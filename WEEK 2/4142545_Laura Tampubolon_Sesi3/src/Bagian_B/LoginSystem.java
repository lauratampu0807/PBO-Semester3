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

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_PERCOBAAN = 3;    // Batas percobaan login
        boolean loginBerhasil = false;  // Flag status login

        //  LOOP PERCOBAAN LOGIN 
        for (int percobaan = 1; percobaan <= MAX_PERCOBAAN; percobaan++) {
            System.out.println("Percobaan login ke-" + percobaan);

            // Input username & password
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            // VALIDASI 
            boolean usernameValid = username.length() >= 5 && username.length() <= 10;
            boolean passwordValid = password.length() >= 8 && mengandungAngka(password);

            // CEK 
            if (usernameValid && passwordValid) {
                System.out.println("Login berhasil!");
                loginBerhasil = true;
                break; // Keluar loop jika berhasil
            } else {
                System.out.println("Login gagal! Periksa ketentuan:");
                if (!usernameValid) System.out.println("- Username harus 5-10 karakter.");
                if (!passwordValid) System.out.println("- Password minimal 8 karakter & mengandung angka.");
            }
        }

        // JIKA GAGAL 3 KALI 
        if (!loginBerhasil) {
            System.out.println("Batas percobaan habis. Akun diblokir sementara.");
        }

        scanner.close();
    }

    //METHOD BANTU: CEK MENGANDUNG ANGKA
    static boolean mengandungAngka(String teks) {
        for (int i = 0; i < teks.length(); i++) {
            if (Character.isDigit(teks.charAt(i))) return true;
        }
        return false;
    }
}
