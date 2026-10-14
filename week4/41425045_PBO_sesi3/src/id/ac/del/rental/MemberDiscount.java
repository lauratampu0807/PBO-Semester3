/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;
/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL
*/
// Implementasi interface Discountable untuk diskon member (misal: potongan 20%)
public class MemberDiscount implements Discountable {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.20; // Diskon 20% dari total biaya dasar
    }
}


/*Hasil Diskusi Kelompok – Bagian C: Kelas Interaktif
1. Analisis Kompilasi dan Hak Akses (Access Modifiers)
Berdasarkan pengujian pada file TestRental.java, proses kompilasi akan gagal (compile-time error) pada Baris B dan Baris C.
Pada Baris B (v.rentalRatePerDay = -500000;), error terjadi karena atribut rentalRatePerDay dideklarasikan dengan akses protected. Karena kelas TestRental berada di package yang berbeda (id.ac.del.test) dan bukan merupakan kelas turunan (subclass) dari VehicleRental, maka atribut tersebut tidak dapat diakses secara langsung.
Pada Baris C (v.discountRate = 0.20;), error muncul akibat atribut discountRate menggunakan akses default (tanpa keyword). Akses jenis ini membatasi visibilitas hanya untuk kelas-kelas yang berada dalam satu package yang sama.
Sementara itu, Baris A aman dari error karena atribut plateNumber bersifat public sehingga bisa diakses secara bebas lintas package. Baris D juga tidak bermasalah karena memanggil setRentalDays(), yang merupakan method publik (public).

2. Kelemahan Integritas Data (Data Hiding & Validation)
i) Cacat Logika pada Method setRentalDays:
Meskipun atribut rentalDays sudah disembunyikan menggunakan modifier private, cacat logika tetap terjadi karena method setRentalDays() tidak dilengkapi dengan proses validasi. Nilai parameter yang dikirimkan langsung disimpan begitu saja tanpa diperiksa. Hal inilah yang membuat parameter negatif seperti -7 pada Baris D tetap bisa masuk ke dalam sistem, padahal durasi hari sewa secara logika tidak boleh bernilai kurang dari nol.
ii) Penyebab Total Biaya Negatif & Cara Mengatasinya:
Korupsi data finansial (seperti total biaya yang bernilai minus) bisa terjadi karena tidak adanya pembatasan nilai (validation) pada atribut-atribut penting. Tarif harian (rentalRatePerDay) maupun durasi sewa (rentalDays) bisa lolos dengan nilai negatif, atau persentase diskon yang dimasukkan tidak terkontrol. Solusi untuk mengatasi masalah ini adalah dengan menerapkan enkapsulasi penuh (private) pada seluruh atribut utama, lalu membubuhi blok validasi logika di dalam setiap setter. Pastikan tarif bernilai positif, hari sewa lebih dari atau sama dengan nol, serta batasan diskon berada dalam rentang yang logis.
3. Penerapan Interface (Dependency Injection)
i) Pembuatan Interface Discountable:
Dirancang sebuah interface bernama Discountable yang di dalamnya mendeklarasikan sebuah kontrak method yaitu calculateDiscount(double amount) untuk mengakomodasi berbagai jenis variasi potongan harga (seperti diskon member, flash sale, maupun korporat).
ii) Penyesuaian Method getTotalCost():
Method getTotalCost() dimodifikasi agar menerima parameter bertipe Discountable. Dengan cara ini, perhitungan total biaya kotor dikalikan terlebih dahulu, kemudian dipotong menggunakan hasil kalkulasi dari objek diskon yang dikirimkan secara dinamis saat program berjalan (runtime memanfaatkan konsep polimorfisme).*/