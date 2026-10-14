/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;
/* Nama: Laura Tampubolon
Nim: 41425045
*/
// Class dengan beberapa constructor (constructor overloading)
class GeeksOverload {
    // Constructor dengan satu argumen bertipe String
    GeeksOverload(String name) {
        System.out.println("Constructor with one argument - String: " + name);
    }

    // Constructor dengan dua argumen: String dan int
    GeeksOverload(String name, int age) {
        System.out.println("Constructor with two arguments: String and Integer: " + name + " " + age);
    }

    // Constructor dengan satu argumen tetapi bertipe berbeda (long)
    GeeksOverload(long id) {
        System.out.println("Constructor with one argument: Long: " + id);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        // Java memilih constructor berdasarkan jumlah dan tipe argumen
        GeeksOverload geek2 = new GeeksOverload("Sweta");
        GeeksOverload geek3 = new GeeksOverload("Amiya", 28);
        GeeksOverload geek4 = new GeeksOverload(325614567);
    }
}

