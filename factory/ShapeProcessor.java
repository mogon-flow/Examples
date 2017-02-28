package interfaces;

public interface ShapeProcessor {

    static final double PI = 3.14159;

    public void setFillColor(int redVal, int greenVal, int blueVal);

    public double calcArea();

    public double calcCircumference();

    public void setRadius(double d);

    public double getRadius();

    public double getHeight();

    public void setHeight(double height);

    public double getWeight();

    public void setWidth(double width);
}
