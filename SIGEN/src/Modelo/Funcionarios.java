/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author user
 */
public class Funcionarios {

    public Integer getFun_codigo() {
        return fun_codigo;
    }

    public void setFun_codigo(Integer fun_codigo) {
        this.fun_codigo = fun_codigo;
    }

    public Enderecos getEndereco() {
        return endereco;
    }

    public void setEndereco(Enderecos endereco) {
        this.endereco = endereco;
    }

    public String getFun_nome() {
        return fun_nome;
    }

    public void setFun_nome(String fun_nome) {
        this.fun_nome = fun_nome;
    }

    public Date getFun_data_cadastro() {
        return fun_data_cadastro;
    }

    public void setFun_data_cadastro(Date fun_data_cadastro) {
        this.fun_data_cadastro = fun_data_cadastro;
    }

    public String getFun_cpf() {
        return fun_cpf;
    }

    public void setFun_cpf(String fun_cpf) {
        this.fun_cpf = fun_cpf;
    }

    public String getFun_rg() {
        return fun_rg;
    }

    public void setFun_rg(String fun_rg) {
        this.fun_rg = fun_rg;
    }

    public String getFun_ctps() {
        return fun_ctps;
    }

    public void setFun_ctps(String fun_ctps) {
        this.fun_ctps = fun_ctps;
    }

    public String getTel_numero() {
        return tel_numero;
    }

    public void setTel_numero(String tel_numero) {
        this.tel_numero = tel_numero;
    }

    public String getCel_numero() {
        return cel_numero;
    }

    public void setCel_numero(String cel_numero) {
        this.cel_numero = cel_numero;
    }
    private Integer fun_codigo;
    private Enderecos endereco;
    private String fun_nome;
    private Date fun_data_cadastro;
    private String fun_cpf;
    private String fun_rg;
    private String fun_ctps;
    private String tel_numero;
    private String cel_numero;
}
