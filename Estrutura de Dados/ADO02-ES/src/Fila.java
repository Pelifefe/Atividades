public class Fila {
    private Pessoa [] fila;
    private int qtsPessoas;
    private int qtsPreferenciais;
    public Fila(int tamanhoFila) {
        this.fila = new Pessoa[tamanhoFila];
        this.qtsPessoas = 0;
        this.qtsPreferenciais = 0;
    }
    public Fila(){
        this(10);
    }
    public void enfileirar(Pessoa pessoa){
        aumentaCapacidade();
        if(qtsPessoas == 0){
            fila[0]= pessoa;
            qtsPessoas++;
        }else{
            if(!pessoa.isPreferencial()){
                fila[qtsPessoas] = pessoa;
                qtsPessoas++;
            }else{
                int i;
                for(i = qtsPessoas - 1;i >= 0; i--){
                    if(!fila[i].isPreferencial()){
                        fila[i + 1] = fila[i];
                    }else{
                        break;
                    }
                }
                fila[i + 1] = pessoa;
                qtsPessoas++;
            }
        }
    }
    private void aumentaCapacidade(){
        if(this.qtsPessoas == this.fila.length){
            Pessoa[] filaNova = new Pessoa[this.fila.length + 1];
            for (int i=0; i<this.fila.length; i++){
                filaNova[i] = this.fila[i];
            }
            this.fila = filaNova;
        }
    }
    public int qtsPessoas(){
        return this.qtsPessoas;
    }

    public void desenfileirar() {
        if(fila[0].isPreferencial()){
            if(!(qtsPreferenciais == 3)){
                qtsPreferenciais++;
                moverFila(0);
                qtsPessoas--;
            }else{
                int i;
                for(i = 0; i < qtsPessoas; i++){
                    if(!fila[i].isPreferencial()){
                        qtsPreferenciais = 0;
                        moverFila(i);
                        qtsPessoas--;
                        break;
                    }
                }
            }
        }else{
            qtsPreferenciais = 0;
            moverFila(0);
            qtsPessoas--;
        }
    }
    private void moverFila(int posicao){
        for (int i = posicao; i < qtsPessoas - 1; i++){
            fila[i] = fila[i+1];
        }
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i =0; i<this.qtsPessoas-1; i++){
            s.append(this.fila[i].getNome() + ", é preferencial " + this.fila[i].isPreferencial());
            s.append("| ");
        }
        if(this.qtsPessoas> 0){
            s.append(this.fila[qtsPessoas-1].getNome() + ", é preferencial " + this.fila[qtsPessoas-1].isPreferencial());

        }
        s.append("]");
        return s.toString();
    }
}