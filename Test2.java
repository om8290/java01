import  Test1.A;// Allowed
// import Test1.A; 
public class Test2 {
     public static void main(String []s){
         Test1 t= new Test1();
         Test1.A b= t.new A();
         b.display();
     }
    
}
