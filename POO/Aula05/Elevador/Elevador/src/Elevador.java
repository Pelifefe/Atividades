public class Elevador{
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoas;

    public Elevador(int capacidade, int totalAndares){
        this.capacidade = capacidade;
        this.totalAndares= totalAndares;
        this.andarAtual = 0;
        this.pessoas = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    //////////////////////////////////////

    public void entrar(){
        if(this.pessoas >= this.capacidade){
            System.out.println("Capacidade do elevador já está excedida");
        }else{
            pessoas++;
            System.out.println("Pessoa entrou no elevador.");
        }
    }
    public void entrar(int pessoa){
        if(pessoa <= 0){
            System.out.println("Favor informar um número de pessoas maior que zero");
        }else if(this.pessoas >= this.capacidade){
            System.out.println("Capacidade do elevador já está excedida");
        }else{
            this.pessoas =+ pessoa;
            if(pessoa > 1){
                System.out.println("Pessoas entraram no elevador.");
            }else{
                System.out.println("Pessoa entrou no elevador.");
            }
        }
    }

    public void sair(){
        if(this.pessoas < 1){
            System.out.println("Não existe pessoas no elevador para sair.");
        }else{
            this.pessoas--;
            System.out.println("Pessoa saiu do elevador.");
        }
    }
    public String sobe(){
        if(andarAtual == totalAndares){
            return "Você está no ultimo andar";
        }else{
            andarAtual++;
            return "Você subiu para o andar " + andarAtual;
        }
    }
    public String desce(){
        if(andarAtual == 0){
            return "Você está no Térreo não tem subsolo";
        }else{
            andarAtual--;
            return "Você desceu para o andar " + andarAtual;
        }
    }
}