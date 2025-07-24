package src.Main;

public class App {

    public static void main(String[] args) {


        // pilha como integer(tipo de int) de nome pilhaDeNumeros, que é uma nova pilha com capacidade para 5 elementos
        Pilha<Integer> pilhaDeNumeros = new Pilha<>(4);
        // declara a classe livro, como um vetor da pilha com 6 posições
        Pilha<Livro> pilhaDeLivros = new Pilha<>(6);

        //testando a pilha
        System.out.println("---Testando a pilha---");
        //testando a pilha de numeros
        System.out.println("empilhando numeros 10, 20, 30, 40");
        //empilhando os números no vetor
        pilhaDeNumeros.empilhar(10);
        pilhaDeNumeros.empilhar(20);
        pilhaDeNumeros.empilhar(30);
        pilhaDeNumeros.empilhar(40);

        System.out.println("--------------");

        //testanndo o elemento no tpo
        System.out.println("elemento no topo: " + pilhaDeNumeros.topo());

        // desempilhando um elemento (30)
        System.out.println("Desempilhando: " + pilhaDeNumeros.desempilhar());

        //verifica se o elemento 30 foi removido e retorna o elemento do topo (20)
        System.out.println("novo elemento no topo: " + pilhaDeNumeros.topo());

        System.out.println("--------------");


        try {
            System.out.println("enchendo a pilha de numeros");

            pilhaDeNumeros.empilhar(70);

            System.out.println("tentando empilhar em pilha cheia");

            pilhaDeNumeros.empilhar(80);

        } catch (PilhaCheiaException e) {
            System.out.println("Erro captura: " + e.getMessage());
        }

        System.out.println("------------------");

        // consultado a pilha de livros vazia
        try {
            System.out.println("consultando pilha de livro vazia...");

            System.out.println("Topo da pilha de livros: " + pilhaDeLivros.topo());
        } catch (PilhaVaziaException e) {
            System.out.println("Erro de captura: " + e.getMessage());
        }



    }
}
