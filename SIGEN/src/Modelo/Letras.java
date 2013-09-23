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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    private String letra;
    private Quadras quadra;
    private int codigo;
}
