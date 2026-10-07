package Pertemuan6;
import java.util.Scanner;

public class Tugas2SeleksiAsisten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif, sedangDisanksi, sertifikatKompetensi;
        int nilaiDaspro, nilaiWawancara;
        
        System.out.print("Apakah anda mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah anda sedang menjalani sanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah anda memiliki sertifikat kompetensi pemrograman? (true/false): ");
        sertifikatKompetensi = sc.nextBoolean();
        System.out.print("Berapakah nilai Dasar Pemrograman anda: ");
        nilaiDaspro = sc.nextInt();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (nilaiDaspro >= 75 || sertifikatKompetensi) {
                System.out.println("Selamat! Anda lolos ke tahap seleksi wawancara");

                System.out.print("Berapakah nilai hasil wawancara anda: ");
                nilaiWawancara = sc.nextInt();
                if (nilaiWawancara >= 70) {
                    System.out.println("Selamat, anda lolos menjadi asisten praktikum");
                } else {
                    System.out.println("Maaf, anda tidak lolos seleksi! Nilai wawancara anda kurang dari 75");
                }
            } else {
                System.out.println("Maaf, anda tidak lolos! Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi pemrograman");
            }
        } else {
            System.out.println("Maaf, anda tidak lolos! Anda bukan mahasiswa aktif atau sedang menjalani sanksi");
        }
    }
}