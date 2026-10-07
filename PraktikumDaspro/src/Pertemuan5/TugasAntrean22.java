package Pertemuan5;
import java.util.Scanner;
public class TugasAntrean22 {

public static void main(String[] args) {
    Scanner ozora = new Scanner (System.in);
    int layanan;
    System.out.println("Pilihlah Kode Jenis Layanan yang Anda Butuhkan");
    System.out.println("1 = Legalisir Ijazah");
    System.out.println("2 = Surat Keterangan Aktif Kuliah");
    System.out.println("3 = Pembayaran UKT");
    System.out.println("4 = Pengajuan Cuti Akademik");
        
    System.out.print("Masukkan kode layanan yang dibutuhkan: ");
    layanan = ozora.nextInt();
        switch (layanan) {
            case 1:
                System.out.println("Anda memilih layanan LEGALISIR IJAZAH");
                System.out.println("Silahkan ke loket A");
                break;
            case 2:
                System.out.println("Anda memilih layanan SURAT KETERANGAN AKITF MAHASISWA");
                System.out.println("Silahkan ke loket B");
                break;
            case 3:
                System.out.println("Anda memilih layanan PEMBAYARAN UKT");
                System.out.println("Silahkan ke loket  C");
                break;
            case 4:
                System.out.println("Anda memilih layanan PENGAJUAN CUTI AKADEMIK");
                System.out.println("Silahkan ke loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }
    }
}