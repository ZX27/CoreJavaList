package oneToFourChapter;

public class ParamTest {
    public static void main(String[] args) {
        /*Test1:方法无法修改基本参数变量*/
        System.out.println("Testing tripleValue");
        double percent = 10;
        System.out.println("Beforce: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /*Test2:方法可以改变对象参数的状态*/
        System.out.println("\nTesting tripleSalary:");
        Employee Luke = new Employee("Luke", 50000);
        System.out.println("Before: salary=" + Luke.getSalary());
        tripleSalary(Luke);
        System.out.println("After: salary=" + Luke.getSalary());

        /*Test3:方法无法将新对象附加到对象参数*/
        System.out.println("\nTesting swap");
        Employee a = new Employee("Chandler", 50000);
        Employee b = new Employee("Monica", 30000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());

    }

    public static void tripleValue(double x) {
        x = 3 * x;
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method : salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method : x=" + x.getName());
        System.out.println("End of method : y=" + y.getName());
    }

    static class Employee {
        private String name;
        private double salary;

        public Employee(String n, double s) {
            this.name = n;
            this.salary = s;
        }

        public String getName() {
            return this.name;
        }

        public double getSalary() {
            return this.salary;
        }

        public void raiseSalary(double byPercent) {
            double raise = this.salary * byPercent / 100;
            this.salary += raise;
        }
    }
}
