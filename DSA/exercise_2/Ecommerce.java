package exercise_2;
public class Ecommerce {
    public static void main(String[] args) {
        Product[] products = new Product[]{
            new Product(1, "Laptop", "Electrical Appliance"),
            new Product(2, "Mobile", "Electrical Appliance"),
            new Product(3, "TV", "Electrical Appliance"),
            new Product(4, "Shirts", "Fashion"),
        };
        
        //Linear Search for the product - Shirts
        Product searchProduct = SearchingAlgorithms.LinerSearch(products, "Shirts");
        searchProduct.getDetails();
    }
}
