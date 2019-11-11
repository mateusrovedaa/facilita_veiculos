package functions;

import dao.DaoGenerico;
import dao.PermissaoDao;
import entidade.Permissao;
import entidade.PermissaoId;
import entidade.Usuario;
import java.awt.Toolkit;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTable;

public class Funcoes {
    
    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");
    private PermissaoDao peDAO = new PermissaoDao();
    
    public void limparCheckTabela(JTable tabela) {
        
        for (int i = 0; i < tabela.getRowCount(); i++) {
            
            boolean selecionado = tabela.getValueAt(i, 0) == null ? false : true;
            
            if (selecionado) {
                tabela.setValueAt(false, i, 0);
            }
        }
    }
    
    public static String textoIdentificador(String slug) {
        String nowhitespace = WHITESPACE.matcher(slug).replaceAll("-");
        String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD);
        String texto_slug = NONLATIN.matcher(normalized).replaceAll("");
        return texto_slug.toLowerCase();
    }
    
    public static Boolean salvarPermissao(String textopermissao, Usuario idusuario, String tela) {
        Boolean ok = false;
        Permissao permissao = new Permissao();
        PermissaoId permissaoid = new PermissaoId();
        permissaoid.setPermissao(textopermissao);
        permissaoid.setUsuario_id(idusuario);
        permissaoid.setTela(tela);
        permissao.setId(permissaoid);
        permissao.setSlug(Funcoes.textoIdentificador(textopermissao));
        permissao.setCriadoEm(Calendar.getInstance());
        permissao.setAlteradoEm(Calendar.getInstance());
        ok = DaoGenerico.getInstance().inserir(permissao);
        return ok;
    }
    
     public static boolean verificaPermissoes(JCheckBox cbx, String regra, String tela, Usuario usuario, PermissaoDao peDAO) {
        boolean ok = false;
        if (cbx.isSelected()) {
            if (!peDAO.consultarPermissao(regra, tela, usuario.getId())) {
                ok = Funcoes.salvarPermissao(regra, usuario, tela);
            } else {
                ok = true;
            }
        } else {
            if (peDAO.consultarPermissao(regra, tela, usuario.getId())) {
                ok = peDAO.excluir(regra, tela, usuario.getId());
            } else {
                ok = true;
            }
        }
        return ok;
    }
}
