package ListaEncadeada;
import No.No;

public class ListaDEncadeada {
    public No inicio;
    
    public ListaDEncadeada(){
        this.inicio = null;
    }
    
    public void inserir(int valor){
        if (this.inicio == null){
            this.inicio = new No(valor);
        }else{
            No atual = this.inicio;
            No anterior = this.inicio;
            
            while(atual.next != null){
                anterior = atual;
                atual = atual.next;
            }
            atual.next = new No(valor);
            atual.prev = anterior;
            atual.next.prev = new No(valor);
            
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
}
