import java.util.Random;
import java.util.Scanner;

public class Jokempo {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        int escolhaPC = gerador.nextInt(2);

        System.out.print("Faça sua escolha entre (pedra, papel, tesoura): ");
        String escolhaUsuario = entrada.nextLine();
        String resultado = "";
        String escolhaPCTexto = "";

        if (escolhaUsuario.equalsIgnoreCase("pedra")){
            if (escolhaPC == 0){
                resultado = "O jogo deu empate
                escolhaPCTexto = "pedra";
            }else if (escolhaPC == 1){
                resultado = "O computador é o vencedor";
                escolhaPCTexto = "papel";
            } else if (escolhaPC == 2) {
                resultado = "O usuário é o vencedor";
                escolhaPCTexto = "tesoura";
            }
            System.out.println("Escolha do Computador foi " + escolhaPCTexto);
        } else if (escolhaUsuario.equalsIgnoreCase("papel")){
                if (escolhaPC == 0) {
                    resultado = "O usuário é o vencedor";
                    escolhaPCTexto = "pedra";
                } else if (escolhaPC == 1) {
                    resultado = "O jogo deu empate";
                    escolhaPCTexto = "papel";
                } else if (escolhaPC == 2) {
                    resultado = "O computador é o vencedor";
                    escolhaPCTexto = "tesoura";
                }
            System.out.println("Escolha do Computador foi " + escolhaPCTexto);
        } else if (escolhaUsuario.equalsIgnoreCase("tesoura")) {
            if (escolhaPC == 0) {
                resultado = "O computador é o vencedor";
                escolhaPCTexto = "pedra";
            } else if (escolhaPC == 1) {
                resultado = "O usuário é o vencedor";
                escolhaPCTexto = "papel";
            } else if (escolhaPC == 2) {
                resultado = "O jogo deu empate";
                escolhaPCTexto = "tesoura";
            }
            System.out.println("Escolha do Computador foi " + escolhaPCTexto);
        } else {
            resultado = "Escolha do Usuário Inválida, escolha entre pedra, papel ou tesoura";
        }
        System.out.println(resultado);
    }
}