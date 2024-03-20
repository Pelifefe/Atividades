
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Osvaldo");
        p1.setPreferencial(true);
        Pessoa p2 = new Pessoa();
        p2.setNome("Maria");
        p2.setPreferencial(true);
        Pessoa p3 = new Pessoa();
        p3.setNome("Paula");
        p3.setPreferencial(false);
        Pessoa p4 = new Pessoa();
        p4.setNome("Diana");
        p4.setPreferencial(false);
        Pessoa p5 = new Pessoa();
        p5.setNome("Vitor");
        p5.setPreferencial(false);
        Pessoa p6 = new Pessoa();
        p6.setNome("Godofredo");
        p6.setPreferencial(true);
        Pessoa p7 = new Pessoa();
        p7.setNome("Nádia");
        p7.setPreferencial(true);

        Fila fila = new Fila();
        fila.enfileirar(p1);
        System.out.println("Primeira pessoa adicionada na fila: ");
        System.out.println(fila.toString());

        fila.enfileirar(p3);
        fila.enfileirar(p2);
        fila.enfileirar(p5);
        fila.enfileirar(p4);
        System.out.println("4 pessoas adicionadas na fila: ");
        System.out.println(fila.toString());
        fila.enfileirar(p6);
        fila.enfileirar(p7);
        System.out.println("2 pessoas preferenciais adicionadas");
        System.out.println(fila.toString());

        fila.desenfileirar();
        System.out.println("1 pessoas desifileirada: ");
        System.out.println(fila.toString());
        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();
        System.out.println("Mais 3 pessoas desinfileiradas: ");
        System.out.println(fila.toString());
    }
}