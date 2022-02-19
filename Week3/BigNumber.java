package tugas3;

/**
 *

 * @author Deo
 */
import java.math.*;
import java.util.Scanner;
public class BigNumber {
   public static void main(String []args){
       Scanner input = new Scanner(System.in);
       String s1,s2;
       BigInteger big1, big2;
       s1=input.nextLine();
       s2=input.nextLine();
       input.close();
       big1 = new BigInteger(s1);
       big2 = new BigInteger(s2);
       System.out.println(big1.add(big2));
       System.out.println(big1.multiply(big2));
   }
}
