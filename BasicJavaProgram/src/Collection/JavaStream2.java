package Collection;

// Filtering Collection without using Stream

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product2{
    int id;
    String name;
    float price;
    public Product2(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStream2 {
    public static void main(String args[]){
        List<Product2> productList = new ArrayList<Product2>();
        productList.add(new Product2(1, "HP laptop", 25000f));
        productList.add(new Product2(2, "Dell laptop", 30000f));
        productList.add(new Product2(3, "Lenovo laptop", 28000f));
        productList.add(new Product2(4, "Sony laptop", 28000f));
        productList.add(new Product2(5, "Apple laptop", 90000f));
//        List<Float> productPriceList = new ArrayList<Float>();
//        for(Product2 product: productList){
//            if (product.price< 30000){
//                productPriceList.add(product.price);
//            }
//        }
//        System.out.println(productPriceList);
        List<Float> productPriceList2 = productList.stream().filter(p->p.price>50000)
                .map(p->p.price)
                .collect(Collectors.toList());
        System.out.println(productPriceList2);

    }
}
