import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Quantos carros podem ser adicionados: ");
        int tamanho = sc.nextInt();
        RegistroCarros registro = new RegistroCarros(tamanho);
        int opcao = -1;

        while(opcao != 0){
            int posicao = 0;
            menu();
            opcao = sc.nextInt();
            switch (opcao){
                case 1-> {
                    Carro carro = new Carro();
                    System.out.println("Marca: ");
                    sc.nextLine();
                    carro.setMarca(sc.nextLine());
                    System.out.println("Modelo: ");
                    sc.nextLine();
                    carro.setModelo(sc.nextLine());
                    System.out.println("Placa: ");
                    carro.setPlaca(sc.next());
                    System.out.println("Chassi: ");
                    carro.setChassi(sc.next());
                    registro.adiciona(carro);
                }
                case 2->{
                    System.out.println("Favor informa a posição para busca: ");
                    posicao = sc.nextInt();
                    registro.busca(posicao);
                }
                case 3-> {
                    System.out.println("Favor informa a posição para remoção de veiculo: ");
                    posicao = sc.nextInt();
                    registro.remove(posicao);
                }
                case 0-> {
                    System.out.println("Processos finalizados");
                    System.exit(0);
                }
            }
        }
    }
    public static void menu(){
        String menu = """
                Menu de opções:
                1. Adicionar carro
                2. Busca
                3. Remover carro
                0. Sair
                """;
        System.out.println(menu);
    }
}