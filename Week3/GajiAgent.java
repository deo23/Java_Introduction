package tugas3;
import java.util.Scanner;
/**
 *
 * @author Deo
 */
public class GajiAgent {
    public static void main (String args[]){
        double gajiPokok, hargaItem, gajiTotal, gajiBonus, denda;
        int jumlahItem;
        
        //inisialisasi
        gajiPokok = 500000;
        hargaItem = 50000;
        Scanner read = new Scanner(System.in);
        //baca input total item
        jumlahItem = read.nextInt();
        
        //perhitungan sesuai kondisi
        if( jumlahItem>80){
            gajiBonus = (jumlahItem * hargaItem * 0.35);
            gajiTotal = gajiPokok + gajiBonus;
           
        }
        else if(jumlahItem>=40){
            gajiBonus = (jumlahItem * hargaItem * 0.25);
            gajiTotal = gajiPokok + gajiBonus;
        }
        else if(jumlahItem<15){
            jumlahItem = 15 - jumlahItem;
            denda = (jumlahItem * hargaItem * 0.15);
            gajiTotal = gajiPokok - denda;
        }
        else{
            gajiBonus = (jumlahItem * hargaItem * 0.1);
            gajiTotal = gajiPokok + gajiBonus;
        }
        //convert double to int
        System.out.println((int)gajiTotal);
    }
}
