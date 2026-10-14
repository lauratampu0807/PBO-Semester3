/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_D;

import java.util.Scanner;

/* NIM: 41425045
   Nama : Laura Tampubolon
   Motto:Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran 
*/

public class PalindromeVokal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input kata dari user
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        // Ubah ke huruf kecil biar tidak case-sensitive (misal "Katak" = "katak")
        String kataKecil = kata.toLowerCase();

        // CEK PALINDROME
        // Balik kata: baca dari huruf terakhir sampai pertama
        String kataBalik = "";
        for (int i = kataKecil.length() - 1; i >= 0; i--) {
            kataBalik = kataBalik + kataKecil.charAt(i);
        }

        // Bandingkan kata asli (kecil) dengan kata yang sudah dibalik
        if (kataKecil.equals(kataBalik)) {
            System.out.println("Kata \"" + kata + "\" adalah PALINDROME.");
        } else {
            System.out.println("Kata \"" + kata + "\" BUKAN palindrome.");
        }

        // HITUNG JUMLAH HURUF VOKAL 
        int jumlahVokal = 0;
        for (int i = 0; i < kataKecil.length(); i++) {
            char c = kataKecil.charAt(i);
            // Cek apakah karakter termasuk vokal a, i, u, e, o
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
                jumlahVokal++;
            }
        }

        System.out.println("Jumlah huruf vokal: " + jumlahVokal);

        input.close();
    }
}

