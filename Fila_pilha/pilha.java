import java.util.Scanner;

public class pilha {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        String identificador[], atributo[], varTrocaIdentificador, varTrocaAtributo;
        float altura[], largura[], profundidade[], varTrocaAltura, varTrocaLargura, varTrocaProfundidade;
        altura = new float[10];
        largura = new float[10];
        profundidade = new float[10];
        identificador = new String[10];
        atributo = new String[10];
        int menu, i;

        int qntCaixa = 0;
        for (i = 0; i < 11; i++) {
            System.out.print("\nCapacidada máxima de caixas empilhadas: 10. Quantidade atual: " + qntCaixa);
            if (qntCaixa == 10) {
                System.out.print("\nCapacidade limite alcançada, impossibiltado de empilhar nova caixa:" +
                        "\n\n2 - Desempilhar\n3 - Sair\n\nOpção desejada: ");
                menu = Integer.parseInt(teclado.next());
            } else {
                System.out.print("\nEscolha uma das opções:\n\n1 - Empilhar\n2 - Desempilhar\n" +
                        "3 - Sair\n\nOpção desejada: ");
                menu = Integer.parseInt(teclado.next());
            }

            if (menu == 1) {
                i = 0;
                System.out.print("\nBom dia, para realizar o empilhamento preencha as seguintes informações:\n");
                System.out.print("Identificador da caixa: ");
                identificador[i + qntCaixa] = teclado.next();
                System.out.print("Altura (m): ");
                altura[i + qntCaixa] = Float.parseFloat(teclado.next());
                System.out.print("Largura (m): ");
                largura[i + qntCaixa] = Float.parseFloat(teclado.next());
                System.out.print("Profundidade (m): ");
                profundidade[i + qntCaixa] = Float.parseFloat(teclado.next());
                System.out.print("Conteúdo frágil? (s/n): ");
                char fragil = teclado.next().charAt(0);
                if (fragil == 's'){
                    atributo[i + qntCaixa] = "Frágil";
                } else {
                    atributo[i + qntCaixa] = "Não frágil";
                }
                qntCaixa = qntCaixa + 1;
            } else if (menu == 2) {
                if (qntCaixa == 0) {
                    System.out.print("\nNão há mais caixas para serem desempilhadas.");
                    break;
                } else {
                    System.out.print("\nSituação atualizada da pilha:\n\n");
                    for (i = (qntCaixa - 2); i >= 0; i--) {
                        System.out.print((i + 1) + "º Caixa:\nIdentificação: " + identificador[i] + "\nAltura: " +
                                         altura[i] + "\nLargura: " + largura[i] + "\nProfundidade: " + profundidade[i] +
                                         "\nConteúdo: " + atributo[i] + "\n\n");
                    }
                    qntCaixa = qntCaixa - 1;
                    i = i - 2;
                }
            } else {
                System.out.print("Saindo...");
                break;
            }
        }
    }
}
