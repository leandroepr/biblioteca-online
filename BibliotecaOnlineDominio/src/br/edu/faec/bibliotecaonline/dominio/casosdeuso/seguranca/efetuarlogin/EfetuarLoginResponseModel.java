package br.edu.faec.bibliotecaonline.dominio.casosdeuso.seguranca.efetuarlogin;

/**
 * 
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 16/06/2020
 */
public class EfetuarLoginResponseModel{
    private final String nome;
    private final String login;
    private final String tipo;

    public EfetuarLoginResponseModel(String nome, String login, String tipo) {
        this.nome = nome;
        this.login = login;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getTipo() {
        return tipo;
    }
}
