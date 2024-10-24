import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Operadores {
    public static void main(String[] args){
        //variavéis
        int numero1;
        int numero2;
        float resultado;
        NumberFormat formato = NumberFormat.getInstance(new Locale("pt", "br"));
        formato.setMinimumFractionDigits(1);

        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite um número: ");
        numero1 = entrada.nextInt(); //entrada de dados
        System.out.print("digite mais um número: ");
        numero2 = entrada.nextInt(); //entrada de dados

        //adição
        resultado = numero1+numero2;
        System.out.println("A soma de " + numero1 + "+" + numero2 + " é o resultado de " + formato.format(resultado));

        //subtração
        resultado = numero1 - numero2;
        System.out.println("A subtração de " + numero1 + "-" + numero2 + " é o resultado de " + formato.format(resultado));

        //multiplicação
        resultado = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + "x" + numero2 + " é o resultado de " + formato.format(resultado));

        //divisão
        resultado = numero1 / numero2;
        System.out.println("A divisão de " + numero1 + "/" + numero2 + " é o resultado de " + formato.format(resultado));


        //módulo
        resultado = numero1 % numero2;
        System.out.println("A resto da divisão entre " + numero1 + "/" + numero2 + " é o resultado de " + formato.format(resultado));

        entrada.close();
    }
}
