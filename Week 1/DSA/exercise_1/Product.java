package exercise_1;
public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double price;

    //constructor
    public Product(int id,String name,int quantity,double price){
        this.productId = id;
        this.productName = name;
        this.quantity = quantity;
        this.price = price;
    }

    // functions to get the information of the products 
    public int getId(){
        return this.productId;
    }

    public String getName(){
        return this.productName;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    // functions to update the attributes
    public void updateId(int newid){
        this.productId = newid;
    }

    public void updateName(String newName){
        this.productName = newName;
    }

    public void updateQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

    public void updatePrice(double newPrice){
        this.price = newPrice;
    }

    //to show product details
    public void getDetails(){
        System.out.println("ID: "+this.productId+", Name: "+
        this.productName+", Quantity: "+
        this.quantity+", Price: "+
        this.price
        );
    }

}
