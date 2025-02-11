package Doubt;

abstract class Abs0 {
    Abs0() {
        System.out.println("Abs0 constructor");
    }
    abstract void display();
}

class Abs1 extends Abs0 {
    Abs1() {
        System.out.println("Abs1 constructor");
    }
    void display() {
        System.out.println("display method");
    }
}

public class Abs01 {
    public static void main(String[] args) {
        Abs0 a = new Abs0();
        a.display();
    }
}
