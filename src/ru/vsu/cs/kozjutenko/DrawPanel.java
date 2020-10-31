package ru.vsu.cs.kozjutenko;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {


    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(new Color(135, 206, 235));
        gr.fillRect(0, 0, getWidth(), getHeight()/2);
        gr.setColor(new Color(0, 0, 128));
        gr.fillRect(0, getHeight()/2, getWidth(), getHeight());

        gr.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        DrawShip ds = new DrawShip();
        this.add(ds);
        ds.drawBasis(gr, getWidth(), getHeight(), new Color(128, 0, 0), new Color(160, 82, 45));
        ds.drawSail(gr, getWidth(), getHeight(), new Color(255, 248, 220));
        ds.drawWindows(gr, (int) (0.85 * getWidth() - 420), (int) (0.255 * getHeight() + 295), 40, 40, new Color(255, 248, 220));


        DrawCloud dc = new DrawCloud();
        this.add(dc);
        dc.draw(gr, getWidth(), getHeight());


        drawSun(gr, 700, 80, 40, 90, 28, Color.yellow);

        Text t = new Text();
        this.add(t);
        t.draw(gr, getWidth(), getHeight());


    }


    public static void drawSun(Graphics2D gr, int x, int y, int r, int R, int n, Color color) {
        gr.setColor(color);
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

    private void add(Text t) {
    }

    private void add(DrawShip ds) {
    }

    private void add(DrawCloud dc) {
    }
}

