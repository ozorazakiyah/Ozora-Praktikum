package Pertemuan2;
import java.util.Scanner;
public class P2_Tugas2 {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        int lebarTanah, panjangTanah, sisiTaman, diameterKolam;
        double phi = 3.14;
        double luasTanah, luasKolam, luasTaman, totalTanahSisa;
        int jarijari;

        System.out.println("Masukkan lebar tanah: ");
        lebarTanah = input.nextInt();
        System.out.println("Masukkan panjang tanah: ");
        panjangTanah = input.nextInt();
        System.out.println("Masukkan sisi taman: ");
        sisiTaman = input.nextInt();
        System.out.println("Masukkan diamter kolam: ");
        diameterKolam = input.nextInt();

        jarijari = diameterKolam/2;
        luasTanah = lebarTanah*panjangTanah;
        luasTaman = sisiTaman*sisiTaman;
        luasKolam = phi*(jarijari)*(jarijari);
        totalTanahSisa = luasTanah - luasTaman - luasKolam;
        System.out.println("Sisa tanah yang tidak terpakai: " + totalTanahSisa + "m");
    }
    
}