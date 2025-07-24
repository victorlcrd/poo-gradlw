package src.Main;

public class Pilha<T>{

    private T[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        // T[] significa que é um vetor(array) generico
        elementos = (T[]) new Object[capacidade];
        topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo ==elementos.length -1;
    }

    public void empilhar(T elemento) {
        if (estaCheia()) {
            //se esta cheia, retorna pilhacheiaEx "esta cheia"
            throw new PilhaCheiaException("está cheia");
        }
        // else, retorna o "empilhar" adicionaado mais um
        topo++;
        //depois retorna o atributo elementos no topo e se torna o elemento T de empilhar
        elementos[topo] = elemento;
    }

    public T desempilhar() {
        if (estaVazia()) {
            // se estiver vazia, retorna a pilha vazia
            throw new PilhaVaziaException("esta vazia");
        }
        // caso não esteja vazia. retorna o elemento do topo
        T elemento = elementos[topo];
        // e tira um elemento do topo
        topo--;
        // depois retorna o elemento depois de remover um
        return elemento;
    }

    public T topo() {
        if (estaVazia()) {
            // caso esteja vazia
            throw new PilhaVaziaException("esta vazia");
        }
        // retorna o elemento do topo
        return elementos[topo];

    }


}
