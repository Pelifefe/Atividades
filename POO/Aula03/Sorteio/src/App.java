import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int chances = 0;
        int palpite = 0;
        int numeroSorteado = random.nextInt(1 + 1000);

        while(palpite != numeroSorteado){
            System.out.println("Informe seu palpite: ");
            palpite = scanner.nextInt();
            if(palpite < 0){
                System.out.println("Favor informar um palpite entre 1 a 1000");
            }else if(palpite > 1000){
                System.out.println("Valor maior que 1000");
            }else{
                if(chances < 10){
                    if(palpite < numeroSorteado){
                        System.out.println("Você errou, o seu palpite é menor que o número sorteado");
                        chances++;
                    }else if(palpite > numeroSorteado){
                        System.out.println("Você errou, o seu palpite é maior que o número sorteado");
                        chances++;
                    }else{
                        System.out.println("Parabens você acertou!");
                        break;
                    }
                }else{
                    System.out.println("Seu número de chances foi excedida!");
                }
            }
        }
        scanner.close();
    }
}
