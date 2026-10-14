/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hybrid_Inheritance;

/* Nama: Laura Tampubolon
Nim: 41425045
*/
class Vehicle { }
class Car extends Vehicle { }
class Fare extends Vehicle { }
class Bus extends Fare { }

public class HybridInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();
        System.out.println("Hybrid inheritance berhasil");
    }
}
