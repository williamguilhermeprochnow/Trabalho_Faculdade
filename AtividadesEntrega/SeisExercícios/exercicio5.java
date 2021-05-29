//        05 - Faça um algoritmo que o valor de base e o valor da altura de um triangulo. Calcule e mostre a área deste triângulo.
//        Observação: Area = (Base * Altura) / 2;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        double valorBase;

        double valorAltura;

        Scanner teclado = new Scanner(System.in);


        System.out.print("Digite o valor da base do triângulo: ");
        valorBase = Double.parseDouble(teclado.next());

        System.out.print("Digite o valor da altura do triângulo: ");
        valorAltura = Double.parseDouble(teclado.next());

        System.out.print("\nResultado do calculo da área: " + (valorBase * valorAltura / 2));
    }
}
