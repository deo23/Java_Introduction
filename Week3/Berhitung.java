package tugas3;

/**
 * @author Deo
 * @since 2022-02-19
 */

import java.util.Scanner;

public class Berhitung {
  public static void main(String[] args) {

    char operator;
    int number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in); 
    
    

    // ask users to input numbers and operand
    
    number1 = input.nextInt();
    operator = input.next().charAt(0);
    number2 = input.nextInt();
       
    if((number1>=1&&number1<=1000)&&(number2>=1&&number2<=1000)) {
        switch (operator) {

          // performs addition between numbers
          case '+':
            result = number1 + number2;
            System.out.println(result);
            break;

          // performs subtraction between numbers
          case '-':
            result = number1 - number2;
            System.out.println(result);
            break;

          // performs multiplication between numbers
          case '*':
            result = number1 * number2;
            System.out.println(result);
            break;

          // performs division between numbers
          case '/':
            result = number1 / number2;
            System.out.println(result);
            break;
          // performs modulo between numbers
          case '%':
            result = number1 % number2;
            System.out.println(result);
            break;
            
          default:
            System.out.println("Invalid operator!");
            break;
        }
    }
    else{
        System.out.println("Invalid operator!");
    }

    input.close();
  }
}
