public class ListaEncadeada <T>{

    //Código que tem como objetivo criar uma váriavel de inicio e como referencia no final, valor vazio (referencia)
    //Elemento[0] = x -> Elemento ->[1] = null
    private No inicio;
    private No fim;
    private int tamanho;
    public ListaEncadeada() {
        this.tamanho = 0;
    }
    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString(){
        return "Lista encadeada" + " inicio= " + inicio + "}";
    }

    //Método para add elemento
    public void adiciona(T elemento){

        No<T> celula = new No<T>(elemento);
        if (this.inicio == null && this.fim == null){
            this.inicio = celula;
            this.fim = celula;
        }else{
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }

    //Método para buscar o Nó
    public No get(int posicao){
        No atual = this.inicio;
        for(int i = 0; i < posicao; i++){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    //Método para remover um elemento Nó
    public void remover(T elemento){
        No anterior = null;
        No atual = this.inicio;

        for(int i = 0; i < this.getTamanho(); i++){
            if(atual.getElemento().equals(elemento)){
                if(this.tamanho == 1){
                    this.inicio = null;
                    this.fim = null;
                }else if(atual == inicio){
                    this.inicio = atual.getProximo();
                    atual.setProximo(null);
                }else if(atual == fim){
                    this.fim = anterior;
                    anterior.setProximo(null);
                }else
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                    this.tamanho--;
                    break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

}
