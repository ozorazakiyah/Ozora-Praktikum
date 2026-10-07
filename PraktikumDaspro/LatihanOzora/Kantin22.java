package PraktikumDaspro.LatihanOzora;
import java.util.Scanner;

public class Kantin22 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int hargaSeporsi = 8500;
        int biayaModal = 1201250;
        int banyakPetugas = 4;
        int banyakPorsi, laba, pendapatan;
        double bagianTiapPetugas, sisaKas;

        System.out.print("Masukkan banyak porsi terjual dalam satu hari: ");
        banyakPorsi = input.nextInt();
        pendapatan = banyakPorsi*hargaSeporsi;
        laba = pendapatan-biayaModal;
        bagianTiapPetugas = laba/banyakPetugas;
        sisaKas = pendapatan + (laba%banyakPetugas);

        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Laba: " + laba);
        System.out.println("Bagian Petugas: " + bagianTiapPetugas);
        System.out.println("Sisa kas: " + sisaKas);

        //Masukkan banyak porsi terjual dalam satu hari: 1000
        //Pendapatan: 8500000
        //Laba: 7298750
        //Bagian Petugas: 1824687.0
        //Sisa kas: 8500002.0
    }   
}
