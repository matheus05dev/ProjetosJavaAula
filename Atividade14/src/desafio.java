import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String aluno01 = null;
        String aluno02 = null;
        String aluno03 = null;
        int alunos = 0;
        int opcao = 10;

        while (opcao != 0){
            System.out.println("\nBem-vindo ao menu de opções");
            System.out.println("Escolha uma opção: ");
            System.out.println("\n1 - Adicionar aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Listar alunos");
            System.out.println("0 - Sair");
            System.out.print("\nDigite sua opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();


            switch (opcao) {
                case 1:
                    if (alunos < 3) {
                        System.out.println("Adicione o aluno");
                        System.out.println("Insira o nome do aluno:");
                        String nome = entrada.nextLine();
                        if (alunos == 0) {
                            aluno01 = nome;
                        } else if (alunos == 1) {
                            aluno02 = nome;
                        } else if (alunos == 2) {
                            aluno03 = nome;
                        }
                        alunos++;
                        System.out.println("Aluno adicionado!");
                    }else{
                    System.out.println("Lista da turma está cheia! Não é possível adicionar mais alunos");
                    }
                    break;
                case 2:
                    if (alunos == 0) {
                        System.out.println("Não há alunos para remover");
                    } else {
                        System.out.println("Lista de Alunos:");
                        if (aluno01 != null) System.out.println("1 - " + aluno01);
                        if (aluno02 != null) System.out.println("2 - " + aluno02);
                        if (aluno03 != null) System.out.println("3 - " + aluno03);
                        System.out.print("Digite o número do aluno a remover: ");
                        int numero = entrada.nextInt();

                        if (numero == 1 && aluno01 != null) {
                            aluno01 = null;
                        } else if (numero == 2 && aluno02 != null) {
                            aluno02 = null;
                        } else if (numero == 3 && aluno03 != null) {
                            aluno03 = null;
                        } else {
                            System.out.println("Número inválido!");
                        }

                        alunos = 0;
                        if (aluno01 != null) alunos++;
                        if (aluno02 != null) alunos++;
                        if (aluno03 != null) alunos++;
                        System.out.println("Aluno removido!");
                    }
                    break;
                case 3:
                    System.out.println("Lista dos alunos");
                    if (alunos == 0) {
                        System.out.println("Não há alunos cadastrados");
                    } else {
                        System.out.println("Lista de Alunos:");
                        if (aluno01 != null) System.out.println("1 - " + aluno01);
                        if (aluno02 != null) System.out.println("2 - " + aluno02);
                        if (aluno03 != null) System.out.println("3 - " + aluno03);
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente");
                    break;

            }
        }
            entrada.close();
    }
}
