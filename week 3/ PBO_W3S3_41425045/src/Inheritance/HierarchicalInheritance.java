/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/* Nama: Laura Tampubolon
Nim: 41425045
*/
// Hierarchical inheritance: satu superclass punya banyak subclass
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Car dan Bus sama-sama mewarisi Vehicle
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

class Bus extends Vehicle {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing subclass
        Car obj1 = new Car();
        Bus obj2 = new Bus();
    }
}
