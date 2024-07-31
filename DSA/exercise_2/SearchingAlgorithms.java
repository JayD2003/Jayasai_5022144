package exercise_2;
public class SearchingAlgorithms {
    public static Product LinerSearch(Product[] products, String name){
        for(Product product : products){
            if(product.getName().compareTo(name)==0){
                return product;
            }
        }
        return null;
    }

    
}
