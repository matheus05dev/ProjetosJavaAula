import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){

        // Variavéis
        String nomeAluno = "João";
        String nomeEntrada;

        // Scanner/Entrada de Dados
        Scanner entrada = new Scanner(System.in);

        //Processo
        System.out.println("Qual é seu nome?");
        nomeEntrada = entrada.nextLine();
        if (nomeEntrada.equalsIgnoreCase(nomeAluno)){
            System.out.println("Você está no sistema");
        }else{
            System.out.println("Você não foi encontrado no sistema");
        }
    }
}