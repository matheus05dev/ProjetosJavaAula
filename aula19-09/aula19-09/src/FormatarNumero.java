import java.util.Locale;
import java.text.NumberFormat;

public class FormatarNumero {
    public static void main (String[] args){
        long numero = 1234567890;
        double numeroDecimal = 12345.67890;
        double porcentagem = 0.15;

        //formatação dos números
            NumberFormat formato = NumberFormat.getInstance(new Locale("pt")); //define o formato dos números utilizados
            formato.setMaximumFractionDigits(7); //para definir quantas casas decimais vai ter a variavél float/double
            //formato.setMinimumFractionDigits (1) vai definir o quantas casas decimais vai ter a variavél float/double
            NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(); // define o formato da moeda
            NumberFormat formatoPorcentagem = NumberFormat.getPercentInstance();// define porcentagem

        //aplicação da formatação
            //long formatado com as separações de milhares
            System.out.println("Número formatado com divisão dos milhares conforme configuração do sistema operacional: " + formato.format(numero));
            //double formatado com as casas decimais
            System.out.println("Número formatado com decimal conforme configuração do sistema operacional: " + formato.format(numeroDecimal));
            //moeda
            System.out.println("Número formatado com o padrão de moeda do Brasil " + formatoMoeda.format(numeroDecimal));
            //porcentagem
            System.out.println("Número formatado com a porcentagem " + formatoPorcentagem.format(porcentagem));
    }
}
