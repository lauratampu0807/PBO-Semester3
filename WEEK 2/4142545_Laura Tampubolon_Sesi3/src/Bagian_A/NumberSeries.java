/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

import java.util.Scanner;
/* NIM: 41425045
   Nama : Laura Tampubolon
   Motto:Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran 
*/
import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah deret Fibonacci
        System.out.print("Masukkan Jumlah deret Fibonacci : ");
        int n = scanner.nextInt();

        // Generate Fibonacci series
        System.out.println("Deret Fibonacci:");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;   // hitung suku berikutnya
            a = b;              // geser nilai a ke b
            b = next;           // geser nilai b ke next
        }
        System.out.println();

        // Check prime number
        // Meminta pengguna memasukkan bilangan untuk dicek prima
        System.out.print("Masukkan bilangan untuk dicek prima : ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;    // bilangan <= 1 bukan prima
        } else {
            // Cek pembagi dari 2 sampai akar kuadrat num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;  // jika habis dibagi, bukan prima
                    break;
                }
            }
        }

        // Menampilkan hasil pengecekan bilangan prima
        System.out.println(num + (isPrime ? " adalah bilangan prima" : " bukan bilangan prima"));
    }
}

/*
Bagaimana cara mengoptimalkan algoritma Fibonacci untuk jumlah yang besar?
jawab:
Untuk mengoptimalkan Fibonacci bagi n besar,dan gunakan fast doubling atau matrix exponentiation dengan 
exponentiation by squaring agar kompleksitasnya turun menjadi O(log n), 
lengkapi dengan BigInteger untuk menangani angka raksasa dan modular arithmetic bila hasilnya hanya perlu dalam modulo tertentu.
*/
