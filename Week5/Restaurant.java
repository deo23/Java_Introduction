/**
 *
 * @author Deo
 */
public class Restaurant {
    private Food[] Foods;
    
    private static byte id=0;       
 
    //Tidak dibutuhkan accessor dan mutators untuk id
  
    
    
    public Restaurant() { //Menginisialisasi data default
        Foods = new Food[10];
        for(int i = 0; i<10; i++){
            Foods[i] = new Food("dummy", 0.0, 0);
        }
    }
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        Foods[id].setNama_makanan(nama);
        Foods[id].setHarga_makanan(harga);
        Foods[id].setStok(stok);
    }
 
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(Foods[i].getNama_makanan() +"["+Foods[i].getStok()+"]"+"\tRp. "+Foods[i].getHarga_makanan());
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(Foods[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void kurangStok(int id, int pengurangan){ //method untuk mengurangi stok saat ada pemesanan
        Foods[id].setStok(Foods[id].getStok() - pengurangan);
    }
    public static void nextId(){        
        id++;
    }
}
