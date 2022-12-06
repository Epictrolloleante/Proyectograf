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
public class Circuito2 extends JPanel {
    Metodos m = new Metodos();
    
    
    public Circuito2() {
        //DEF_SISTEMA("Mirilla", 800, 800, Color.LIGHT_GRAY);

    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 700, 700);
        m.Arduino(g);
        m.Proto(g);
                
        //SERVO (Azul)
        int [] servoX={495,560,560,495}; //Coordenadas en X del servo
        int [] servoY={60,60,150,150};  //Coordenadas en Y del servo
        g.setColor(Color.BLUE);
        g.fillPolygon(servoX, servoY, 4); //Colorear servo de azul
        g.setColor(Color.BLACK);
        g.drawPolygon(servoX, servoY, 4);  //Contorno del Servo
        
        //BASE SERVO (Rectangulo Negro)
        int [] baseServoX={510,545,545,510}; //Coordenadas en X base del servo
        int [] baseServoY={150,150,170,170}; //Coordenadas en Y base negra del servo
        g.fillPolygon(baseServoX, baseServoY, 4); //Colorear base color negro del Servo
        
        //DETALLES DEL SERVO (Aspas Grises)
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(500, 105, 50, 20); //Aspa servo horizontal
        g.fillOval(515, 70, 20, 75); //Aspa servo vertical
        g.fillOval(515, 105, 20, 20); //circulo, centro del servo
        g.setColor(Color.BLACK);
        g.drawOval(500, 105, 50, 20); //Contorno del Aspa servo horizontal
        g.drawOval(515, 70, 20, 75); //Contorno del Aspa servo vertical
        g.drawOval(515, 105, 20, 20); //Contorno del circulo (centro servo)
        
        //LDR
        g.setColor(Color.YELLOW);
        g.fillOval(405, 80, 35, 35); //Colorear LDR 
        g.setColor(Color.RED);
        g.drawOval(405, 80, 35, 35); //Dibujar contorno de LDR
        g.drawLine(405, 96, 440, 96);//Linea del centro de LDR
        int [] simboloLDRX={410,435,435,410}; //Coordenadas en X del rectangulo de LDR
        int [] simboloLDRY={91,91,101,101};  //Coordenadas en Y del rectangulo de LDR
        g.drawPolygon(simboloLDRX, simboloLDRY, 4); //Dibujar rectangulo para LDR
        //Patitas de la LDR
        g.setColor(Color.LIGHT_GRAY);
        int [] patita2LDRX={425,430,430,425}; //Coordenadas de la patita derecha de la LDR
        int [] patita2LDRY={115,115,130,130};
        g.fillPolygon(patita2LDRX, patita2LDRY, 4); //Patita derecha
        int [] patita1LDRX={415,420,420,415};  //Coordenadas de la patita izquierda de la LDR
        int [] patita1LDRY={115,115,130,130};
        g.fillPolygon(patita1LDRX, patita1LDRY, 4); //Patita izquierda
        
        dibujarCables(g);                                      
        
    }
    
    public void dibujarCables(Graphics g){
        m.Fuente(g);
        
        //CABLES DE COLOR ROJO
        g.setColor(Color.RED);
        //Cable que conecta el servo a voltaje:
        int [] cableRojoServoX={525,530,530,525};
        int [] cableRojoServoY={170,170,205,205};
        g.fillPolygon(cableRojoServoX, cableRojoServoY, 4); 
        
        //Cable que conecta la LDR con el voltaje:
        int [] cableRojoLDRX={415,420,420,415};
        int [] cableRojoLDRY={165,165,205,205};
        g.fillPolygon(cableRojoLDRX, cableRojoLDRY, 4);
        
        //CABLES DE COLOR NEGRO
        g.setColor(Color.black);
        //Cable que conecta el servo con la tierra:
        int [] cableNegroServoX={535,540,540,535};
        int [] cableNegroServoY={170,170,190,190};
        g.fillPolygon(cableNegroServoX, cableNegroServoY, 4); 
        
        //CABLE AZUL
        //Rectangulos que conforman al cable azul que conecta al servo a -9 del arduino:
        g.setColor(Color.cyan);
        int [] cableAzulServoX={515,520,520,515};
        int [] cableAzulServoY={170,170,190,190};
        g.fillPolygon(cableAzulServoX, cableAzulServoY, 4);
        int [] cableAzul4X={475,515,515,475};
        int [] cableAzul4Y={185,185,190,190};
        g.fillPolygon(cableAzul4X, cableAzul4Y, 4);
        int [] cableAzul3X={475,480,480,475};
        int [] cableAzul3Y={35,35,185,185};
        g.fillPolygon(cableAzul3X, cableAzul3Y, 4);
        int [] cableAzul2X={177,475,475,177};
        int [] cableAzul2Y={35,35,40,40};
        g.fillPolygon(cableAzul2X, cableAzul2Y, 4);
        int [] cableAzulX={177,182,182,177};
        int [] cableAzulY={35,35,45,45};
        g.fillPolygon(cableAzulX, cableAzulY, 4);
        
        //CABLE VERDE
        //Rectangulos que conforman al cable verde que conecta a la LDR al pin A0 del arduino:
        g.setColor(Color.GREEN);
        int [] cableVerdeX={330,430,430,330};
        int [] cableVerdeY={145,145,150,150};
        g.fillPolygon(cableVerdeX, cableVerdeY, 4);
        int [] cableVerde2X={330,335,335,330};
        int [] cableVerde2Y={145,145,250,250};
        g.fillPolygon(cableVerde2X, cableVerde2Y, 4);
        int [] cableVerde3X={227,335,335,227};
        int [] cableVerde3Y={250,250,255,255};
        g.fillPolygon(cableVerde3X, cableVerde3Y, 4);
        int [] cableVerde4X={227,232,232,227};
        int [] cableVerde4Y={230,230,250,250};
        g.fillPolygon(cableVerde4X, cableVerde4Y, 4);
    }

}
