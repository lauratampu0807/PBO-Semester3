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
public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //  INPUT 
        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();
        
        System.out.print("Masukkan harga barang: ");
        int harga = input.nextInt();
        
        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();
        
        //  HITUNG TOTAL SEBELUM DISKON 
        int total = harga * jumlah;
        System.out.println("Total sebelum diskon: " + total);
        
        //  CEK DISKON 
        if (total >= 100000) {
            // Hitung diskon 10% (pakai int biar hasilnya bulat)
            int diskon = total * 10 / 100;
            int totalBayar = total - diskon;
            
            // Tampilkan diskon
            System.out.println("Diskon: " + diskon);
            
            // Baris kosong (biar ada jarak sebelum total bayar)
            System.out.println();
            
            // Tampilkan total akhir
            System.out.println("Total bayar: " + totalBayar);
        } else {
            // Kalau tidak dapat diskon
            System.out.println("Diskon: 0");
            System.out.println();
            System.out.println("Total bayar: " + total);
        }
        
        input.close();
    }
}


