/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

import java.util.Scanner;

/* NIM: 41425045
   Nama : Laura Tampubolon
   Motto: Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran */

 // mengimpor kelas Scanner untuk menerima input dari user

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membuat objek Scanner untuk membaca input
        final double PI = 3.14; // konstanta nilai PI

        System.out.print("Masukkan jari-jari: "); // menampilkan pesan input
        double r = input.nextDouble(); // membaca input jari-jari berupa desimal

        if (r < 0) { // percabangan: mengecek apakah jari-jari bernilai negatif
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else { // jika jari-jari valid (bernilai 0 atau positif)
            double luas = PI * r * r; // menghitung luas lingkaran
            double keliling = 2 * PI * r; // menghitung keliling lingkaran
            System.out.println("Luas: " + luas); // menampilkan hasil luas
            System.out.println("Keliling: " + keliling); // menampilkan hasil keliling
        }
    }
}

/*
Pertaanyaan Pemantik:
Mengapa kita perlu validasi r < 0?
Karena jari-jari (r) tidak boleh bernilai negatif dalam perhitungan geometri seperti lingkup, sehingga validasi r < 0 diperlukan untuk mencegah hasil yang salah dan memberi pesan error kepada pengguna bahwa input tidak valid.

Dalam aplikasi nyata, di mana validasi input sangat penting?
Validasi input sangat penting pada aplikasi yang menerima data dari pengguna, seperti form pendaftaran, aplikasi perbankan, e-commerce, dan sistem login, karena dapat mencegah error, data kotor, dan potensi serangan seperti injection atau manipulasi data.*/
