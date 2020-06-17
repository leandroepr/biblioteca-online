package br.edu.faec.bibliotecaonline.dominio.entidades.seguranca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 */
public class UsuarioTest {
    private Usuario usuario;
    public UsuarioTest() {
    }
    
    @Before
    public void setUp() {
        usuario = new Usuario("Leandro Reis", "lreis", "senha", "Administrador");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void aoAuteticarUsuarioESenha_comUsuarioESenhaValidos_RetornaTrue() {
        assertTrue(usuario.autenticar("lreis", "senha"));
    }
}
