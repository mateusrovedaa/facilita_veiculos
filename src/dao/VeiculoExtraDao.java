package dao;

import entidade.Extra;
import entidade.Veiculo;
import entidade.VeiculoExtra;
import functions.ConexaoBD;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JTable;

public class VeiculoExtraDao implements IDAO_T<VeiculoExtra> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(VeiculoExtra veiculoExtra) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO veiculos_extras VALUES "
                    + "(DEFAULT, "
                    + "'" + veiculoExtra.getVeiculo_id() + "',"
                    + "'" + veiculoExtra.getExtra_id() + "',"
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
            System.out.println("Erro salvar extra = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(VeiculoExtra o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM veiculos_extras" + " "
                    + "WHERE veiculo_id = " + id;

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro excluir registros veículos extras = " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<VeiculoExtra> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VeiculoExtra> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VeiculoExtra consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String salvarVeiculoExtra(JTable tabela, int veiculoID) {

        VeiculoExtra veiculoExtra = new VeiculoExtra();

        VeiculoExtraDao veiculoExtraDao = new VeiculoExtraDao();

        for (int i = 0; i < tabela.getRowCount(); i++) {

            boolean selecionado;

            if (tabela.getValueAt(i, 0) == null) {
                selecionado = false;
            } else {
                selecionado = (boolean) tabela.getValueAt(i, 0);
            }

            Object objectVeiculo = DaoGenerico.getInstance().obterPorId(Veiculo.class, veiculoID);
            Veiculo veiculo = new Veiculo((Veiculo) objectVeiculo);

            Object objectExtra = DaoGenerico.getInstance().obterPorId(Extra.class, Integer.parseInt(String.valueOf(tabela.getValueAt(i, 1))));
            Extra extra = new Extra((Extra) objectExtra);

            if (selecionado) {
                veiculoExtra.setVeiculo_id(veiculo);
                veiculoExtra.setExtra_id(extra);
                veiculoExtraDao.salvar(veiculoExtra);
            }
        }
        return null;
    }
}
