//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
}
    public static void main(String[] args) {
        House house = new House(
                "Бишкек ш., Манас проспекти",
                4,
                120.5
        );

        double price = house.calculatePrice(10000);
        System.out.println("Үйдүн баасы: " + price);
    }






