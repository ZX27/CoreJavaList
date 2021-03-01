package tryTest;

public class TryTest1 {
    public TryTest1() {
        try {
            int a[] = new int[2];
            a[4] = 3;
            System.out.println("在异常处理后，会返回到这里吗？");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Exception string: " + e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("--------------");
            System.out.println("FINALLY");
        }
        System.out.println("No exception?");
    }

    public static void main(String[] args) {
        new TryTest1();
    }
}
