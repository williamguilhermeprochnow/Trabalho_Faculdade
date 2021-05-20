import java.util.Scanner;

public class fila {
    public static String input(){
        Scanner teclado = new Scanner(System.in);
        String input = teclado.nextLine();

        return input;
    };

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        String nome[], descricao[], varTrocaNome, varTrocaDescricao;
        int idade[] = new int[20];
        nome = new String[20];
        descricao = new String[20];
        int menu, i, varTrocaIdade;

        int qntPessoa = 0;
        for (i = 0; i < 21; i++) {
            System.out.print("\nCapacidada máxima de pessoas na fila: 20. Quantidade atual: " + qntPessoa);
            if (qntPessoa == 20) {
                System.out.print("\nCapacidade limite alcançada, impossibiltado de inserir novo paciente:" +
                                 "\n\n2 - Atender Paciente\n3 - Sair\n\nOpção desejada: ");
                menu = Integer.parseInt(teclado.next());
            } else {
                System.out.print("\nEscolha uma das opções:\n\n1 - Incluir Paciente\n2 - Atender Paciente\n" +
                                 "3 - Sair\n\nOpção desejada: ");
                menu = Integer.parseInt(teclado.next());
            }

            if (menu == 1) {
                i = 0;
                System.out.print("\nBom dia, para realizar o procedimento preencha as seguintes informações:\n");
                System.out.print("Nome: ");
                nome[i + qntPessoa] = input();
                System.out.print("Idade: ");
                idade[i + qntPessoa] = Integer.parseInt(teclado.next());
                System.out.print("Breve descrição sobre o motivo do atendimento: ");
                descricao[i + qntPessoa] = input();
                qntPessoa = qntPessoa + 1;
            } else if (menu == 2) {
                if (qntPessoa == 0) {
                    System.out.print("\nNão há mais pessoas para serem atendidas.");
                    break;
                } else {
                    System.out.print("\nFilas reorganizadas:\n\n");
                    qntPessoa = qntPessoa - 1;
                    for (i = 0; i < qntPessoa; i++) {
                        varTrocaNome = nome[i + 1];
                        nome[i + 1] = nome[i];
                        nome[i] = varTrocaNome;

                        varTrocaIdade = idade[i + 1];
                        idade[i + 1] = idade[i];
                        idade[i] = varTrocaIdade;

                        varTrocaDescricao = descricao[i + 1];
                        descricao[i + 1] = descricao[i];
                        descricao[i] = varTrocaDescricao;

                        System.out.print((i + 1) + "º da fila:\nNome: " + nome[i] + "\nIdade: " + idade[i] +
                                         "\nDescrição: " + descricao[i] + "\n\n");
                    }
                    i = i - 2;
                }
            } else {
                System.out.print("Saindo...");
                break;
            }
        }
    }
}
