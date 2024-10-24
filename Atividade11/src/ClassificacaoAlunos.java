import java.util.Scanner;

public class ClassificacaoAlunos {
    public static void main(String[] args) {

        //variavéis
        double notaCorte = 7;
        double notaEntrada;
        int frequenciaCorte = 75;
        int frequenciaEntrada;

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Processo
        System.out.print("Insira a nota do Aluno: ");
        notaEntrada = entrada.nextDouble();
        System.out.print("Insira a frequência do Aluno: ");
        frequenciaEntrada = entrada.nextInt();

        if (notaEntrada >= notaCorte && frequenciaEntrada >= frequenciaCorte) {
            System.out.print("Aluno foi Aprovado com a nota de " + notaEntrada + " e a presença de " + frequenciaEntrada + "%");
        } else {
            if (notaEntrada >= 6 && notaEntrada < notaCorte && frequenciaEntrada >= frequenciaCorte) {
                System.out.print("Aluno esta de Recuperação com a nota de " + notaEntrada + " e a presença de " + frequenciaEntrada + "%");
            } else {
                if (notaEntrada < 6 || frequenciaEntrada >= frequenciaCorte) {
                    System.out.print("Aluno esta no Curso de Nivelamento com a nota de " + notaEntrada + " e a presença de " + frequenciaEntrada + "%");
                } else {
                    if (frequenciaEntrada < frequenciaCorte) {
                        System.out.print("Aluno foi Reprovado com a nota de" + notaEntrada + " e a presença de " + frequenciaEntrada + "%");
                    }
                }
            }
        }
    }
}