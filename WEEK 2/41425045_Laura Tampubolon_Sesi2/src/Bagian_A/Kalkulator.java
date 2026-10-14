package Bagian_A;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


    /*NIM: 41425045
Nama: Laura Tampubolon
Motto:Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran */


public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        System.out.print("Masukkan angka pertama: "); // Meminta pengguna memasukkan angka pertama
        int a = input.nextInt(); // Membaca angka pertama sebagai tipe int

        System.out.print("Masukkan angka kedua: "); // Meminta pengguna memasukkan angka kedua
        int b = input.nextInt(); // Membaca angka kedua sebagai tipe int

        // Menampilkan hasil penjumlahan a dan b
        System.out.println("Tambah: " + (a + b));

        // Menampilkan hasil pengurangan a dan b
        System.out.println("Kurang: " + (a - b));

        // Menampilkan hasil perkalian a dan b
        System.out.println("Kali: " + (a * b));

        // Meng-casting a ke double sebelum pembagian agar hasilnya tidak dibulatkan (mendapat nilai desimal)
        System.out.println("Bagi: " + ((double) a / b));
    }
}

/*
Pertanyaam Pemantik:
Praktek 1: Perbedaan nilai asli double dengan hasil casting int terletak pada bagian desimalnya. Nilai double mempertahankan angka di belakang koma secara penuh, sedangkan saat di-casting ke int, bagian desimal tersebut akan dipotong (truncate), bukan dibulatkan. Contohnya double nilai = 9.99; jika di-casting menjadi int hasil = (int) nilai; maka hasilnya adalah 9, bukan 10. Jadi casting double ke int hanya mengambil bagian bulatnya saja dan menghilangkan pecahannya.

Praktek 2 (casting): Pembagian int perlu di-casting ke double karena operasi pembagian antara dua bilangan int akan menghasilkan int juga (integer division), sehingga bagian desimalnya dibuang. Misalnya 5 / 2 menghasilkan 2, bukan 2.5. Agar hasilnya berupa bilangan desimal yang akurat, salah satu operand harus di-casting ke double, contohnya (double) a / b, sehingga pembagian dilakukan secara desimal dan menghasilkan 2.5.

Praktek 2 (pembagi 0): Risiko jika pembagi bernilai 0 bergantung pada tipenya. Pada tipe int, pembagian dengan nol akan melempar ArithmeticException dan membuat program crash jika tidak ditangani. Sedangkan pada tipe double, pembagian dengan nol tidak error tetapi menghasilkan nilai khusus seperti Infinity, -Infinity, atau NaN (Not a Number), yang membuat hasil perhitungan menjadi tidak valid. Karena itu, sebaiknya selalu validasi pembagi sebelum melakukan pembagian, misalnya dengan pengecekan if (b != 0) atau menggunakan try-catch.*/

