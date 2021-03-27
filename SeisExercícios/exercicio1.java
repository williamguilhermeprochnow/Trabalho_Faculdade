//        01 - Faça um algoritmo que leia dois números inteiros, execute e mostre as quatro operações aritméticas básicas.
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        double n1;
        double n2;
        double divisao;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o n1: ");
        n1 = Double.parseDouble(teclado.next());

        System.out.print("Digite o n2: ");
        n2 = Double.parseDouble(teclado.next());


        System.out.print("\nO resultado da soma é: " + (n1 + n2) + "\n");
        System.out.print("O resultado da subtração é: " + (n1 - n2) + "\n");
        System.out.print("O resultado da multiplicação é: " + (n1 * n2) + "\n");
        System.out.print("O resultado da divisão é: " + (n1 / n2));
    }
}
