package codingProblem.railwayBooking;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No of Tickets You want to Book");
        int total_ticket = scanner.nextInt();
        int price = 0;
        for (int i = 0; i < total_ticket; i++) {
            System.out.println("Enter Age of " + (i + 1) + " person");
            int age = scanner.nextInt();
            if (age >= 60)
                price += 30;
            else if (age <= 12)
                price += 20;
            else
                price += 50;
        }
        System.out.println("this is price of you " + price);
    }
}
