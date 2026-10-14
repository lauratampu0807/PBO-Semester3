/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

/*
NIM: 41425045
Nama: Laura Tampubolon
Motto: Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran */


import java.util.Scanner; // Import Scanner untuk input dari keyboard

public class GradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objek untuk baca input

        // DEKLARASI ARRAY & VARIABEL 
        double[] grades = new double[5]; // Array penampung 5 nilai
        double total = 0;                // Penampung jumlah seluruh nilai

        // INPUT NILAI 
        for (int i = 0; i < grades.length; i++) {
            while (true) {
                System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();

                // Validasi rentang nilai 0-100
                if (grades[i] >= 0 && grades[i] <= 100) {
                    break; // Nilai valid, keluar dari while
                } else {
                    System.out.println("Nilai harus 0-100. Ulangi!");
                }
            }
            total += grades[i]; // Tambahkan ke total
        }

        //  HITUNG RATA-RATA 
        double average = total / grades.length;
        System.out.println("Rata-rata nilai: " + average);

        // KATEGORI GRADE (PERCABANGAN) 
        char grade;
        if (average >= 85) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Grade: " + grade);

        // CARI MAX & MIN 
        double max = grades[0]; // Inisialisasi max dari elemen pertama
        double min = grades[0]; // Inisialisasi min dari elemen pertama

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) max = grades[i]; // Update max
            if (grades[i] < min) min = grades[i]; // Update min
        }

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);

        scanner.close(); // Tutup scanner
    }
}
