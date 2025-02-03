public class Local {
 static int num2=20;
 int num1=10;     
     public void method(){
         int local =30;
          System.out.println("local variable "+ local);
          System.out.println("static "+ num2);
          System.out.println(" instance variable "+  num1);

     }
      public static void main(String a[]){
        Local obj1= new Local();
         obj1.method();
          System.out.println("reintalizing");
        obj1.num1=40;
           obj1.num2=50;
            obj1.method();
            Local obj2= new Local();
            System.out.println("reintalizing");
             obj2.method();
             
      }
}
