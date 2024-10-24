import java.util.Locale;

public class Licao04 {
    public static void main(String [] args){
        //Váriaveis
        String product1 = "Computador";
        String product2 = "Mesa de Escritório";
        int idade = 30;
        int codigo = 5290;
        char genero = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double medida = 53.234567;

        //Processo
        System.out.println("Produtos:");
        System.out.printf("%s cujo preço é R$ %.2f %n",product1,price1);
        System.out.printf("%s cujo preço é R$ %.2f %n",product2,price2);
        System.out.printf("Registro: %d anos, código %c e código %d %n",idade,genero,codigo);
        System.out.printf("Medida com oito casas decimais: %f %n",medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Roteado (três casas decimais): %.3f %n",medida);

    }
}
