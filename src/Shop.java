public class Shop {
    private String shopName;
    private Product[] products;
    private int count;

    public Shop(String shopName, int size) {
        this.shopName = shopName;
        this.products = new Product[size];
        this.count = 0;
    }

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count++] = product;
        } else {
            System.out.println("Массив толду!");
        }
    }

    public void printProducts() {
        for (int i = 0; i < count; i++) {
            System.out.println(
                            "ID: " + products[i].getId() +
                            ", Name: " + products[i].getName()+
                            ", Price: " + products[i].getPrice()
            );
        }
    }
    public void updateProduct(int id, String newName, double newPrice){
        for (int i = 0; i < count; i++) {
            if (products[i].getId() == id) {
                products[i].setName(newName);
                products[i].setPrice(newPrice);
                return;
            }
        }
        System.out.println("Продукт табылган жок");
    }
    public void removeProduct(int id) {
        for (int i = 0; i < count; i++) {
            if (products[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[--count] = null;
                return;
            }
        }
        System.out.println("Продукт табылган жок");
    }
}










