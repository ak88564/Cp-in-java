package Collection;

// Filtering Collection without using Stream

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStream {
    public static void main(String args[]){
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP laptop", 25000f));
        productList.add(new Product(2, "Dell laptop", 30000f));
        productList.add(new Product(3, "Lenovo laptop", 28000f));
        productList.add(new Product(4, "Sony laptop", 28000f));
        productList.add(new Product(5, "Apple laptop", 90000f));
        List<Float> productPriceList = new ArrayList<Float>();
        for(Product product: productList){
            if (product.price< 30000){
                productPriceList.add(product.price);
            }
        }
        System.out.println(productPriceList);

    }
}
