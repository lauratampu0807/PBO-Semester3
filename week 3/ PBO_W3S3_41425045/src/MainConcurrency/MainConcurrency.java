/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainConcurrency;
/* Nama: Laura Tampubolon
Nim: 41425045
*/
class AntreanShared {
    private String data; // Variabel untuk menyimpan pesan yang dibagikan
    private boolean adaData = false; // Status untuk menandai apakah ada pesan yang belum diambil

    // Method untuk memproduksi data
    public synchronized void kirimPesan(String pesan) {
        // Selama masih ada data yang belum diambil oleh konsumen, produsen harus menunggu
        while (adaData) {
            try {
                // Menunggu hingga pesan sebelumnya diambil/dikonsumsi
                wait();
            } catch (InterruptedException e) {
                // Mengembalikan status interupsi jika thread di-interupsi saat menunggu
                Thread.currentThread().interrupt();
            }
        }
        this.data = pesan; // Menyimpan pesan baru ke dalam variabel data
        this.adaData = true; // Mengubah status menjadi true karena pesan baru sudah dimasukkan
        System.out.println("Pesan dikirim: " + pesan); // Menampilkan informasi pesan yang dikirim

        // Memberitahu thread konsumen bahwa data sudah siap
        notify();
    }

    // Method untuk mengambil data
    public synchronized String ambilPesan() {
        // Selama belum ada data yang dikirim oleh produsen, konsumen harus menunggu
        while (!adaData) {
            try {
                // Menunggu hingga pesan tersedia
                wait();
            } catch (InterruptedException e) {
                // Mengembalikan status interupsi jika thread di-interupsi saat menunggu
                Thread.currentThread().interrupt();
            }
        }
        this.adaData = false; // Mengubah status menjadi false karena data akan segera diambil/dikosongkan
        System.out.println("Pesan diterima: " + data); // Menampilkan informasi pesan yang berhasil diterima

        // Memberitahu thread produsen bahwa tempat sudah kosong
        notify();
        return data; // Mengembalikan nilai pesan yang diambil
    }
}

public class MainConcurrency {
    public static void main(String[] args) {
        // Membuat objek bersama (shared object) yang menjadi pengatur antrean pesan
        AntreanShared antrean = new AntreanShared();

        // Thread Produsen: bertugas mengirimkan sekumpulan pesan secara berurutan
        Thread produsen = new Thread(() -> {
            String[] listPesan = {"Halo", "Belajar Java", "Selesai"}; // Daftar pesan yang akan dikirim
            for (String p : listPesan) {
                antrean.kirimPesan(p); // Memanggil method untuk mengirimkan setiap pesan
            }
        });

        // Thread Konsumen: bertugas menerima dan mengambil pesan dari antrean
        Thread konsumen = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                antrean.ambilPesan(); // Memanggil method untuk mengambil pesan sebanyak 3 kali
            }
        });

        // Memulai eksekusi thread produsen
        produsen.start();
        // Memulai eksekusi thread konsumen
        konsumen.start();
    }
}