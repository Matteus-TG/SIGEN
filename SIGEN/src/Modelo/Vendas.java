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
public class Vendas {

    private Chapas chapa;
    private int ven_codigo;
    private Date ven_data;
    private Proprietarios proprietario;

    public Chapas getChapa() {
        return chapa;
    }

    public void setChapa(Chapas chapa) {
        this.chapa = chapa;
    }

    public int getVen_codigo() {
        return ven_codigo;
    }

    public void setVen_codigo(int ven_codigo) {
        this.ven_codigo = ven_codigo;
    }

    public Date getVen_data() {
        return ven_data;
    }

    public void setVen_data(Date ven_data) {
        this.ven_data = ven_data;
    }

    public Proprietarios getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietarios proprietario) {
        this.proprietario = proprietario;
    }
}
