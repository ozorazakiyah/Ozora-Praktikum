package Pertemuan5;
import java.util.Scanner;

public class Tugas2Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jumlahSKS;

        System.out.print("Masukkan jumlah SKS anda: ");
        jumlahSKS = sc.nextInt();

        if (jumlahSKS <= 24) {
            System.out.println("KRS valid");
        } else {
            System.out.println("Melebihi batas");
        }
    }
}
