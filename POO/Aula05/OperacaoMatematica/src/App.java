public class App {
    public static void main(String[] args) throws Exception {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao(); 
        Divisao divisao = new Divisao();

        System.out.println("Soma: " + soma.calcular(3, 3));
        System.out.println("Subtracao: " + subtracao.calcular(3, 3));
        System.out.println("Multiplicacao: " + multiplicacao.calcular(3, 3));
        System.out.println("Divisao: " + divisao.calcular(3, 3));
    }
}
