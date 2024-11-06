package codingProblem.food_order;

import java.util.Scanner;
import java.util.function.Function;

public class Solution {
    public static void main(String[] args) {
        System.out.println("This is Menu card :");
        System.out.println("Pizza RS 200");
        System.out.println("Burger RS 180");
        System.out.println("Briyani RS 250");
        System.out.println("Dosa RS 80");
        System.out.println("Idly RS 50");
        String foodName = "";
        Scanner scanner = new Scanner(System.in);
        int price = 0;
        int count = 0;
        // String foodName = "";
        int flag = 1;
        Function<Scanner, String> scan = v -> v.nextLine();
        do {
            System.out.println("Type FoodName or Type Exist ");
            foodName = scan.apply(scanner);
            foodName = foodName.toLowerCase();
            switch (foodName) {
                // int count = 0;
                case "pizza":
                    System.out.println("Enter quantity :");
                    count = scanner.nextInt();
                    price += (count * 200);
                    break;
                case "burger":
                    System.out.println("Enter quantity :");

                    count = scanner.nextInt();
                    price += (count * 200);
                    break;
                case "briyani":
                    System.out.println("Enter quantity :");

                    count = scanner.nextInt();
                    price += (count * 200);
                    break;
                case "Dosa":
                    System.out.println("Enter quantity :");

                    count = scanner.nextInt();
                    price += (count * 200);
                    break;
                case "Idly":
                    System.out.println("Enter quantity :");
                    count = scanner.nextInt();
                    price += (count * 200);
                    break;
            }

        } while (!foodName.equalsIgnoreCase("exist"));
        if (price >= 1000) {
            price = ((price) * 10 / 100) - price;

        } else {
            System.out.println("you price of your order :" + price);

        }
    }
}
