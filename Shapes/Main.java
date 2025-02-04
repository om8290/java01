package Shapes;

public class Main {
     public static void main(String []a){
        System.out.println("lets check");
         Circle circle1 = new Circle(5);
         System.out.println("checing for circle...");
         System.out.println("Area " + circle1.area());
         System.out.println("perimeter " + circle1.perimeter());
          Traingle traingle1= new Traingle(3,4,5);
          System.out.println("checing for Traingle...");
          System.out.println("Area " + traingle1.area());
          System.out.println("perimeter " + traingle1.perimeter());
 Rectangle rectangle1= new Rectangle(20,29);
 System.out.println("checing for rectangle...");
 System.out.println("Area " + rectangle1.area());
 System.out.println("perimeter " + rectangle1.perimeter());

     }
    
}
