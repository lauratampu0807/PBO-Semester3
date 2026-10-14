package PassingObject;

// Class untuk mendemonstrasikan pengiriman objek sebagai parameter method
class ObjectPassDemo {
    int a, b;

    // Constructor untuk mengisi nilai a dan b
    ObjectPassDemo(int i, int j) {
        a = i;
        b = j;
    }

    // Method menerima objek lain sebagai parameter,
    // lalu membandingkan nilai a dan b kedua objek
    boolean equalTo(ObjectPassDemo o) {
        return (o.a == a && o.b == b);
    }
}

public class PassingObjectDemo {
    public static void main(String[] args) {
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);

        // ob1 dan ob2 bernilai sama -> true
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        // ob1 dan ob3 berbeda -> false
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
