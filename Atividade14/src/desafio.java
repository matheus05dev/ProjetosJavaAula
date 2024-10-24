import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner entradanome = new Scanner(System.in);
        Scanner entradaopcao = new Scanner(System.in);

        String aluno01 = null;
        String aluno02 = null;
        String aluno03 = null;

        System.out.println("\nBem-vindo ao menu de opções");
        System.out.println("Escolha uma opção: ");
        System.out.println("\n1 - Adicionar aluno");
        System.out.println("2 - Remover aluno");
        System.out.println("3 - Listar alunos");
        System.out.println("0) Sair");
        System.out.print("\nDigite sua opção: ");
        int opcoes = entradaopcao.nextInt();

        while(opcoes !=0){
            if (opcoes <= 3){
                switch (opcoes) {
                    case 1:
                        System.out.println("Adicione o aluno");
                        System.out.println("Insira o nome do aluno:");
                        if (aluno01 == null){
                            aluno01 = entradanome.nextLine();
                        }else if (aluno02 == null){
                            aluno02 = entradanome.nextLine();
                        } else {
                            aluno03 = entradanome.nextLine();
                        }
                    case 2:
                        System.out.println("Adicione o aluno");
                        System.out.println("Insira o nome do aluno:");
                        if (aluno01 == null){
                            aluno01 = entradanome.nextLine();
                        }else if (aluno02 == null){
                            aluno02 = entradanome.nextLine();
                        } else {
                            aluno03 = entradanome.nextLine();
                        }
                }
            }
        }
    }
}
