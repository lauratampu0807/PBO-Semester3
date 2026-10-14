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

public class ModifikasiDataDiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan umur: ");
        int umur = Integer.parseInt(input.nextLine());
        
        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = Double.parseDouble(input.nextLine());
        
        System.out.print("Masukkan status mahasiswa (true/false): ");
        boolean isMahasiswa = Boolean.parseBoolean(input.nextLine());
        
        System.out.println("\nNama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);
        
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
        
        input.close();
    }
}