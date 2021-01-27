
package nonvoidsk1;

public class NonVoidSK1 {

    
    public static void main(String[] args) {
       
        SummonNonVoid good = new SummonNonVoid(); 
        System.out.println("Penambahan: " +good.tambah(30,15)); 
        System.out.println("Pengurangan: " +good.kurang(30,15)); 
        System.out.println("Perkalian: " +good.kali(30,15)); 
        System.out.println("Pembagian: " +good.bagi(30,15));
        System.out.println("Modulus: " +good.modulus(30,15));
    }
    
}
