package tugas3;
import java.util.Scanner;
/**
 *
 * @author Deo
 */
public class BukaTutup {
    public static void main (String[] args){
    
    
        Scanner input = new Scanner(System.in);

        String angka = input.nextLine();
        String[] angka2 = angka.split(" ");
        String hasil ="";
        
        //for-each loop untuk setiap elemen di angka2 dimasukkan ke variabel x
        for(String x : angka2){
            hasil += x;
        }
        //convert string to long
        long plat = Long.parseLong(hasil);
        
        if((plat-999999)%5==0){
            System.out.println("berhenti");
        }
        else{
            System.out.println("jalan");
        }
    }        
}
