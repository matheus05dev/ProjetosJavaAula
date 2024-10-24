 import java.util.Scanner;

public class ExercicioHora {
    public static void main(String[] args) {

        //Variavéis
        int hora;

        //Entrada de Dados
        Scanner entrada = new Scanner(System.in);

        //Processo
        System.out.print("Insira a hora atual no formato das 24 horas dessa maneira (6 , 18,) :");
        hora = entrada.nextInt();

        if (hora >= 0 && hora <= 24) {
            if (hora >= 6 && hora <= 11) {
                System.out.print("é da manhã");
            } else {
                if (hora >= 12 && hora <= 17) {
                    System.out.print("é da tarde");
                } else {
                    if (hora >= 18 && hora <= 22) {
                        System.out.print("é da noite");
                    } else {
                        System.out.print("é da madrugada");
                    }
                }
            }
        } else {
            System.out.println("Horario inexsistente");
        }
    }
}