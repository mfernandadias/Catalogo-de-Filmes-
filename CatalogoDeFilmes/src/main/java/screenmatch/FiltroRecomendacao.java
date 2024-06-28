package screenmatch;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel.classificavel){
        if(classificavel.getclassificacao() >= 4){
            System.out.println("Esta entre os preferidos do momento");
        } else if(classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento");
        } else{
            System.out.println("Coloque na sua lits para assistir depois");
        }
    }

}
