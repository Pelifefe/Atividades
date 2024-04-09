public class FilaMain {
    public static void main(String []args){
        Fila<Integer> fila = new Fila<Integer>();
        fila.enfileira(3);
        fila.enfileira(2);
        fila.enfileira(1);

        System.out.println("A fila está vazia? " + fila.estaVazia());

        System.out.println("Qual o tamanho da fila: " + fila.tamanho());

        System.out.println(fila.toString());

        System.out.println("Elemento 1º posição: " + fila.espiar());
        fila.desenfileira();
        System.out.println(fila.toString());
    }
}
