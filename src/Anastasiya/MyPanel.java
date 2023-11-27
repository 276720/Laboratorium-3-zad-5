package Anastasiya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class MyPanel extends JPanel {
    private Square square;
    public MyPanel() {
        square = new Square(50,50,50,Color.cyan);
        setBackground(Color.lightGray);
        setLayout(null);
        setBounds(10, 7, 365, 150);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
                System.out.println("Buło naciśnienie");
            }
            public void mouseEntered(MouseEvent mouseEvent) {
                System.out.println("Mysz na MyPanel");
            }

            public void mouseExited(MouseEvent mouseEvent) {
                System.out.println("Mysz nie na MyPanel");
            }

        });

        addMouseWheelListener(new MouseAdapter() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                int notches = e.getWheelRotation();
                if (notches < 0) {
                    square.changeSize(notches);

                } else {
                    square.changeSize(notches);
                }
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(square.getColor());
        g2d.fillRect(square.getX(), square.getY(), square.getSideLength(), square.getSideLength());
        g2d.dispose();
    }
}

