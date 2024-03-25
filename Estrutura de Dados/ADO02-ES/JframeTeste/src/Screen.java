import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Screen extends JFrame implements ActionListener{
    
    public Screen(){
        iniciar();
        
    }

    private void iniciar(){
        setTitle("Ordenação de Fila");
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        button();
        
    }
    public void button(){
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
        Enfileirar enfileirar = new Enfileirar();
    }
    private void desenfileirar(ActionEvent actionEvent){
        //mensagem
    }
    private void exibir(ActionEvent actionEvent){
        Exibir exibir = new Exibir();
    }
    private void qPessoas(ActionEvent actionEvent){
        //mensagem
    }
}
