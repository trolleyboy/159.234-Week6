package exercise6.task1;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;
import javax.swing.JFrame;

public class DrawFrame extends JFrame {
    
    private Shape[] shapes = new Shape[1];
    private IDraw[] d = new IDraw[1];
    private IRotate[] r = new IRotate[1];
    private EquilateralTriangle eqTriangle = new EquilateralTriangle(new Point(180,180), 100, 100);

    public void paint(Graphics g) {
        super.paint(g);
        shapes[0] = eqTriangle;
        d[0] = eqTriangle;
        r[0] = eqTriangle;

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("The shape is a: " + shapes[i].getShapeName());
            System.out.println("It's area is: " + shapes[i].calculateArea());
            System.out.println("");

            d[i].draw(g);

            r[i].rotateShape();
            g.setColor(Color.RED);
            d[i].draw(g);
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
