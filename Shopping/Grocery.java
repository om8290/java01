package Shopping;
import Shopping.Product;
class Grocery  extends Product{
    protected  String payment_mode;

   
    public Grocery(String name, double price, int quantity, String mode) {
        super(name, price, quantity); 
        this.payment_mode=mode;
    }

 
    @Override
    public void calculatePrice() {
        double totalPrice = (price * quantity) ;
        System.out.println("Total price: " + totalPrice);
    }

 
    @Override
    public void getDetails() {
        System.out.println("Electronics name: " + name + ", Price: " + price + ", Quantity: " + quantity + ", payment mode: " + payment_mode);
        calculatePrice();
    }
}
