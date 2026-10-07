package Pertemuan3;
import java.util.Scanner;

    public class MenghitungTotalBayar22 {
        public static void main(String[] args) {
            Scanner ozora = new Scanner(System.in);
            double harga;
            double potongan;
            double jumlah_bayar;
            double diskon = 0.15;

            harga = ozora.nextDouble();
            potongan = harga*diskon;
            jumlah_bayar = harga-potongan;
            System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jumlah_bayar);

        }
}