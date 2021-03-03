package oneToFourChapter;

public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;

        //allocate triangular array
        int[][] odds = new int[NMAX + 1][]; //初始化一个 NMAX+1 行的数组
        for (int n = 0; n <= NMAX; n++) {
            odds[n] = new int[n + 1]; //每一行的数组元素都为 行数+1
        }

        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                    odds[n][k] = lotteryOdds;
                }
            }
        }

        for (int[] row : odds) {
            for (int odd : row) {
                System.out.printf("%4d", odd);
            }

            System.out.println();
        }

    }

}
