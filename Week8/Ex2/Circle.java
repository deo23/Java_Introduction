/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Deo
 */
public class Circle extends Shape {
    private double radius;
    public Circle() { // 1st (default) constructor
        radius = 1.0;        
    }
    
    public Circle(double r){
        radius = r;
    }
    
    public Circle (double r, String c, boolean f){
        radius = r;
        setColor(c);
        setFilled(f);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter(){
        return radius*Math.PI*2;
    }
    
    @Override
    public String toString(){
        return "A circle with radius=" +radius+" ,which is a subclass of " +super.toString();
    }
}
