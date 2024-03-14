import java.util.*;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        int opcao;
        ControleRemoto controle = new ControleRemoto(ar);
        do{

            menu();
            opcao = scanner.nextInt();

            switch(opcao){
                case 0:
                    System.out.println("Operações Finalizadas");
                    break;
                case 1:
                    controle.ligarArcondicionado();
                    break;
                case 2:
                    controle.desligarArcondicionado();
                    break;
                case 3:
                    System.out.println(controle.statusArcondicionado());
                    break;
                case 4:
                    controle.alterarIntensidade();
                    break;
                case 5:
                    controle.alterarOscilacao();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
    public static void menu(){
        String mensagem = """
                Opções do ar condicionado:
                0. Sair
                1. Ligar
                2. Desligar
                3. Status
                4. Alterar intensidade
                5. Alterar oscilação
                """;
        System.out.println("\n" + mensagem);
    }
}