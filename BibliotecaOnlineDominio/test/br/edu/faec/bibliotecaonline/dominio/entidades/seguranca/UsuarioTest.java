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
        usuario = new Usuario.Builder()
                .nome("Leandro Reis")
                .login("lreis")
                .senha("senha")
                .perfil("Administrador")
                .build();
    }

    
    @Test
    public void aoAuteticarUsuarioESenha_comUsuarioESenhaValidos_RetornaTrue() {
        assertTrue(usuario.autenticar("lreis", "senha"));
    }
    
    @Test
    public void aoAuteticarUsuarioESenha_comUsuarioNulo_RetornaFalso() {
        assertFalse(usuario.autenticar(null, "senha"));
    }
    
    @Test
    public void aoAuteticarUsuarioESenha_comSenhaNula_RetornaFalso() {
        assertFalse(usuario.autenticar("", null));
    }
    
    @Test
    public void aoAuteticarUsuarioESenha_comUsuarioInvalido_RetornaFalso() {
        assertFalse(usuario.autenticar("invalido", "senha"));
    }    
    
    @Test
    public void aoAuteticarUsuarioESenha_comSenhaInvalida_RetornaFalso() {
        assertFalse(usuario.autenticar("invalido", "senha"));
    }
}
