/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;
/* Nama: Laura Tampubolon
Nim: 41425045
*/

// Class dengan parameterized constructor dan copy constructor
class GeeksCopy {
    String name;
    int id;

    // Parameterized constructor
    GeeksCopy(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy constructor: menerima objek lain lalu menyalin datanya
    GeeksCopy(GeeksCopy obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

public class CopyConstructorDemo {
    public static void main(String[] args) {
        // Objek pertama dibuat dengan parameterized constructor
        System.out.println("First Object");
        GeeksCopy geek1 = new GeeksCopy("Sweta", 68);
        System.out.println("GeekName: " + geek1.name + " and GeekId: " + geek1.id);

        System.out.println();

        // Objek kedua dibuat dengan menyalin geek1 melalui copy constructor
        GeeksCopy geek2 = new GeeksCopy(geek1);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("GeekName: " + geek2.name + " and GeekId: " + geek2.id);
    }
}

