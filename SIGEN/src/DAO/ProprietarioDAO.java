/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Cidades;
import Modelo.Enderecos;
import Modelo.Estados;
import Modelo.Proprietarios;
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
public class ProprietarioDAO {

    private Connection conexao;

    public ProprietarioDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Proprietarios proprietario) throws SQLException {
        String sql = "INSERT INTO PROPRIETARIOS (pro_nome,pro_rg,pro_cpf,cel_numero,tel_numero,pro_nascimento,end_id) VALUES\n"
                + "(?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, proprietario.getPro_nome());
            stmt.setString(2, proprietario.getPro_rg());
            stmt.setString(3, proprietario.getPro_cpf());
            stmt.setString(4, proprietario.getCel_numero());
            stmt.setString(5, proprietario.getTel_numero());
            stmt.setDate(6, new java.sql.Date(proprietario.getPro_nascimento().getTime()));
            stmt.setInt(7, proprietario.getEndereco().getEnd_id());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } catch (SQLException ex) {
            EnderecoDAO edao = new EnderecoDAO();
            edao.removeError();
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public void editar(Proprietarios proprietario) throws SQLException {
        String sql = "update PROPRIETARIOS set pro_nome = ?, pro_rg = ?,pro_cpf = ?,cel_numero = ?,tel_numero = ?,"
                + "pro_nascimento = ? where pro_codigo = ?";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, proprietario.getPro_nome());
            stmt.setString(2, proprietario.getPro_rg());
            stmt.setString(3, proprietario.getPro_cpf());
            stmt.setString(4, proprietario.getCel_numero());
            stmt.setString(5, proprietario.getTel_numero());
            stmt.setDate(6, new java.sql.Date(proprietario.getPro_nascimento().getTime()));
            stmt.setInt(7, proprietario.getPro_codigo());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public Proprietarios listarCPF(String cpf) throws SQLException {
        String sql = "select proprietarios.pro_codigo,proprietarios.pro_nome,"
                + "proprietarios.pro_rg,proprietarios.cel_numero,proprietarios.tel_numero,"
                + "proprietarios.pro_nascimento,proprietarios.pro_cpf,"
                + "enderecos.end_id,enderecos.end_cep,enderecos.end_complemento,"
                + "enderecos.end_bairro,enderecos.end_numero,enderecos.end_logradouro,"
                + "cidades.cid_codigo,cidades.cid_nome,estados.est_sigla,estados.est_nome "
                + "from proprietarios inner join enderecos on "
                + "proprietarios.end_id = enderecos.end_id inner join cidades on "
                + "enderecos.cid_codigo = cidades.cid_codigo inner join estados on "
                + "cidades.est_sigla = estados.est_sigla where proprietarios.pro_cpf = '" + cpf + "'";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        Proprietarios proprietario = new Proprietarios();
        Enderecos endereco = new Enderecos();
        Cidades cidade = new Cidades();
        Estados estado = new Estados();
        while (rs.next()) {
            proprietario.setPro_codigo(rs.getInt("pro_codigo"));
            proprietario.setPro_nome(rs.getString("pro_nome"));
            proprietario.setPro_rg(rs.getString("pro_rg"));
            proprietario.setPro_nascimento(rs.getDate("pro_nascimento"));
            proprietario.setPro_cpf(rs.getString("pro_cpf"));
            proprietario.setCel_numero(rs.getString("cel_numero"));
            proprietario.setTel_numero(rs.getString("tel_numero"));
            endereco.setEnd_id(rs.getInt("end_id"));
            endereco.setEnd_cep(rs.getString("end_cep"));
            endereco.setEnd_complemento(rs.getString("end_complemento"));
            endereco.setEnd_bairro(rs.getString("end_bairro"));
            endereco.setEnd_numero(rs.getString("end_numero"));
            endereco.setEnd_logradouro(rs.getString("end_logradouro"));
            estado.setEst_nome(rs.getString("est_nome"));
            estado.setEst_sigla(rs.getString("est_sigla"));
            cidade.setEstado(estado);
            cidade.setCid_codigo(rs.getInt("cid_codigo"));
            cidade.setCid_nome(rs.getString("cid_nome"));
            endereco.setCidade(cidade);
            proprietario.setEndereco(endereco);
        }
        rs.close();
        pstmt.close();
        return proprietario;
    }

    public List<Proprietarios> listarNome(String nome) throws SQLException {
        String sql = "select proprietarios.pro_codigo,proprietarios.pro_nome,"
                + "proprietarios.pro_rg,proprietarios.cel_numero,proprietarios.tel_numero,"
                + "proprietarios.pro_nascimento,proprietarios.pro_cpf,enderecos.end_id,"
                + "enderecos.end_cep,enderecos.end_complemento, enderecos.end_bairro,enderecos.end_numero,"
                + "enderecos.end_logradouro,cidades.cid_codigo,cidades.cid_nome,estados.est_sigla,"
                + "estados.est_nome from proprietarios inner join enderecos "
                + "on proprietarios.end_id = enderecos.end_id inner join cidades "
                + "on enderecos.cid_codigo = cidades.cid_codigo inner join estados "
                + "on cidades.est_sigla = estados.est_sigla where proprietarios.pro_nome ilike '" + nome + "'";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Proprietarios> proprietarios = new ArrayList<>();

        while (rs.next()) {

            Proprietarios proprietario = new Proprietarios();
            Enderecos endereco = new Enderecos();
            Cidades cidade = new Cidades();
            Estados estado = new Estados();

            proprietario.setPro_codigo(rs.getInt("pro_codigo"));
            proprietario.setPro_nome(rs.getString("pro_nome"));
            proprietario.setPro_rg(rs.getString("pro_rg"));
            proprietario.setPro_nascimento(rs.getDate("pro_nascimento"));
            proprietario.setPro_cpf(rs.getString("pro_cpf"));
            proprietario.setCel_numero(rs.getString("cel_numero"));
            proprietario.setTel_numero(rs.getString("tel_numero"));
            endereco.setEnd_id(rs.getInt("end_id"));
            endereco.setEnd_cep(rs.getString("end_cep"));
            endereco.setEnd_complemento(rs.getString("end_complemento"));
            endereco.setEnd_bairro(rs.getString("end_bairro"));
            endereco.setEnd_numero(rs.getString("end_numero"));
            endereco.setEnd_logradouro(rs.getString("end_logradouro"));
            estado.setEst_nome(rs.getString("est_nome"));
            estado.setEst_sigla(rs.getString("est_sigla"));
            cidade.setEstado(estado);
            cidade.setCid_codigo(rs.getInt("cid_codigo"));
            cidade.setCid_nome(rs.getString("cid_nome"));
            endereco.setCidade(cidade);
            proprietario.setEndereco(endereco);
            proprietarios.add(proprietario);
        }
        rs.close();
        pstmt.close();
        return proprietarios;
    }

    public int CapturarProprietario() {
        int id = 0;
        String sql = "select case when max(pro_codigo) is null then 1.0 else max(pro_codigo) end from proprietarios";

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

    public void remover(int id) throws SQLException {
        String sql = "delete from proprietarios cascade where pro_codigo=? ";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }

    public Proprietarios getEdit(int id) throws SQLException {
        String sql = "select proprietarios.pro_codigo,proprietarios.pro_nome,"
                + "proprietarios.pro_rg,proprietarios.cel_numero,proprietarios.tel_numero,"
                + "proprietarios.pro_nascimento,proprietarios.pro_cpf,"
                + "enderecos.end_id,enderecos.end_cep,enderecos.end_complemento,"
                + "enderecos.end_bairro,enderecos.end_numero,enderecos.end_logradouro,"
                + "cidades.cid_codigo,cidades.cid_nome,estados.est_sigla,estados.est_nome "
                + "from proprietarios inner join enderecos on "
                + "proprietarios.end_id = enderecos.end_id inner join cidades on "
                + "enderecos.cid_codigo = cidades.cid_codigo inner join estados on "
                + "cidades.est_sigla = estados.est_sigla where proprietarios.pro_codigo = '" + id + "'";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        Proprietarios proprietario = new Proprietarios();
        Enderecos endereco = new Enderecos();
        Cidades cidade = new Cidades();
        Estados estado = new Estados();

        while (rs.next()) {
            proprietario.setPro_codigo(rs.getInt("pro_codigo"));
            proprietario.setPro_nome(rs.getString("pro_nome"));
            proprietario.setPro_rg(rs.getString("pro_rg"));
            proprietario.setPro_nascimento(rs.getDate("pro_nascimento"));
            proprietario.setPro_cpf(rs.getString("pro_cpf"));
            proprietario.setTel_numero(rs.getString("tel_numero"));
            proprietario.setCel_numero(rs.getString("cel_numero"));
            endereco.setEnd_id(rs.getInt("end_id"));
            endereco.setEnd_cep(rs.getString("end_cep"));
            endereco.setEnd_complemento(rs.getString("end_complemento"));
            endereco.setEnd_bairro(rs.getString("end_bairro"));
            endereco.setEnd_numero(rs.getString("end_numero"));
            endereco.setEnd_logradouro(rs.getString("end_logradouro"));
            estado.setEst_nome(rs.getString("est_nome"));
            estado.setEst_sigla(rs.getString("est_sigla"));
            cidade.setEstado(estado);
            cidade.setCid_codigo(rs.getInt("cid_codigo"));
            cidade.setCid_nome(rs.getString("cid_nome"));
            endereco.setCidade(cidade);
            proprietario.setEndereco(endereco);
        }

        rs.close();
        pstmt.execute();
        pstmt.close();
        return proprietario;
    }

    public List<Proprietarios> getVenda(String nome) throws SQLException {
        String sql = "select pro_codigo,pro_nome,pro_cpf,pro_rg from proprietarios where pro_nome ilike '" + nome + "'";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Proprietarios> proprietarios = new ArrayList<>();
        while (rs.next()) {
            Proprietarios proprietario = new Proprietarios();
            proprietario.setPro_codigo(rs.getInt("pro_codigo"));
            proprietario.setPro_nome(rs.getString("pro_nome"));
            proprietario.setPro_rg(rs.getString("pro_rg"));
            proprietario.setPro_cpf(rs.getString("pro_cpf"));
            proprietarios.add(proprietario);
        }

        rs.close();
        pstmt.close();
        return proprietarios;
    }
}
