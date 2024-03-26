import java.util.Scanner;

public class ControleRemoto{
    Scanner scanner = new Scanner(System.in);
    private ArCondicionado ar;
    public ControleRemoto(ArCondicionado ar) {
        this.ar = ar;
        ar.setLigado(true);
        ar.setIntensidade(2);
        ar.setOscilacao("Modo AUTO");
    }
    public void ligarArcondicionado(){
            System.out.println("Ligando..");
            this.ar.setLigado(true);
    }
    public void desligarArcondicionado(){
            System.out.println("Desligando..");
            this.ar.setLigado(false);
    }
    public String statusArcondicionado(){
        String oscilacao = this.ar.getOscilacao();
        int intensidade = this.ar.getIntensidade();

        if(!this.ar.isLigado()){
            return"Desligado";
        }else{
            return "Oscilação se encontra: " + oscilacao + "\n"+ "O nível de intesidade: " + intensidade;
        }
    }
    public void alterarIntensidade(){
        String mensagem = """
            Escala de intensidade de 0 á 5, onde 0 é 18 ºC e 5 24ºC.
            Digite a sua escolha:
            """;

        if(!this.ar.isLigado()){
            System.out.println("Desligado");
        }else{
            System.out.println(mensagem);
            this.ar.setIntensidade(scanner.nextInt());
            scanner.nextLine(); // Consumir a quebra de linha pendente
        }
    }

    public void alterarOscilacao(){
        String mensagem = """
            1 - Modo AUTO
            2 - Fan Speed
            3 - Modo SWING
            """;
        if(!this.ar.isLigado()){
            System.out.println("Desligado");
        }else{
            System.out.println(mensagem);
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente
            if(opcao == 1){
                this.ar.setOscilacao("Modo AUTO");
            }else if(opcao == 2){
                this.ar.setOscilacao("Fan Speed");
            }else if(opcao == 3){
                this.ar.setOscilacao("Modo SWING");
            }else{
                System.out.println("Opção Inválida");
                this.ar.setOscilacao("Modo AUTO");
            }
        }
    }
}
