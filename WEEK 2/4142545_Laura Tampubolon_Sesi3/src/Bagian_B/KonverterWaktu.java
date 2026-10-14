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


public class KonverterWaktu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  MENU 
        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");
        System.out.print("Pilihan: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Bersihkan enter

        switch (pilihan) {
            //DETIK → HH:MM:SS 
            case 1:
                System.out.print("Masukkan jumlah detik: ");
                int totalDetik = scanner.nextInt();

                int jam   = totalDetik / 3600;          // 1 jam = 3600 detik
                int menit = (totalDetik % 3600) / 60;   // Sisa ke menit
                int detik = totalDetik % 60;            // Sisa ke detik

                System.out.printf("Hasil: %02d:%02d:%02d%n", jam, menit, detik);
                break;

            //Detik
            case 2:
                System.out.print("Masukkan waktu (HH:MM:SS): ");
                String waktu = scanner.nextLine();
                String[] bagian = waktu.split(":"); // Pecah berdasarkan ":"

                if (bagian.length == 3) {
                    int h = Integer.parseInt(bagian[0]);
                    int m = Integer.parseInt(bagian[1]);
                    int s = Integer.parseInt(bagian[2]);
                    int total = h * 3600 + m * 60 + s;
                    System.out.println("Hasil: " + total + " detik");
                } else {
                    System.out.println("Format salah! Gunakan HH:MM:SS");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

