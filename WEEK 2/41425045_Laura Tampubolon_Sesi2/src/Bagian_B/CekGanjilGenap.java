/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

import java.util.Scanner;

/*
NIM: 41425045
Nama: Laura Tampubolon
Motto:Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran */

public class CekGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input

        System.out.print("Masukkan bilangan: "); // Meminta pengguna memasukkan bilangan
        int bilangan = input.nextInt(); // Membaca bilangan sebagai int

        // Mengecek sisa bagi bilangan dengan 2, jika 0 berarti genap, selain itu ganjil
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan Genap");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil");
        }
    }
}
