/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;
/* Nama: Laura Tampubolon
Nim: 41425045
*/


// Class dengan parameterized constructor
class Geeks{
    // Data member (atribut) class
    String name;
    int id;

    // Constructor dengan parameter untuk mengisi nilai atribut
    Geeks(String name, int id) {
        this.name = name; // this.name = atribut, name = parameter
        this.id = id;
    }
}

public class Parameterized{
    public static void main(String[] args) {
        // Memanggil parameterized constructor dengan nilai sendiri
        Geeks geek1 = new Geeks("Sweta", 68);
        // Menampilkan nilai atribut objek
        System.out.println("GeekName: " + geek1.name + " and GeekId: " + geek1.id);
    }
}
