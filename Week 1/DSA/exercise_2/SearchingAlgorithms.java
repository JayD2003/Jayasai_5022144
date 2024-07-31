package exercise_2;

import java.util.Arrays;
import java.util.Comparator;

public class SearchingAlgorithms {

    //linear search algorithm
    public static Product linerSearch(Product[] products, String name){
        for(Product product : products){
            if(product.getName().compareTo(name)==0){
                return product;
            }
        }
        return null;
    }
     
    //custom sorting for products using productId
    public static void sortProducts(Product[] products){
        Arrays.sort(products, new Comparator<Product>(){
            public int compare(Product product1, Product product2)
            {
                return product1.getId()-product2.getId();
            }
        });
    }

    //binary search algorithm
    public static Product binarySearch(Product[] products, String name){
        int start = 0;
        int end = products.length-1;

        sortProducts(products);

        while(start<end){
            int mid = (start+end)/2;
            if(name.compareTo(products[mid].getName())==0){
                return products[mid];
            }

            if(name.compareTo(products[mid].getName())>1){
                mid = end-1;
            }else{
                mid = start+1;
            }
        }
        return null;
    }
}
