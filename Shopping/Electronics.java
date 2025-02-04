package Shopping;

public class Electronics extends Product {
    protected double transportFee;

   
    public Electronics(String name, double price, int quantity, double transportFee) {
        super(name, price, quantity); 
        this.transportFee = transportFee;
    }

 
    @Override
    public void calculatePrice() {
        double totalPrice = (price * quantity) + transportFee;
        System.out.println("Total price: " + totalPrice);
    }

 
    @Override
    public void getDetails() {
        System.out.println("Electronics name: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Transport fee: " + transportFee);
        calculatePrice();
    }
}
