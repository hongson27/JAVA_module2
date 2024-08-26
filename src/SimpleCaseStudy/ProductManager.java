package SimpleCaseStudy;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static List<Product> products = new ArrayList<Product>();
    static {
        Product p1 = new Product(1, "Iphone", 1000);
        Product p2 = new Product(2, "Samsung Galaxy", 800);
        Product p3 = new Product(3, "Oppo", 600);
        products.add(p1);
        products.add(p2);
        products.add(p3);
    }

    public void display() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void add(Product product) {
        products.add(product);
    }

    public void deleteById(int id) {
        boolean found = false;
        for (Product p : products) {
            if (p != null && p.getId() == id) {
                products.remove(p);
                return;
            } else {
                found = true;
            }
        }
        if (found) {
            System.out.println("Không tìm thấy sản phẩm có mã " + id);
        }
    }

    public void findByName(String name) {
        List<Product> newList = new ArrayList<>();
        boolean test = true;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                newList.add(product);
                System.out.println(product);
                test = false;
            }
        }
        if (test) {
            System.out.println("Không tìm thấy sản phẩm có tên " + name);
        }
        System.out.println("----------------------------------------------------------------");
    }


    public void updateById(int id, Product newProduct) {
        boolean found = true;
        for (Product p : products) {
            if (p!= null && p.getId() == id) {
                p.setName(newProduct.getName());
                p.setPrice(newProduct.getPrice());
                found = false;
                break;
            }
        }
        if (found) {
            System.out.println("Không tìm thấy sản phẩm có mã " + id);
        }
    }

}
