package dao;

import entidade.Conforto;
import entidade.Veiculo;
import entidade.VeiculoConforto;
import functions.ConexaoBD;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JTable;

public class VeiculoConfortoDao implements IDAO_T<VeiculoConforto> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(VeiculoConforto veiculoConforto) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO veiculos_confortos VALUES "
                    + "(DEFAULT, "
                    + "'" + veiculoConforto.getVeiculo_id() + "',"
                    + "'" + veiculoConforto.getConforto_id() + "',"
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
            System.out.println("Erro salvar conforto = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(VeiculoConforto o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM veiculos_confortos" + " "
                    + "WHERE veiculo_id = " + id;

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro excluir registros veículos confortos = " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<VeiculoConforto> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VeiculoConforto> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VeiculoConforto consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String salvarVeiculoConforto(JTable tabela, int veiculoID) {
        VeiculoConforto veiculoConforto = new VeiculoConforto();

        VeiculoConfortoDao veiculoConofortoDao = new VeiculoConfortoDao();

        for (int i = 0; i < tabela.getRowCount(); i++) {

            //boolean selecionado = tabela.getValueAt(i, 0) == null ? false : true;
            boolean selecionado;

            if (tabela.getValueAt(i, 0) == null) {
                selecionado = false;
            } else {
                selecionado = (boolean) tabela.getValueAt(i, 0);
            }

            Object objectVeiculo = DaoGenerico.getInstance().obterPorId(Veiculo.class, veiculoID);
            Veiculo veiculo = new Veiculo((Veiculo) objectVeiculo);

            Object objectConforto = DaoGenerico.getInstance().obterPorId(Conforto.class, Integer.parseInt(String.valueOf(tabela.getValueAt(i, 1))));
            Conforto conforto = new Conforto((Conforto) objectConforto);

            if (selecionado) {
                veiculoConforto.setVeiculo_id(veiculo);
                veiculoConforto.setConforto_id(conforto);
                veiculoConofortoDao.salvar(veiculoConforto);
            }
        }
        return null;
    }
}
