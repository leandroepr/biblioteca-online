package br.edu.faec.bibliotecaonline.dominio.casosdeuso.seguranca.efetuarlogin;

import br.edu.faec.bibliotecaonline.dominio.entidades.seguranca.Usuario;
import br.edu.faec.bibliotecaonline.dominio.repositorio.seguranca.UsuarioRepositorio;
import br.edu.faec.bibliotecaonline.dominio.excecoes.seguranca.FalhaNaAutenticacao;

/**
 *
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 04/06/2020
 */
public class EfetuarLoginInteractor implements EfetuarLoginInputPort {

    private final UsuarioRepositorio repositorio;
    private final EfetuarLoginOutputPort cliente;

    public EfetuarLoginInteractor(UsuarioRepositorio repositorio, EfetuarLoginOutputPort cliente) {
        this.repositorio = repositorio;
        this.cliente = cliente;
    }

    @Override
    public void executar(EfetuarLoginRequestModel requestModel) {
        Usuario user = repositorio.recuperarUsuarioViaLogin(requestModel.getLogin());
        if (user == null) {
            cliente.onError(new FalhaNaAutenticacao());
        } else if (user.validarSenha(requestModel.getSenha())) {
            EfetuarLoginResponseModel resposta;
            resposta = new EfetuarLoginResponseModel(user.getNome(), user.getLogin(), "Administrador");
            cliente.onNext(resposta);
        } else{
            cliente.onError(new FalhaNaAutenticacao());
        }
        cliente.onComplete();
    }

}
