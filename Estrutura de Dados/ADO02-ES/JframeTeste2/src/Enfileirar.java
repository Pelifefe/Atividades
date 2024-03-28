import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Enfileirar extends JFrame implements ActionListener {
    
    JTextField nome;
    Fila fila;
    Pessoa pessoa;
    
    public Enfileirar(Fila fila) {
        this.fila = fila;
        iniciar();
    }
    
    public void iniciar() {
        setTitle("Adicionar pessoa na fila");
        setVisible(true);
        setSize(350, 250);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        config();
    }
    
    public void config() {
        nome = new JTextField();
        nome.setBounds(20, 40, 280, 25);
        nome.setFont(new Font("Arial", Font.BOLD, 20));
        add(nome);
        
        JButton preferencial = new JButton("Preferencial");
        preferencial.setBounds(20, 80, 140, 25);
        add(preferencial);
        preferencial.addActionListener(this);
        
        JButton nPreferencial = new JButton("Não Preferencial");
        nPreferencial.setBounds(160, 80, 140, 25);
        add(nPreferencial);
        nPreferencial.addActionListener(this);
        
        JButton addButton = new JButton("Adicionar pessoa");
        addButton.setBounds(95, 160, 150, 40);
        add(addButton);
        addButton.addActionListener(this);
    } 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Preferencial")) {
            pessoa = new Pessoa(); // Inicializa a pessoa
            pessoa.setNome(nome.getText());
            pessoa.setPreferencial(true);
        } else if (e.getActionCommand().equals("Não Preferencial")) {
            pessoa = new Pessoa(); // Inicializa a pessoa
            pessoa.setNome(nome.getText());
            pessoa.setPreferencial(false);
        } else if (e.getActionCommand().equals("Adicionar pessoa")) {
            fila.enfileirar(pessoa);
        }
    }
}
