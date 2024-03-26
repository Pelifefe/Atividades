public class App {
    public static void main(String[] args) throws Exception {
        Elevador elevador = new Elevador(4, 6);
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();

        System.out.println("*******************");
        elevador.sair();
        elevador.sair();
        elevador.sair();
        elevador.sair();
        elevador.sair();

        System.out.println("*******************");
        System.out.println(elevador.desce());

        System.out.println("*******************");
        System.out.println(elevador.sobe());
        System.out.println(elevador.sobe());
        System.out.println(elevador.sobe());
        System.out.println(elevador.sobe());
        System.out.println(elevador.sobe());
        System.out.println(elevador.sobe());
        System.out.println(elevador.sobe());
    }
}
