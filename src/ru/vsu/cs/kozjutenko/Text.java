package ru.vsu.cs.kozjutenko;

import java.awt.*;

public class Text implements Drawable {
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        gr.setColor(Color.BLACK);
        gr.setFont(new Font("Arial", Font.BOLD, 25));
        gr.drawString("Свобода",(int)(0.85*width-450),(int)(0.255*height+280));
    }
}
