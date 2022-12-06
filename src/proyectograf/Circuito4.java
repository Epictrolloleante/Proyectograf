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
public class Circuito4 extends JPanel {
    Metodos m = new Metodos();
    
    
    public Circuito4() {
        //DEF_SISTEMA("Mirilla", 800, 800, Color.LIGHT_GRAY);

    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 700, 700);
        m.Arduino(g);
        m.Proto(g);
                               
        dibujarCables(g);                        

        //HC-SR04 (SENSOR ULTRASONICO)----------------------------------------------------------------------
        g.setColor(Color.BLUE);
        g.fillRect(530, 138, 90, 40);
        //PINES
        g.setColor(Color.GRAY);        
        g.fillRect(m.coordProto2X[1][22], m.coordProto2Y[1][22], 5, 15);
        g.fillRect(m.coordProto2X[1][20], m.coordProto2Y[1][20], 5, 15);
        g.fillRect(m.coordProto2X[1][19], m.coordProto2Y[1][19], 5, 15);
        g.fillRect(m.coordProto2X[1][17], m.coordProto2Y[1][17], 5, 15);
        
        g.fillOval(565, 164, 20, 10);
        //Receptor y transmisor del sensor
        g.setColor(Color.black);
        g.fillOval(536, 148, 25, 25);
        g.fillOval(589, 148, 25, 25); 
        
        //BUZZER        
        g.setColor(Color.black);
        g.fillOval(400, 125, 55, 55);   
        g.fillRect(424, 120, 8, 8);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval( 420, 145, 15, 15);
        
        //SIGNO "+" DEL BUZZER
        g.drawLine(440, 135, 440, 145);
        g.drawLine(435, 140, 445, 140);
         
        
    }
    
    public void dibujarCables(Graphics g){
        m.Fuente(g);
        
        //CABLES BUZZER
        g.setColor(Color.red);        
        g.fillRect(m.coordPines[5][0], m.coordPines[5][1], 5, 98);
        g.fillRect(m.coordPines[5][0], m.coordPines[5][1]+98, 300, 5);
        g.setColor(Color.black);        
        g.fillRect(m.coordPines[3][0], m.coordPines[3][1], 5, m.coordPines[3][1]+45);
        g.fillRect(m.coordPines[3][0], (m.coordPines[3][1]*2)+45, 300, 5);
        
        //CABLES HC-SR04 (sensor ultrasonico)
        g.setColor(Color.black);
        g.fillRect(m.coordProto2X[1][17], m.coordProto2Y[1][17], -30, 5);
        g.fillRect(m.coordProto2X[1][17]-30, m.coordProto2Y[1][17]+5, 5, 136);
        g.fillRect(m.coordProto2X[1][17]-25, m.coordProto2Y[1][17]+141, -315, 5);
        g.fillRect(m.coordProto2X[1][17]-342, m.coordProto2Y[1][17]+146, 5, -43);
        
        g.setColor(Color.orange);
        g.fillRect(m.coordProto2X[1][22], m.coordProto2Y[1][22], 35, 5);
        g.fillRect(m.coordProto2X[1][22]+30, m.coordProto2Y[1][22]+5, 5, 156);
        g.fillRect(m.coordProto2X[1][22]+35, m.coordProto2Y[1][22]+156, -445, 5);
        g.fillRect(m.coordProto2X[1][22]-412, m.coordProto2Y[1][22]+161, 5, -57);
        
        g.setColor(Color.yellow);
        g.fillRect(m.coordProto2X[1][19], m.coordProto2Y[1][19], 5, -16);
        g.fillRect(m.coordProto2X[1][19]+5, m.coordProto2Y[1][19]-16, -352, 5);
        g.fillRect(m.coordProto2X[1][19]-352, m.coordProto2Y[1][19]-11, 5, -63);
        
        g.setColor(Color.green);
        g.fillRect(m.coordProto2X[1][20], m.coordProto2Y[1][20], 5, -24);
        g.fillRect(m.coordProto2X[1][20]+5, m.coordProto2Y[1][20]-24, -357, 5);
        g.fillRect(m.coordProto2X[1][20]-352, m.coordProto2Y[1][20]-24, 5, -50);
        
    }

}
