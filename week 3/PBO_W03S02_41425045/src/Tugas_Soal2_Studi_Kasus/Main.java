/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Soal2_Studi_Kasus;

/* Nama: Laura Tampubolon
   Nim : 41425045
*/

// Class Mahasiswa berfungsi sebagai blueprint dasar
// yang memiliki atribut umum: nama dan nim.
class Mahasiswa {
    String nama;   // atribut untuk menyimpan nama mahasiswa
    String nim;    // atribut untuk menyimpan NIM mahasiswa
}

// Class MahasiswaAktif mewarisi (extends) class Mahasiswa.
// Artinya, ia otomatis memiliki atribut nama dan nim dari Mahasiswa,
// lalu menambahkan atribut dan method baru yaitu semester dan belajar().
class MahasiswaAktif extends Mahasiswa {
    int semester;  // atribut tambahan khusus MahasiswaAktif

    // Method untuk menampilkan perilaku belajar
    // Menggunakan atribut nama (warisan dari Mahasiswa) dan semester
    void belajar() {
        System.out.println(nama + " sedang belajar di semester " + semester);
    }
}

// Class Main berisi method main() sebagai titik awal eksekusi program.
public class Main {
    public static void main(String[] args) {
        
        // 1. Membuat objek dari class MahasiswaAktif
        MahasiswaAktif m = new MahasiswaAktif();

        // 2. Mengisi nilai atribut objek
        m.nama = "Dina";        // atribut warisan dari class Mahasiswa
        m.nim = "123456";       // atribut warisan dari class Mahasiswa
        m.semester = 5;         // atribut milik class MahasiswaAktif

        // 3. Menampilkan data ke layar
        System.out.println("Nama: " + m.nama);
        System.out.println("NIM: " + m.nim);

        // 4. Memanggil method belajar() milik MahasiswaAktif
        //    Output: Dina sedang belajar di semester 5
        m.belajar();
    }
}