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

    public Metodos() {
       
    }

    public void Arduino(Graphics g) {
        int[] xPoints = {40, 280, 300, 300, 320, 320, 300, 300, 40};
        int[] yPoints = {40, 40, 60, 100, 120, 200, 220, 240, 240};
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
        }
        for (int i = 0; i < 80; i = i + 10) {
            g.fillRect(202 + i, 47, 6, 6);
        }

        g.setColor(Color.black);

        g.fillRect(140, 225, 80, 10);
        g.fillRect(225, 225, 60, 10);
        g.setColor(Color.darkGray);
        for (int i = 0; i < 80; i = i + 10) {
            g.fillRect(142 + i, 227, 6, 6);
        }
        for (int i = 0; i < 60; i = i + 10) {
            g.fillRect(227 + i, 227, 6, 6);
        }

    }
    
    public void Proto(Graphics g){
        int[] protoX = {360, 650, 650, 360};
        int[] protoY = {50, 50, 220, 220};
        int[] protoCuaX = {370, 375, 375, 370};
        int[] protoCuaY = {65, 65, 70, 70};
        int[] protoCX = {370, 375, 375, 370};
        int[] protoCY = {80, 80, 85, 85};
        int[] BprotoCuaX = {370, 375, 375, 370};
        int[] BprotoCuaY = {205, 205, 200, 200};
        int[] BprotoCX = {370, 375, 375, 370};
        int[] BprotoCY = {185, 185, 190, 190};
        
        
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
            g.fillPolygon(BprotoCuaX, BprotoCuaY, 4);
            g.fillPolygon(BprotoCX, BprotoCY, 4);
            for (int i = 0; i < BprotoCuaX.length; i++) {
                BprotoCuaX[i] = BprotoCuaX[i] + 5;
                BprotoCX[i] = BprotoCX[i] + 5;
            }
        }
    }

    

}
