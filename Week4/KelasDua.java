/**
 *
 * @author Deo
 */
public class KelasDua
{
    {
        System.out.println(5);
    }
    public static void main(String[] args)
    {
        System.out.println(6);
        KelasSatu satu = new KelasSatu();
        KelasSatu dua = new KelasSatu(10);
    }
}

class KelasSatu{
    {
        System.out.println(11); //instance
    }
    static //static block gets executed only once by JVM when the class is loaded into the memory by Java ClassLoader. 
    {
        System.out.println(2);
    }
    public KelasSatu(int i)
    {
        System.out.println(3);
    }
    public KelasSatu()
    {
        System.out.println(4);
    }
}
