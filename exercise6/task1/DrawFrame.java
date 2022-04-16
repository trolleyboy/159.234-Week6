package exercise6.task1;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;
import javax.swing.JFrame;

public class DrawFrame extends JFrame {
    
    private TwoDimensionalShape[] shapes = new TwoDimensionalShape[1];


    public void paint(Graphics g) {
        super.paint(g);
        shapes[0] = new EquilateralTriangle(new Point(180,180), 100, 100);
        for ( TwoDimensionalShape s : shapes ) {
            System.out.println("The shape is a: " + s.getShapeName());
            System.out.println("It's area is: " + s.calculateArea());
            System.out.println("");
            s.draw(g);

            IRotate r = s;
            r.rotateShape();
            g.setColor(Color.RED);
            s.draw(g);

        }
    }

    public static void main(String[] args) {
        
        DrawFrame frame = new DrawFrame();
        frame.setTitle("Print Shapes");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
