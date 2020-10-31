package ru.vsu.cs.kozjutenko;

import javax.swing.*;
import java.awt.*;

public class DrawShip implements Drawable {


    @Override
    public void draw(Graphics2D gr, int width, int height) {

        int[] ArrayX = {(int) (0.85 * width - 470), (int) (0.85 * width - 80), (int) (0.85 * width), (int) (0.85 * width - 550)};
        int[] ArrayY = {(int) (0.255 * height + 340), (int) (0.255 * height + 340), (int) (0.255 * height + 250), (int) (0.255 * height + 250)};
        Polygon p = new Polygon(ArrayX, ArrayY, 4);
        gr.drawPolygon(p);
        gr.setColor(new Color(128, 0, 0));
        gr.fillPolygon(p);
        gr.setColor(new Color(160, 82, 45));
        gr.fillRect((int) (0.85 * width - 285), (int) (0.255 * height), 10, 250);

        int[] ArrayX1 = {(int) (0.85 * width - 275), (int) (0.85 * width - 140), (int) (0.85 * width - 275)};
        int[] ArrayY2 = {(int) (0.255 * height), (int) (0.255 * height + 220), (int) (0.255 * height + 220)};
        Polygon pl = new Polygon(ArrayX1, ArrayY2, 3);
        gr.drawPolygon(pl);
        gr.setColor(new Color(255, 248, 220));
        gr.fillPolygon(pl);

        gr.setColor(new Color(255, 248, 220));
        for (int i = (int) (0.85 * width - 460); i < (int) (0.85 * width - 70); i += 80) {
            gr.fillOval(i, (int) (0.255 * height + 280), 40, 40);
        }
    }
}




