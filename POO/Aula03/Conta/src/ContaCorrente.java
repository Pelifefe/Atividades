public class ContaCorrente {
    protected double saldo;
    
    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }
    public double sacar(double valor){
        if(valor < this.saldo){
            return this.saldo -= valor;
        }else{
            System.out.println("Valor maior que o saldo");
            return saldo;
        }
    }
    public double depositar(double valor){
        return this.saldo += valor; 
    }
    public double saldoAtual(){
        return this.saldo;
    }
}
