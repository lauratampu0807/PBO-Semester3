/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_C;

import java.util.Scanner;

/*
NIM: 41425045
Nama: Laura Tampubolon
Motto: Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran */

public class NomorKartu {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INPUT 
        System.out.print("Masukkan nomor kartu: ");
        String input = scanner.nextLine().trim();

        // Hapus tanda hubung untuk hitung digit asli
        String digits = input.replace("-", "");

        boolean valid = true;
        String pesan = "Nomor kartu valid.";

        //VALIDASI JUMLAH DIGIT 
        if (digits.length() != 16) {
            valid = false;
            pesan = "Nomor kartu tidak valid! Harus 16 digit.";

        // VALIDASI HANYA ANGKA 
        } else if (!digits.matches("\\d+")) {
            valid = false;
            pesan = "Nomor kartu tidak valid! Hanya boleh angka dan tanda hubung.";

        // VALIDASI AWALAN 4 / 5 / 6 
        } else if (digits.charAt(0) != '4' &&
                   digits.charAt(0) != '5' &&
                   digits.charAt(0) != '6') {
            valid = false;
            pesan = "Nomor kartu tidak valid! Harus dimulai dengan 4, 5, atau 6.";

        // VALIDASI FORMAT TANDA HUBUNG 
        } else if (input.contains("-")) {
            // Harus persis: XXXX-XXXX-XXXX-XXXX
            if (!input.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}")) {
                valid = false;
                pesan = "Nomor kartu tidak valid! Format tanda hubung harus setiap 4 digit.";
            }
        }

        // OUTPUT
        System.out.println(pesan);

        scanner.close();
    }
} 

