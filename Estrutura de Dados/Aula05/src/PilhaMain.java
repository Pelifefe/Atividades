
public class PilhaMain {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println("Pilha vazia: " + pilha.estaVazia());
        for (int i = 1; i <= 10; i++){
            pilha.empilha(i);
        }
        System.out.println(pilha);
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
        System.out.println("Pilha vazia: " + pilha.estaVazia());
        System.out.println(pilha.topo());
        ////
        pilha.desempilha();
        System.out.println("Desempilhada 1x");
        System.out.println(pilha);
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
    }
}