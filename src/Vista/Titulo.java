package Vista;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Titulo extends JPanel{
    private JLabel titulo;
    public Titulo(){
        titulo = new JLabel("Seleccione una de las siguientes prendas:");
        titulo.getAlignmentX();
        setLayout(new FlowLayout());
        add(titulo);

    }
}
