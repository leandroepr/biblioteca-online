package br.edu.faec.bibliotecaonline.dominio.entidades.seguranca;

/**
 * 
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 16/06/2020
 */
public class Usuario {
    private final String nome;
    private final String login;
    private final String senha;
    private final String perfil;

    public Usuario(String nome, String login, String senha, String perfil) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }
    
    public boolean autenticar(String login, String senha){
        return this.login.equalsIgnoreCase(login) && this.senha.equals(senha);
    }
}
