package codingProblem.push_empty_packet;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
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
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        for (int val : arr) {
            if (val == 0)
                count += 1;
            else if (!queue.contains(val))
                queue.add(val);
        }
        while (count != 0) {
            while (!queue.isEmpty())
                answer.add(queue.poll());
            answer.add(0);
            count -= 1;
        }
        System.out.println("the answer is :" + answer);
    }
}
