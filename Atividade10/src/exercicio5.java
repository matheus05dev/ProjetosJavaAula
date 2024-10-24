import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        // Variavéis
        int numeroDiv = 2;
        int numeroEntrada;

        // Scanner/Entrada de Dados
        Scanner entrada = new Scanner(System.in);

        //Processo
        System.out.println("Insira um numero: ");
        numeroEntrada = entrada.nextInt();
        int numeroPARouIMPAR = numeroEntrada % numeroDiv;
        if (numeroPARouIMPAR == 0){
            System.out.println("O " +numeroEntrada + " número é par");
        }else{
            System.out.println("O " +numeroEntrada + " número é impar");
        }
    }
}
