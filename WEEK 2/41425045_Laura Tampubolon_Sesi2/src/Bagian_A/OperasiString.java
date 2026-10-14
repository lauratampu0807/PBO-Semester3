/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

import java.util.Scanner;

/*
NIM: 41425045
Nama: Laura Tampubolon
Motto: Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran */

public class OperasiString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input

        System.out.print("Masukkan nama lengkap: "); // Meminta pengguna memasukkan nama lengkap
        String nama = input.nextLine(); // Membaca seluruh baris input (termasuk spasi)

        // Menampilkan panjang string, yaitu jumlah karakter dalam nama (termasuk spasi)
        System.out.println("Panjang string: " + nama.length());

        // Mengambil dan menampilkan karakter pertama dari string (index ke-0)
        System.out.println("Huruf pertama: " + nama.charAt(0));

        // Mengecek apakah string mengandung karakter spasi (" ")
        System.out.println("Mengandung spasi? " + nama.contains(" "));
    }
}
/* Pertanyaan pemantik
Bagaimana jika nama yang diinput dengan lebih dari satu spasi?
jawab: hal ini bisa menimbulkan beberapa masalah, seperti validasi yang gagal karena aturan hanya mengizinkan satu spasi, data yang tidak konsisten */

