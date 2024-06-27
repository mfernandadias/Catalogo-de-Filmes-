package screenmatch;
/*
Crie uma classe Calculadora com um método
que recebe um número como parâmetro e retorna
o dobro desse número.
 */


public class Calculadora {
    public int dobrarNumero(int numero){
        return numero = 2;
    }

    //método principal para testar a calculadora
    public static void main (String[] args){
        Calculadora calc = new Calculadora();
        int numero = 5;
        int resultado = calc.dobrarNumero(numero);
        System.out.println("O dobro de " + numero + " é "+ resultado);

    }
}
