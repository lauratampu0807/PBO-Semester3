/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

/*
NIM: 41425045
Nama: Laura Tampubolon
Motto:Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran s*/

import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input

        System.out.print("Masukkan nilai 1: "); // Meminta nilai ujian pertama
        int nilai1 = input.nextInt(); // Membaca nilai 1 sebagai int

        System.out.print("Masukkan nilai 2: "); // Meminta nilai ujian kedua
        int nilai2 = input.nextInt(); // Membaca nilai 2 sebagai int

        System.out.print("Masukkan nilai 3: "); // Meminta nilai ujian ketiga
        int nilai3 = input.nextInt(); // Membaca nilai 3 sebagai int

        // Menjumlahkan ketiga nilai lalu dibagi 3, di-casting ke double agar hasil tidak dibulatkan
        double rataRata = (nilai1 + nilai2 + nilai3) / 3.0;

        // Menampilkan hasil rata-rata dengan format 2 angka di belakang koma
        System.out.printf("Rata-rata: %.2f%n", rataRata);
    }
}
