package codingProblem.Red_green_pen;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of arr");
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the enter " + (i + 1) + " num");
            arr[i] = scanner.nextInt();
        }

        int pre = arr[0], count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (pre % 2 != 0 && arr[i] % 2 == 0)
                count += 1;
        }
        System.out.println("the answer is :" + count);
    }
}
