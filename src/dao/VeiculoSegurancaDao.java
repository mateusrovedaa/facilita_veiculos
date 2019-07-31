package dao;

import entidade.Seguranca;
import entidade.VeiculoSeguranca;
import functions.ConexaoBD;
import functions.Formatacao;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JTable;

public class VeiculoSegurancaDao implements IDAO_T<VeiculoSeguranca> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(VeiculoSeguranca veiculoSeguranca) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO veiculos_segurancas VALUES "
                    + "(DEFAULT, "
                    + "'" + veiculoSeguranca.getVeiculoId() + "',"
                    + "'" + veiculoSeguranca.getSegurancaId() + "',"
                    + "'" + now + "',"
                    + "'" + now + "'"
                    + ")";

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao inserir";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro salvar segurança = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(VeiculoSeguranca o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM veiculos_segurancas" + " "
                    + "WHERE veiculo_id = " + id;

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro excluir registros veículos seguranças = " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<VeiculoSeguranca> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VeiculoSeguranca> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VeiculoSeguranca consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String salvarVeiculoSeguranca(JTable tabela, int veiculoID) {

        VeiculoSeguranca veiculoSeguranca = new VeiculoSeguranca();

        VeiculoSegurancaDao veiculoSegurancaDao = new VeiculoSegurancaDao();

        for (int i = 0; i < tabela.getRowCount(); i++) {

            boolean selecionado;

            if (tabela.getValueAt(i, 0) == null) {
                selecionado = false;
            } else {
                selecionado = (boolean) tabela.getValueAt(i, 0);
            }

            if (selecionado) {
                veiculoSeguranca.setVeiculoId(veiculoID);
                veiculoSeguranca.setSegurancaId(Integer.parseInt(String.valueOf(tabela.getValueAt(i, 1))));
                veiculoSegurancaDao.salvar(veiculoSeguranca);
            }
        }
        return null;
    }

}
