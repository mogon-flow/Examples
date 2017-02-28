package classes;

import java.awt.Color;
import java.awt.Graphics;

public class Shape {

    protected double area;
    protected double circumference;
    protected Color fillColor;

    public Shape() {
        super();
    }


    public void setFillColor(int redVal, int greenVal, int blueVal){
        this.fillColor = new Color(redVal, greenVal, blueVal);
    }

}// End of Shape Class
