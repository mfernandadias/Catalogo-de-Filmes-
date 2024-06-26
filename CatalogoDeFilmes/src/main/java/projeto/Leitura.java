package projeto;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = scan.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = scan.nextInt();
        System.out.println("Diga sua avaliação para o filme  ");
        double avaliacao = scan.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}