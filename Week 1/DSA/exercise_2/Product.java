package exercise_2;
public class Product {
    private int productId;
    private String productName;
    private String category;

    //constructor
    public Product(int id,String name,String category){
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    // functions to get the information of the products 
    public int getId(){
        return this.productId;
    }

    public String getName(){
        return this.productName;
    }

    public String getCategory(){
        return this.category;
    }

    // functions to update the attributes
    public void updateId(int newid){
        this.productId = newid;
    }

    public void updateName(String newName){
        this.productName = newName;
    }

    public void updateCategory(String newCategory){
        this.category = newCategory;
    }

    //to show product details
    public void getDetails(){
        System.out.println("ID: "+this.productId+", Name: "+
        this.productName+", Category: "+
        this.category
        );
    }

}
