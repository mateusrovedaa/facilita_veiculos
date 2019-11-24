package dao;

import entidade.Estilo;
import entidade.Veiculo;
import entidade.VeiculoEstilo;
import functions.ConexaoBD;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JTable;

public class VeiculoEstiloDao implements IDAO_T<VeiculoEstilo> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(VeiculoEstilo veiculoEstilo) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO veiculos_estilos VALUES "
                    + "(DEFAULT, "
                    + "'" + veiculoEstilo.getVeiculo_id() + "',"
                    + "'" + veiculoEstilo.getEstilo_id() + "',"
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
            System.out.println("Erro salvar estilo = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(VeiculoEstilo o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM veiculos_estilos" + " "
                    + "WHERE veiculo_id = " + id;

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro excluir registros veículos estilos = " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<VeiculoEstilo> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VeiculoEstilo> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VeiculoEstilo consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String salvarVeiculoEstilo(JTable tabela, int veiculoID) {

        VeiculoEstilo veiculoEstilo = new VeiculoEstilo();

        VeiculoEstiloDao veiculoEstiloDao = new VeiculoEstiloDao();

        for (int i = 0; i < tabela.getRowCount(); i++) {

            boolean selecionado;

            if (tabela.getValueAt(i, 0) == null) {
                selecionado = false;
            } else {
                selecionado = (boolean) tabela.getValueAt(i, 0);
            }

            Object objectVeiculo = DaoGenerico.getInstance().obterPorId(Veiculo.class, veiculoID);
            Veiculo veiculo = new Veiculo((Veiculo) objectVeiculo);

            Object objectEstilo = DaoGenerico.getInstance().obterPorId(Estilo.class, Integer.parseInt(String.valueOf(tabela.getValueAt(i, 1))));
            Estilo estilo = new Estilo((Estilo) objectEstilo);

            if (selecionado) {
                veiculoEstilo.setVeiculo_id(veiculo);
                veiculoEstilo.setEstilo_id(estilo);
                veiculoEstilo.setCriadoEm(Calendar.getInstance());
                veiculoEstilo.setAlteradoEm(Calendar.getInstance());
                boolean retorno = DaoGenerico.getInstance().inserir(veiculoEstilo);
            }
        }
        return null;
    }
}
