/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multiple_Inheritance_Interface;

/* Nama: Laura Tampubolon
Nim: 41425045
*/
interface LandVehicle {
    default void landInfo() {
        System.out.println("This is a LandVehicle");
    }
}

interface WaterVehicle {
    default void waterInfo() {
        System.out.println("This is a WaterVehicle");
    }
}

class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    public static void main(String[] args) {
        AmphibiousVehicle av = new AmphibiousVehicle();
        av.landInfo();
        av.waterInfo();
    }
}
