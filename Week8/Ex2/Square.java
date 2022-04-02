/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Deo
 */
public class Square extends Rectangle{
    public Square(){
        super();
    }
    
    public Square(double side) {
        super(side, side); // Call superclass Rectangle(double, double)
        }

    
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    public double getSide(){
        return getLength();
    }
    
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    @Override
    public String toString(){
         return "A square with side=" +getSide()+ ",which is a subclass of " +super.toString();
    }
}
