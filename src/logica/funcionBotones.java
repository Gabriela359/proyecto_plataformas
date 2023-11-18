package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import logica.traductor;


/**
 *
 * @author Gabriela Es
 */
public class funcionBotones implements ActionListener{
    
    private boolean textoOriginal = true;

    public void cambiarTexto(JLabel label, JLabel label2, JLabel label3, JLabel label4, JLabel label5){
        if (textoOriginal) {
            label.setText("Mass Storage - Systems");
            label2.setText("Topic 1           Topic 5");
            label3.setText("Topic 2           Topic 6");
            label4.setText("Topic 3           Topic 7");
            label5.setText("Topic 4           Topic 8");
        } else {
            label.setText("Sistemas de Almacenamiento Masivos");
            label2.setText("Tema 1            Tema 5");
            label3.setText("Tema 2            Tema 6");
            label4.setText("Tema 3            Tema 7");
            label5.setText("Tema 4            Tema 8");
       
        }
        textoOriginal = !textoOriginal;
    }

    public static void botonContinuar(JFrame frame) { //continuar pantallas
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void botonCerrar() {
        System.exit(0);
    }
    
    public void actionPerformed(ActionEvent e){
        
    }

}
