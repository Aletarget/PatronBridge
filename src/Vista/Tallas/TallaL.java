package Vista.Tallas;


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

import Vista.TallaSML;

public class TallaL extends JPanel{
    private JButton lImg;
    private JLabel ltext;
    private ImageIcon imagenL;
    private JPanel panel;
    @SuppressWarnings("unused")
    private TallaSML parent;
    public TallaL(TallaSML parent){
        this.parent = parent;
        imagenL = new ImageIcon(getClass().getResource("../Images/L(1).png"));
        lImg = new JButton(imagenL);
        ltext = new JLabel("Talla L");
        lImg.setPreferredSize(new Dimension(80,82));
        lImg.setAlignmentX(Component.CENTER_ALIGNMENT);
        ltext.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(ltext);
        panel.add(lImg);
        setLayout(new FlowLayout());
        add(panel);

        lImg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                parent.setSelectedTalla("L");
            }
        });
    }
}
