/**
 *
 * @author Deo
 */
public class Sasuke extends Itachi {
    String Dojutsu = "Sharingan";
    void printDojutsu() {
        super.printDojutsu();//Memanggil method superclass
        System.out.println(this.Dojutsu);
    }
}
