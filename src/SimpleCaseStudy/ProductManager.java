package SimpleCaseStudy;

public class ProductManager {
    private static Product[] products = new Product[10];
    static {
        products[0] = new Product(1, "Iphone", 1000);
        products[1] = new Product(2, "Samsung Galaxy", 800);
        products[2] = new Product(3, "Oppo", 600);
    }

    public void display() {
        for (int i = 0; i < products.length; i++) {
            if (products[i]!= null) {
                System.out.println((i+1) + ". " +products[i]);
            } else {
                break;
            }
        }
    }

    public void add(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    public void deleteById(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i]!= null && products[i].getId() == id) {
                for (int j = i; j < products.length -1; j++) {
                    products[j] = products[j + 1];
                }
                products[products.length - 1] = null;
                break;
            } else {
                System.out.println("Không tìm thấy sản phẩm có mã " + id);
            }
        }
    }

}
