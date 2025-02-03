public class Static {
     static int staticvar=10;
     int nonstaticvar=20;
      public void method (){
         System.out.println("this is the static variable "+ staticvar);
         System.out.println("this is the non static variable "+ nonstaticvar);
         
      }
    public static void main(String []a){
            Static s= new Static();
             s.method();
              s.nonstaticvar= 30;
               Static.staticvar= 40;
                Static s2= new Static();
                 s2.method();
    }
}
