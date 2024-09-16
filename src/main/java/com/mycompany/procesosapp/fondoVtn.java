package com.mycompany.procesosapp;
import java.awt.*;
import javax.swing.*;

public class fondoVtn extends JPanel{
    private Image imagen;
        
        @Override
        public void paintComponent(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("images/BG1.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paintComponent(g);
        }
    
}
