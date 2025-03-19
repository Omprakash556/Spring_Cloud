import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class ProductService {

    List<Product> products = new ArrayList<>();
    public void addProduct(Product p){
        products.add(p);
    }
    public List<Product> getAllProducts(){
        return products;
    }
    public Product getProduct(String name){
        for (Product p : products){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public List<Product> getProductWithText(String text) {
       String str = text.toLowerCase();
        List<Product> products1 = new ArrayList<>();
        for (Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(text) || type.contains(text) || place.contains(text)){
                products1.add(p);
            }
        }
        return products1;
    }
}
