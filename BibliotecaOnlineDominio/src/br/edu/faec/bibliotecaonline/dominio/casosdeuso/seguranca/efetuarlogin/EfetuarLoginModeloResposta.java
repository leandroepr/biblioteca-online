package br.edu.faec.bibliotecaonline.dominio.casosdeuso.seguranca.efetuarlogin;

/**
 * 
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 16/06/2020
 */
public class EfetuarLoginModeloResposta {
    private final String nome;
    private final String login;
    private final String perfil;

    public EfetuarLoginModeloResposta(String nome, String login, String perfil) {
        this.nome = nome;
        this.login = login;
        this.perfil = perfil;
    }
}
