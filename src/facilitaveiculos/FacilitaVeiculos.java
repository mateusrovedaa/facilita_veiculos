package facilitaveiculos;

import functions.HibernateUtil;
import java.sql.Connection;
import javax.swing.JOptionPane;
import tela.TelaLogin;

public class FacilitaVeiculos {

    public static Connection conexao;
    
    public static void main(String[] args) {

        try{
            HibernateUtil.getSessionFactory().openSession();
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir conexão!");
        }
    }
}
