package br.edu.faec.bibliotecaonline.dominio.casosdeuso.seguranca.efetuarlogin;

/**
 * 
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 16/06/2020
 */
public class EfetuarLoginModeloRequisicao {
    private final String login;
    private final String senha;

    public EfetuarLoginModeloRequisicao(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
}
