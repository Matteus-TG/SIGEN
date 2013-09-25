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

    public Integer getLog_codigo() {
        return log_codigo;
    }

    public void setLog_codigo(Integer log_codigo) {
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

    public Integer getFun_codigo() {
        return fun_codigo;
    }

    public void setFun_codigo(Integer fun_codigo) {
        this.fun_codigo = fun_codigo;
    }
    private Integer log_codigo;
    private String log_senha;
    private String log_nome;
    private Integer fun_codigo;
}
