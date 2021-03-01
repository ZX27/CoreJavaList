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

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] results = new int[k];
        for (int i = 0; i < results.length; i++) {
            int r = (int) (Math.random() * n);
            results[i] = numbers[r];
            numbers[r] = numbers[n - 1];//不重复取数字
            n--;
        }

        Arrays.sort(results);
        System.out.println("Bet tje following combination. It'll make you rich!");
        for (int i : results)
            System.out.println(i);
    }

    public static class InputTest {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            //get first input
            System.out.print("What's your name?");
            String name = in.nextLine();

            //get second input
            System.out.print("How old are you?");
            int age = in.nextInt();

            //display output on console
            System.out.println("Hello, " + name + ". Next Year, You'll be " + (age + 1));
        }
    }
}
