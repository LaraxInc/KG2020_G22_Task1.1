package ru.vsu.cs.kozjutenko;

import javax.swing.*;
import java.awt.*;

public class DrawShip implements Drawable {

    public void drawBasis(Graphics2D gr, int width, int height, Color color, Color colorMast) {
        int[] ArrayX = {(int)(0.85*width-470), (int) (0.85*width-80), (int) (0.85*width), (int) (0.85*width-550)};
        int[] ArrayY = {(int)(0.255*height+340), (int)(0.255*height+340), (int)(0.255*height+250), (int)(0.255*height+250)};
        Polygon p = new Polygon(ArrayX, ArrayY, 4);
        gr.drawPolygon(p);
        gr.setColor(color);
        gr.fillPolygon(p);
        gr.setColor(colorMast);
        gr.fillRect((int)(0.85*width-285), (int)(0.255*height), 10, 250);
    }

    public static void drawSail(Graphics2D gr, int width, int height, Color color) {
        int[] ArrayX1 = {(int)(0.85*width-275), (int)(0.85*width-140), (int)(0.85*width-275)};
        int[] ArrayY2 = {(int)(0.255*height), (int)(0.255*height+220), (int)(0.255*height+220)};
        Polygon pl = new Polygon(ArrayX1, ArrayY2, 3);
        gr.drawPolygon(pl);
        gr.setColor(color);
        gr.fillPolygon(pl);
    }

    public static void drawWindows(Graphics2D gr, int x, int y,int width, int height, Color color) {
        gr.setColor(color);
        for (int i = (int)(0.85*width-420); i < (int)(0.85*width); i += 140) {
            gr.fillOval(i, (int)(0.255*height + 100), width, height);
        }
    }

    @Override
    public void draw(Graphics2D gr, int width, int height) {

    }
}
