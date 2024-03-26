import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();
        
        String abreviatura = abreviarNome(nomeCompleto);
        System.out.println("Abreviatura: " + abreviatura);
    }
    
    public static String abreviarNome(String nomeCompleto) {
        String[] partesNome = nomeCompleto.split(" ");
        StringBuilder abreviatura = new StringBuilder();

        for (int i = 0; i < partesNome.length; i++) {
            if (i == 0 || i == partesNome.length - 1 || partesNome[i].length() > 2) {
                abreviatura.append(partesNome[i].charAt(0)).append(".");
            }
        }

        return abreviatura.toString();
    }
}
