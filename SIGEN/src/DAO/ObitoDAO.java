/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Chapas;
import Modelo.Cidades;
import Modelo.Letras;
import Modelo.Obitos;
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
 * @author matt
 */
public class ObitoDAO {

    private Connection conexao;

    public ObitoDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Obitos obito) throws SQLException {
        String sql = "insert into obitos (cha_codigo,obi_nome,obi_idade,"
                + "cid_codigo,obi_protocolo,obi_guia,obi_data,"
                + "obi_numero_documento,obi_mae,obi_pai,obi_medico,obi_causa_morte) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setInt(1, obito.getChapa().getCodigo());
            stmt.setString(2, obito.getObi_nome());
            stmt.setString(3, obito.getObi_idade());
            stmt.setInt(4, obito.getCidade().getCid_codigo());
            stmt.setString(5, obito.getObi_protocolo());
            stmt.setString(6, obito.getObi_guia());
            stmt.setDate(7, new java.sql.Date(obito.getObi_data().getTime()));
            stmt.setString(8, obito.getObi_numero_documento());
            stmt.setString(9, obito.getObi_mae());
            stmt.setString(10, obito.getObi_pai());
            stmt.setString(11, obito.getObi_medico());
            stmt.setString(12, obito.getObi_causa_morte());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Obito cadastrado com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Obitos> listarCPF(String cpf) throws SQLException {
        String sql = "select proprietarios.pro_nome,obitos.obi_nome,"
                + "obitos.obi_idade,cidades.cid_nome,obitos.obi_protocolo,"
                + "obitos.obi_guia,obitos.obi_data,obitos.obi_numero_documento,"
                + "obitos.obi_pai,obitos.obi_mae,obitos.obi_medico,obitos.obi_causa_morte,"
                + "chapas.cha_chapa,letras.let_letra,quadras.tum_quadra from obitos inner join"
                + " chapas on obitos.cha_codigo = chapas.cha_codigo inner join"
                + " letras on letras.let_codigo = chapas.cha_letra inner join"
                + " quadras on letras.let_quadra = quadras.tum_quadra inner join"
                + " proprietarios on chapas.pro_codigo = proprietarios.pro_codigo inner join"
                + " cidades on cidades.cid_codigo = obitos.cid_codigo "
                + "where proprietarios.pro_cpf = '" + cpf + "' order by obitos.obi_data";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Obitos> obitos = new ArrayList<>();

        while (rs.next()) {
            Obitos obito = new Obitos();
            Proprietarios proprietario = new Proprietarios();
            Quadras quadra = new Quadras();
            Letras letra = new Letras();
            Chapas chapa = new Chapas();
            Cidades cidade = new Cidades();
            proprietario.setPro_nome(rs.getString("pro_nome"));
            obito.setProprietario(proprietario);
            obito.setObi_nome(rs.getString("obi_nome"));
            obito.setObi_idade(rs.getString("obi_idade"));
            cidade.setCid_nome(rs.getString("cid_nome"));
            obito.setCidade(cidade);
            obito.setObi_protocolo(rs.getString("obi_protocolo"));
            obito.setObi_guia(rs.getString("obi_guia"));
            obito.setObi_data(rs.getDate("obi_data"));
            obito.setObi_numero_documento(rs.getString("obi_numero_documento"));
            obito.setObi_pai(rs.getString("obi_pai"));
            obito.setObi_mae(rs.getString("obi_mae"));
            obito.setObi_medico(rs.getString("obi_medico"));
            obito.setObi_causa_morte(rs.getString("obi_causa_morte"));
            quadra.setQuadra(rs.getString("tum_quadra"));
            letra.setLetra(rs.getString("let_letra"));
            letra.setQuadra(quadra);
            chapa.setChapa(rs.getString("cha_chapa"));
            chapa.setLetra(letra);
            obito.setChapa(chapa);
            obitos.add(obito);
        }
        rs.close();
        pstmt.close();
        return obitos;
    }

    public List<Obitos> listarData(java.util.Date dataI, java.util.Date dataF) throws SQLException {
        String sql = "select proprietarios.pro_nome,obitos.obi_nome,"
                + "obitos.obi_idade,cidades.cid_nome,obitos.obi_protocolo,"
                + "obitos.obi_guia,obitos.obi_data,obitos.obi_numero_documento,"
                + "obitos.obi_pai,obitos.obi_mae,obitos.obi_medico,obitos.obi_causa_morte,"
                + "chapas.cha_chapa,letras.let_letra,quadras.tum_quadra from obitos inner join"
                + " chapas on obitos.cha_codigo = chapas.cha_codigo inner join"
                + " letras on letras.let_codigo = chapas.cha_letra inner join"
                + " quadras on letras.let_quadra = quadras.tum_quadra inner join"
                + " proprietarios on chapas.pro_codigo = proprietarios.pro_codigo inner join"
                + " cidades on cidades.cid_codigo = obitos.cid_codigo "
                + "where obi_data >= '?' AND obi_data <= ?  order by obitos.obi_data";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setDate(1, new java.sql.Date(dataI.getTime()));
        pstmt.setDate(2, new java.sql.Date(dataF.getTime()));
        ResultSet rs = pstmt.executeQuery();
        List<Obitos> obitos = new ArrayList<>();

        while (rs.next()) {
            Obitos obito = new Obitos();
            Proprietarios proprietario = new Proprietarios();
            Quadras quadra = new Quadras();
            Letras letra = new Letras();
            Chapas chapa = new Chapas();
            Cidades cidade = new Cidades();
            proprietario.setPro_nome(rs.getString("pro_nome"));
            obito.setProprietario(proprietario);
            obito.setObi_nome(rs.getString("obi_nome"));
            obito.setObi_idade(rs.getString("obi_idade"));
            cidade.setCid_nome(rs.getString("cid_nome"));
            obito.setCidade(cidade);
            obito.setObi_protocolo(rs.getString("obi_protocolo"));
            obito.setObi_guia(rs.getString("obi_guia"));
            obito.setObi_data(rs.getDate("obi_data"));
            obito.setObi_numero_documento(rs.getString("obi_numero_documento"));
            obito.setObi_pai(rs.getString("obi_pai"));
            obito.setObi_mae(rs.getString("obi_mae"));
            obito.setObi_medico(rs.getString("obi_medico"));
            obito.setObi_causa_morte(rs.getString("obi_causa_morte"));
            quadra.setQuadra(rs.getString("tum_quadra"));
            letra.setLetra(rs.getString("let_letra"));
            letra.setQuadra(quadra);
            chapa.setChapa(rs.getString("cha_chapa"));
            chapa.setLetra(letra);
            obito.setChapa(chapa);
            obitos.add(obito);
        }
        rs.close();
        pstmt.close();
        return obitos;
    }

    public List<Obitos> listarObito(String nome) throws SQLException {
        String sql = "select proprietarios.pro_nome,obitos.obi_nome,"
                + "obitos.obi_idade,cidades.cid_nome,obitos.obi_protocolo,"
                + "obitos.obi_guia,obitos.obi_data,obitos.obi_numero_documento,"
                + "obitos.obi_pai,obitos.obi_mae,obitos.obi_medico,obitos.obi_causa_morte,"
                + "chapas.cha_chapa,letras.let_letra,quadras.tum_quadra from obitos inner join"
                + " chapas on obitos.cha_codigo = chapas.cha_codigo inner join"
                + " letras on letras.let_codigo = chapas.cha_letra inner join"
                + " quadras on letras.let_quadra = quadras.tum_quadra inner join"
                + " proprietarios on chapas.pro_codigo = proprietarios.pro_codigo inner join"
                + " cidades on cidades.cid_codigo = obitos.cid_codigo "
                + "where obitos.obi_nome ilike '%" + nome + "%' order by obitos.obi_data";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Obitos> obitos = new ArrayList<>();

        while (rs.next()) {
            Obitos obito = new Obitos();
            Proprietarios proprietario = new Proprietarios();
            Quadras quadra = new Quadras();
            Letras letra = new Letras();
            Chapas chapa = new Chapas();
            Cidades cidade = new Cidades();
            proprietario.setPro_nome(rs.getString("pro_nome"));
            obito.setProprietario(proprietario);
            obito.setObi_nome(rs.getString("obi_nome"));
            obito.setObi_idade(rs.getString("obi_idade"));
            cidade.setCid_nome(rs.getString("cid_nome"));
            obito.setCidade(cidade);
            obito.setObi_protocolo(rs.getString("obi_protocolo"));
            obito.setObi_guia(rs.getString("obi_guia"));
            obito.setObi_data(rs.getDate("obi_data"));
            obito.setObi_numero_documento(rs.getString("obi_numero_documento"));
            obito.setObi_pai(rs.getString("obi_pai"));
            obito.setObi_mae(rs.getString("obi_mae"));
            obito.setObi_medico(rs.getString("obi_medico"));
            obito.setObi_causa_morte(rs.getString("obi_causa_morte"));
            quadra.setQuadra(rs.getString("tum_quadra"));
            letra.setLetra(rs.getString("let_letra"));
            letra.setQuadra(quadra);
            chapa.setChapa(rs.getString("cha_chapa"));
            chapa.setLetra(letra);
            obito.setChapa(chapa);
            obitos.add(obito);
        }
        rs.close();
        pstmt.close();
        return obitos;
    }

    public List<Obitos> listarNomeP(String nome) throws SQLException {
        String sql = "select proprietarios.pro_nome,obitos.obi_nome,"
                + "obitos.obi_idade,cidades.cid_nome,obitos.obi_protocolo,"
                + "obitos.obi_guia,obitos.obi_data,obitos.obi_numero_documento,"
                + "obitos.obi_pai,obitos.obi_mae,obitos.obi_medico,obitos.obi_causa_morte,"
                + "chapas.cha_chapa,letras.let_letra,quadras.tum_quadra from obitos inner join"
                + " chapas on obitos.cha_codigo = chapas.cha_codigo inner join"
                + " letras on letras.let_codigo = chapas.cha_letra inner join"
                + " quadras on letras.let_quadra = quadras.tum_quadra inner join"
                + " proprietarios on chapas.pro_codigo = proprietarios.pro_codigo inner join"
                + " cidades on cidades.cid_codigo = obitos.cid_codigo "
                + "where proprietarios.pro_nome ilike '%" + nome + "%' order by obitos.obi_data";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Obitos> obitos = new ArrayList<>();

        while (rs.next()) {
            Obitos obito = new Obitos();
            Proprietarios proprietario = new Proprietarios();
            Quadras quadra = new Quadras();
            Letras letra = new Letras();
            Chapas chapa = new Chapas();
            Cidades cidade = new Cidades();
            proprietario.setPro_nome(rs.getString("pro_nome"));
            obito.setProprietario(proprietario);
            obito.setObi_nome(rs.getString("obi_nome"));
            obito.setObi_idade(rs.getString("obi_idade"));
            cidade.setCid_nome(rs.getString("cid_nome"));
            obito.setCidade(cidade);
            obito.setObi_protocolo(rs.getString("obi_protocolo"));
            obito.setObi_guia(rs.getString("obi_guia"));
            obito.setObi_data(rs.getDate("obi_data"));
            obito.setObi_numero_documento(rs.getString("obi_numero_documento"));
            obito.setObi_pai(rs.getString("obi_pai"));
            obito.setObi_mae(rs.getString("obi_mae"));
            obito.setObi_medico(rs.getString("obi_medico"));
            obito.setObi_causa_morte(rs.getString("obi_causa_morte"));
            quadra.setQuadra(rs.getString("tum_quadra"));
            letra.setLetra(rs.getString("let_letra"));
            letra.setQuadra(quadra);
            chapa.setChapa(rs.getString("cha_chapa"));
            chapa.setLetra(letra);
            obito.setChapa(chapa);
            obitos.add(obito);
        }
        rs.close();
        pstmt.close();
        return obitos;
    }

    public List<Obitos> listarTumulo(int ID) throws SQLException {
        String sql = "select proprietarios.pro_nome,obitos.obi_nome,"
                + "obitos.obi_idade,cidades.cid_nome,obitos.obi_protocolo,"
                + "obitos.obi_guia,obitos.obi_data,obitos.obi_numero_documento,"
                + "obitos.obi_pai,obitos.obi_mae,obitos.obi_medico,obitos.obi_causa_morte,"
                + "chapas.cha_chapa,letras.let_letra,quadras.tum_quadra from obitos inner join"
                + " chapas on obitos.cha_codigo = chapas.cha_codigo inner join"
                + " letras on letras.let_codigo = chapas.cha_letra inner join"
                + " quadras on letras.let_quadra = quadras.tum_quadra inner join"
                + " proprietarios on chapas.pro_codigo = proprietarios.pro_codigo inner join"
                + " cidades on cidades.cid_codigo = obitos.cid_codigo "
                + "where chapas.cha_codigo = " + ID + " order by obitos.obi_data";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Obitos> obitos = new ArrayList<>();

        while (rs.next()) {
            Obitos obito = new Obitos();
            Proprietarios proprietario = new Proprietarios();
            Quadras quadra = new Quadras();
            Letras letra = new Letras();
            Chapas chapa = new Chapas();
            Cidades cidade = new Cidades();
            proprietario.setPro_nome(rs.getString("pro_nome"));
            obito.setProprietario(proprietario);
            obito.setObi_nome(rs.getString("obi_nome"));
            obito.setObi_idade(rs.getString("obi_idade"));
            cidade.setCid_nome(rs.getString("cid_nome"));
            obito.setCidade(cidade);
            obito.setObi_protocolo(rs.getString("obi_protocolo"));
            obito.setObi_guia(rs.getString("obi_guia"));
            obito.setObi_data(rs.getDate("obi_data"));
            obito.setObi_numero_documento(rs.getString("obi_numero_documento"));
            obito.setObi_pai(rs.getString("obi_pai"));
            obito.setObi_mae(rs.getString("obi_mae"));
            obito.setObi_medico(rs.getString("obi_medico"));
            obito.setObi_causa_morte(rs.getString("obi_causa_morte"));
            quadra.setQuadra(rs.getString("tum_quadra"));
            letra.setLetra(rs.getString("let_letra"));
            letra.setQuadra(quadra);
            chapa.setChapa(rs.getString("cha_chapa"));
            chapa.setLetra(letra);
            obito.setChapa(chapa);
            obitos.add(obito);
        }
        rs.close();
        pstmt.close();
        return obitos;
    }

    public List<Obitos> listarAvancado(String sql) throws SQLException {
        sql = sql + " order by obitos.obi_data";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Obitos> obitos = new ArrayList<>();

        while (rs.next()) {
            Obitos obito = new Obitos();
            Proprietarios proprietario = new Proprietarios();
            Quadras quadra = new Quadras();
            Letras letra = new Letras();
            Chapas chapa = new Chapas();
            Cidades cidade = new Cidades();
            proprietario.setPro_nome(rs.getString("pro_nome"));
            obito.setProprietario(proprietario);
            obito.setObi_nome(rs.getString("obi_nome"));
            obito.setObi_idade(rs.getString("obi_idade"));
            cidade.setCid_nome(rs.getString("cid_nome"));
            obito.setCidade(cidade);
            obito.setObi_protocolo(rs.getString("obi_protocolo"));
            obito.setObi_guia(rs.getString("obi_guia"));
            obito.setObi_data(rs.getDate("obi_data"));
            obito.setObi_numero_documento(rs.getString("obi_numero_documento"));
            obito.setObi_pai(rs.getString("obi_pai"));
            obito.setObi_mae(rs.getString("obi_mae"));
            obito.setObi_medico(rs.getString("obi_medico"));
            obito.setObi_causa_morte(rs.getString("obi_causa_morte"));
            quadra.setQuadra(rs.getString("tum_quadra"));
            letra.setLetra(rs.getString("let_letra"));
            letra.setQuadra(quadra);
            chapa.setChapa(rs.getString("cha_chapa"));
            chapa.setLetra(letra);
            obito.setChapa(chapa);
            obitos.add(obito);
        }
        rs.close();
        pstmt.close();
        return obitos;
    }
}
