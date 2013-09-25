/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author user
 */
public class Chapas {

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Proprietarios getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietarios proprietario) {
        this.proprietario = proprietario;
    }

    public Letras getLetra() {
        return letra;
    }

    public void setLetra(Letras letra) {
        this.letra = letra;
    }

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }
    private Integer codigo;
    private Proprietarios proprietario;
    private Letras letra;
    private String chapa;
}
