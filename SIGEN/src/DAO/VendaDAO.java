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
import Modelo.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matt
 */
public class VendaDAO {

    private Connection conexao;

    public VendaDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Vendas venda) throws SQLException {
        String sql = "insert into vendas (ven_data,cha_codigo,pro_codigo) values (?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(venda.getVen_data().getTime()));
            stmt.setInt(2, venda.getChapa().getCodigo());
            stmt.setInt(3, venda.getProprietario().getPro_codigo());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Vendas> getByName(String nome) throws SQLException {
        String sql = "select proprietarios.pro_codigo,proprietarios.pro_nome,"
                + "proprietarios.pro_cpf,proprietarios.pro_rg,chapas.cha_chapa,"
                + "letras.let_letra,quadras.tum_quadra,vendas.ven_data from "
                + "proprietarios inner join   vendas on proprietarios.pro_codigo = vendas.pro_codigo "
                + "inner join chapas on chapas.cha_codigo = vendas.cha_codigo "
                + "inner join letras on chapas.cha_letra = letras.let_codigo "
                + "inner join quadras on letras.let_quadra = quadras.tum_quadra "
                + "where proprietarios.pro_nome ilike '%" + nome + "%'";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Vendas> vendas = new ArrayList<>();

        while (rs.next()) {
            Proprietarios proprietario = new Proprietarios();
            Vendas venda = new Vendas();
            Chapas chapa = new Chapas();
            Letras letra = new Letras();
            Quadras quadra = new Quadras();

            proprietario.setPro_codigo(rs.getInt("pro_codigo"));
            proprietario.setPro_nome(rs.getString("pro_nome"));
            proprietario.setPro_rg(rs.getString("pro_rg"));
            proprietario.setPro_cpf(rs.getString("pro_cpf"));
            quadra.setQuadra(rs.getString("tum_quadra"));
            letra.setQuadra(quadra);
            letra.setLetra(rs.getString("let_letra"));
            chapa.setLetra(letra);
            chapa.setChapa(rs.getString("cha_chapa"));
            venda.setChapa(chapa);
            venda.setProprietario(proprietario);
            venda.setVen_data(rs.getDate("ven_data"));
            vendas.add(venda);
        }
        rs.close();
        pstmt.close();
        return vendas;
    }

    public List<Vendas> getByDate(java.util.Date dataI, java.util.Date dataF) throws SQLException {
        String sql = "select proprietarios.pro_codigo,proprietarios.pro_nome,"
                + "proprietarios.pro_cpf,proprietarios.pro_rg,chapas.cha_chapa,"
                + "letras.let_letra,quadras.tum_quadra,vendas.ven_data from "
                + "proprietarios inner join   vendas on proprietarios.pro_codigo = vendas.pro_codigo "
                + "inner join chapas on chapas.cha_codigo = vendas.cha_codigo "
                + "inner join letras on chapas.cha_letra = letras.let_codigo "
                + "inner join quadras on letras.let_quadra = quadras.tum_quadra "
                + "where vendas.ven_data >= ? AND vendas.ven_data <= ?";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setDate(1, new java.sql.Date(dataI.getTime()));
        pstmt.setDate(2, new java.sql.Date(dataF.getTime()));

        ResultSet rs = pstmt.executeQuery();
        List<Vendas> vendas = new ArrayList<>();

        while (rs.next()) {
            Proprietarios proprietario = new Proprietarios();
            Vendas venda = new Vendas();
            Chapas chapa = new Chapas();
            Letras letra = new Letras();
            Quadras quadra = new Quadras();

            proprietario.setPro_codigo(rs.getInt("pro_codigo"));
            proprietario.setPro_nome(rs.getString("pro_nome"));
            proprietario.setPro_rg(rs.getString("pro_rg"));
            proprietario.setPro_cpf(rs.getString("pro_cpf"));
            quadra.setQuadra(rs.getString("tum_quadra"));
            letra.setQuadra(quadra);
            letra.setLetra(rs.getString("let_letra"));
            chapa.setLetra(letra);
            chapa.setChapa(rs.getString("cha_chapa"));
            venda.setChapa(chapa);
            venda.setProprietario(proprietario);
            venda.setVen_data(rs.getDate("ven_data"));
            vendas.add(venda);
        }
        rs.close();
        pstmt.close();
        return vendas;
    }

    public List<Vendas> getByTomb(String quadraAux, String chapaAux, String letraAux) throws SQLException {
        String sql = "select proprietarios.pro_codigo,proprietarios.pro_nome,"
                + "proprietarios.pro_cpf,proprietarios.pro_rg,chapas.cha_chapa,"
                + "letras.let_letra,quadras.tum_quadra,vendas.ven_data from "
                + "proprietarios inner join   vendas on proprietarios.pro_codigo = vendas.pro_codigo "
                + "inner join chapas on chapas.cha_codigo = vendas.cha_codigo "
                + "inner join letras on chapas.cha_letra = letras.let_codigo "
                + "inner join quadras on letras.let_quadra = quadras.tum_quadra "
                + "where quadras.tum_quadra = ? AND chapas.cha_chapa = ? AND letras.let_letra = ?";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, quadraAux);
        pstmt.setString(2, chapaAux);
        pstmt.setString(3, letraAux);

        ResultSet rs = pstmt.executeQuery();
        List<Vendas> vendas = new ArrayList<>();

        while (rs.next()) {
            Proprietarios proprietario = new Proprietarios();
            Vendas venda = new Vendas();
            Chapas chapa = new Chapas();
            Letras letra = new Letras();
            Quadras quadra = new Quadras();

            proprietario.setPro_codigo(rs.getInt("pro_codigo"));
            proprietario.setPro_nome(rs.getString("pro_nome"));
            proprietario.setPro_rg(rs.getString("pro_rg"));
            proprietario.setPro_cpf(rs.getString("pro_cpf"));
            quadra.setQuadra(rs.getString("tum_quadra"));
            letra.setQuadra(quadra);
            letra.setLetra(rs.getString("let_letra"));
            chapa.setLetra(letra);
            chapa.setChapa(rs.getString("cha_chapa"));
            venda.setChapa(chapa);
            venda.setProprietario(proprietario);
            venda.setVen_data(rs.getDate("ven_data"));
            vendas.add(venda);
        }
        rs.close();
        pstmt.close();
        return vendas;
    }
}
