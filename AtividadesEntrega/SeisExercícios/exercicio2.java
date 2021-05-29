//        02 - Faça um algoritmo que leia três valores inteiros e mostre no console:
//        V1 + V2;
//        V2 - V1;
//        V3 * V1;
//        V3 + V2;
//        V3 - V2;
//        V1 + V2 + V3.
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        int v1;
        int v2;
        int v3;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o v1: ");
        v1 = Integer.parseInt(teclado.next());

        System.out.print("Digite o v2: ");
        v2 = Integer.parseInt(teclado.next());

        System.out.print("Digite o v3: ");
        v3 = Integer.parseInt(teclado.next());


        System.out.print("\nO resultado da soma de " + (v1) + " + " + (v2) + " = " + (v1 + v2) + "\n");
        System.out.print("\nO resultado da subtração de " + (v2) + " - " + (v1) + " = " + (v2 - v1) + "\n");
        System.out.print("\nO resultado da multiplicação de " + (v3) + " * " + (v1) + " = " + (v3 * v1) + "\n");
        System.out.print("\nO resultado da soma de " + (v3) + " + " + (v2) + " = " + (v3 + v2) + "\n");
        System.out.print("\nO resultado da subtração de " + (v3) + " - " + (v2) + " = " + (v3 - v2) + "\n");
        System.out.print("\nO resultado da subtração de " + (v1) + " + " + (v2) + " + " + (v3) + " = " + (v1 + v2 + v3));
    }
}
