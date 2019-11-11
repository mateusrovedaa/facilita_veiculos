package functions;

import java.awt.Toolkit;
import java.text.Normalizer;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JTable;

public class Funcoes {

    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");

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
}
