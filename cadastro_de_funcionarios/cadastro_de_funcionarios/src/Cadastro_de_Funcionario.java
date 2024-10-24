import javax.swing.*;

public class Cadastro_de_Funcionario {
    public static   void main(String[] args) {
        //Inicio / Funcionamento
        JFrame janelaCadastro = new JFrame();
        janelaCadastro.setTitle("Cadastro de Funcionário");
        janelaCadastro.setSize(800, 550);
        janelaCadastro.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Caixas de texto

        //Nome
        JLabel labelName = new JLabel();
        labelName.setText("Nome:");
        labelName.setBounds(20, 20, 250, 20);
        janelaCadastro.setLayout(null);
        janelaCadastro.getContentPane().add(labelName);

        JTextField caixaNome = new JTextField();
        caixaNome.setBounds(20, 40, 300, 20);

        //Endereço
        JLabel labelEndereco = new JLabel();
        labelEndereco.setText("Endereço:");
        labelEndereco.setBounds(20, 60, 250, 20);
        janelaCadastro.setLayout(null);
        janelaCadastro.getContentPane().add(labelEndereco);

        JTextField caixaEndereco = new JTextField();
        caixaEndereco.setBounds(20, 80, 300, 20);

        //Bairro
        JLabel labelBairro = new JLabel();
        labelBairro.setText("Bairro:");
        labelBairro.setBounds(20, 100, 250, 20);
        janelaCadastro.setLayout(null);
        janelaCadastro.getContentPane().add(labelBairro);

        JTextField caixaBairro = new JTextField();
        caixaBairro.setBounds(20, 120, 300, 20);

        //Cidade
        JLabel labelCidade = new JLabel();
        labelCidade.setText("Cidade:");
        labelCidade.setBounds( 20, 140,250, 20);

        JTextField caixaCidade = new JTextField();
        caixaCidade.setBounds(20, 160, 300, 20);

        //Estado
        JLabel labelEstado = new JLabel();
        labelEstado.setText("Estado:");
        labelEstado.setBounds(20, 180, 250, 20);
        janelaCadastro.setLayout(null);
        janelaCadastro.getContentPane().add(labelEstado);

        JTextField caixaEstado = new JTextField();
        caixaEstado.setBounds(20, 200, 300, 20);

        //CEP
        JLabel labelCEP = new JLabel();
        labelCEP.setText("CEP:");
        labelCEP.setBounds(20, 220, 250, 20);
        janelaCadastro.setLayout(null);
        janelaCadastro.getContentPane().add(labelCEP);

        JTextField caixaCEP = new JTextField();
        caixaCEP.setBounds(20, 240, 300, 20);

        //Telefone
        JLabel labelTelefone = new JLabel();
        labelTelefone.setText("Telefone:");
        labelTelefone.setBounds(20, 260, 250, 20);
        janelaCadastro.setLayout(null);
        janelaCadastro.getContentPane().add(labelTelefone);

        JTextField caixaTelefone = new JTextField();
        caixaTelefone.setBounds(20, 280, 300, 20);

        //E-Mail
        JLabel labelEmail = new JLabel();
        labelEmail.setText("Email:");
        labelEmail.setBounds(20, 300, 250, 20);
        janelaCadastro.setLayout(null);
        janelaCadastro.getContentPane().add(labelEmail);

        JTextField caixaEmail = new JTextField();
        caixaEmail.setBounds(20, 320, 300, 20);

        //Cargo
        JLabel labelCargo = new JLabel();
        labelCargo.setText("Cargo:");
        labelCargo.setBounds(20, 340, 250, 20);
        janelaCadastro.setLayout(null);
        janelaCadastro.getContentPane().add(labelCargo);

        JTextField caixaCargo = new JTextField();
        caixaCargo.setBounds(20, 360, 300, 20);

        //Data de Contratação
        JLabel labelDt_Contratacao = new JLabel();
        labelDt_Contratacao.setText("Data de contratação:");
        labelDt_Contratacao.setBounds(20, 380, 250, 20);
        janelaCadastro.setLayout(null);
        janelaCadastro.getContentPane().add(labelDt_Contratacao);

        JTextField caixaDt_contratacao = new JTextField();
        caixaDt_contratacao.setBounds(20, 400, 300, 20);

        //Remuneração
        JLabel labelRemuneracao = new JLabel();
        labelRemuneracao.setText("Remuneração:");
        labelRemuneracao.setBounds(20, 420, 250, 20);
        janelaCadastro.setLayout(null);
        janelaCadastro.getContentPane().add(labelRemuneracao);

        JTextField caixaRemuneracao = new JTextField();
        caixaRemuneracao.setBounds(20, 440, 300, 20);

        //Botões

        //Enviar(incluir)
        JButton botaoIncluir = new JButton();
        botaoIncluir.setText("Incluir");
        botaoIncluir.setBounds(20, 480, 100, 20);
        botaoIncluir.addActionListener(event -> {
            String nomedigitado = caixaNome.getText();
            JOptionPane.showMessageDialog(janelaCadastro,"Funcionario(a) "+nomedigitado+" incluido com sucesso !");
        });

        //Consultar
        JButton botaoConsultar = new JButton();
        botaoConsultar.setText("Consultar");
        botaoConsultar.setBounds(130,480,100,20);
        botaoConsultar.addActionListener(event ->{
            caixaNome.setText("Matheus");
            caixaEndereco.setText("Rua Brasil");
            caixaBairro.setText("Terras de São José");
            caixaCidade.setText("Itu");
            caixaEstado.setText("São Paulo");
            caixaCEP.setText("13212240");
            caixaTelefone.setText("(11) 9 4264-0042");
            caixaEmail.setText("paulo18guri90@outlook.com");
            caixaCargo.setText("desenvolvedor de software junior");
            caixaDt_contratacao.setText("05/09/2024");
            caixaRemuneracao.setText("R$ 4500");
        });

        //Limpar
        JButton botaoLimpar= new JButton();
        botaoLimpar.setText("Limpar");
        botaoLimpar.setBounds(240,480,100,20);
        botaoLimpar.addActionListener(event ->{
            caixaNome.setText(" ");
            caixaEndereco.setText(" ");
            caixaBairro.setText(" ");
            caixaCidade.setText(" ");
            caixaEstado.setText(" ");
            caixaCEP.setText(" ");
            caixaTelefone.setText(" ");
            caixaEmail.setText(" ");
            caixaCargo.setText(" ");
            caixaDt_contratacao.setText(" ");
            caixaRemuneracao.setText(" ");
        });

        //Excluir
        JButton botaoExcluir = new JButton();
        botaoExcluir.setText("Excluir");
        botaoExcluir.setBounds(350,480,100,20);
        botaoExcluir.addActionListener(action -> {

            String nomedigitado = caixaNome.getText();
            JOptionPane.showMessageDialog(janelaCadastro, "Funcionário(a) " + nomedigitado + " excluído com sucesso!");
        });

        //Alterar
        JButton botaoAlterar = new JButton();
        botaoAlterar.setText("Alterar");
        botaoAlterar.setBounds(460,480,100,20);
        botaoAlterar.addActionListener(action -> {

            String nomedigitado = caixaNome.getText();
            JOptionPane.showMessageDialog(janelaCadastro, "Funcionário(a) " + nomedigitado + " alterado com sucesso!");
        });

        //Sair
        JButton botaoSair = new JButton();
        botaoSair.setText("Sair");
        botaoSair.addActionListener(event -> {janelaCadastro.dispose();});
        botaoSair.setBounds(570,480,100,20);

        //Tela

        //Etiquetas
        janelaCadastro.setLayout(null);
        janelaCadastro.getContentPane().add(labelName);
        janelaCadastro.getContentPane().add(labelEndereco);
        janelaCadastro.getContentPane().add(labelBairro);
        janelaCadastro.getContentPane().add(labelCidade);
        janelaCadastro.getContentPane().add(labelEstado);
        janelaCadastro.getContentPane().add(labelCEP);
        janelaCadastro.getContentPane().add(labelTelefone);
        janelaCadastro.getContentPane().add(labelEmail);
        janelaCadastro.getContentPane().add(labelCargo);
        janelaCadastro.getContentPane().add(labelDt_Contratacao);
        janelaCadastro.getContentPane().add(labelRemuneracao);

        //Caixas de Textos
        janelaCadastro.getContentPane().add(caixaNome);
        janelaCadastro.getContentPane().add(caixaEndereco);
        janelaCadastro.getContentPane().add(caixaBairro);
        janelaCadastro.getContentPane().add(caixaCidade);
        janelaCadastro.getContentPane().add(caixaEstado);
        janelaCadastro.getContentPane().add(caixaCEP);
        janelaCadastro.getContentPane().add(caixaTelefone);
        janelaCadastro.getContentPane().add(caixaEmail);
        janelaCadastro.getContentPane().add(caixaCargo);
        janelaCadastro.getContentPane().add(caixaDt_contratacao);
        janelaCadastro.getContentPane().add(caixaRemuneracao);

        //Botões
        janelaCadastro.getContentPane().add(botaoIncluir);
        janelaCadastro.getContentPane().add(botaoConsultar);
        janelaCadastro.getContentPane().add(botaoLimpar);
        janelaCadastro.getContentPane().add(botaoExcluir);
        janelaCadastro.getContentPane().add(botaoAlterar);
        janelaCadastro.getContentPane().add(botaoSair);

        //Funcionar
        janelaCadastro.setVisible(true);

    }
}