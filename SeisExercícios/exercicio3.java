//        03 - Faça um algoritmo que leia o ano de nascimento de uma pessoa, calcule e mostre sua idade aproximada. Buscar no Google uma função que retorne a data atual (do momento).
import java.util.Scanner;
import java.time.LocalDateTime;

public class exercicio3 {

    public static void main(String[] args) {

        int anoNascimento;

        LocalDateTime anoPresente = LocalDateTime.now();

        int anoAtual = anoPresente.getYear();


        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        anoNascimento = Integer.parseInt(teclado.next());


        System.out.print("\nSua idade aproximada atual é: " + (anoAtual - anoNascimento) + " anos.");
    }
}
