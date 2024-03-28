import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exibir extends JFrame{
    
    public Exibir(String lista){
        iniciar();
        info(lista);
    }
    private void iniciar(){
        setTitle("Exibir a Fila");
        setVisible(true);
        setSize(375, 375);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        
    }

    private void info(String lista){
        JLabel jLabel = new JLabel(lista);
        if(lista.equals(null)){

        }else{
            jLabel.setFont(new Font("Arial", Font.PLAIN, 13));
            jLabel.setBounds(20, 20, 320, 320);
        }
        add(jLabel);  
    }
}
