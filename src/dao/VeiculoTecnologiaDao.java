package dao;

import entidade.VeiculoTecnologia;
import functions.ConexaoBD;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JTable;

public class VeiculoTecnologiaDao implements IDAO_T<VeiculoTecnologia> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(VeiculoTecnologia veiculoTecnologia) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO veiculos_tecnologias VALUES "
                    + "(DEFAULT, "
                    + "'" + veiculoTecnologia.getVeiculoId() + "',"
                    + "'" + veiculoTecnologia.getTecnologiaId() + "',"
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
            System.out.println("Erro salvar tecnologia = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(VeiculoTecnologia o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM veiculos_tecnologias" + " "
                    + "WHERE veiculo_id = " + id;

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro excluir registros veículos tecnologias = " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<VeiculoTecnologia> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VeiculoTecnologia> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VeiculoTecnologia consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String salvarVeiculoTecnologia(JTable tabela, int veiculoID) {

        VeiculoTecnologia veiculoTecnologia = new VeiculoTecnologia();

        VeiculoTecnologiaDao veiculoTecnologiaDao = new VeiculoTecnologiaDao();

        for (int i = 0; i < tabela.getRowCount(); i++) {

            boolean selecionado;

            if (tabela.getValueAt(i, 0) == null) {
                selecionado = false;
            } else {
                selecionado = (boolean) tabela.getValueAt(i, 0);
            }

            if (selecionado) {
                veiculoTecnologia.setVeiculoId(veiculoID);
                veiculoTecnologia.setTecnologiaId(Integer.parseInt(String.valueOf(tabela.getValueAt(i, 1))));
                veiculoTecnologiaDao.salvar(veiculoTecnologia);
            }
        }
        return null;
    }

}
