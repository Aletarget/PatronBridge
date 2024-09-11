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

public class TallaS extends JPanel {
    private JButton sImg;
    private JLabel stext;
    private ImageIcon imagenS;
    private JPanel panel;
    @SuppressWarnings("unused")
    private TallaSML parent;
    public TallaS(TallaSML parent){
        this.parent = parent;
        imagenS = new ImageIcon(getClass().getResource("../Images/S(1).png"));
        sImg = new JButton(imagenS);
        stext = new JLabel("Talla S");
        sImg.setPreferredSize(new Dimension(80,82));
        sImg.setAlignmentX(Component.CENTER_ALIGNMENT);
        stext.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(stext);
        panel.add(sImg);
        setLayout(new FlowLayout());
        add(panel);

        sImg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                parent.setSelectedTalla("S");    
            }
            
        });
    }
}
