package ru.vsu.cs.kozjutenko;

import java.awt.*;

public class DrawSun implements Drawable {

    @Override
    public void draw(Graphics2D gr, int width, int height) {
        gr.setColor(Color.YELLOW);
        int x = (int)(0.90 * width);
        int y = 80;
        int r = 40;
        int R = 90;
        int n = 28;
        gr.fillOval(x - r, y - r, 2 * r, 2 * r);
        double an = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(an * i);
            double dy1 = r * Math.sin(an * i);
            double dx2 = R * Math.cos(an * i);
            double dy2 = R * Math.sin(an * i);
            gr.drawLine((int)dx1+x, (int)dy1+y, (int)dx2+x, (int)dy2+y);
        }
    }
}
