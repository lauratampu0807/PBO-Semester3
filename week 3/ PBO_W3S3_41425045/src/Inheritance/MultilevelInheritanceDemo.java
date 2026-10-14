/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;
/* Nama: Laura Tampubolon
Nim: 41425045
*/
// Multilevel inheritance: pewarisan bertingkat Vehicle -> FourWheeler -> Car
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// FourWheeler mewarisi Vehicle
class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}

// Car mewarisi FourWheeler (sekaligus Vehicle secara tidak langsung)
class Car extends FourWheeler {
    Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Constructor dipanggil berurutan dari kelas paling atas
        Car obj = new Car();
    }
}
