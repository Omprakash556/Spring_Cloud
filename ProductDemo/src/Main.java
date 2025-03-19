import java.util.List;

public class Main {
    public static void main(String[] args) {
       ProductService service = new ProductService();

       // hey Service add the product
        service.addProduct(new Product("Asus VivoBook","Laptop","Brown table", 2023));
        service.addProduct(new Product("Type c","Cable","Black Drawer", 2025));
        service.addProduct(new Product("Asus Rog","Laptop","White Table", 2027));
        service.addProduct(new Product("Lenovo Mouse","Mouse","Brown table", 2025));
        service.addProduct(new Product("Apple mouse","Mouse","Green table", 2028));

        List<Product> products = service.getAllProducts();
        for(Product p : products){
            System.out.println(p);
        }
        System.out.println("==================================");
        System.out.println("A particular product");
        Product p = service.getProduct("Asus VivoBook");
        System.out.println(p);

        System.out.println("============================");
        System.out.println("A Particular text");
        List<Product> products1 = service.getProductWithText("mouse");
        for (Product p1 : products1){
            System.out.println(p1);
        }
    }
}