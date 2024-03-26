public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();
        
        carro.velocidade = 23; //Atributo protected os demais em private não é possivel o acesso
    }
}
