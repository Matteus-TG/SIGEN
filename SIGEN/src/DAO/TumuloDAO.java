/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Chapas;
import Modelo.Letras;
import Modelo.Proprietarios;
import Modelo.Quadras;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TumuloDAO {

    private Connection conexao;

    public TumuloDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public List<Chapas> listarTumulos() {
        List<Chapas> chapas = new ArrayList<>();
        String sql = "SELECT QUADRAS.TUM_QUADRA,LETRAS.LET_LETRA,CHAPAS.CHA_CHAPA,PROPRIETARIOS.PRO_NOME "
                + "FROM CHAPAS INNER JOIN LETRAS ON CHAPAS.CHA_LETRA = LETRAS.LET_CODIGO "
                + "INNER JOIN QUADRAS ON LETRAS.LET_QUADRA = QUADRAS.TUM_QUADRA "
                + "LEFT JOIN PROPRIETARIOS ON CHAPAS.PRO_CODIGO = PROPRIETARIOS.PRO_CODIGO "
                + "ORDER BY TUM_QUADRA,LET_LETRA,CHA_CHAPA";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Quadras quadra = new Quadras();
                Letras letra = new Letras();
                Chapas chapa = new Chapas();
                Proprietarios proprietario = new Proprietarios();

                quadra.setQuadra(rs.getString("tum_quadra"));
                letra.setQuadra(quadra);
                letra.setLetra(rs.getString("let_letra"));
                chapa.setChapa(rs.getString("cha_chapa"));
                chapa.setLetra(letra);
                proprietario.setPro_nome(rs.getString("pro_nome"));
                chapa.setProprietario(proprietario);
                chapas.add(chapa);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return chapas;
    }

    public List<Quadras> listarQuadraBYCPF(String cpf) {
        List<Quadras> quadras = new ArrayList<>();
        String sql = "SELECT DISTINCT QUADRAS.TUM_QUADRA FROM CHAPAS "
                + "INNER JOIN LETRAS ON CHAPAS.CHA_LETRA = LETRAS.LET_CODIGO INNER JOIN QUADRAS\n"
                + "ON LETRAS.LET_QUADRA = QUADRAS.TUM_QUADRA LEFT JOIN PROPRIETARIOS ON "
                + "CHAPAS.PRO_CODIGO = PROPRIETARIOS.PRO_CODIGO WHERE PROPRIETARIOS.PRO_CPF = '" + cpf + "'";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Quadras quadra = new Quadras();

                quadra.setQuadra(rs.getString("tum_quadra"));
                quadras.add(quadra);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return quadras;
    }

    public List<Quadras> listarQuadras() {
        //METODO CORRRETO - NAO DELETAR
        List<Quadras> quadras = new ArrayList<>();
        String sql = "select distinct quadras.tum_quadra from quadras inner join letras on "
                + "quadras.tum_quadra = letras.let_quadra inner join chapas on"
                + " letras.let_codigo = chapas.cha_letra where chapas.pro_codigo IS NULL";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Quadras quadra = new Quadras();
                quadra.setQuadra(rs.getString("tum_quadra"));
                quadras.add(quadra);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return quadras;
    }

    public List<Quadras> listarQuadrasVendidas() {
        //METODO CORRRETO - NAO DELETAR
        List<Quadras> quadras = new ArrayList<>();
        String sql = "select distinct quadras.tum_quadra from quadras inner join letras on "
                + "quadras.tum_quadra = letras.let_quadra inner join chapas on"
                + " letras.let_codigo = chapas.cha_letra where chapas.pro_codigo IS NOT NULL";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Quadras quadra = new Quadras();
                quadra.setQuadra(rs.getString("tum_quadra"));
                quadras.add(quadra);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return quadras;
    }

    public List<Letras> listarLetras(String aux) {
        //METODO CORRETO - NAO DELETAR
        List<Letras> letras = new ArrayList<>();
        String sql = "SELECT DISTINCT LET_CODIGO,LET_LETRA,LET_QUADRA FROM LETRAS  INNER JOIN CHAPAS ON LETRAS.LET_CODIGO = CHAPAS.CHA_LETRA  WHERE LETRAS.LET_QUADRA = '" + aux + "'";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Letras letra = new Letras();
                Quadras quadra = new Quadras();

                quadra.setQuadra(rs.getString("let_quadra"));
                letra.setQuadra(quadra);
                letra.setCodigo(rs.getInt("let_codigo"));
                letra.setLetra(rs.getString("let_letra"));
                letras.add(letra);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return letras;
    }

    public int pegaIDLetra(String aux1, String aux2) {
        int id = 0;
        String sql = "select let_codigo from letras where let_quadra = '" + aux1 + "' and let_letra = '" + aux2 + "'";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("let_codigo");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id;
    }

    public List<Chapas> listarChapas(int aux, String aux2) {
        List<Chapas> chapas = new ArrayList<>();
        String sql = "  SELECT CHA_CHAPA,PRO_CODIGO,LETRAS.LET_LETRA,TUM_QUADRA FROM CHAPAS INNER JOIN LETRAS ON \n"
                + "                CHAPAS.CHA_LETRA = LETRAS.LET_CODIGO\n"
                + "                inner join quadras on letras.let_quadra = quadras.tum_quadra "
                + "WHERE CHAPAS.PRO_CODIGO IS NULL AND CHAPAS.CHA_LETRA = " + aux + " AND LETRAS.LET_QUADRA = '" + aux2 + "'";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Quadras quadra = new Quadras();
                Letras letra = new Letras();
                Chapas chapa = new Chapas();

                quadra.setQuadra(rs.getString("tum_quadra"));
                letra.setQuadra(quadra);
                letra.setLetra(rs.getString("let_letra"));
                chapa.setChapa(rs.getString("cha_chapa"));
                chapa.setLetra(letra);
                chapas.add(chapa);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chapas;
    }

    public List<Chapas> listarChapasVendidas(int aux, String aux2) {
        List<Chapas> chapas = new ArrayList<>();
        String sql = "  SELECT CHA_CHAPA,PRO_CODIGO,LETRAS.LET_LETRA,TUM_QUADRA FROM CHAPAS INNER JOIN LETRAS ON \n"
                + "                CHAPAS.CHA_LETRA = LETRAS.LET_CODIGO\n"
                + "                inner join quadras on letras.let_quadra = quadras.tum_quadra "
                + "WHERE CHAPAS.PRO_CODIGO IS NOT NULL AND CHAPAS.CHA_LETRA = " + aux + " AND LETRAS.LET_QUADRA = '" + aux2 + "'";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Quadras quadra = new Quadras();
                Letras letra = new Letras();
                Chapas chapa = new Chapas();
                quadra.setQuadra(rs.getString("tum_quadra"));
                letra.setQuadra(quadra);
                letra.setLetra(rs.getString("let_letra"));
                chapa.setChapa(rs.getString("cha_chapa"));
                chapa.setLetra(letra);
                chapas.add(chapa);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chapas;
    }

    public void adicionarQuadra(Quadras quadra) throws SQLException {
        String sql = "insert into quadras values (?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, quadra.getQuadra());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void adicionarLetra(Letras letra, String quadra) throws SQLException {
        String sql = "insert into letras (let_letra,let_quadra) values (?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, letra.getLetra());
            stmt.setString(2, quadra);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void adicionarChapa(Chapas chapa) throws SQLException {
        String sql = "INSERT INTO CHAPAS (CHA_CHAPA,CHA_LETRA) "
                + "VALUES (?,(select max(let_codigo) from letras))";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, chapa.getChapa());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Tumulo cadastrado com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Letras> listarLetrasBYCPF(String cpf, String quadraAux) {
        List<Letras> letras = new ArrayList<>();
        String sql = "SELECT DISTINCT LETRAS.LET_LETRA,LETRAS.LET_CODIGO,LETRAS.LET_QUADRA FROM CHAPAS INNER JOIN LETRAS ON "
                + "CHAPAS.CHA_LETRA = LETRAS.LET_CODIGO INNER JOIN QUADRAS ON "
                + "LETRAS.LET_QUADRA = QUADRAS.TUM_QUADRA LEFT JOIN PROPRIETARIOS ON "
                + "CHAPAS.PRO_CODIGO = PROPRIETARIOS.PRO_CODIGO "
                + "WHERE PROPRIETARIOS.PRO_CPF = '" + cpf + "' AND QUADRAS.TUM_QUADRA = '" + quadraAux + "'";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Letras letra = new Letras();
                Quadras quadra = new Quadras();

                quadra.setQuadra(rs.getString("let_quadra"));
                letra.setQuadra(quadra);
                letra.setCodigo(rs.getInt("let_codigo"));
                letra.setLetra(rs.getString("let_letra"));
                letras.add(letra);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return letras;
    }

    public List<Chapas> listarQuadrasBYCPF(String cpf, String quadraAux, int Laux) {
        List<Chapas> chapas = new ArrayList<>();
        String sql = "SELECT CHAPAS.CHA_CHAPA,QUADRAS.TUM_QUADRA,LETRAS.LET_LETRA FROM"
                + " CHAPAS INNER JOIN LETRAS ON CHAPAS.CHA_LETRA = LETRAS.LET_CODIGO  "
                + "INNER JOIN QUADRAS ON LETRAS.LET_QUADRA = QUADRAS.TUM_QUADRA "
                + "INNER JOIN PROPRIETARIOS ON  CHAPAS.PRO_CODIGO = PROPRIETARIOS.PRO_CODIGO "
                + "WHERE PROPRIETARIOS.PRO_CPF = '" + cpf + "'AND "
                + "CHAPAS.CHA_LETRA = " + Laux + " AND"
                + " LETRAS.LET_QUADRA = '" + quadraAux + "'";

        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Quadras quadra = new Quadras();
                Letras letra = new Letras();
                Chapas chapa = new Chapas();

                quadra.setQuadra(rs.getString("tum_quadra"));
                letra.setQuadra(quadra);
                letra.setLetra(rs.getString("let_letra"));
                chapa.setChapa(rs.getString("cha_chapa"));
                chapa.setLetra(letra);
                chapas.add(chapa);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chapas;
    }

    public int getTomb(String quadra, String letra, String chapa) {
        int id = 0;
        String sql = "select chapas.cha_codigo from chapas inner join letras on"
                + " chapas.cha_letra = letras.let_codigo inner join quadras on"
                + " letras.let_quadra = quadras.tum_quadra "
                + "where quadras.tum_quadra = '" + quadra + "' AND letras.let_letra = '" + letra + "' AND chapas.cha_chapa = '" + chapa + "'";

        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("cha_codigo");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return id;
    }

    public void sellTomb(int id_pro, int id_chapa) throws SQLException {
        String sql = "update chapas set pro_codigo = " + id_pro + " where cha_codigo = " + id_chapa + "";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.execute();
        stmt.close();

    }

    public int getIdChapa(String chapa, String letra) throws SQLException {
        int id = 0;
        String sql = "select cha_codigo from chapas inner join"
                + " letras on chapas.cha_letra = letras.let_codigo "
                + "where let_letra = ? and cha_chapa = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, letra);
        stmt.setString(2, chapa);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            id = rs.getInt("cha_codigo");
        }
        rs.close();

        stmt.execute();
        stmt.close();
        return id;
    }
}