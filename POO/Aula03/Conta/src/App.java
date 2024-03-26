public class App {
    public static void main(String[] args) {
        Cliente especial = new Cliente(1000);
        especial.setEspecial(true);

        Cliente comum = new Cliente(1000);
        comum.setEspecial(false);

        System.out.println("Saldo atual especial: " + especial.sacar(100));
        System.out.println("Saldo atual comum: " + comum.sacar(100));
    }
}
