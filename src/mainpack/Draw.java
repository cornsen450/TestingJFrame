package mainpack;

import java.awt.*;

import javax.swing.*;

public class Draw extends JLabel{

    private static final long serialVersionUID = 1L;
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        //draw

        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,0,400,600);
        g.setColor(Color.CYAN);
        g.fillRect(100,100,150,150);
        g.setColor(Color.RED);
        g.fillOval(200,200,150,150);
        g.setColor(Color.YELLOW);
        g.drawString("THIS IS A TEST",100,50);
    }
}
