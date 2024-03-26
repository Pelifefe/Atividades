public class Veiculo {
    protected int velocidade;
    private int capacidadePassageiros;
    private int pessoas;
    private boolean ligado;

    public Veiculo(int capacidadePassageiros){
        this.velocidade = 0;
        this.capacidadePassageiros = capacidadePassageiros;
        this.ligado = false;
    }

    public void ligarVeículo(){
        if(this.ligado){
            this.ligado = false;
        }else{
            this.ligado = true;
        }
    }
    public void velocidade(int velocidade){
        if(!this.ligado){
            System.out.println("Não é possível alterar velocidade, pois o veículo se encontra desligado.");
            this.velocidade = 0;
        }else{
            this.velocidade += velocidade;
            System.out.println(this.velocidade + " Km");
        }
    }
    public void entrar(int pessoa){
        if(pessoa == this.capacidadePassageiros){
            System.out.println("Capacidade do véiculo excedida");
        }else{
            this.pessoas++;
            System.out.println(this.pessoas + " pessoas no veículo");
        }
    }
}