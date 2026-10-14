/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s3_41425045;

/* Nama: Laura Tampubolon
NIM: 41425045
Prodi: Str TRPL
*/
import java.util.*;

/*
 Kelas Mantra memiliki beberapa method ucapkan() dengan parameter berbeda.
 */
public class Mantra {

    // Method ucapkan() dengan satu parameter: hanya nama mantra
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload: method ucapkan() dengan dua parameter (nama mantra dan kekuatan)
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        // Efek ditentukan oleh besar kekuatan
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload: method ucapkan() dengan tiga parameter (nama mantra, kekuatan, target)
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    // TUGAS: Overload baru dengan parameter nama mantra dan target (tanpa kekuatan)
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        // Tanpa kekuatan, efek yang dicetak adalah efek standar
        System.out.println("Efek: " + target + " terkena mantra " + namaMantra + " dengan kekuatan standar.");
    }


    public static void main(String[] args) {
        // Membuat objek Mantra
        Mantra mantra = new Mantra();

        // Memanggil setiap versi overload; Java memilih berdasarkan tipe dan jumlah argumen
        mantra.ucapkan("Expelliarmus");                      // 1 parameter
        mantra.ucapkan("Expelliarmus", 5);                   // String, int
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");     // String, int, String
       }
}


/* 
Pertanyaan
1. Jika salah satu method overloading dihapus (misalnya yang dua parameter), setiap pemanggilan yang memakai versi itu akan error kompilasi, karena tidak ada method yang cocok dengan argumen yang diberikan.
2. Bisa. Overloading hanya mensyaratkan daftar parameter berbeda (jumlah, tipe, atau urutan tipe). ucapkan(int kekuatan, String namaMantra) sah karena urutan tipenya berbeda dari ucapkan(String, int).
*/