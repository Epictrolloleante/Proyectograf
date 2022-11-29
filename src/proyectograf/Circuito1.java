/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograf;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import proyectograf.Metodos;
import tiburcio.lib2D.s2D;
/**
 *
 * @author reyes
 */
public class Circuito1 extends JPanel{

    public Circuito1() {
        //DEF_SISTEMA("Mirilla", 800, 800, Color.LIGHT_GRAY);
        
       
    }
    
     public void paint(Graphics g) {
         Metodos m=new Metodos();
        m.Arduino(g);
        m.Proto(g);
        
     }
    
}
