package ru.vsu.cs.kozjutenko;

import java.awt.*;

public class DrawCloud implements Drawable {
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        gr.setColor(Color.WHITE);
        int y = 30;
        for (int x = 50; x < width; x += 150) {
            for (int n = 0; n < 4; n++)
            {
                gr.fillOval(x, y, 80, 50);
                y = y + (int)(Math.pow((-1), n))*15;
                x = x + 25;
            }
            for (int n = 0; n < 4; n++)
            {
                gr.fillOval(x + 80, y + 70, 80, 50);
                y = y + (int)(Math.pow((-1), n))*15;
                x = x + 25;
            }
        }
    }
}
