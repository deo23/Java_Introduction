package tugas3;

/**
 *
 * @author Deo
 */
import java.io.*;
import java.util.*;
public class InputOutput {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String s = keyboard.nextLine();
        keyboard.close();

        
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for (String str : strings)
                System.out.println(str);
        }
    }
}
