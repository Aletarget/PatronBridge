package Vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Color extends JPanel{
    private String[] opciones = {"ROJO","AZUL","AMARILLO"};
    private JComboBox<String> desplegable;
    private String color = "ROJO";

    public Color(){
        desplegable = new JComboBox<>(opciones);
        desplegable.setPreferredSize(new Dimension(100,25));
        setLayout(new FlowLayout());
        add(desplegable);
        desplegable.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                color = (String) desplegable.getSelectedItem();    
            }
            
        });
    }

    public String getColor(){
        return color;
    }
}
