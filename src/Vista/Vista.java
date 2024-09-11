/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Abstraccion.Buzo;
import Abstraccion.Chaqueta;
import Abstraccion.Pantalon;
import Implementador_color.Amarillo;
import Implementador_color.Azul;
import Implementador_color.Rojo;
import implementador_talla.Talla_L;
import implementador_talla.Talla_M;
import implementador_talla.Talla_S;


/**
 *
 * @author Estudiantes
 */
public class Vista extends JFrame{

    private JButton btnConfirm;
    private Titulo titulo;
    private Options tipos;
    private TallaSML tallas;
    private Color colores;
    
    private String talla;
    private String tipo;
    private String color;

    private JPanel panelOptions; 

    public Vista() {
        // Configurar el JFrame
        setTitle("Tienda de ropa");
        setLayout(new BorderLayout());

        
        btnConfirm = new JButton("Confirmar");
        titulo = new Titulo();
        tipos = new Options();
        tallas = new TallaSML();
        colores = new Color();

        panelOptions = new JPanel();

        panelOptions.setLayout(new BoxLayout(panelOptions, BoxLayout.Y_AXIS));
        panelOptions.add(tipos);
        panelOptions.add(tallas);
        panelOptions.add(colores);

        add(btnConfirm, BorderLayout.SOUTH);
        add(titulo, BorderLayout.NORTH);
        add(panelOptions, BorderLayout.CENTER);
        
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        btnConfirm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                talla = tallas.getTalla();
                tipo = tipos.getTipo();
                color = colores.getColor();
                if (tipo.equals("BUZO")) {
                    Buzo buzo = null;
                    if(color.equals("ROJO")){
                        if(talla.equals("S")){
                            buzo = new Buzo(new Rojo(), new Talla_S());
                        }else if(talla.equals("M")){
                            buzo = new Buzo(new Rojo(), new Talla_M());
                        }else if(talla.equals("L")){
                            buzo = new Buzo(new Rojo(), new Talla_L());
                        }
                    JOptionPane.showMessageDialog(null, buzo.prenda());
                        }else if(color.equals("AZUL")){
                        if(talla.equals("S")){
                            buzo = new Buzo(new Azul(), new Talla_S());
                        }else if(talla.equals("M")){
                            buzo = new Buzo(new Azul(), new Talla_M());
                        }else if(talla.equals("L")){
                            buzo = new Buzo(new Azul(), new Talla_L());
                        }
                    JOptionPane.showMessageDialog(null, buzo.prenda());
                    }else if(color.equals("AMARILLO")){
                        if(talla.equals("S")){
                            buzo = new Buzo(new Amarillo(), new Talla_S());
                        }else if(talla.equals("M")){
                            buzo = new Buzo(new Amarillo(), new Talla_M());
                        }else if(talla.equals("L")){
                            buzo = new Buzo(new Amarillo(), new Talla_L());
                        }
                    JOptionPane.showMessageDialog(null, buzo.prenda());
                    }
                }else if(tipo.equals("CHAQUETA")){
                    Chaqueta chaqueta = null;
                    if(color.equals("ROJO")){
                        if(talla.equals("S")){
                            chaqueta = new Chaqueta(new Rojo(), new Talla_S());
                        }else if(talla.equals("M")){
                            chaqueta = new Chaqueta(new Rojo(), new Talla_M());
                        }else if(talla.equals("L")){
                            chaqueta = new Chaqueta(new Rojo(), new Talla_L());
                        }
                    JOptionPane.showMessageDialog(null, chaqueta.prenda());
                        }else if(color.equals("AZUL")){
                        if(talla.equals("S")){
                            chaqueta = new Chaqueta(new Azul(), new Talla_S());
                        }else if(talla.equals("M")){
                            chaqueta = new Chaqueta(new Azul(), new Talla_M());
                        }else if(talla.equals("L")){
                            chaqueta = new Chaqueta(new Azul(), new Talla_L());
                        }
                    JOptionPane.showMessageDialog(null, chaqueta.prenda());
                    }else if(color.equals("AMARILLO")){
                        if(talla.equals("S")){
                            chaqueta = new Chaqueta(new Amarillo(), new Talla_S());
                        }else if(talla.equals("M")){
                            chaqueta = new Chaqueta(new Amarillo(), new Talla_M());
                        }else if(talla.equals("L")){
                            chaqueta = new Chaqueta(new Amarillo(), new Talla_L());
                        }
                    JOptionPane.showMessageDialog(null, chaqueta.prenda());
                    }
                }else if(tipo.equals("PANTALON")){
                    Pantalon pantalon = null;
                    if(color.equals("ROJO")){
                        if(talla.equals("S")){
                            pantalon = new Pantalon(new Rojo(), new Talla_S());
                        }else if(talla.equals("M")){
                            pantalon = new Pantalon(new Rojo(), new Talla_M());
                        }else if(talla.equals("L")){
                            pantalon = new Pantalon(new Rojo(), new Talla_L());
                        }
                    JOptionPane.showMessageDialog(null, pantalon.prenda());
                        }else if(color.equals("AZUL")){
                        if(talla.equals("S")){
                            pantalon = new Pantalon(new Azul(), new Talla_S());
                        }else if(talla.equals("M")){
                            pantalon = new Pantalon(new Azul(), new Talla_M());
                        }else if(talla.equals("L")){
                            pantalon = new Pantalon(new Azul(), new Talla_L());
                        }
                    JOptionPane.showMessageDialog(null, pantalon.prenda());
                    }else if(color.equals("AMARILLO")){
                        if(talla.equals("S")){
                            pantalon = new Pantalon(new Amarillo(), new Talla_S());
                        }else if(talla.equals("M")){
                            pantalon = new Pantalon(new Amarillo(), new Talla_M());
                        }else if(talla.equals("L")){
                            pantalon = new Pantalon(new Amarillo(), new Talla_L());
                        }
                    JOptionPane.showMessageDialog(null, pantalon.prenda());
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha seleccionado algun tipo de prenda de ropa");
                }
            }
        });
    }
}
