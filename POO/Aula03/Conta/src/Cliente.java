public class Cliente extends ContaCorrente{
    private String nomeCompleto;
    private int CPF;
    private boolean especial;

    public Cliente(double saldo) {
        super(saldo); 
    }
    
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    @Override
    public double sacar(double valor) {
        if(valor < this.saldo){
            if(this.especial){
                double taxa = (valor/100) * 0.1;
                return this.saldo -= (valor + taxa); 
            }else{
                double taxa = (valor/100) * 0.5;
                return this.saldo -= (valor + taxa);
            }
        }else{
            System.out.println("Valor maior que o saldo");
            return saldo;
        }
    }
}
