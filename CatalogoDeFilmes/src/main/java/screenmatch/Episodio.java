package screenmatch;

public class Episodio {
    private int numero;
    private String nome;
    private Serie serie;

    public int totalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    private int totalVisualizacoes;

    public int getNumero(){
        return numero;
    }

    public int numero() {
        return numero;
    }

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public Serie serie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getClassificacao(){
        if(totalVisualizacoes > 100){
            return 4;
        }
        return 2;
    }
}
