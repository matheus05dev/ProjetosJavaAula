import java.util.Scanner;

public class OperadorRelacionaisExemplos {
    public static void main(String[] args) {
        //  Variavéis
        int idade;
        int idadeMinima = 18;

        //Entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Idade
        System.out.print("Insira sua idade: ");
        idade = entrada.nextInt();
        if (idadeMinima >= idade) {
            System.out.println("Você é menor de idade.");
        }
        else {
            System.out.println("Você é maior de idade.");
        }

        //Nome
        System.out.print("Insira seu Nome: ");
        entrada.nextLine();
        String nomeUsuario = entrada.nextLine();

        System.out.print("Insira o nome do seu colega: ");
        String nomeColega = entrada.nextLine();

        if (nomeUsuario.equalsIgnoreCase(nomeColega)){
            System.out.println(nomeUsuario + " e " + nomeColega + " tem nomes iguais");
        } else{
        System.out.println( nomeUsuario + " e " + nomeColega + " tem nomes diferentes");
        }
    }
}
