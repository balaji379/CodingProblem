package codingProblem.largestNnum;

import java.util.Arrays;
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
        Arrays.sort(arr);
        int largestNum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            largestNum += arr[i] * Math.pow(10, i);
        }
        System.out.println("the answe is :" + largestNum);
    }
}
