/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Membuat_Beberapa_Objek;

/* Nama: Laura Tampubolon
Nim: 41425045
*/
class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }

public class Test {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj = new Cat();
        System.out.println("Objek berhasil diganti dari Dog ke Cat");
    }
}
