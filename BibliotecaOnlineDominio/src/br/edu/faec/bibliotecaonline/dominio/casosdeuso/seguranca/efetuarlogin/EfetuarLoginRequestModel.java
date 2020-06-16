package br.edu.faec.bibliotecaonline.dominio.casosdeuso.seguranca.efetuarlogin;

/**
 * 
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 16/06/2020
 */
public class EfetuarLoginRequestModel {
    private final String login;
    private final String senha;

    public EfetuarLoginRequestModel(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }
    
    public String getSenha(){
        return senha;
    }
}
