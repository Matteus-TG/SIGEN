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
public class Proprietarios {

    private Integer pro_codigo;
    private String pro_nome;
    private String pro_rg;
    private Date pro_nascimento;
    private String pro_cpf;
    private Enderecos endereco;
    private String tel_numero;
    private String cel_numero;

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

    public Integer getPro_codigo() {
        return pro_codigo;
    }

    public void setPro_codigo(Integer pro_codigo) {
        this.pro_codigo = pro_codigo;
    }

    public String getPro_nome() {
        return pro_nome;
    }

    public void setPro_nome(String pro_nome) {
        this.pro_nome = pro_nome;
    }

    public String getPro_rg() {
        return pro_rg;
    }

    public void setPro_rg(String pro_rg) {
        this.pro_rg = pro_rg;
    }

    public Date getPro_nascimento() {
        return pro_nascimento;
    }

    public void setPro_nascimento(Date pro_nascimento) {
        this.pro_nascimento = pro_nascimento;
    }

    public String getPro_cpf() {
        return pro_cpf;
    }

    public void setPro_cpf(String pro_cpf) {
        this.pro_cpf = pro_cpf;
    }

    public Enderecos getEndereco() {
        return endereco;
    }

    public void setEndereco(Enderecos endereco) {
        this.endereco = endereco;
    }
}
