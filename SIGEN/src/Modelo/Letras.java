/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author user
 */
public class Letras {

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Quadras getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadras quadra) {
        this.quadra = quadra;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    private String letra;
    private Quadras quadra;
    private Integer codigo;
}
