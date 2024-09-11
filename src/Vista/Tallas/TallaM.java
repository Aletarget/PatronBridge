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

public class TallaM extends JPanel {
    private JButton mImg;
    private JLabel mtext;
    private ImageIcon imagenM;
    private JPanel panel;

    @SuppressWarnings("unused")
    private TallaSML parent;
    public TallaM(TallaSML parent){
        this.parent = parent;
        imagenM = new ImageIcon(getClass().getResource("../Images/M(1).png"));
        mImg = new JButton(imagenM);
        mtext = new JLabel("Talla M");
        mImg.setPreferredSize(new Dimension(80,82));
        mImg.setAlignmentX(Component.CENTER_ALIGNMENT);
        mtext.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(mtext);
        panel.add(mImg);
        setLayout(new FlowLayout());
        add(panel);
        
        mImg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                parent.setSelectedTalla("M");    
            }
        });
    }   

}
