package tryTest;

public class TryTest2 {
    public TryTest2() {
        for (int i = 0; i < 2; i++) {
            int k;
            try {
                System.out.println("\nOuter try block; Test Case #" + i);
                try {
                    System.out.println("\tInner try block");
                    switch (i) {
                        case 0:
                            int zero = 0;
                            k = 8 / zero;
                            break;
                        case 1:
                            int[] c = new int[3];
                            k = c[5];
                            break;
                    }
                } catch (ArithmeticException e) {
                    System.out.println("\tInner> " + e);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("\tInner> " + e);
                    //ArrayIndexOutOfBoundsException是IndexOutOfBoundsException的子类
                    //所以内层捕获父类后为了保证外层捕获子类，再次抛出异常
                    throw e;
                } finally {
                    System.out.println("\tInner finally block");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\tOuter> " + e);
            } finally {
                System.out.println("Outer finally block");
            }
        }
    }

    public static void main(String[] args) {
        new TryTest2();
    }
}
