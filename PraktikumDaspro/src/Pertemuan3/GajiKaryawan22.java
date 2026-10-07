package Pertemuan3;
import java.util.Scanner;

    public class GajiKaryawan22 {
        public static void main(String[] args) {
            Scanner ozora = new Scanner(System.in);
            int gajiPokok, totalGaji;
            double bonus;
            double tunjanganTransportasi = 600000;
            double tunjanganMakan = 400000;

            gajiPokok = ozora.nextInt();
            bonus = 0.05*gajiPokok;
            totalGaji = (int) (gajiPokok+tunjanganTransportasi+tunjanganMakan+bonus-(0.1*gajiPokok));

            System.out.println("Bonus bulanan anda adalah Rp. " +bonus);
            System.out.println("Gaji yang diterima adalah Rp. " +totalGaji);

        }    
}
