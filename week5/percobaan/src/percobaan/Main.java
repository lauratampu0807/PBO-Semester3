/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan;

/**
 *
 * @author Alfredo Samuel
 */

abstract class Animal {
    abstract void suara();

    void tidur() {
        System.out.println("Hewan tidur");
    }
}

class Kucing extends Animal {
    @Override
    void suara() {
        System.out.println("Meong");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Kucing();   // variabel Animal, objek asli Kucing
        a.suara();                 // Meong
        a.tidur();  
        // Hewan tidur
    }
}