/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author matt
 */
public class LoginDAO {

    private Connection conexao;

    public LoginDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Login login) throws SQLException {
        String sql = "INSERT INTO LOGIN (LOG_nome,FUN_CODIGO) VALUES (?,?);";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, login.getLog_nome());
            stmt.setInt(2, login.getFun_codigo());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
        }
    }

    public boolean testLogin(String login, String senha) throws SQLException {
        String sql = "select log_nome,log_senha from login where log_nome ilike ? AND log_senha ilike ?";
        boolean status = false;
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, login);
        pstmt.setString(2, senha);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            if (login.equalsIgnoreCase(rs.getString("log_nome")) && senha.equalsIgnoreCase(rs.getString("log_senha"))) {
                status = true;
                break;
            }
        }

        pstmt.close();
        return status;
    }

    public void alterPass(String login, String senha) throws SQLException {
        String sql = "update login set log_senha = ? where log_nome ilike ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, senha);
        stmt.setString(2, login);
        stmt.execute();
        stmt.close();
        JOptionPane.showMessageDialog(null, "Senha alterada com sucesso.");
    }
}
