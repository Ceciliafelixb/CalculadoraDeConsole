package calculadoradeconsole;

import java.util.Scanner;

public class CalculadoradeConsole {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double op1, op2;
        int opcao;
        double resposta;
        opcao = 0;

        do {
            System.out.println("[1] Soma");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5]Raiz Quadrada");
            System.out.println("[6]Potência ao Quadrado");
            System.out.println("[0] Sair");
            System.out.println();//pula uma linha
            System.out.println("Escolha:");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Entre com o valor 1");
                    op1 = teclado.nextDouble();
                    System.out.println("Entre com o valor 2");
                    op2 = teclado.nextDouble();
                    resposta = (op1 + op2);
                    System.out.println("Soma = " + resposta);
                    System.out.println(); //pula uma linha
                    break; // executar e parar o comando   
                }

                case 2: {
                    System.out.println("Entre com o valor 1");
                    op1 = teclado.nextDouble();
                    System.out.println("Entre com o valor 2");
                    op2 = teclado.nextDouble();
                    resposta = (op1 - op2);
                    System.out.println("Subtração = " + resposta);
                    System.out.println(); //pula uma linha
                    break; // executar e parar o comando
                }

                case 3: {
                    System.out.println("Entre com o valor 1");
                    op1 = teclado.nextDouble();
                    System.out.println("Entre com o valor 2");
                    op2 = teclado.nextDouble();
                    resposta = (op1 * op2);
                    System.out.println("Multiplicação = " + resposta);
                    System.out.println(); //pula uma linha
                    break; // executar e parar o comando
                }

                case 4: {
                    System.out.println("Entre com o valor 1");
                    op1 = teclado.nextDouble();
                    System.out.println("Entre com o valor 2");
                    op2 = teclado.nextDouble();
                    resposta = (op1 / op2);
                    System.out.println("Divisão = " + resposta);
                    System.out.println();//pula uma linha
                    break; // executar e parar o comando
                }
                case 5: {
                    System.out.println("Entre com um valor");
                    op1 = teclado.nextDouble();

                    resposta = Math.sqrt(op1);
                    System.out.println(" A raiz quadrada desse valor é:" + resposta);
                    System.out.println();//pula uma linha
                    break; // executar e parar o comando
                }
                case 6: {
                    System.out.println("Entre com um valor");
                    op1 = teclado.nextDouble();

                    resposta = Math.pow(op1,2);
                    System.out.println("Essa potência ao quadrado é :" + resposta);
                    System.out.println();//pula uma linha
                    break; // executar e parar o comando
                }

                default: {
                    if (opcao != 0) {
                        System.out.println("Opção Inválida");
                    }
                }

            }

        } while (opcao != 0);
    }
}
