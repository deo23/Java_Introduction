/**
 *
 * @author Deo
 */
public class Food {// Membuat class baru sehingga tidak terdapat banyak data pada class Restaurant
    private String nama_makanan;   //
    private double harga_makanan; // Menerapkan Class Design No. 1
    private int stok;             // Menjaga data agar tetap private

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public double getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(double harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }


   
    
    Food(String nama, double harga, int Stok){
        this.nama_makanan = nama;
        this.harga_makanan = harga;
        this.stok = Stok;
    }
}
