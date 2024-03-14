public class RegistroCarros {
    Carro[] carros;
    private int tamanho;
    public RegistroCarros(int capacidade){
        this.carros = new Carro[capacidade];
        this.tamanho = 0;
    }
    public void adiciona(Carro carro)throws Exception{
        this.aumentaCapacidade();
        if (this.tamanho < this.carros.length){
            carros[this.tamanho] = carro;
            this.tamanho++;
        }
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i<this.tamanho-1; i++){
            s.append(this.carros[i]);
            s.append(", ");
        }

        if(this.tamanho> 0){
            s.append(this.carros[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

    public String busca(int posicao)throws Exception{
        if(posicao >=0 && posicao < tamanho){
            return "Marca " + carros[posicao].getMarca() + ", modelo " + carros[posicao].getMarca();
        } else {
            throw new Exception("Posição Inválida");
        }
    }
    private void aumentaCapacidade(){
        if (this.tamanho == this.carros.length){
            Carro[] carrosNovos = new Carro[this.carros.length + 1];
            for (int i=0; i < this.carros.length;i++){
                carrosNovos[i] = this.carros[i];
            }
            this.carros = carrosNovos;
        }
    }
    public void remove(int posicao) throws Exception{
        if(posicao >= 0 && posicao < tamanho){
            for (int i = posicao; i < this.tamanho-1; i++){
                this.carros[i] = this.carros[i+1];
            }
            System.out.println(this.carros[posicao]);
            this.tamanho--;
        } else {
            throw new Exception("Posição Inválida");
        }
    }
}

