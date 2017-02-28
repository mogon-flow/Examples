package apps;

import classes.Rectangle;
import classes.Circle;
import interfaces.ShapeProcessor;
import javax.swing.JOptionPane;

public class Draw {

    public Draw() {
        super();
    }

    public static void main(String[] args) {

        ShapeProcessor myshape = null; // Declare a ShapeProcessor object

        String input = JOptionPane.showInputDialog(null, "Enter either circle or rectangle:", "Select a shape", 0);

        switch (input) {
            case "circle": // delegate instantiation to subclass Circle                
                myshape = new Circle(5.6);
                break;
            case "rectangle": // defer instantiation to subclass Rectangle
                myshape = new Rectangle(3.2, 5.1);
                break;
            default:
        }

        if (myshape != null) {
            double area = myshape.calcArea();
            JOptionPane.showMessageDialog(null, "Your " + input + " has an area of " + area + ".", "The area of your shape", 0);
        } else {
            JOptionPane.showConfirmDialog(null, input + "Sorry. Your choice doesn't exist in the system. Contact us.", null, 0);
        }
       

    }// End of Main method

}// End of Draw
