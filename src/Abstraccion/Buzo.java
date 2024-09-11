/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

import Implementador_color.Seleccion_color; //importa la interfase
import implementador_talla.Seleccion_talla;
/**
 *
 * @author jorge malaver
 */
public class Buzo extends Abstract_prenda{
    
    public Buzo(Seleccion_color tono ,Seleccion_talla talla){
     super(tono, talla);   
    }
    
    @Override
    public String prenda(){//implementaion del metodo abstracto
        //llamado a la referencia del implementador
        return("Adquirio un buso\n"
                + "Color: " + tono.Seleccionar_color()
                + "\nTalla: " + talla.Seleccionar_talla());
    }
}
