package Shopping;

abstract class Product {
    protected String name;
     protected double price;
      protected int quantity;


     public Product (String st,double p, int q ){
         this.name= st;
         this.price= p;
          this.quantity= q;
     }
    
      abstract  void calculatePrice();
       abstract void  getDetails();

}
