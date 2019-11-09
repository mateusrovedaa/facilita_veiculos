package dao;

import entidade.Permissao;
import functions.ConexaoBD;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PermissaoDao implements IDAO_T<Permissao> {

    public static int idUser = 0;
    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(Permissao o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String atualizar(Permissao o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Boolean excluir(String permissao, String tela, int idUsuario) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM permissoes WHERE usuario_id = " + idUsuario + " AND permissao = '" + permissao + "' and tela = '" + tela + "'";

            System.out.println("sql: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @Override
    public ArrayList<Permissao> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Permissao> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<String> consultarPermissoes() {
        ArrayList<String> permissoes = new ArrayList();
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM permissoes "
                    + "WHERE usuario_id = " + idUser;

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);
            while (resultadoQ.next()) {
                permissoes.add(resultadoQ.getString("permissao"));
            }
        } catch (Exception e) {
            System.out.println("Erro consultar permissao = " + e);
        }
        return permissoes;
    }

    public ArrayList<String> consultarPermissoes(String tela) {
        ArrayList<String> permissoes = new ArrayList();
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM permissoes "
                    + "WHERE usuario_id = " + idUser + " AND tela = '" + tela + "'";

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);
            while (resultadoQ.next()) {
                permissoes.add(resultadoQ.getString("permissao"));
            }
        } catch (Exception e) {
            System.out.println("Erro consultar permissao = " + e);
        }
        return permissoes;
    }

    public ArrayList<String> consultarPermissoes(String tela, int id) {
        ArrayList<String> permissoes = new ArrayList();
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM permissoes "
                    + "WHERE usuario_id = " + id + " AND tela = '" + tela + "'";

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);
            while (resultadoQ.next()) {
                permissoes.add(resultadoQ.getString("permissao"));
            }
        } catch (Exception e) {
            System.out.println("Erro consultar permissao = " + e);
        }
        return permissoes;
    }

    @Override
    public Permissao consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean consultarPermissao(String permissao, String tela) {
        boolean ok = false;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM permissoes "
                    + "WHERE usuario_id = " + idUser + " AND permissao = '" + permissao + "' AND tela ='" + tela + "'";

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);
            while (resultadoQ.next()) {
                ok = true;
            }
        } catch (Exception e) {
            System.out.println("Erro consultar permissao = " + e);
            ok = false;
        }
        return ok;
    }

    public boolean consultarPermissao(String permissao, String tela, int id) {
        boolean ok = false;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM permissoes "
                    + "WHERE usuario_id = " + id + " AND permissao = '" + permissao + "' AND tela ='" + tela + "'";

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);
            while (resultadoQ.next()) {
                ok = true;
            }
        } catch (Exception e) {
            System.out.println("Erro consultar permissao = " + e);
            ok = false;
        }
        return ok;
    }

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
