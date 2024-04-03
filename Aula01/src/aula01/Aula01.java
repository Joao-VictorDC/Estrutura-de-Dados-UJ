/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import ListaEncadeada.ListaSEncadeada;
import ListaEncadeada.ListaDEncadeada;
/**
 *
 * @author ipimenta
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Pegar dois numeros e somar ");
//        
//        float n1,n2, result;
//        
//        n1 = 10;
//        n2 = 5;
//        
//        result = n1 + n2;
//        
//        System.out.println("A soma é " + result);


        ListaSEncadeada lista = new ListaSEncadeada();
        lista.inserir(10);
        lista.inserir(7);
        lista.inserir(2);
        lista.inserir(3);
        
        //remover
        lista.remover(2);
        //Buscar o valor na lista
        int valor;
        
        valor = lista.buscarValor(7);
        System.out.println(valor);
        
        ListaDEncadeada listaDupla = new ListaDEncadeada();
        listaDupla.inserir(10);
        listaDupla.inserir(7);
        listaDupla.inserir(2);
        listaDupla.inserir(3);
    }
    
}
