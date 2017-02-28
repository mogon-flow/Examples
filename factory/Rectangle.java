package classes;

import interfaces.ShapeProcessor;

public class Rectangle extends Shape implements ShapeProcessor {

    private double width;
    private double height;

    public Rectangle(double w, double h) {
        super();
        this.width = w;
        this.height = h;
    }    
    
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    
    @Override
    public double calcArea() {
        this.area = this.width * this.height;
        return this.area;
    }


    @Override
    public double calcCircumference() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRadius(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getRadius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getWeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}// End of Rectangle Class
