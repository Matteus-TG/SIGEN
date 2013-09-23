/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Cidades;
import Modelo.Enderecos;
import Modelo.Estados;
import Modelo.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author matt
 */
public class FuncionarioDAO {

    private Connection conexao;

    public FuncionarioDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Funcionarios funcionario) throws SQLException {
        String sql = "INSERT INTO FUNCIONARIOS (FUN_NOME,FUN_RG,FUN_CPF,FUN_CTPS,CEL_NUMERO,TEL_NUMERO,END_ID) VALUES"
                + "(?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getFun_nome());
            stmt.setString(2, funcionario.getFun_rg());
            stmt.setString(3, funcionario.getFun_cpf());
            stmt.setString(4, funcionario.getFun_ctps());
            stmt.setString(5, funcionario.getCel_numero());
            stmt.setString(6, funcionario.getTel_numero());
            stmt.setInt(7, funcionario.getEndereco().getEnd_id());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!");
        } catch (SQLException ex) {
            EnderecoDAO edao = new EnderecoDAO();
            edao.removeError();
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Funcionarios> listarNome(String nome) throws SQLException {
        String sql = "select funcionarios.fun_codigo,funcionarios.fun_nome,"
                + "funcionarios.fun_rg,funcionarios.cel_numero,funcionarios.tel_numero,"
                + "funcionarios.fun_data_cadastro,fun_ctps,funcionarios.fun_cpf,enderecos.end_id,"
                + "enderecos.end_cep,enderecos.end_complemento, enderecos.end_bairro,enderecos.end_numero,"
                + "enderecos.end_logradouro,cidades.cid_codigo,cidades.cid_nome,estados.est_sigla,"
                + "estados.est_nome from funcionarios inner join enderecos "
                + "on funcionarios.end_id = enderecos.end_id inner join cidades "
                + "on enderecos.cid_codigo = cidades.cid_codigo inner join estados "
                + "on cidades.est_sigla = estados.est_sigla where funcionarios.fun_nome ilike '" + nome + "'";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Funcionarios> funcionarios = new ArrayList<>();

        while (rs.next()) {

            Funcionarios funcionario = new Funcionarios();
            Enderecos endereco = new Enderecos();
            Cidades cidade = new Cidades();
            Estados estado = new Estados();

            funcionario.setFun_codigo(rs.getInt("fun_codigo"));
            funcionario.setFun_nome(rs.getString("fun_nome"));
            funcionario.setFun_rg(rs.getString("fun_rg"));
            funcionario.setFun_data_cadastro(rs.getDate("fun_data_cadastro"));
            funcionario.setFun_cpf(rs.getString("fun_cpf"));
            funcionario.setFun_ctps(rs.getString("fun_ctps"));
            funcionario.setCel_numero(rs.getString("cel_numero"));
            funcionario.setTel_numero(rs.getString("tel_numero"));
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
            funcionario.setEndereco(endereco);
            funcionarios.add(funcionario);
        }
        rs.close();
        pstmt.close();
        return funcionarios;
    }

    public List<Funcionarios> listarCPF(String cpf) throws SQLException {
        String sql = "select funcionarios.fun_codigo,funcionarios.fun_nome,"
                + "funcionarios.fun_rg,funcionarios.cel_numero,funcionarios.tel_numero,"
                + "funcionarios.fun_data_cadastro,fun_ctps,funcionarios.fun_cpf,enderecos.end_id,"
                + "enderecos.end_cep,enderecos.end_complemento, enderecos.end_bairro,enderecos.end_numero,"
                + "enderecos.end_logradouro,cidades.cid_codigo,cidades.cid_nome,estados.est_sigla,"
                + "estados.est_nome from funcionarios inner join enderecos "
                + "on funcionarios.end_id = enderecos.end_id inner join cidades "
                + "on enderecos.cid_codigo = cidades.cid_codigo inner join estados "
                + "on cidades.est_sigla = estados.est_sigla where funcionarios.fun_cpf =  '" + cpf + "'";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Funcionarios> funcionarios = new ArrayList<>();

        while (rs.next()) {

            Funcionarios funcionario = new Funcionarios();
            Enderecos endereco = new Enderecos();
            Cidades cidade = new Cidades();
            Estados estado = new Estados();

            funcionario.setFun_codigo(rs.getInt("fun_codigo"));
            funcionario.setFun_nome(rs.getString("fun_nome"));
            funcionario.setFun_rg(rs.getString("fun_rg"));
            funcionario.setFun_data_cadastro(rs.getDate("fun_data_cadastro"));
            funcionario.setFun_cpf(rs.getString("fun_cpf"));
            funcionario.setFun_ctps(rs.getString("fun_ctps"));
            funcionario.setCel_numero(rs.getString("cel_numero"));
            funcionario.setTel_numero(rs.getString("tel_numero"));
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
            funcionario.setEndereco(endereco);
            funcionarios.add(funcionario);
        }
        rs.close();
        pstmt.close();
        return funcionarios;
    }

    public void remover(int id) throws SQLException {
        String sql = "delete from funcionarios cascade where fun_codigo=? ";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }

    public Funcionarios getEdit(int id) throws SQLException {
        String sql = "select funcionarios.fun_codigo,funcionarios.fun_nome,"
                + "funcionarios.fun_rg,funcionarios.cel_numero,funcionarios.tel_numero,"
                + "funcionarios.fun_data_cadastro,funcionarios.fun_cpf,funcionarios.fun_ctps,"
                + "enderecos.end_id,enderecos.end_cep,enderecos.end_complemento,"
                + "enderecos.end_bairro,enderecos.end_numero,enderecos.end_logradouro,"
                + "cidades.cid_codigo,cidades.cid_nome,estados.est_sigla,estados.est_nome "
                + "from funcionarios inner join enderecos on "
                + "funcionarios.end_id = enderecos.end_id inner join cidades on "
                + "enderecos.cid_codigo = cidades.cid_codigo inner join estados on "
                + "cidades.est_sigla = estados.est_sigla where funcionarios.fun_codigo = '" + id + "'";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        Funcionarios funcionario = new Funcionarios();
        Enderecos endereco = new Enderecos();
        Cidades cidade = new Cidades();
        Estados estado = new Estados();

        while (rs.next()) {
            funcionario.setFun_codigo(rs.getInt("fun_codigo"));
            funcionario.setFun_nome(rs.getString("fun_nome"));
            funcionario.setFun_rg(rs.getString("fun_rg"));
            funcionario.setFun_data_cadastro(rs.getDate("fun_data_cadastro"));
            funcionario.setFun_cpf(rs.getString("fun_cpf"));
            funcionario.setFun_ctps(rs.getString("fun_ctps"));
            funcionario.setTel_numero(rs.getString("tel_numero"));
            funcionario.setCel_numero(rs.getString("cel_numero"));
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
            funcionario.setEndereco(endereco);
        }

        rs.close();
        pstmt.execute();
        pstmt.close();
        return funcionario;
    }

    public int getLast() {
        int id = 0;
        String sql = "select max(fun_codigo) from funcionarios";

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
}
