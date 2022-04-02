/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Deo
 */
public class TestShape {
    public static void main (String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1);
        Shape s2 = new Shape("Red", false);
        System.out.println(s2);
        Circle c1 = new Circle();
        System.out.println(c1);
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Square sq1 = new Square(2, "Red", true);
        System.out.println(sq1);
        System.out.println(sq1.getArea());
    }
}
