import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Desconto {
    public static void main(String[] args){
        // variavéis
        float precoOriginal;
        float Desconto;
        float precoFinal;
        float precoDescontado;
        float porcenagemDesconto;
        //formatação
        NumberFormat formato = NumberFormat.getInstance(new Locale("pt", "br"));
        formato.setMinimumFractionDigits(2);
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        NumberFormat descontopc = NumberFormat.getPercentInstance();

        //processo
        Scanner entrada = new Scanner(System.in);
        System.out.print("insira a o preço original: ");
        precoOriginal = entrada.nextFloat();
        System.out.print("insira o desconto: ");
        Desconto = entrada.nextFloat();
        porcenagemDesconto = Desconto /100;
        precoFinal = precoOriginal * porcenagemDesconto;
        precoDescontado = precoOriginal - precoFinal;
        System.out.println("Valor pago foi de " + moeda.format(precoDescontado) + ", o desconto foi de " + descontopc.format(porcenagemDesconto)  + ", você economizou " + moeda.format(precoFinal) + " de " + moeda.format(precoOriginal));
        
    }
}
