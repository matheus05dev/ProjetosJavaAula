import java.util.Scanner;

public class SwitchCaseAula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaopcao = new Scanner(System.in);


        System.out.println("\nBem-vindo ao menu de opções");
        System.out.println("Escolha uma opção: ");
        System.out.println("\n1) Somar dois números");
        System.out.println("2) Subtrair dois números");
        System.out.println("3) Multiplicar dois números");
        System.out.println("4) Dividir dois números");
        System.out.println("0) Sair");
        System.out.print("\nDigite sua opção: ");
        int opcoes = entradaopcao.nextInt();

        while(opcoes !=0){
            if (opcoes <= 4) {
                System.out.print("\nInsira o primeiro número para operação: ");
                if (entrada.hasNextInt()) {
                    int num1 = entrada.nextInt();
                    System.out.print("\nInsira o segundo número para operação: ");
                    if (entrada.hasNextInt()) {
                        int num2 = entrada.nextInt();
                        switch (opcoes) {
                            case 1:
                            int resultado;
                                resultado = num1 + num2;
                                System.out.println("\nA soma entre o seus números foi de " + resultado);
                                break;

                            case 2:
                                resultado = num1 - num2;
                                System.out.println("\nA subtração entre o seus números foi de " + resultado);
                                break;

                            case 3:
                                resultado = num1 * num2;
                                System.out.println("\nA multiplicação entre o seus números foi de " + resultado);
                                break;

                            case 4:
                                double resultadoDivisao;
                                if (num2 == 0) {
                                    System.out.println("Erro");
                                    System.out.println("Programa encerrado por divisão invalida já que o divisor é 0");
                                    break;
                                }
                                resultadoDivisao = (double) num1 / num2;
                                System.out.println("\nA divisão entre o seus números foi de " + resultadoDivisao);
                                break;

                            case 0:
                                System.out.print("Encerrando o programa");
                                break;

                            default:
                                System.out.print("Opção inserida é inválida, tente as opções de 1,2,3 e 4 para suas operações");
                                break;
                        }
                    }else System.out.println("Só é possivel user os números inteiros");
                }else System.out.println("Só é possivel user os números inteiros");
            }else System.out.print("\nOpção inserida é inválida, tente as opções de 1,2,3 e 4 para suas operações");
            System.out.println("          ");



            System.out.println("\nBem-vindo ao menu de opções");
            System.out.println("Escolha uma opção: ");
            System.out.println("\n1) Somar dois números");
            System.out.println("2) Subtrair dois números");
            System.out.println("3) Multiplicar dois números");
            System.out.println("4) Dividir dois números");
            System.out.println("0) Sair");
            System.out.print("\nDigite sua opção: ");
            opcoes = entradaopcao.nextInt();


        }System.out.println("O programa será encerrado");
        entrada.close();
        entradaopcao.close();
    }
}

