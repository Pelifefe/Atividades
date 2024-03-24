import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Enfileirar extends JFrame implements ActionListener{
    
    JTextField nome;
    
    public Enfileirar(){
        iniciar();
    }
    public void iniciar(){

        setTitle("Adicionar pessoa na fila");
        setVisible(true);
        setSize(350, 250);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        config();
    }
    public void config(){

        nome = new JTextField();
        nome.setBounds(20, 40, 280, 25);
        nome.setFont(new Font("Arial", Font.BOLD, 20));
        add(nome);
        
        JButton preferencial = new JButton("Preferencial");
        preferencial.setBounds(20, 80, 140, 25);
        add(preferencial);
        preferencial.addActionListener(this::preferencial);

        JButton nPreferencial = new JButton("Não Preferencial");
        nPreferencial.setBounds(160, 80, 140, 25);
        add(nPreferencial);
        nPreferencial.addActionListener(this::nPreferencial);

        JButton add = new JButton("Adicionar pessoa");
        add.setBounds(95, 160, 150, 40);
        add(add);
        add.addActionListener(this::botao);
        
    } 
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    public boolean nPreferencial(ActionEvent actionEvent){
        return true;
    }
    public boolean preferencial(ActionEvent actionEvent){
        return true;
    }
    public void botao(ActionEvent actionEvent){
        String name = nome.getText();

        if(nPreferencial(actionEvent)){
            
        }else if(preferencial(actionEvent)){
            
        }else{
            
        }
        
    }
}
