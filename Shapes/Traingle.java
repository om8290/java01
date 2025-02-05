package Shapes;

 class Traingle extends Shape {
     private double a,b,c;
     public Traingle(double a, double b, double c){
        if( a+b <=c || a+c <= b || b+c<= a ){
            throw new IllegalArgumentException("Invalid traingle sides");

        }
         this.a=a;
          this.b=b;
           this.c=c;
     }
    @Override
    double area() {
        double s = (a + b + c) / 2; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}



