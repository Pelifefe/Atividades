import java.util.ArrayList;

public class Vertice <Tipo>{
    private Tipo dado;

    private ArrayList<Aresta<Tipo>> arestasEntradas;
    private ArrayList<Aresta<Tipo>> arestasSaidas;

    public Vertice(Tipo valor){
        this.dado = valor;
        this.arestasEntradas = new ArrayList<Aresta<Tipo>>();
        this.arestasSaidas = new ArrayList<Aresta<Tipo>>();
    }

    public Tipo getDado() {
        return dado;
    }

    public void setDado(Tipo dado) {
        this.dado = dado;
    }

    public ArrayList<Aresta<Tipo>> getArestasEntradas() {
        return arestasEntradas;
    }

    public void setArestasEntradas(ArrayList<Aresta<Tipo>> arestasEntradas) {
        this.arestasEntradas = arestasEntradas;
    }

    public ArrayList<Aresta<Tipo>> getArestasSaidas() {
        return arestasSaidas;
    }

    public void setArestasSaidas(ArrayList<Aresta<Tipo>> arestasSaidas) {
        this.arestasSaidas = arestasSaidas;
    }
    public void adicionarArestaEntrada(Aresta<Tipo> aresta){
        this.arestasEntradas.add(aresta);
    }
    public void adicionarArestaSaida(Aresta<Tipo> aresta){
        this.arestasSaidas.add(aresta);
    }
}
