/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograf;

import java.awt.Color;
import java.awt.Graphics;
import tiburcio.lib2D.s2D;

/**
 *
 * @author reyes
 */
public class Metodos {
    public int coordPines[][]=new int[32][2];
    public int coordProto1X[][]=new int[2][27];
    public int coordProto1Y[][]=new int[2][27];
    
    public int coordProto2X[][]=new int[4][27];
    public int coordProto2Y[][]=new int[4][27];
    
    public int coordProto3X[][]=new int[2][27];
    public int coordProto3Y[][]=new int[2][27];
    
    public Color c;
    public int x;
    public int y;
    public int w;
    public int h;
    
    public Color c2;
    public int x2;
    public int y2;
    public int w2;
    public int h2;
    
    public Metodos() {
       
    }
    
    public void Caliente(Graphics g){
        g.setColor(c);
        g.fillOval(x, y, w, h);
    }
    
    public void Fuente(Graphics g){
        //ALIMENTACION
        g.setColor(Color.black);
        g.fillRect(coordProto3X[0][0]-25, coordProto3Y[0][0], 30, 5);
        g.fillRect(coordProto3X[0][0]-25, coordProto3Y[0][0], 5, 65);
        
        g.setColor(Color.red);
        g.fillRect(coordProto3X[1][0]-35, coordProto3Y[1][0]-5, 40, 5);
        g.fillRect(coordProto3X[1][0]-35, coordProto3Y[1][0]-5, 5, 60);
        
        //Bateria
        g.setColor(Color.decode("#cccccc"));
        g.fillRect(coordProto3X[0][0]-40, coordProto3Y[0][0]+60, 40, 80);
        
        g.setColor(Color.decode("#bd8759"));
        g.fillRect(coordProto3X[0][0]-40, coordProto3Y[0][0]+65, 40, 80);
    }

    public void Arduino(Graphics g) {
        int pin=0;
        int[] xPoints = {40, 280, 300, 300, 320, 320, 300, 300, 40};
        int[] yPoints = {40, 40, 60, 100, 120, 200, 220, 240, 240};
        
        g.setColor(Color.black);
        g.drawPolygon(xPoints, yPoints, 9);

        g.drawRect(30, 80, 40, 30);
        g.drawArc(50, 75, 10, 10, 0, 180);
        g.drawArc(50, 105, 10, 10, 180, 360);
        g.setColor(Color.lightGray);
        g.fillRect(31, 81, 39, 29);

        g.setColor(Color.black);

        g.drawRect(55, 45, 20, 20);
        g.drawRect(52, 45, 3, 5);
        g.drawRect(52, 52, 3, 5);
        g.drawRect(52, 59, 3, 5);
        g.drawRect(75, 45, 3, 5);
        g.drawRect(75, 59, 3, 5);
        g.setColor(Color.red);
        g.fillArc(60, 50, 10, 10, 0, 360);

        g.setColor(Color.black);

        g.fillRoundRect(35, 200, 5, 30, 5, 5);
        g.fillRoundRect(35, 202, 40, 27, 10, 10);

        g.fillRoundRect(160, 160, 140, 40, 5, 5);
        g.setColor(Color.darkGray);
        g.fillRoundRect(165, 165, 129, 29, 5, 5);
        g.setColor(Color.white);
        for (int i = 0; i <= 117; i = i + 9) {
            g.fillRect(170 + i, 162, 5, 3);
        }
        for (int i = 0; i <= 117; i = i + 9) {
            g.fillRect(170 + i, 194, 5, 3);
        }

        g.setColor(Color.black);

        g.fillRect(95, 45, 100, 10);
        g.fillRect(200, 45, 80, 10);
        g.setColor(Color.darkGray);
        for (int i = 0; i < 100; i = i + 10) {
            g.fillRect(97 + i, 47, 6, 6);
            coordPines[pin][0]=97 + i;
            coordPines[pin][1]=47;
            pin++;
        }
        for (int i = 0; i < 80; i = i + 10) {
            g.fillRect(202 + i, 47, 6, 6);
            coordPines[pin][0]=202 + i;
            coordPines[pin][1]=47;
            pin++;
        }

        g.setColor(Color.black);

        g.fillRect(140, 225, 80, 10);
        g.fillRect(225, 225, 60, 10);
        g.setColor(Color.darkGray);
        for (int i = 0; i < 80; i = i + 10) {
            g.fillRect(142 + i, 227, 6, 6);
            coordPines[pin][0]=142 + i;
            coordPines[pin][1]=227;
            pin++;
        }
        for (int i = 0; i < 60; i = i + 10) {
            g.fillRect(227 + i, 227, 6, 6);
            coordPines[pin][0]=227 + i;
            coordPines[pin][1]=227;
            pin++;
        }
        
    }
    
