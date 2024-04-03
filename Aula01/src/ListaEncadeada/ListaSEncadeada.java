/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEncadeada;
import No.No;

/**
 *
 * @author ipimenta
 */
public class ListaSEncadeada {
    
    public No inicio;
    
    public ListaSEncadeada(){
        this.inicio = null;
    }
    
    
    public void inserir(int valor){
        if (this.inicio == null){
            this.inicio = new No(valor);
        }else{
            No atual = this.inicio;
            
            while(atual.next != null){
                atual = atual.next;
            }
            
            atual.next = new No(valor);
            
        }   
    }
    
    public void remover(int valor){
        if (this.inicio == null){
            System.out.println("Não tem nada na lista!!!!!");
        }else{
            if (this.inicio.valor == valor){
                this.inicio = this.inicio.next;
            }else{
                No atual = this.inicio;
                No anterior = this.inicio;
                while(atual.valor != valor){
                    anterior = atual;
                    atual = atual.next;
                }
                anterior.next = atual.next;
            }
            
        } 
    }
    
    public int tamanhoLista(){
        int count = 0;
        if (this.inicio != null){
            No atual = this.inicio;
            count = 1;
            while(atual.next != null){
                count++;
            }
        } 
        return count;
    }
    
    public int buscarValor(int valor){
        No atual = this.inicio;
        while(atual.valor != valor){
            if(atual.next == null){
                return -1;
            }
            atual = atual.next;
        }
        
        return atual.valor;    
        
    }
}
