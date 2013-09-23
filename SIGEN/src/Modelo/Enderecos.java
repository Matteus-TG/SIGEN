/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author user
 */
public class Enderecos {

    private int end_id;
    private String end_cep;
    private String end_complemento;
    private String end_bairro;
    private String end_logradouro;
    private String end_numero;
    private Cidades cidade;

    public int getEnd_id() {
        return end_id;
    }

    public void setEnd_id(int end_id) {
        this.end_id = end_id;
    }

    public String getEnd_cep() {
        return end_cep;
    }

    public void setEnd_cep(String end_cep) {
        this.end_cep = end_cep;
    }

    public String getEnd_complemento() {
        return end_complemento;
    }

    public void setEnd_complemento(String end_complemento) {
        this.end_complemento = end_complemento;
    }

    public String getEnd_bairro() {
        return end_bairro;
    }

    public void setEnd_bairro(String end_bairro) {
        this.end_bairro = end_bairro;
    }

    public String getEnd_logradouro() {
        return end_logradouro;
    }

    public void setEnd_logradouro(String end_logradouro) {
        this.end_logradouro = end_logradouro;
    }

    public String getEnd_numero() {
        return end_numero;
    }

    public void setEnd_numero(String end_numero) {
        this.end_numero = end_numero;
    }

    public Cidades getCidade() {
        return cidade;
    }

    public void setCidade(Cidades cidade) {
        this.cidade = cidade;
    }
}
