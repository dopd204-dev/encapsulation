//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static boolean contains(int a, int... varargs) {
        for (int number : varargs) {
            if (number == a) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(contains(5, 1, 2, 3, 4, 5));
        System.out.println(contains(10, 1, 2, 3, 4, 5));
        System.out.println(contains(3, 3, 6, 7, 8));
        System.out.println(contains(2,3,5,6,7));
    }
}










