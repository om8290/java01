package Shopping;
import  Shopping.Product;
 class Clothing extends Product {
    protected boolean carry_bag;

   
    public Clothing(String name, double price, int quantity, boolean carry_bag) {
        super(name, price, quantity); 
        this.carry_bag= carry_bag;

    }
    @Override
    public void calculatePrice() {
        double totalPrice = (price * quantity) ;
        System.out.println("Total price: " + totalPrice);
    }

 
    @Override
    public void getDetails() {
        System.out.println("Electronics name: " + name + ", Price: " + price + ", Quantity: " + quantity + "need carrybag " + carry_bag);
        calculatePrice();
    }  
}
