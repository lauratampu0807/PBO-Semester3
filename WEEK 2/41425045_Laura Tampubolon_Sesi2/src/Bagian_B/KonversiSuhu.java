/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

import java.util.Scanner;

/*
NIM: 41425045
Nama: Laura Tampubolon
Motto: Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran */


public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input

        System.out.print("Masukkan suhu dalam Celsius: "); // Meminta suhu dalam Celsius
        double celsius = input.nextDouble(); // Membaca suhu Celsius sebagai double

        // Rumus konversi Celsius ke Fahrenheit: F = (C x 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " C = " + fahrenheit + " F");

        System.out.print("Masukkan suhu dalam Fahrenheit: "); // Meminta suhu dalam Fahrenheit
        double fahrenheit2 = input.nextDouble(); // Membaca suhu Fahrenheit sebagai double

        // Rumus konversi Fahrenheit ke Celsius: C = (F - 32) x 5/9
        double celsius2 = (fahrenheit2 - 32) * 5 / 9;
        // Membulatkan hasil menjadi 2 angka di belakang koma
        System.out.printf("%.1f F = %.2f C%n", fahrenheit2, celsius2);
    }
}
