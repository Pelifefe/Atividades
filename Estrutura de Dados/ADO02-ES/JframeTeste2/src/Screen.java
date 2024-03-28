import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Screen extends JFrame implements ActionListener{
    Pessoa pessoa = new Pessoa();
    Fila fila = new Fila();

    public Screen(){
        iniciar();
    }

    private void iniciar(){
        setTitle("Fila");
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        button();
        
    }
    public void button(){
        JLabel titulo = new JLabel("Fila de Ordenação", JLabel.CENTER);
        titulo.setBounds(120, 50, 160, 40);
        add(titulo);

        JButton enfileira = new JButton("Enfileira");
        enfileira.setBounds(120, 120, 160, 40);
        add(enfileira);
        enfileira.addActionListener(this::enfileirar);

        JButton desenfileira = new JButton("Desenfileira");
        desenfileira.setBounds(120, 160, 160, 40);
        add(desenfileira);
        desenfileira.addActionListener(this::desenfileirar);

        JButton exibir = new JButton("Exibir a fila");
        exibir.setBounds(120, 200, 160, 40);
        add(exibir);
        exibir.addActionListener(this::exibir);

        JButton qPessoas = new JButton("Quantas pessoas?");
        qPessoas.setBounds(120, 240, 160, 40);
        add(qPessoas);
        qPessoas.addActionListener(this::qPessoas);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Teste", "Teste titulo", JOptionPane.WARNING_MESSAGE);
    }

    private void enfileirar(ActionEvent actionEvent){
        Enfileirar enfileirar = new Enfileirar(fila);
    }

    private void desenfileirar(ActionEvent actionEvent){
        if(fila.qtsPessoas() <= 0){
            JOptionPane.showMessageDialog(new JFrame(), "Não há pessoas para desenfileirar!", "Desenfileirar",
        JOptionPane.ERROR_MESSAGE);
        }else{
            fila.desenfileirar();
            JOptionPane.showMessageDialog(null, "A pessoa saiu da fila com sucesso!", "Desenfileira", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void exibir(ActionEvent actionEvent){
        if(fila.qtsPessoas() > 0){
            Exibir exibir = new Exibir(fila.toString());
        }else{
            JOptionPane.showMessageDialog(new JFrame(), "Não há pessoas para exibir!", "Exibir",
        JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void qPessoas(ActionEvent actionEvent){
        if(fila.qtsPessoas() == 0){
            JOptionPane.showMessageDialog(new JFrame(), "Não há pessoas nessa fila!", "Quantas pessoas na fila",
        JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Quantidade: " + fila.qtsPessoas(), "Quantas pessoas na fila", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
