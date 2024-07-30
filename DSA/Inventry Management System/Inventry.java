import java.util.HashMap;

public class Inventry {
    HashMap<Integer,Product> inventry;

    //constructor
    public Inventry(){
        inventry = new HashMap<>();
    }

    //to add product into inventry
    public void addProduct(Product product){
        this.inventry.put(product.getId(), product);
    }

    //to update product in inventry
    public void updateProduct(int productId, Product updateProduct){
        this.inventry.put(productId, updateProduct);
    }

    //to delete the product in inventry
    public Product deleteProduct(int productId){
        Product deletedProduct = this.inventry.get(productId);
        this.inventry.remove(productId);
        return deletedProduct;
    }

    //to get product in inventry
    public Product getProduct(int productId){
        if(inventry.containsKey(productId)){
            return inventry.get(productId);
        }
        return null;
    }

    //to show inventry
    public void showInventry(){
        for(Product p : inventry.values()){
            p.getDetails();
        }
    }

    public static void main(String[] args) {
        Inventry i = new Inventry();
        Product p = new Product(0, "ull", 0, 0);
        Product q = new Product(1, "null", 0, 0);
        i.addProduct(p);
        i.addProduct(q);

        i.showInventry();

    }
}
