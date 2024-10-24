import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class troco {
    public static void main(String[] args){
        // variavéis
        float valorPago;
        float troco;
        float valorDescontado;
        //formatação
        NumberFormat formato = NumberFormat.getInstance(new Locale("pt", "br"));
        formato.setMinimumFractionDigits(2);
        NumberFormat moeda = NumberFormat.getCurrencyInstance();

        //processo
        Scanner entrada = new Scanner(System.in);
        System.out.print("insira a o valor pago: ");
        valorPago = entrada.nextFloat();
        System.out.print("insira o valor do produto: ");
        valorDescontado = entrada.nextFloat();
        troco = valorPago - valorDescontado;
        System.out.println("Você pagou com " + moeda.format(valorPago) + " e seu troco foi de " + moeda.format(troco));

    }
}
