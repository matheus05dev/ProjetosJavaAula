import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImposto {
    public static void main(String[] args){

        // variavéis
        double precoOriginal;
        double desconto;
        double porcentoDesconto;
        double precoDesconto;
        double precoDescontado;
        double ICMS = 0.17;
        double precoCmImposto;
        double precoImposto;
        double precoComDesconto;

        //formatação
        NumberFormat formato = NumberFormat.getInstance(new Locale("pt", "br"));
        formato.setMinimumFractionDigits(2);
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        NumberFormat porcento = NumberFormat.getPercentInstance();

        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.print("insira a o preço original: ");
        precoOriginal = entrada.nextFloat();
        System.out.print("insira o desconto: ");
        desconto = entrada.nextFloat();

        //processo
        porcentoDesconto = desconto / 100;
        precoDesconto = precoOriginal * porcentoDesconto;
        precoDescontado = precoOriginal - precoDesconto;
        precoComDesconto = precoOriginal - precoDesconto ;
        precoImposto = precoDescontado * ICMS;
        precoCmImposto = precoDescontado + precoImposto;

        //impressão de dados
        System.out.println("Valor pago foi de " + moeda.format(precoCmImposto));
        System.out.println("O desconto foi de " + porcento.format(porcentoDesconto));
        System.out.println("O valor do desconto de " + moeda.format(precoDesconto));
        System.out.println("O preço com desconto foi " + moeda.format(precoComDesconto));
        System.out.println("Com preço original o valor é de " + precoOriginal);
        System.out.println("O valor do icms é de " + moeda.format(precoImposto));

    }
}
