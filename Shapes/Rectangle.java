package Shapes;

class Rectangle extends Shape {
     private double lenght, breath;
      public Rectangle(double l, double b){
         this.lenght= l;
          this.breath= b;

      }
      @Override
       double area(){
         return lenght*breath;
       }
      
    @Override
     double perimeter(){
         return 2* (lenght+breath);
     }
}
