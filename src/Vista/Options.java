package Vista;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Options extends JPanel{
    private JButton btnChaqueta; 
    private JButton btnPantalon; 
    private JButton btnBuzo; 


    private ImageIcon imageChaqueta;
    private ImageIcon imagePantalon;
    private ImageIcon imageBuzo;

    private JLabel buzoText;
    private JLabel pantalonText;
    private JLabel chaquetaText;

    private JPanel panelBuzo;
    private JPanel panelPantalon;
    private JPanel panelChaqueta;

    private String tipo = "";

    public Options(){
        imageBuzo = new ImageIcon(getClass().getResource("./Images/sudadera(1).png"));
        btnBuzo = new JButton(imageBuzo);
        buzoText = new JLabel("BUZO");
        btnBuzo.setPreferredSize(new Dimension(102,102));
        btnBuzo.setAlignmentX(Component.CENTER_ALIGNMENT);
        buzoText.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelBuzo = new JPanel();
        panelBuzo.setLayout(new BoxLayout(panelBuzo,BoxLayout.Y_AXIS));
        panelBuzo.add(buzoText);
        panelBuzo.add(btnBuzo);
        
        imageChaqueta = new ImageIcon(getClass().getResource("./Images/chaqueta(1).png"));
        btnChaqueta = new JButton(imageChaqueta);
        chaquetaText = new JLabel("CHAQUETA");
        btnChaqueta.setPreferredSize(new Dimension(102,102));
        btnChaqueta.setAlignmentX(Component.CENTER_ALIGNMENT);
        chaquetaText.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelChaqueta = new JPanel();
        panelChaqueta.setLayout(new BoxLayout(panelChaqueta,BoxLayout.Y_AXIS));
        panelChaqueta.add(chaquetaText);
        panelChaqueta.add(btnChaqueta);


        imagePantalon = new ImageIcon(getClass().getResource("./Images/pantalon(1).png"));
        btnPantalon = new JButton(imagePantalon);
        pantalonText = new JLabel("PANTALON");
        btnPantalon.setPreferredSize(new Dimension(102,102));
        btnPantalon.setAlignmentX(Component.CENTER_ALIGNMENT);
        pantalonText.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelPantalon = new JPanel();
        panelPantalon.setLayout(new BoxLayout(panelPantalon,BoxLayout.Y_AXIS));
        panelPantalon.add(pantalonText);
        panelPantalon.add(btnPantalon);


        setLayout(new FlowLayout());

        add(panelBuzo);
        add(panelChaqueta);
        add(panelPantalon);


        btnBuzo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = buzoText.getText();
            }
        });
        btnChaqueta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = chaquetaText.getText();
            }
        });
        btnPantalon.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = pantalonText.getText();
            }
        });
    }
    public String getTipo(){
        return tipo;
    }
}
