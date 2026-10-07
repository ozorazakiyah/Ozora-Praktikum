package Pertemuan2;
public class ContohVariabel22 {
    public static void main(String[] args) {
        String hobbiSayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte umurSaya = 18;
        double ipk = 3.24, tinggi = 1.78;
        System.out.println(hobbiSayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSaya);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
