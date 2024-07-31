package exercise_2;
public class Ecommerce {
    public static void main(String[] args) {
        Product[] products = new Product[]{
            new Product(10, "Laptop", "Electrical Appliance"),
            new Product(2, "Mobile", "Electrical Appliance"),
            new Product(3, "TV", "Electrical Appliance"),
            new Product(4, "Shirts", "Fashion"),
        };
        
        // Linear Search for the product - Shirts
        Product searchProduct1 = SearchingAlgorithms.linerSearch(products, "Shirts");
        searchProduct1.getDetails();

        // Binary Search for the product - Laptop
        Product searchProduct2 = SearchingAlgorithms.linerSearch(products, "Laptop");
        searchProduct2.getDetails();

        // Sorted Array
        SearchingAlgorithms.sortProducts(products);
        System.out.println("Sorted Products");
        for(Product product : products){
            product.getDetails();
        }
    }
}
