package seguranca.entidade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 */
public class UsuarioTeste {

    public UsuarioTeste() {
    }

    @Test
    public void testCriacao() {
        Usuario usuario = new Usuario();
        assertNotNull(usuario);
    }

    @Test
    public void testAtributos() {
        Usuario usuario = new Usuario();
        usuario.setNome("Usuario");
        assertEquals("Usuario", usuario.getNome());
        usuario.setNome("Usuario2");
        assertEquals("Usuario2", usuario.getNome());

        usuario.setLogin("LOGIN");
        assertEquals("login", usuario.getLogin());
        usuario.setLogin("Login2");
        assertEquals("login2", usuario.getLogin());

        usuario.setSenha("senha");
        assertEquals("senha", usuario.getSenha());
        usuario.setSenha("Senh4");
        assertEquals("Senh4", usuario.getSenha());
    }

}
