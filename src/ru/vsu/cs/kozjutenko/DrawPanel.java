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

        DrawSun ds = new DrawSun();
        ds.draw(gr, getWidth(), getHeight());

        DrawCloud dc = new DrawCloud();
        this.add(dc);
        dc.draw(gr, getWidth(), getHeight());

        DrawShip dship = new DrawShip();
        dship.draw(gr, getWidth(), getHeight());

        Text t = new Text();
        this.add(t);
        t.draw(gr, getWidth(), getHeight());


    }

    private void add(Text t) {
    }

    private void add(DrawCloud dc) {
    }
}

