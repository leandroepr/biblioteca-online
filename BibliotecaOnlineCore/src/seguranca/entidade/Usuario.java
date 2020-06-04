package seguranca.entidade;

/**
 *
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 03/06/2020
 */
public class Usuario {

    private String nome;
    private String login;
    private String senha;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login.toLowerCase();
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
