package Collection;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product4{
    int id;
    String name;
    float price;
    public Product4(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class JavaStream4 {
    public static void main(String args[]){
        List<Product4> productList = new ArrayList<Product4>();
        productList.add(new Product4(1, "HP laptop", 25000f));
        productList.add(new Product4(2, "Dell laptop", 30000f));
        productList.add(new Product4(3, "Lenovo laptop", 28000f));
        productList.add(new Product4(4, "Sony laptop", 28000f));
        productList.add(new Product4(5, "Apple laptop", 90000f));

        Map<Integer, String> productPriceMap = productList.stream().collect(Collectors.toMap(
            p->p.id, p->p.name));
        System.out.println(productPriceMap);
    }

}
