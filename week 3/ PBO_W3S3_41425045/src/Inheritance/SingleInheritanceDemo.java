/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;
/* Nama: Laura Tampubolon
Nim: 41425045
*/
// Single inheritance: satu subclass mewarisi satu superclass
class Vehicle { // Superclass
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Subclass Car mewarisi Vehicle dengan kata kunci extends
class Car extends Vehicle {
    Car() {
        // Constructor superclass (Vehicle) otomatis dipanggil lebih dulu
        System.out.println("This Vehicle is Car");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Output: This is a Vehicle, lalu This Vehicle is Car
        Car obj = new Car();
    }
}
