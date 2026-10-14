/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_equals;

/* Nama: Laura Tampubolon
Nim: 41425045
*/
public class Student {
    int roll;

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            return this.roll == ((Student) o).roll;
        }
        return false;
    }

    public static void main(String[] args) {
        Student sl = new Student();
        sl.roll = 101;
        Student s2 = new Student();
        s2.roll = 101;
        Student s3 = new Student();
        s3.roll = 102;

        System.out.println("sl.equals(s2): " + sl.equals(s2));
        System.out.println("sl.equals(s3): " + sl.equals(s3));
    }
}