package codingProblem.sum_of_cubes;

import java.util.Scanner;

public class Solution {

    public static int getPowerFromMtoN(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i * i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of M");
        int m = scanner.nextInt();
        System.out.println("enter value of N");
        int n = scanner.nextInt();
        System.out.println("the answer is  :" + getPowerFromMtoN(m, n));
    }
}
