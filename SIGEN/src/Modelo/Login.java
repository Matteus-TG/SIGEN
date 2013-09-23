/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author user
 */
public class Login {

    public int getLog_codigo() {
        return log_codigo;
    }

    public void setLog_codigo(int log_codigo) {
        this.log_codigo = log_codigo;
    }

    public String getLog_senha() {
        return log_senha;
    }

    public void setLog_senha(String log_senha) {
        this.log_senha = log_senha;
    }

    public String getLog_nome() {
        return log_nome;
    }

    public void setLog_nome(String log_nome) {
        this.log_nome = log_nome;
    }

    public int getFun_codigo() {
        return fun_codigo;
    }

    public void setFun_codigo(int fun_codigo) {
        this.fun_codigo = fun_codigo;
    }
    private int log_codigo;
    private String log_senha;
    private String log_nome;
    private int fun_codigo;
}
