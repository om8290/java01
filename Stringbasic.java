public class Stringbasic {
    public static void main(String []a){
        String s= " welcome";
         String st= new String("welcome");
         int n= st.length();
          System.out.println( s + " "+ st +" "+ n);
        //    concat
         System.out.println(s.concat(st).concat(st).concat("of yours"));

        //  trim
        String str1 = "   Hello, World!   ";
        System.out.println(str1.trim());
        //  charAt
        //  contain
            boolean con= str1.contains("He");
             System.out.println(con);
// replace
//  substr
 System.out.println( s.substring(0,6));
        //    toUpper(), toLower
    }
}
