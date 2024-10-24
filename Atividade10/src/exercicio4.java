import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){

        // Variavéis
        int numeroPositivo = 1;
        int numeroNegativo = -1;
        int numeroEntrada;

        // Scanner/Entrada de Dados
        Scanner entrada = new Scanner(System.in);

        //Processo
        System.out.println("Insira um numero (positivo ou negativo): ");
        numeroEntrada = entrada.nextInt();
        if (numeroEntrada>=numeroPositivo){
            System.out.println("O número é positivo");
        }else{
            if (numeroEntrada<=numeroNegativo){
                System.out.println("O número é negativo");
            }else{
                if (numeroEntrada == 0){
                    System.out.println("O número 0 é neutro");
                }
            }
        }
    }
}