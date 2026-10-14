/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Soal1_Fill_in_Blank;

/* Nama: Laura Tampubolon
   Nim : 41425045
*/

// Class Mahasiswa berfungsi sebagai blueprint atau template
// yang memiliki dua atribut: nama dan nim.
class Mahasiswa {
    String nama;   // atribut untuk menyimpan nama mahasiswa
    String nim;    // atribut untuk menyimpan NIM mahasiswa
}

// Class Main berisi method main() sebagai titik awal eksekusi program.
public class Main {
    public static void main(String[] args) {

        // 1. Membuat objek m1 dari class Mahasiswa
        Mahasiswa m1 = new Mahasiswa();

        // 2. Mengisi nilai atribut objek m1
        m1.nama = "Budi";      // mengisi atribut nama dengan "Budi"
        m1.nim = "12345";      // mengisi atribut nim dengan "12345"

        // 3. Menampilkan data objek ke layar
        System.out.println("Nama: " + m1.nama);   // menampilkan nama
        System.out.println("NIM: " + m1.nim);     // menampilkan nim
    }
}