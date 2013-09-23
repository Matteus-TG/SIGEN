/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Enderecos;

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
public class EnderecoDAO {

    private Connection conexao;

    public EnderecoDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public List<String> listarCidades(String UF) {
        List<String> listaCidade = new ArrayList<>();
        String sql = "SELECT * FROM CIDADES WHERE EST_SIGLA = '" + UF + "'";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                listaCidade.add(rs.getString("cid_nome"));

            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return listaCidade;
    }

    public int CapturarID(String UF, String cidade) {
        int id = 0;
        String sql = "SELECT CID_CODIGO FROM CIDADES WHERE "
                + "CID_NOME ILIKE '" + cidade + "' AND EST_SIGLA ILIKE '" + UF + "'";

        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("cid_codigo");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return id;
    }

    public int CapturarEndereco() {
        int id = 0;
        String sql = "select case when max(end_id) is null then 1.0 else max(end_id) end from enderecos";

        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("max");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return id;
    }

    public void adicionar(Enderecos endereco) throws SQLException {
        String sql = "INSERT INTO ENDERECOS (END_CEP,END_COMPLEMENTO,END_BAIRRO,END_NUMERO,END_LOGRADOURO,CID_CODIGO) VALUES\n"
                + "(?,?,?,?,?,?);";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, endereco.getEnd_cep());
            stmt.setString(2, endereco.getEnd_complemento());
            stmt.setString(3, endereco.getEnd_bairro());
            stmt.setString(4, endereco.getEnd_numero());
            stmt.setString(5, endereco.getEnd_logradouro());
            stmt.setInt(6, endereco.getCidade().getCid_codigo());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void editar(Enderecos endereco) throws SQLException {
        String sql = "UPDATE ENDERECOS SET END_CEP = ?, END_COMPLEMENTO = ?, END_BAIRRO = ?, END_NUMERO = ?,"
                + "END_LOGRADOURO = ?, CID_CODIGO = ? WHERE END_ID = ?";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, endereco.getEnd_cep());
            stmt.setString(2, endereco.getEnd_complemento());
            stmt.setString(3, endereco.getEnd_bairro());
            stmt.setString(4, endereco.getEnd_numero());
            stmt.setString(5, endereco.getEnd_logradouro());
            stmt.setInt(6, endereco.getCidade().getCid_codigo());
            stmt.setInt(7, endereco.getEnd_id());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void removeError() throws SQLException {
        String sql = "delete from enderecos where end_id = (select max(end_id) from enderecos)";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.execute();
        stmt.close();
    }
}
