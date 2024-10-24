import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){

        // Variavéis
        int idadeMinima = 18;
        int idadeEntrada;

        // Scanner/Entrada de Dados
        Scanner entrada= new Scanner(System.in);

        //Processo
        System.out.println("Qual é sua Idade?");
        idadeEntrada = entrada.nextInt();
        if (idadeEntrada<idadeMinima){
            System.out.println("Você é Menor de idade");
        }else{
            System.out.println("Você é Maior de idade");
        }
    }
}
