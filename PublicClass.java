public class PublicClass {
    private class innerClass {
           void display(){
             System.out.println("this is  the  innerclass");
           }
            
    }
     void test (){
        innerClass in = new innerClass();
         in.display();
     }
      public static void main(String []s){
        PublicClass pc= new PublicClass();
         pc.test();
      }
}
