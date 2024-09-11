package Vista;

import java.awt.FlowLayout;

import javax.swing.JPanel;

import Vista.Tallas.*;

public class TallaSML extends JPanel{
    private TallaS tallaS;
    private TallaM tallaM;
    private TallaL tallaL;
    private String talla = "S";
    public TallaSML(){
        tallaL = new TallaL(this);
        tallaS = new TallaS(this);
        tallaM = new TallaM(this);
        setLayout(new FlowLayout());

        add(tallaS);
        add(tallaM);
        add(tallaL);
        
    }
    public void setSelectedTalla(String talla){
        this.talla = talla;
    }   
    public String getTalla(){
        return talla;
    }

}
