public class Test1 {
    //defalut class 
         class A{
         void display(){
             System.out.println(" this is the default class ");
         }
     }    //   public class
      public class B{
         void display(){
             System.out.println(" this is the public class");
         }
      }       public static void main(String []s){
         Test1 t= new Test1();
         Test1.A a = t.new A();
        a.display(); 

        Test1.B b = t.new B();
        b.display();
          
       }
}
