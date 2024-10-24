import java.util.Scanner;

public class CondicionalFaculdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Insira sua nota final:");
        double nota = entrada.nextDouble();

        String mensagem = (nota>=7 && idade>=17)
                ? "Aprovado!! Você pode prestar o vestibular!!"
                : "Você ainda não pode prestar o vestibulares 😢";
        System.out.println(mensagem);
        entrada.close();
    }
}
