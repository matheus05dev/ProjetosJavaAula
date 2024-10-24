import javax.swing.*;

public class Janelamatheus {
    public static   void main(String[] args) {
        JFrame Janelamatheus = new JFrame();
        Janelamatheus.setTitle("Vaaaaaaaaai Corinthiaaaaans!");
        Janelamatheus.setSize(500, 500);
        Janelamatheus.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel labelMatheus = new JLabel();
        labelMatheus.setText("Fale seu nome ai se você é corinthiano:");
        labelMatheus.setBounds(20, 20, 250, 20);
        Janelamatheus.setLayout(null);
        Janelamatheus.getContentPane().add(labelMatheus);

        JTextField caixaMatheus = new JTextField();
        caixaMatheus.setBounds(20, 40, 300, 20);

        JButton botaoEnviar = new JButton();
        botaoEnviar.setText("Enviar");
        botaoEnviar.setBounds(20, 60, 100, 20);
        botaoEnviar.addActionListener(event -> {
            String nomeDigitado = caixaMatheus.getText();
            JOptionPane.showMessageDialog(Janelamatheus, "Olá Corinthiano " + nomeDigitado);
        });

        Janelamatheus.setLayout(null);
        Janelamatheus.getContentPane().add(labelMatheus);
        Janelamatheus.getContentPane().add(caixaMatheus);
        Janelamatheus.getContentPane().add(botaoEnviar);
        Janelamatheus.setVisible(true);

    }
}