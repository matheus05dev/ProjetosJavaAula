import java.util.Scanner;

public class EntradaCinema {
    public static void main(String[] args) {

        // variavéis
        int idade;
        int idadeMinima = 18;
        boolean estudante;

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        //processo

        //idade
        System.out.println("Insira sua idade: ");
        idade = entrada.nextInt();

        if (idade >= idadeMinima) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        //estudante
        System.out.println("Insira true se for estudante, insira false se for falso: ");
        estudante = entrada.nextBoolean();
        if (estudante == true) {
            System.out.println("Você é Estudante");
        } else {
            System.out.println("Você não é estudante");
        }

        //desconto
        if (estudante == true && idade < idadeMinima) {
            System.out.println("Você tem desconto");
        } else {
            if (estudante == false && idade < idadeMinima) {
                System.out.println("Você não tem direito do desconto");
            } else {
                if (estudante == true && idade >= idadeMinima) {
                    System.out.println("Você tem direito do desconto");
                } else {
                    if (estudante == false && idade >= idadeMinima) ;
                    System.out.println("Você não tem direito do desconto");
                }
            }
        }
    }
}
