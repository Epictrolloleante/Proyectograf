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
public class Circuito1 extends JPanel {
    //Coordenadas del PCB verde
    public int PantallaRect1X[]={380,650,650,380};
    public int PantallaRect1Y[]={240,240,350,350};
    
    public int PantallaRect2X[]={390,640,640,390};
    public int PantallaRect2Y[]={260,260,340,340};
    
    public int PantallaRect3X[]={400,630,630,400};
    public int PantallaRect3Y[]={270,270,330,330};
    
    public int coordPINLCDX=390;
    public int coordPINLCDY=243;
    public int coordsPINLCDX[]=new int[16];
    
    
    public Circuito1() {
        //DEF_SISTEMA("Mirilla", 800, 800, Color.LIGHT_GRAY);

    }

    public void paint(Graphics g) {
        Metodos m = new Metodos();
        g.setColor(Color.white);
        g.fillRect(0, 0, 700, 700);
        m.Arduino(g);
        m.Proto(g);
        
        //DIBUJAR PANTALLA LCD
        g.setColor(Color.green);
        g.fillPolygon(PantallaRect1X,PantallaRect1Y,4);
        
        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(PantallaRect2X,PantallaRect2Y,4);
        
        g.setColor(Color.cyan);
        g.fillPolygon(PantallaRect3X,PantallaRect3Y,4);
        
        g.setColor(Color.orange);
        for(int i=0;i<16;i++){
            g.fillOval(coordPINLCDX, coordPINLCDY, 5, 5);
            coordsPINLCDX[i]=coordPINLCDX;
            coordPINLCDX=coordPINLCDX+10;
        }
        
    }

}
