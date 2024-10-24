import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){

        // Variavéis

        double notaMinima = 6;
        double notaEntrada;

        // Scanner/Entrada de Dados
        Scanner entrada= new Scanner(System.in);

        //Processo
        System.out.println("Qual é sua nota?");
        notaEntrada = entrada.nextDouble();
        if (notaEntrada<notaMinima){
            System.out.println("Você foi REPROVADO");
        }else{
            System.out.println("Você foi APROVADO");
        }
    }
}
