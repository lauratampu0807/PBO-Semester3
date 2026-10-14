/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

/*
NIM: 41425045
Nama: Laura Tampubolon
Motto: Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran */

import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class SisaBagiDanPangkat{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input

        System.out.print("Masukkan angka pertama: "); // Meminta angka pertama
        int a = input.nextInt(); // Membaca angka pertama sebagai int

        System.out.print("Masukkan angka kedua: "); // Meminta angka kedua
        int b = input.nextInt(); // Membaca angka kedua sebagai int

        // Menghitung sisa bagi menggunakan operator modulus (%)
        int sisaBagi = a % b;

        // Menghitung hasil pangkat a^b menggunakan Math.pow, hasilnya berupa double
        double pangkat = Math.pow(a, b);

        System.out.println("Sisa bagi: " + sisaBagi); // Menampilkan hasil sisa bagi

        // Meng-casting hasil pangkat ke int agar tampil tanpa desimal (misal 343.0 -> 343)
        System.out.println("Pangkat: " + (int) pangkat);
    }
}
