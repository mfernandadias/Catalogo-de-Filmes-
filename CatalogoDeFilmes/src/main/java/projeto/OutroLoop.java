package projeto;
import java.util.Scanner;

public class OutroLoop {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while(nota != -1){
            System.out.println("Diga sua avaliação para o filme ");
            nota = scan.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Média de avaliações " + mediaAvaliacao/3);

    }
}
