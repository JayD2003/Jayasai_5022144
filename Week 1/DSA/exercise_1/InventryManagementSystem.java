package exercise_1;
public class InventryManagementSystem {
    public static void main(String[] args) {
        Inventry inventry = new Inventry();
        
        Product first = new Product(1, "Laptop", 10, 100000);
        Product second = new Product(2, "Phone", 5, 50000);
        Product third = new Product(3, "Head Phones", 40, 1000);

        inventry.addProduct(first);
        inventry.addProduct(second);
        inventry.addProduct(third);

        System.out.println("Inventry");
        inventry.showInventry();
        System.out.println();

        Product updateProduct = new Product(1, "Dell Lpatops", 12, 50000);
        inventry.updateProduct(1, updateProduct);

        System.out.println("Inventry after Update");
        inventry.showInventry();
        System.out.println();

        inventry.deleteProduct(2);

        System.out.println("Inventry after Deletion");
        inventry.showInventry();
        System.out.println();
    }
}
