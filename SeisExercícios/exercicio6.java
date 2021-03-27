//        06 - Uma empresa tem uma ficha de um determinado funcionário com as informações:
//        1- o nome do funcionário;
//        2- o número de horas trabalhadas por este funcionário;
//        3- e o número de dependentes deste funcionário.
//        Considerando que:
//        A. A empresa paga fixo R$32.00 por hora;
//        B. A empresa paga fixo R$40.00 por dependente;
//        C. Sobre o salário bruto são feitos descontos fixos de 8.5% para o INSS
//        D. Sobre o salário bruto são feitos descontos fixos de 5% para o IR;
//        Faça um algoritmo que leia os dados da ficha do funcionário, calcule:
//        1- O salário bruto (hora * valorhora + dependente * valordependente)
//        2- Valor do desconto de INSS (percentual sobre o salario bruto);
//        3- Valor de desconto de IR (percentual sobre o salario bruto);
//        4- Valor liquido do salário deste funcionário (Salario Bruto - INSS - IR).
import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio6 {

    public static void main(String[] args) {

        String nomeFuncionario;

        double horasTrabalhadas;

        int numeroDependentes;

        Scanner teclado = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#####0.00");

        System.out.print("Digite o seu nome: ");
        nomeFuncionario = teclado.next();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = Double.parseDouble(teclado.next());

        System.out.print("Digite a quantidade de dependentes: ");
        numeroDependentes = Integer.parseInt(teclado.next());

        double salarioBruto = (horasTrabalhadas * 32.00) + (numeroDependentes * 40.00);

        double valorINSS = salarioBruto * 8.5 / 100;

        double valorIR = salarioBruto * 5 / 100;


        System.out.print("\nSálario bruto: " + salarioBruto);
        System.out.print("\nDesconto de INSS: " + df.format(valorINSS));
        System.out.print("\nDesconto de IR: " + df.format(valorIR));
        System.out.print("\nValor liquido do salário de " + nomeFuncionario + " é: " + df.format((salarioBruto - valorINSS - valorIR)));
    }
}
