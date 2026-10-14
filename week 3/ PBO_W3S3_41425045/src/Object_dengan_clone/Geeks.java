/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_dengan_clone;

/* Nama: Laura Tampubolon
Nim: 41425045
*/
class Geeks implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String name = "GeeksForGeeks";

    public static void main(String[] args) {
        Geeks ol = new Geeks();
        try {
            Geeks o2 = (Geeks) ol.clone();
            System.out.println(o2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
