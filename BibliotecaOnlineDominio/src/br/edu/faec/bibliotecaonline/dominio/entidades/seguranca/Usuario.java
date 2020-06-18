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

    private Usuario(Builder builder) {
        this.nome = builder.nome;
        this.login = builder.login;
        this.senha = builder.senha;
        this.perfil = builder.perfil;
    }

    public static class Builder {

        private String nome;
        private String login;
        private String senha;
        private String perfil;
        
        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }
        
        
        public Builder login(String login){
            this.login = login;
            return this;
        }
        
        
        public Builder senha(String senha){
            this.senha = senha;
            return this;
        }        
        
        public Builder perfil(String perfil){
            this.perfil = perfil;
            return this;
        }
        
        public Usuario build(){
            return new Usuario(this);
        }

    }

    public boolean autenticar(String login, String senha) {
        return this.login.equalsIgnoreCase(login) && this.senha.equals(senha);
    }
}
