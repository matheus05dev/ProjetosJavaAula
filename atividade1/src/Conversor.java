import java.util.Scanner;

public class Conversor {
    public static void main (String[] args){
        //variavéis
        int celsius;
        float resultado;

        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.print("insira a temperatura em graus celsius: ");
        celsius = entrada.nextInt();
        resultado = (celsius*9/5) + 32;
        System.out.println(resultado + " °F");
    }
}
