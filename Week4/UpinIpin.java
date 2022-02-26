/**
 *
 * @author Deo
 */
public class UpinIpin {
    public static void main(String[] args) {
        Item name = new Item("upin");
        
    }
}

class Item {
    private String name;
    private Item() {
        name = "Ipin";
    }
    public Item(String name) { 
        this(); //used to call one constructor from the other of the same class.
        System.out.println(this.name);
    }
}