    public void Proto(Graphics g){
        int[] protoX = {360, 650, 650, 360};
        int[] protoY = {50, 50, 220, 220};
        //Coordenadas proto primera linea
        int[] protoCuaX = {370, 375, 375, 370};
        int[] protoCuaY = {65, 65, 70, 70};
        //Coordenadas proto segunda linea
        int[] protoCX = {370, 375, 375, 370};
        int[] protoCY = {80, 80, 85, 85};
        
        //Coordenadas proto (parte baja) primer linea
        int[] BprotoCuaX = {370, 375, 375, 370};
        int[] BprotoCuaY = {185, 185, 190, 190};
        //Coordenadas proto (parte baja) segunda linea
        int[] BprotoCX = {370, 375, 375, 370};
        int[] BprotoCY = {205, 205, 200, 200};
        int[] CprotoCX = {370, 375, 375, 370};
        int[] CprotoCY = {105, 105, 110, 110};
        int[] contX = new int[4];
        int[] contY = new int[4];
        
        for (int i = 0; i < contX.length; i++) {
            contX[i] = CprotoCX[i];
            contY[i] = CprotoCY[i];
        }

        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 27; x++) {
                for (int i = 0; i < contX.length; i++) {
                    contX[i] = contX[i] + 5;
                }
                
                //Coordenadas arreglo
                coordProto2X[y][x]=contX[0];
                coordProto2Y[y][x]=contY[0];
                
                g.fillPolygon(contX, contY, 4);
                for (int i = 0; i < contX.length; i++) {
                    contX[i] = contX[i] + 5;
                }
            }
            for (int i = 0; i < contX.length; i++) {
                contX[i] = CprotoCX[i];
            }

            for (int i = 0; i < contY.length; i++) {
                contY[i] = contY[i] + 20;
            }
        }
        
        g.setColor(Color.BLACK);
        g.drawPolygon(protoX, protoY, 4);
        g.setColor(Color.blue);
        g.drawLine(360, 60, 650, 60);
        g.drawLine(360, 210, 650, 210);
        g.setColor(Color.RED);
        g.drawLine(360, 90, 650, 90);
        g.drawLine(360, 180, 650, 180);

        g.setColor(Color.BLACK);
        for (int x = 0; x < 27; x++) {
            for (int i = 0; i < protoCuaX.length; i++) {
                protoCuaX[i] = protoCuaX[i] + 5;
                protoCX[i] = protoCX[i] + 5;
            }
            //Coordenadas proto primera linea
            coordProto1X[0][x]= protoCuaX[0];
            coordProto1Y[0][x]=protoCuaY[0];
            //Coordenadas proto segunda linea
            coordProto1X[1][x]= protoCX[0];
            coordProto1Y[1][x]=protoCY[0];
            //Dibujar cuadrados p/ pines
            g.fillPolygon(protoCuaX, protoCuaY, 4);
            g.fillPolygon(protoCX, protoCY, 4);
            for (int i = 0; i < protoCuaX.length; i++) {
                protoCuaX[i] = protoCuaX[i] + 5;
                protoCX[i] = protoCX[i] + 5;
            }
        }
        for (int x = 0; x < 27; x++) {
            for (int i = 0; i < BprotoCuaX.length; i++) {
                BprotoCuaX[i] = BprotoCuaX[i] + 5;
                BprotoCX[i] = BprotoCX[i] + 5;
            }
            //Coordenadas proto primera linea
            coordProto3X[0][x]= BprotoCuaX[0];
            coordProto3Y[0][x]=BprotoCuaY[0];
            //Coordenadas proto segunda linea
            coordProto3X[1][x]= BprotoCX[0];
            coordProto3Y[1][x]=BprotoCY[0];
            //Dibujar cuadrados p/ pines
            g.fillPolygon(BprotoCuaX, BprotoCuaY, 4);
            g.fillPolygon(BprotoCX, BprotoCY, 4);
            for (int i = 0; i < BprotoCuaX.length; i++) {
                BprotoCuaX[i] = BprotoCuaX[i] + 5;
                BprotoCX[i] = BprotoCX[i] + 5;
            }
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getW2() {
        return w2;
    }

    public void setW2(int w2) {
        this.w2 = w2;
    }

    public int getH2() {
        return h2;
    }

    public void setH2(int h2) {
        this.h2 = h2;
    }
    
    

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    
    
    
    
    
    

}
