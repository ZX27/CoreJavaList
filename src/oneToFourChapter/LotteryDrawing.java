package oneToFourChapter;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw?");
        int n = in.nextInt();

        //fill an array with number 1 2 3 ... n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        //draw k numbers and put them into a second array
        int[] results = new int[k];
        for (int i = 0; i < results.length; i++) {

            //make a random index between 0 and n-1
            int r = (int) (Math.random() * n);

            //pick the element at the random location
            results[i] = numbers[r]; //抽取的是numbers数组的下标

            //move the last element int the random location
            numbers[r] = numbers[n - 1];//不重复取数字
            n--;
        }

        //print the sorted array
        Arrays.sort(results);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int i : results)
            System.out.println(i);
    }
}