
package logica;

import javax.swing.JLabel;

/**
 *
 * @author Gabriela Es
 */
public class traductor {
    
    boolean textoOriginal = true;

    public void traduccion1 (JLabel label, JLabel label2, JLabel label3, JLabel label4, JLabel label5){
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
}
