/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lat72;

/**
 *
 * @author HP
 */
public class Overload {
    void demo(int a){
        System.out.println("a: " +a);
    }
    void demo(int a, int b){
        System.out.println("a and b: " +a);
    }
    double demo(double a){
        System.out.println("double a:" +a);
        return a*a;
    }
}    
    class MethodOverloading{
        public static void main(String args[]){
            Overload Obj = new Overload();
            double result;
            Obj.demo(10);
            Obj.demo(10,20);
            result = Obj.demo(5.5);
            System.out.println("O/P : " + result);
        }
    }

