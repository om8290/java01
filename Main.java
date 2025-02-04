class Parent {
    public Parent(String st) {
        System.out.println(st);
    }
}

class Child extends Parent {
    public Child() {
        super("This is the super function");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child(); 
    }
}
