package Collection;


import java.util.ArrayList;
import java.util.List;

class Product3{
    int id;
    String name;
    float price;
    public Product3(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamReduce {
    public static void main(String args[]){
        List<Product3> productList2 = new ArrayList<Product3>();
        productList2.add(new Product3(1, "HP laptop", 25000f));
        productList2.add(new Product3(2, "Dell laptop", 30000f));
        productList2.add(new Product3(3, "Lenovo laptop", 28000f));
        productList2.add(new Product3(4, "Sony laptop", 28000f));
        productList2.add(new Product3(5, "Apple laptop", 90000f));

        Float totalPrice = productList2.stream().map(p->p.price)
                .reduce(0.0f, (sum, price)->sum+price); //accumulating price
        System.out.println(totalPrice);
        Float totalPrice2 = productList2.stream().map(p->p.price)
                .reduce(0.0f, Float::sum);
        System.out.println(totalPrice2);
    }

}
