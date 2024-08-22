package Task2;

import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want extras with your tea (yes/no)? ");
        boolean teaExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        System.out.print("Do you want extras with your coffee (yes/no)? ");
        boolean coffeeExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        Beverages tea = new Tea();
        Beverages coffee = new Coffee();

        tea.setWantsExtras(teaExtras);
        coffee.setWantsExtras(coffeeExtras);

        System.out.println("Making tea...\n");
        tea.finalTemplateMethod();

        System.out.println("Making coffee...\n");
        coffee.finalTemplateMethod();

        scanner.close();
    }
}
