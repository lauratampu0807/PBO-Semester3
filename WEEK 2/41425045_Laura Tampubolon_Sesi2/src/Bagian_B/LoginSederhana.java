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

public class LoginSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        
        System.out.print("Masukkan password: ");
        String password = input.nextLine();
        
        // Cek username
        if (!username.equals("admin")) {
            System.out.println("Login gagal! Username tidak valid.");
        } else {
            // Cek password: minimal 6 karakter & ada angka
            boolean adaAngka = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    adaAngka = true;
                    break;
                }
            }
            
            if (password.length() >= 6 && adaAngka) {
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Login gagal! Password tidak valid.");
            }
        }
        
        input.close();
    }
}
