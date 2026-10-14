/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_C;

import java.util.Scanner;


/*NIM: 41425045
Nama: Laura Tampubolon
Motto: Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran */

public class ModifikasiKalkulator {
    public static void main(String[] args) {
        
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // INPUT ANGKA 
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt(); // Membaca angka pertama sebagai tipe int

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt(); // Membaca angka kedua sebagai tipe int

        //  OPERASI DASAR 
        // Menampilkan hasil penjumlahan a dan b
        System.out.println("Tambah: " + (a + b));

        // Menampilkan hasil pengurangan a dan b
        System.out.println("Kurang: " + (a - b));

        // Menampilkan hasil perkalian a dan b
        System.out.println("Kali: " + (a * b));

        // Meng-casting a ke double sebelum pembagian agar hasilnya tidak dibulatkan (mendapat nilai desimal)
        // Validasi dulu: pembagi tidak boleh 0
        if (b != 0) {
            System.out.println("Bagi: " + ((double) a / b));
        } else {
            System.out.println("Bagi: Error - tidak bisa dibagi dengan 0");
        }

        //MODULUS (MODIFIKASI BARU)
        // Modulus (%) = sisa hasil bagi
        // Contoh: 10 % 3 = 1, karena 10 dibagi 3 sisa 1
        if (b != 0) {
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Modulus: Error - tidak bisa dimodulus dengan 0");
        }

        // PERPANGKATAN (MODIFIKASI BARU) 
        // Math.pow(a, b) = a pangkat b
        // Menggunakan Math.pow karena Java tidak punya operator ^ untuk perpangkatan
        // Catatan: operator ^ di Java adalah XOR (bitwise), BUKAN perpangkatan!
        // Hasil Math.pow bertipe double, jadi kita tampilkan apa adanya (bisa desimal)
        double hasilPangkat = Math.pow(a, b);
        System.out.println("Pangkat: " + hasilPangkat);

        // Menutup Scanner
        input.close();
    }
}
