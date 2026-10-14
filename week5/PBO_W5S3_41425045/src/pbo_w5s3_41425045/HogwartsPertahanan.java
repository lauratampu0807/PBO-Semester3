/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s3_41425045;

/* Nama: Laura Tampubolon
NIM: 41425045
Prodi: TRPL'25
*/
import java.util.ArrayList;
import java.util.List;

// 1. ABSTRACT CLASS
// Kerangka untuk semua mantra perlindungan. Class ini tidak bisa
// dibuat objeknya langsung (tidak bisa new MantraPerlindungan()).
// Isinya hanya "kontrak": setiap mantra wajib punya aktifkan() dan
// nonaktifkan(), tetapi cara kerjanya ditentukan oleh subclass.

abstract class MantraPerlindungan {
    // Abstract method: hanya deklarasi, tanpa isi (tanpa kurung kurawal)
    public abstract void aktifkan();

    public abstract void nonaktifkan();
}

// 2. KELAS KONKRET (mewarisi MantraPerlindungan)
// Setiap kelas WAJIB meng-override aktifkan() dan nonaktifkan(),
// kalau tidak, kode tidak bisa dikompilasi.

// Protego: saat diaktifkan mencetak "Perisai Protego terbentuk!"
class Protego extends MantraPerlindungan {
    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego menghilang.");
    }
}

// Fidelius: membutuhkan penyihir yang menjadi secret keeper
class Fidelius extends MantraPerlindungan {
    // Nama secret keeper disimpan sebagai atribut
    private String secretKeeper;

    // Constructor: secret keeper wajib diisi saat objek Fidelius dibuat
    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Fidelius aktif! Secret keeper: " + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Fidelius nonaktif. " + secretKeeper + " tidak lagi menjaga rahasia.");
    }
}

// MantraAntiApparition: mencegah apparition di area tertentu
class MantraAntiApparition extends MantraPerlindungan {
    // Area yang dilindungi
    private String area;

    // Constructor: area ditentukan saat objek dibuat
    public MantraAntiApparition(String area) {
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("Anti-Apparition aktif! Apparition dicegah di area: " + area);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Anti-Apparition di area " + area + " dinonaktifkan.");
    }
}

// 3. SISTEM PERTAHANAN
// Menampung banyak mantra perlindungan dalam satu daftar.
class SistemPertahanan {
    // List bertipe MantraPerlindungan (abstract class), sehingga bisa berisi
    // Protego, Fidelius, MantraAntiApparition, atau mantra lain yang nanti dibuat
    private List<MantraPerlindungan> daftarMantra = new ArrayList<>();

    // Menambahkan satu mantra ke dalam daftar
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
    }

    // Mengaktifkan semua mantra. Ini contoh POLYMORPHISM: perintahnya sama
    // (mantra.aktifkan()), tapi yang dijalankan sesuai jenis mantra aslinya.
    public void aktifkanSemuaMantra() {
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    // Menonaktifkan semua mantra dengan cara yang sama
    public void nonaktifkanSemuaMantra() {
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

// 4. DEMONSTRASI
public class HogwartsPertahanan {
    public static void main(String[] args) {
        // Buat sistem pertahanan Hogwarts
        SistemPertahanan hogwarts = new SistemPertahanan();

        // Buat beberapa objek mantra
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Albus Dumbledore");
        MantraPerlindungan antiApparition = new MantraAntiApparition("Hogwarts");

        // Tambahkan ke sistem pertahanan
        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);

        // Aktifkan semua mantra sekaligus
        System.out.println("=== Aktifkan semua mantra ===");
        hogwarts.aktifkanSemuaMantra();

        // Nonaktifkan semua mantra sekaligus
        System.out.println("=== Nonaktifkan semua mantra ===");
        hogwarts.nonaktifkanSemuaMantra();
    }
}