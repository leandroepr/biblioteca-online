//package br.edu.faec.bibliotecaonline.dominio.casosdeuso.seguranca.efetuarlogin;
//
//import br.edu.faec.bibliotecaonline.dominio.repositorio.seguranca.UsuarioRepositorio;
//import org.junit.Before;
//import org.junit.Test;
//import static org.mockito.Mockito.*;
//import br.edu.faec.bibliotecaonline.dominio.entidades.seguranca.Usuario;
//import static org.junit.Assert.assertEquals;
//import org.mockito.ArgumentCaptor;
//
///**
// *
// * @author Leandro Reis <leandro.e.reis@gmail.com>
// */
//public class NewEmptyJUnitTest {
//
//    @Before
//    public void setUp() {
//    }
//
//    @Test
//    public void dadoUsuarioESenhaValidos_QuandoRetornochegar_EntaoProssegue() {
//        EfetuarLoginRequestModel parametros = new EfetuarLoginRequestModel("lreis", "senha");
//        EfetuarLoginResponseModel resposta = new EfetuarLoginResponseModel("Leandro Reis", "lreis", "Administrador");
//
//        Usuario usuario = new Usuario();
//        usuario.setNome("Leandro Reis");
//        usuario.setLogin("lreis");
//        usuario.setSenha("senha");
//
//        UsuarioRepositorio repositorioFake = mock(UsuarioRepositorio.class);
//        when(repositorioFake.recuperarUsuarioViaLogin(usuario.getLogin())).thenReturn(usuario);
//
//        EfetuarLoginOutputPort clienteFake = mock(EfetuarLoginOutputPort.class);
//        EfetuarLoginInteractor interactor = new EfetuarLoginInteractor(repositorioFake, clienteFake);
//
//        interactor.executar(parametros);
//        
//        ArgumentCaptor<EfetuarLoginResponseModel> argument = ArgumentCaptor.forClass(EfetuarLoginResponseModel.class);
//        verify(clienteFake).onNext(argument.capture());
//        assertEquals(resposta.getNome(), argument.getValue().getNome());
//        assertEquals(resposta.getLogin(), argument.getValue().getLogin());
//        assertEquals(resposta.getTipo(), argument.getValue().getTipo());
//        verify(clienteFake).onComplete();
//    }
//}
