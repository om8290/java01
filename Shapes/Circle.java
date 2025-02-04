package Shapes;
 import Shapes.Shape;
class Circle extends Shape {
     static final  double pi= 3.14;

    protected double radii;
     public Circle(double r){
         this.radii= r;

     }
     @Override
      double area(){
         return  pi*radii*radii;
      }
       @Override 
        double perimeter(){
             return 2*pi*radii;
        }
    
}
