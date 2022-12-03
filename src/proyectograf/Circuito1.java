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
    Metodos m = new Metodos();
    //Coordenadas del PCB verde
    public int PantallaRect1X[]={380,650,650,380};
    public int PantallaRect1Y[]={240,240,350,350};
    
    public int PantallaRect2X[]={390,640,640,390};
    public int PantallaRect2Y[]={260,260,340,340};
    
    public int PantallaRect3X[]={400,630,630,400};
    public int PantallaRect3Y[]={270,270,330,330};
    
    public int coordPINLCDX=405;
    public int coordPINLCDY=243;
    public int coordsPINLCDX[]=new int[16];
    
    
    public Circuito1() {
        //DEF_SISTEMA("Mirilla", 800, 800, Color.LIGHT_GRAY);

    }

    public void paint(Graphics g) {
        
        g.setColor(Color.white);
        g.fillRect(0, 0, 700, 700);
        m.Arduino(g);
        m.Proto(g);
        dibujarLCD(g);
        dibujarPotenciometro(g);
        dibujarResistencias(g, m.coordProto2X[0][15], m.coordProto2Y[0][15]);
        dibujarCables(g);
    }
    
    public void dibujarCables(Graphics g){
        //PUENTE TIERRA y FASE
        g.setColor(Color.black);
        g.fillRect(m.coordProto1X[0][25], m.coordProto1Y[0][25], 5, 120);
        g.setColor(Color.red);
        g.fillRect(m.coordProto1X[1][26], m.coordProto1Y[1][26], 5, 125);
        
        //Resistencia
        g.setColor(Color.decode("#9c6028"));
        g.fillRect(m.coordProto1X[1][15], m.coordProto1Y[1][15], 5, 27);
        g.fillRect(m.coordProto2X[2][15], m.coordProto2Y[2][15]+5, 5, 100);
        
        //Potenciometro
        g.setColor(Color.red);
        g.fillRect(m.coordProto2X[3][1], m.coordProto2Y[3][1], 5, 25);
        
        g.setColor(Color.black);
        g.fillRect(m.coordProto2X[3][3], m.coordProto2Y[3][3], 5, 35);
        
        //PIN 2
        g.setColor(Color.decode("#68289c"));
        g.fillRect(m.coordProto1X[0][14], m.coordProto1Y[0][14]-35, 5, 220);
        g.fillRect(m.coordPines[15][0], m.coordPines[15][1]-17, 5, 22);
        g.fillRect(m.coordPines[15][0], m.coordPines[15][1]-17, 265, 5);
        
        //PIN 3
        g.setColor(Color.decode("#0d70b8"));
        g.fillRect(m.coordProto1X[0][13], m.coordProto1Y[0][13]-42, 5, 227);
        g.fillRect(m.coordPines[14][0], m.coordPines[14][1]-24, 5, 29);
        g.fillRect(m.coordPines[14][0], m.coordPines[14][1]-24, 265, 5);
        
        //PIN 4
        g.setColor(Color.decode("#5cb6f7"));
        g.fillRect(m.coordProto1X[0][12], m.coordProto1Y[0][12]-49, 5, 234);
        g.fillRect(m.coordPines[13][0], m.coordPines[13][1]-31, 5, 36);
        g.fillRect(m.coordPines[13][0], m.coordPines[13][1]-31, 265, 5);
        
        //PIN 5
        g.setColor(Color.decode("#33a345"));
        g.fillRect(m.coordProto1X[0][11], m.coordProto1Y[0][11]-56, 5, 241);
        g.fillRect(m.coordPines[12][0], m.coordPines[12][1]-38, 5, 43);
        g.fillRect(m.coordPines[12][0], m.coordPines[12][1]-38, 265, 5);
        
        //PIN 12
        g.setColor(Color.yellow);
        g.fillRect(m.coordProto1X[0][8], m.coordProto1Y[0][8]-63, 5, 248);
        g.fillRect(m.coordPines[5][0], m.coordPines[5][1]-45, 5, 50);
        g.fillRect(m.coordPines[5][0], m.coordPines[5][1]-45, 310, 5);
        
        //PIN 11
        g.setColor(Color.decode("#fa7e02"));
        g.fillRect(m.coordProto1X[0][6], m.coordProto1Y[0][6]-70, 5, 255);
        g.fillRect(m.coordPines[4][0], m.coordPines[4][1]-52, 5, 57);
        g.fillRect(m.coordPines[4][0], m.coordPines[4][1]-52, 279, 5);
        
        //ALIMENTACION
        g.setColor(Color.black);
        g.fillRect(m.coordProto3X[1][0]-25, m.coordProto3Y[1][0], 30, 5);
        g.fillRect(m.coordProto3X[1][0]-25, m.coordProto3Y[1][0], 5, 65);
        
        g.setColor(Color.red);
        g.fillRect(m.coordProto3X[0][0]-35, m.coordProto3Y[0][0]-5, 40, 5);
        g.fillRect(m.coordProto3X[0][0]-35, m.coordProto3Y[0][0]-5, 5, 60);
        
        //Bateria
        g.setColor(Color.decode("#cccccc"));
        g.fillRect(m.coordProto3X[1][0]-40, m.coordProto3Y[1][0]+60, 40, 80);
        
        g.setColor(Color.decode("#bd8759"));
        g.fillRect(m.coordProto3X[1][0]-40, m.coordProto3Y[1][0]+65, 40, 80);
        
        //EXTRA CABLE
        g.setColor(Color.black);
        g.fillRect(m.coordProto3X[1][7], m.coordProto3Y[1][7], 5, 65);
        
        g.fillRect(m.coordProto3X[1][16], m.coordProto3Y[1][16], 5, 65);
        
        g.setColor(Color.red);
        g.fillRect(m.coordProto3X[0][4], m.coordProto3Y[0][4]-5, 5, 50);
        
        g.setColor(Color.magenta);
        g.fillRect(m.coordProto2X[3][2], m.coordProto2Y[3][2], 35, 5);
        g.fillRect(m.coordProto2X[3][5], m.coordProto2Y[3][5], 5, 85);
    }   
    public void dibujarResistencias(Graphics g,int x,int y){
        //Patas
        g.setColor(Color.gray);
        g.fillRect(x, y, 5, 45);
        //Cuerpo
        g.setColor(Color.orange);
        g.fillRect(x-3, y+10, 10, 25);
        
        //RAYAS
        g.setColor(Color.red);
        g.fillRect(x-3, y+13, 10, 3);
        
        g.setColor(Color.red);
        g.fillRect(x-3, y+19, 10, 3);
        
        g.setColor(Color.MAGENTA);
        g.fillRect(x-3, y+26, 10, 3);
        
    }
    
    public void dibujarPotenciometro(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(m.coordProto2X[2][1], m.coordProto2Y[2][1], 5, 20);
        g.fillRect(m.coordProto2X[2][2], m.coordProto2Y[2][2], 5, 20);
        g.fillRect(m.coordProto2X[2][3], m.coordProto2Y[2][3], 5, 20);
        
        g.setColor(Color.decode("#2e5878"));
        g.fillOval(m.coordProto2X[1][1]-10, m.coordProto2Y[1][1]-10, 40, 40);
        g.setColor(Color.decode("#5a9ed1"));
        g.fillOval(m.coordProto2X[1][1]-5, m.coordProto2Y[1][1]-5, 30, 30);
        g.setColor(Color.black);
        g.fillRect(m.coordProto2X[1][1]+8, m.coordProto2Y[1][1]+10, 4, 20);
        
        
    }
    public void dibujarLCD(Graphics g){
        //DIBUJAR PANTALLA LCD
        g.setColor(Color.decode("#3bad61"));
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
