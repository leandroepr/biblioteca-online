package br.edu.faec.bibliotecaonline.dominio.repositorio.seguranca;

import br.edu.faec.bibliotecaonline.dominio.entidades.seguranca.Usuario;

/**
 * 
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 04/06/2020
 */
public interface UsuarioRepositorio {
    public Usuario recuperarUsuarioViaLogin(String login);
}
