/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author user
 */
public class Cidades {

    public Integer getCid_codigo() {
        return cid_codigo;
    }

    public void setCid_codigo(Integer cid_codigo) {
        this.cid_codigo = cid_codigo;
    }

    public String getCid_nome() {
        return cid_nome;
    }

    public void setCid_nome(String cid_nome) {
        this.cid_nome = cid_nome;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    private Integer cid_codigo;
    private String cid_nome;
    private Estados estado;
}
