package facilitaveiculos;

import functions.ConexaoBD;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import tela.TelaInicio;
import tela.TelaCadastroCliente;
import tela.TelaCadastroGeral;
import tela.TelaCadastroProprietario;
import tela.TelaLogin;

public class FacilitaVeiculos {

    public static Connection conexao;

    public static void main(String[] args) {

        if (ConexaoBD.getInstance().getConnection() != null) {
            TelaLogin tela = new TelaLogin();

            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(tela);
            } catch (Exception e) {
            }

            tela.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao abrir conexão!");
        }
    }
}
