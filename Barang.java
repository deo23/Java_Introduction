/**
 *
 * @author Deo
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok; //encapsulate stok variable
    
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void plusStok(int plus){ //add method to add the stok
        this.stok += plus;
    }
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}
