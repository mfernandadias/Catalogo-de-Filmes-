package projetoContaBancaria;
import java.util.Scanner;
/*
inicializar dados do cliente
menu de opções
visualizaçao de saldo
envia valor
recebe valor
 */

public class Desafio {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nome = "Clarj Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("..............................");
        System.out.println("\nNome no cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*****************************");

        String menu = """
                ** Digite sua opção 
                1 - Consultar saldo 
                2 - Transferir valor 
                3 - Receber valor 
                4 - Sair 
                """;

        while(opcao != 4){
            System.out.println(menu);
            opcao = scan.nextInt();
            if(opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            }else if (opcao == 2) {
                System.out.println("Não há saldo para realizar a transferencia");
                double valor = scan.nextDouble();
            if (valor > saldo ){
                System.out.println("Não há saldo para realizar a transferencia");
            } else {
                saldo -= valor;
                System.out.println("Noo saldo" + saldo);
            }
        } else if (opcao == 3){
                System.out.println("Novo saldo" + saldo);
                double valor = scan.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo" + saldo);
            } else if(opcao != 4){
                System.out.println("Opção Invalida ");
            }

        }

    }
}
