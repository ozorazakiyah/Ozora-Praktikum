package Pertemuan3;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner ozora = new Scanner(System.in);
        int harga_laptop, uang_muka, bulan_mencicil, harga_sisa;
        double bunga, cicilan;
        double besar_bunga = 0.02;

        harga_laptop = ozora.nextInt();
        uang_muka = ozora.nextInt();
        bulan_mencicil = ozora.nextInt();
        
        harga_sisa = harga_laptop - uang_muka;
        bunga = harga_sisa * besar_bunga; 
        cicilan = (harga_sisa + bunga) / bulan_mencicil; 

        System.out.println("Maka besar cicilan setiap bulannya adalah: " + cicilan);
    }
    
}
