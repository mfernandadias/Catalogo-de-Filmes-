package minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalcurtidas;
    private double classificacao;

    public int totalReproduocoes() {
        return totalReproducoes;
    }

    public double classificacao() {
        return classificacao;
    }

    public int totalcurtidas() {
        return totalcurtidas;
    }

    public String titulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void curte(){
        this.totalReproducoes++;
    }

    public void reprodus(){
        this.totalReproducoes++;
    }
}
