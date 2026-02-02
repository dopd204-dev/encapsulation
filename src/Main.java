//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
}
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020, 50);

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Speed: " + myCar.getSpeed());


        myCar.increaseSpeed(20);
        System.out.println("Increased Speed: " + myCar.getSpeed());
        myCar.decreaseSpeed(40);
        System.out.println("Decreased Speed: " + myCar.getSpeed());
    }













