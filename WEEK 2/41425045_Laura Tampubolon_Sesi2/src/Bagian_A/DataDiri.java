package Bagian_A;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
NIM: 41425045
Nama: Laura Tampubolon
Motto: Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran */

public class DataDiri {
    public static void main(String[] args) {
        String nama = "Andi"; // variabel bertipe String
        int umur = 19; // variabel bertipe int
        double tinggi = 165.8; // variabel bertipe double
        boolean isMahasiswa = true; // variabel bertipe boolean

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);

        int tinggiBulat = (int) tinggi; // casting double ke int, hasil dibulatkan ke bawah (truncate)
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
    }
}