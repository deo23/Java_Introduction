/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Deo
 */
public class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    
    public Rectangle(double w, double l){
        width = w;
        length = l;
    }
    
    public Rectangle(double w, double l, String c, boolean f){
        width = w;
        length = l;
        setColor(c);
        setFilled(f);        
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width*length;
    }
    
    public double getPerimeter(){
        return 2*(width + length);
    }
    
    @Override
    public String toString(){
        return "A rectangle with width=" +width+ "and length="+length+ ",which is a subclass of " +super.toString();
    }
}
