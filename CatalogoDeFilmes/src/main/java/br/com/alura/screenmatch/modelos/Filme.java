package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classificavel;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo /*implements Classificavel*/ {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
