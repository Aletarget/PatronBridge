/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

/**
 *
 * @author jorge malaver
 */
import Implementador_color.Seleccion_color;
import implementador_talla.Seleccion_talla;


public class Chaqueta extends Abstract_prenda{
    
    public Chaqueta(Seleccion_color tono,Seleccion_talla talla){
     super(tono, talla);   
    }
    
    @Override
    public String prenda(){//implementaion del metodo abstracto
        //llamado a la referencia del implementador
        return("Adquirio una chaqueta\n"
                + "Color: " + tono.Seleccionar_color()
                + "\nTalla: " + talla.Seleccionar_talla());
    }
}
