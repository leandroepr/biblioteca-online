package br.edu.faec.bibliotecaonline.dominio.contratos;

/**
 * 
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @param <T>
 * @date 16/06/2020
 */
public interface Requisicao <T>{
    void executar(T parametros);
}
