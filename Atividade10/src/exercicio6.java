import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        // Variavéis
        String CASADO = "CASADO";
        String CASADA = "CASADA";
        String VIUVO = "VIUVO";
        String VIUVA = "VIUVA";
        String SOLTEIRO = "SOLTEIRO";
        String SOLTEIRA = "SOLTEIRA";
        String EstadoPessoa;

        // Scanner/Entrada de Dados
        Scanner entrada = new Scanner(System.in);

        //Processo
        System.out.println("Insira seu estado civil é (Casado(a), Viuvo(a) ou Solteiro(a)): ");
        EstadoPessoa = entrada.nextLine();
        if (EstadoPessoa.equalsIgnoreCase(CASADO)) {
            System.out.println("você é " + CASADO);
        } else {
            if (EstadoPessoa.equalsIgnoreCase(CASADA)) {
                System.out.println("você é " + CASADA);
            } else {
                if (EstadoPessoa.equalsIgnoreCase(VIUVO)) {
                    System.out.println("você é " + VIUVO);
                } else {
                    if (EstadoPessoa.equalsIgnoreCase(VIUVA)) {
                        System.out.println("você é " + VIUVA);
                    }else{
                        if (EstadoPessoa.equalsIgnoreCase(SOLTEIRO)){
                            System.out.println("você é " + SOLTEIRO);
                        }else {
                            if (EstadoPessoa.equalsIgnoreCase(SOLTEIRA)){
                                System.out.println("você é " + SOLTEIRA);
                            }else{
                                System.out.println("O estado civil inserido não existe");
                            }
                        }
                    }
                }
            }
        }
    }
}