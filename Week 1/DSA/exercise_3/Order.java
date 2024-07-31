package exercise_3;

public class Order {
    private int orderId;
    private String customerName;
    private double totalPrice;

    public Order(int id, String customerName, double totalPrice){
        this.orderId = id;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    // functions to get the attributes
    public int getId(){
        return orderId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    // to show the details of the order object
    public void showDetails(){
        System.out.println("ID: "+orderId+
        ", Customer Name: "+customerName+
        ", Total Price: "+totalPrice);
    }
}
