package facilitaveiculos;

import functions.HibernateUtil;
import functions.Mensagem;
import java.sql.Connection;
import tela.TelaLogin;

public class FacilitaVeiculos {

    public static Connection conexao;
    
    public static void main(String[] args) {

        try{
            HibernateUtil.getSessionFactory().openSession();
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
        } catch (Exception e) {
            Mensagem.erro("Erro ao abrir conexão!", null);
        }
    }
}
