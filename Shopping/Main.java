package Shopping;

public class Main {
    public static void main(String[] a){
        Product laptop = new Electronics("laptop", 300, 2, 100);
        Product Tshirt = new Clothing("T-shirt ", 200,3, false);
        Product apples = new Grocery("Apples", 2, 10, "debit");
       laptop.getDetails();
        Tshirt.getDetails();
      apples.getDetails();
    }
}
