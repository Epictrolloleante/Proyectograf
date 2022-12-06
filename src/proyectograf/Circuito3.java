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
public class Circuito3 extends JPanel {
    Metodos m = new Metodos();
    
    
    public Circuito3() {
        //DEF_SISTEMA("Mirilla", 800, 800, Color.LIGHT_GRAY);

    }

    public void paint(Graphics g) {
        //led
        int[]cLedX={485,500,497,488};
        int[]cLedY={95,103,106,100};
        
        g.setColor(Color.white);
        g.fillRect(0, 0, 700, 700);
        m.Arduino(g);
        m.Proto(g);
        
        
        //inicio del diseño del led rojo
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(m.coordProto2X[1][12], m.coordProto2Y[1][12]+5, 5, -27);
        g.fillRect(m.coordProto2X[1][11], m.coordProto2Y[1][11]+5, 5, -33);
        g.fillPolygon(cLedX,cLedY,4);
        g.setColor(Color.RED);
        g.fillRect(485, 80, 15, 17);
        //sensor de temperatra azul
        g.setColor(Color.black);
        g.fillRect(420, 240, 60, 80);
        g.setColor(Color.cyan);
        g.fillRect(430, 265, 40, 45);
        g.setColor(Color.black);
        for(int i=5;i<=25;i=i+10){
            g.fillRect(432+i, 273, 5, 5);
            g.fillRect(432+i, 283, 5, 5);
            g.fillRect(432+i, 293, 5, 5);
        }      
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(435, 230, 5, 30);
        g.fillRect(448, 230, 5, 30);
        g.fillRect(461, 230, 5, 30);
        //resistencia este no sera un elemento al cual se le baje o suba el voltaje
        Color colorRosa=new Color(246, 221, 204);
        g.setColor(colorRosa);
        g.fillRect(500 , 140, 35, 15);
         
        dibujarCables(g);
    }
    
    public void dibujarCables(Graphics g){
        //cables rojos energia
        int[]bCableNX={461,466,470,465};
        int[]bCableNY={230,230,200,200};
        //cables de pines verdes
        int[]aCableVX={250,255,453,448};
        int[]aCableVY={47,47,230,230};
        int[]bCableVX={550,260,260,550};
        int[]bCableVY={145,47,51,150};
        
        m.Fuente(g);
        
        //cables rojos de energia
        g.setColor(Color.RED);        
        g.fillRect(m.coordProto3X[0][6], m.coordProto3Y[0][6], 5, 45);
        //cables negros a tierra
        g.setColor(Color.BLACK);
        g.fillPolygon(bCableNX,bCableNY,4);
        g.fillRect(m.coordProto2X[2][11], m.coordProto2Y[2][11], 5, 60);
        //cables para conectar a los pines del arduino
        g.setColor(Color.GREEN);
        g.fillPolygon(aCableVX,aCableVY,4);
        g.fillPolygon(bCableVX,bCableVY,4);
    }

}
