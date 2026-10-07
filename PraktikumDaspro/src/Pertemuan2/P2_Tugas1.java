package Pertemuan2;
import java.util.Scanner;
public class P2_Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double gaji_pokok, tunjangan_anak, gaji_bersih;
        double prosentase_dana_pensiun = 0.10;
        int jumlah_anak;
        
        System.out.println("Masukkan gaji pokok: ");
        gaji_pokok = input.nextInt();
        System.out.println("Masukkan tunjangan anak perbulan: ");
        tunjangan_anak = input.nextInt();
        System.out.println("Masukkan jumlah anak: ");
        jumlah_anak = input.nextInt();

        gaji_bersih = gaji_pokok + (jumlah_anak*tunjangan_anak) - (prosentase_dana_pensiun*gaji_pokok);
        System.out.println("Jumlah gaji bersih Pak Danur dalam setahun adalah: " + gaji_bersih);

    }
    
}