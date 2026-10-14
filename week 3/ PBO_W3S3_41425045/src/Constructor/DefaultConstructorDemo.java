/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;

/* Nama: Laura Tampubolon
Nim: 41425045
*/

// Class dengan default constructor (explicit, tanpa parameter)
class GeeksDefault {
    // Default constructor: dipanggil otomatis saat objek dibuat dengan new
    GeeksDefault() {
        System.out.println("Default constructor");
    }
}

// Class utama untuk menjalankan program
public class DefaultConstructorDemo {
    public static void main(String[] args) {
        // Membuat objek; constructor otomatis dipanggil dan mencetak teks
        GeeksDefault hello = new GeeksDefault();
    }
}
