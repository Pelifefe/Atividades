public class ListaDuplaEncadeada <T>{
    private NoDuplo <T> inicio;
    private NoDuplo <T> fim;
    private int tamanho;

    //Construtor
    public ListaDuplaEncadeada(NoDuplo inicio, NoDuplo fim){
        this.inicio = inicio;
        this.fim = fim;
        this.tamanho = 0;
    }
    public ListaDuplaEncadeada(){
        
    }

    //Getter e Setter
    public NoDuplo<T> getInicio() {
        return inicio;
    }
    public void setInicio(NoDuplo<T> inicio) {
        this.inicio = inicio;
    }
    public NoDuplo<T> getFim() {
        return fim;
    }
    public void setFim(NoDuplo<T> fim) {
        this.fim = fim;
    }

    //Método para exibir os dados da Lista
    public void exibir() throws Exception{
        System.out.println("Lista -> ");
        //criação de uma variavel auxiliar
        NoDuplo aux = inicio;
        //Estrutura de repetição para percorrer a lista
        while(aux != null){
            System.out.println(aux.getElemento() + " -> ");
            aux = aux.getProximo();
        }
        System.out.println("NULL\n");
    }

    //Este método insere os dados na sequencia ou seja no final da lista
    public void adicionar(String s) throws Exception{
        NoDuplo novoElemento = new NoDuplo<>(s);
        NoDuplo aux = inicio;
        //verifica se ele é o primeiro elemento da nossa lista
        if(inicio == null){
            //sendo o primeiro elemento ele não tem próximo nem anterior
            novoElemento.setProximo(null);
            novoElemento.setAnterior(null);
            //como ele é o primeiro ele vai ser o inicio e o fim da lista  
            inicio =  novoElemento;
            fim = novoElemento;
        }else{
            // agora quando o elemento não for o primeiro da lista
            // vamos percorrer a lista para achar a posição é válida
            while(aux.getProximo() != null){
                // vamos verificar se o elemento não é repetido
                if(aux.getElemento().equals(s)){
                    throw new Exception("Elemento repetido");
                }else{
                    aux = aux.getProximo();
                }
            }
            // o ultimo elemento sempre deve ter o próximo como null
            novoElemento.setProximo(null);
            aux.setProximo(novoElemento);
            novoElemento.setAnterior(aux);
            fim = novoElemento;
        }
    }

    public String removeIndex(int i){
        NoDuplo aux = inicio;
        NoDuplo lixo = null;

        // verifica se o parâmetro informado é válida
        if(i < 0 || i > tamanho)
            throw new Exception("Indice inválido");
        if(tamanho == 0)
            throw new Exception("A lista está vazia");
        if(i == 0){
            lixo = aux;
            aux = aux.getProximo();
            inicio = aux;
        }else{
            // caso o elemento  a ser removido não seja o primeiro
            int contador = 0;
            // percorrer a lista até achar a posição desejada
            while(contador < i){
                aux = aux.getProximo();
                contador++; 
            }
            // armazena na variavel lixo a informação a ser removida
            lixo = aux;
            aux.getProximo().setProximo(aux.getProximo());
            if(aux != fim){
                aux.getProximo().setProximo(aux.getAnterior());
            }else{
                fim = aux;
            }
            // retorna o valor excluido
            return lixo.toString();
        }
    }

    public Object BuscaPosicao(int i){
        //verifica se tem elementos na lista
        if(tamanho == 0) throw new Exception("A lista está vazia");
        //verifica se o parâmetro informado é válido
        if(i < 0 || i > tamanho)throw new Exception("Indice inválido na Lista");
        NoDuplo aux = inicio;
        int contador = 0;
        //pecorrer a Lista até a posição informada
        while(contador <= i){
            if(contador == i){
                return aux.getElemento();
            }else{
                aux = aux.getProximo();
                contador++;
            }
        }
        return aux.getElemento();
    }
}