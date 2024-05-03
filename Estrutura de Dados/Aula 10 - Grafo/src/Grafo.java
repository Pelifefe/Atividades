import java.util.ArrayList;

public class Grafo <Tipo>{
    private ArrayList<Vertice<Tipo>> vertices;
    private ArrayList<Aresta<Tipo>> arestas;

    public Grafo(){
        this.vertices = new ArrayList<Vertice<Tipo>>();
        this.arestas = new ArrayList<Aresta<Tipo>>();
    }

    public void adicionarVertice(Tipo dado){
        Vertice<Tipo> novoVertice = new Vertice<Tipo>(dado);
        this.vertices.add(novoVertice);
    }
    public void adicionarAresta(Double peso, Tipo dadoInicio, Tipo dadoFim){
        Vertice<Tipo> inicio = this.getVertice(dadoInicio);
        Vertice<Tipo> fim = this.getVertice(dadoFim);
        Aresta<Tipo> aresta = new Aresta<Tipo>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }
    public Vertice<Tipo> getVertice(Tipo dado){
        Vertice<Tipo> vertice = null;
        for(int i = 0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }
    public void BuscaEmLargura(){
        ArrayList<Vertice<Tipo>> marcados = new ArrayList<Vertice<Tipo>>();
        ArrayList<Vertice<Tipo>> fila = new ArrayList<Vertice<Tipo>>();
        Vertice<Tipo> atual = this.vertices.get(0);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while(fila.size() > 0){
            Vertice<Tipo> visitado = fila.get(0);
            for(int i =0; i < visitado.getArestasSaidas().size(); i++){
                Vertice<Tipo> proximo = visitado.getArestasSaidas().get(i).getFim();
                if(!marcados.contains(proximo)){
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
}
