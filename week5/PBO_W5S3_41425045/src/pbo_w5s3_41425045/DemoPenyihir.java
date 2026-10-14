/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s3_41425045;

/* Nama: Laura Tampubolon
NIM: 41425045
Prodi: TRPL'25
*/
import java.util.*;

// Superclass Penyihir
class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

// Subclass HarryPotter meng-override ucapkanMantra()
class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

// Subclass Hermione meng-override ucapkanMantra()
class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// TUGAS: Subclass 3 - Ron Weasley dengan implementasi khasnya
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan gugup, tongkatnya sedikit bergetar.");
    }
}


public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
         Penyihir penyihir3 = new RonWeasley();
         
        penyihir1.ucapkanMantra(); // Output: Harry porter mengucapkan mantra dengan tongkatnya yang unik
        penyihir2.ucapkanMantra();// Output: Hermione mengucapkan mantra dengan tepat dan percaya diri 
        penyihir3.ucapkanMantra();    
    }
}

/*
Pertanyaan:
1. Tanpa @Override, kode tetap berjalan normal. Annotation hanya membantu compiler memeriksa bahwa method benar-benar meng-override superclass. Jika nama atau parameter salah ketik, tanpa annotation Java menganggapnya method baru dan tidak ada peringatan.
2. Keuntungan polymorphism: satu tipe (Penyihir) bisa menampung banyak jenis objek dan dipanggil dengan cara yang sama. Kode pemanggil tidak perlu diubah ketika ada penyihir baru (misalnya RonWeasley), sehingga lebih fleksibel dan mudah dikembangkan.
*/