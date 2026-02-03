//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
}
    public static void main(String[] args) {
        Shop shop = new Shop("Shop", 10);

        System.out.println("---------------Меню------------");
        shop.addProduct(new Product("Apple", 50));
        shop.addProduct(new Product("Banana", 30));
        shop.addProduct(new Product("Orange", 40));
        shop.printProducts();
        System.out.println("--------------------------------");
    }








