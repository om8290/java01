public class THis {
    class A {
        int a;
        int b;

        A(int a, int b) {
            this.a = a;
            this.b = b;
        }

        void display() {
            System.out.println(a + " " + b);
        }
    }

    public static void main(String[] args) {
        THis outer = new THis(); 
        A obj = outer.new A(10, 30); 
        System.out.println(obj.a);
        obj.display();
    }
}
