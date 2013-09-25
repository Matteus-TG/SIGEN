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
public class Obitos {

    public Integer getObi_codigo() {
        return obi_codigo;
    }

    public void setObi_codigo(Integer obi_codigo) {
        this.obi_codigo = obi_codigo;
    }

    public String getObi_protocolo() {
        return obi_protocolo;
    }

    public void setObi_protocolo(String obi_protocolo) {
        this.obi_protocolo = obi_protocolo;
    }

    public String getObi_guia() {
        return obi_guia;
    }

    public void setObi_guia(String obi_guia) {
        this.obi_guia = obi_guia;
    }

    public String getObi_mae() {
        return obi_mae;
    }

    public void setObi_mae(String obi_mae) {
        this.obi_mae = obi_mae;
    }

    public String getObi_causa_morte() {
        return obi_causa_morte;
    }

    public void setObi_causa_morte(String obi_causa_morte) {
        this.obi_causa_morte = obi_causa_morte;
    }

    public String getObi_pai() {
        return obi_pai;
    }

    public void setObi_pai(String obi_pai) {
        this.obi_pai = obi_pai;
    }

    public String getObi_nome() {
        return obi_nome;
    }

    public void setObi_nome(String obi_nome) {
        this.obi_nome = obi_nome;
    }

    public String getObi_idade() {
        return obi_idade;
    }

    public void setObi_idade(String obi_idade) {
        this.obi_idade = obi_idade;
    }

    public Date getObi_data() {
        return obi_data;
    }

    public void setObi_data(Date obi_data) {
        this.obi_data = obi_data;
    }

    public String getObi_medico() {
        return obi_medico;
    }

    public void setObi_medico(String obi_medico) {
        this.obi_medico = obi_medico;
    }

    public String getObi_numero_documento() {
        return obi_numero_documento;
    }

    public void setObi_numero_documento(String obi_numero_documento) {
        this.obi_numero_documento = obi_numero_documento;
    }

    public Cidades getCidade() {
        return cidade;
    }

    public void setCidade(Cidades cidade) {
        this.cidade = cidade;
    }

    public Proprietarios getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietarios proprietario) {
        this.proprietario = proprietario;
    }

    public Chapas getChapa() {
        return chapa;
    }

    public void setChapa(Chapas chapa) {
        this.chapa = chapa;
    }
    private Integer obi_codigo;
    private String obi_protocolo;
    private String obi_guia;
    private String obi_mae;
    private String obi_causa_morte;
    private String obi_pai;
    private String obi_nome;
    private String obi_idade;
    private Date obi_data;
    private String obi_medico;
    private String obi_numero_documento;
    private Cidades cidade;
    private Proprietarios proprietario;
    private Chapas chapa;
}
