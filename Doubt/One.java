package Doubt;

public class One {
    public static void main(String[] args) {
        String st = "i am the tester";
        int n = st.length();
        char[] temp = new char[n];
        int t = 0;

    
        for (int i = n - 1; i >= 0; i--) {
            temp[t] = st.charAt(i);
            t++;
        }

    
        String reve = new String(temp);

     
        System.out.println(reve);
    }
}
