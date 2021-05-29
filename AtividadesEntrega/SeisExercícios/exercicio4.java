//        04 - Faça um algoritmo que leia um determinado valor real, calcule e mostre este valor acrescido de 15,8%.
//        Observação 1: Acrescido = Valor + (Valor * (15.8/100));
//        Observação 2: Caso de teste 1486,45 deve gerar como resultado 1721,3091.
//        Observação 3: Necessário pesquisar como tratar um float utilizando vírgula.
import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio4 {

    public static void main(String[] args) {

        double valor;

        DecimalFormat df = new DecimalFormat("#####0.0000");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        valor = Double.parseDouble(teclado.next());

        System.out.print("Com o valor acrescido o total ficará: " + df.format((valor + (valor * 15.8 / 100))));
    }
}
