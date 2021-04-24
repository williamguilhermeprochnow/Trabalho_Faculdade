//III - Regras de negócio Específicas das quais eu abordei pelas letras do meu nome:
//
//
//
//  A - O benefício só será concedido para maiores de 18 anos; x
//  G - Para empregadores que tenham até 10 funcionários haverá um acréscimo de 18% sobre o valor total; x
//  I - Sábado deve ser considerado dia útil para pagamento; x
//  L - O benefício será de 6 meses para desempregados;x
//  M - O benefício de pessoas que moram em São Paulo terá acréscimo de 10%;x
//  W - O benefício de pessoas que moram em Minas Gerais terá acréscimo de 8%;x

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Exercicio1 {
    public static String input(){
            Scanner teclado = new Scanner(System.in);
            String input = teclado.nextLine();

            return input;
            };

    public static int calculaIdade(java.util.Date dataNasc) {

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(dataNasc);
        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
            idade--;
        }
        else
        {
            if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                idade--;
            }
        }

        return idade;
    };

    public static void main(String[] args) throws  ParseException{

        String nomeCompleto;
        float valorBeneficioEmpregadoDesempregado;
        int categoria;
        int estadoUFComAcrescimo;
        String estadoUF;


        Scanner teclado = new Scanner(System.in);

        Calendar cal = GregorianCalendar.getInstance();
        int diaSemana = cal.get(Calendar.DAY_OF_WEEK);


        int totalUsuarios = 0;
        int totalBeneficiarios = 0;
        float totalValorConcedido = 0;
        float valorBeneficioEmpregador = 0;
        System.out.print("Realizar cadastro?\n\n1 - Sim\n2 - Não\n\nOpção desejada: ");
        for (int cadastro = Integer.parseInt(input()); cadastro != 2; cadastro++) {
            totalUsuarios = totalUsuarios + 1;

            System.out.print("Nome completo: ");
            nomeCompleto = input();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Sua data de nascimento (dd/mm/aaaa): ");
            Date dataNascimento = sdf.parse(input());
            int idadeCalculo = calculaIdade(dataNascimento);
            System.out.println("Idade: " + idadeCalculo + " anos.");


            if (idadeCalculo <= 18) {
                System.out.print("Você não poderá ter o benefício por ser menor da idade minima permitida!");
                break;
            } else {
                System.out.print("Valor do banefício para esse cadastro, lembrando que:\n\nEmpregados - Não receberão benefício;\nDesempregados - Receberão entre R$ 1.500 e R$ 2.300;\nEmpregadores - Receberão R$ 200,00 por funcionário, valor padrão nesse instante é = 0.\n\nR$");
                valorBeneficioEmpregadoDesempregado = Float.parseFloat(input());

                System.out.print("Categoria:\n\n1 - Empregado\n2 - Empregador\n3 - Desempregado\n\nOpção desejada: ");
                categoria = Integer.parseInt(input());


                if (categoria == 1) {
                    System.out.print("Você não tem acesso ao benefício!");
                    break;
                } else if (categoria == 2) {
                    System.out.print("\nQuantos meses ficara com o beneficio, lembrando que:\n\nO benefício será de no máximo 12 meses e mínimo 2 meses.\n\nOpção desejada: ");
                    int mesesComBeneficio = Integer.parseInt(teclado.next());
                    System.out.print("Quantidade de funcionários: ");
                    int numeroFuncionarios = Integer.parseInt(teclado.next());
                    valorBeneficioEmpregador = 200 * numeroFuncionarios;
                    totalValorConcedido = totalValorConcedido + valorBeneficioEmpregador;
                    if (numeroFuncionarios <= 10) {
                        System.out.print("Seu acréscimo será multiplicado pelo numero de funcionários. Totalizando: R$" + valorBeneficioEmpregador);
                        totalBeneficiarios = totalBeneficiarios + 1;
                    } else {
                        System.out.print("Você não tem acesso ao benefício!");
                        break;
                    }
                } else if (categoria == 3) {
                    totalValorConcedido = totalValorConcedido + valorBeneficioEmpregadoDesempregado;
                    System.out.println(totalValorConcedido);
                    System.out.print("Seu benefício de R$" + valorBeneficioEmpregadoDesempregado + " terá duração de 6 meses.");
                    totalBeneficiarios = totalBeneficiarios + 1;
                    } else {
                    System.out.println("\nPor favor escolha uma das opções listadas anteriormente!");
                    break;
                    }

                System.out.print("\nIndique seu estado (UF):\n\n1 - São Paulo\n2 - Minas Gerais\n3 - Outro\n\nOpção desejada: ");
                estadoUFComAcrescimo = Integer.parseInt(input());
                if (estadoUFComAcrescimo == 1 && categoria == 2){
                    float acrescimoEstado = ((valorBeneficioEmpregador * 10 / 100) + valorBeneficioEmpregador);
                    totalValorConcedido = acrescimoEstado + totalValorConcedido;
                    System.out.print("Seu benefício de acordo com seu estado, terá um acréscimo de 10%. Totalizando R$" + acrescimoEstado);
                } else if (estadoUFComAcrescimo == 1 && categoria == 3){
                    float acrescimoEstado = ((valorBeneficioEmpregadoDesempregado * 10 / 100) + valorBeneficioEmpregadoDesempregado);
                    totalValorConcedido = acrescimoEstado + totalValorConcedido;
                    System.out.print("\nSeu benefício de acordo com seu estado, terá um acréscimo de 10%. Totalizando R$" + acrescimoEstado);
                } else if (estadoUFComAcrescimo == 2 && categoria == 2){
                    float acrescimoEstado = ((valorBeneficioEmpregador * 8 / 100) + valorBeneficioEmpregador);
                    totalValorConcedido = acrescimoEstado + totalValorConcedido;
                    System.out.print("\nSeu benefício de acordo com seu estado, terá um acréscimo de 8%. Totalizando R$" + acrescimoEstado);
                } else if (estadoUFComAcrescimo == 2 && categoria == 3){
                    float acrescimoEstado = ((valorBeneficioEmpregadoDesempregado * 8 / 100) + valorBeneficioEmpregadoDesempregado);
                    System.out.print("\nSeu benefício de acordo com seu estado, terá um acréscimo de 8%. Totalizando R$" + acrescimoEstado);
                    totalValorConcedido = acrescimoEstado + totalValorConcedido;
                } else {
                    System.out.print("\nDigite seu Estado: ");
                    estadoUF = input();
                    System.out.print("Você não terá mais acréscimo no benefíco decorrente ao estado onde se localiza\n");
                }

                System.out.print("\nDeseja pegar seu benefício:\n\n1 - Sim\n2 - Não\n\nOpção desejada: ");
                int depositar = Integer.parseInt(teclado.next());
                if (depositar == 1 && diaSemana == 7) {
                    System.out.print("Ok, benefício retirado com sucesso!");
                } else {
                    System.out.print("A retirada do banefício só fica disponível aos sábados!\n");
                }

                System.out.print("\nDeseja cadastrar um novo benificiário:\n\n1 - Sim\n2 - Não\n\nOpção desejada: ");
                int novoBenificiario = Integer.parseInt(teclado.next());
                if (novoBenificiario == 1) {
                    cadastro = cadastro - novoBenificiario;
                    System.out.print("\n\n##### Cadastro de um novo benificiário #####\n\n");
                } else {
                    System.out.print("\nCadastro(s) realizado(s) com sucesso!");
                }

                String requisitosAtendidos = "\n\nRequisitos atendidos do cadastro recém feito:\n\nNome completo - " + nomeCompleto + ";" +
                        "\nMaioridade (data de nascimento) - " + dataNascimento + ";" +
                        "\nCategoria escolhida - " + categoria + ";" +
                        "\nO empregador que tem até 10 funcionários, terá um acréscimo multiplicando o número de funcionários por 200. Total R$" + valorBeneficioEmpregador + ";" +
                        "\nO sistema só deixará fazer a retiradá do beneficio quando for sábado (diaSemana == 7) - " + diaSemana + ";" +
                        "\nO benefício será de 6 meses para o Desempregado;" +
                        "\nO benefício de pessoas que moram em São Paulo terá acréscimo de 10% - variavel: acrescimoEstado - restrita ao if;" +
                        "\nO benefício de pessoas que moram em Minas Gerais terá acréscimo de 8% - variavel: acrescimoEstado - restrita ao if.\n\n";
                System.out.print(requisitosAtendidos);



                if (novoBenificiario == 1){
                    System.out.print("\n\n##################################################\n\n");
                } else {
                    System.out.print("Final da execução do programa\n\nTotal de usuários lidos: " + totalUsuarios + ";" +
                            "\nTotal de beneficiários: " + totalBeneficiarios + ";" +
                            "\nTotal de valor que será concedido: " + totalValorConcedido);
                }
            }
        }
    }
}
