import java.util.Random;

/*
    第四章第五节讨论特性：

    重载（overload）构造器
    用this(...)调用另一个构造器
    无参数构造器
    对象初始化块
    静态初始化块
    实例域初始化
*/
public class ConstructorTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Joey", 30000);
        staff[1] = new Employee(40000);
        staff[2] = new Employee();

        for (Employee e : staff)
        {
            System.out.println("name=" + e.getName() + ", id=" + e.getId() + " , salary=" + e.getSalary());
        }

    }

    static class Employee
    {
        private static int nextId;

        private int id;
        private String name = "";
        private double salary;

        //static initialization block
        static
        {
            Random generater = new Random();

            nextId = generater.nextInt(10000);
        }

        {
            id = nextId;
            nextId++;
        }

        public Employee(String n, double s)
        {
            name = n;
            salary = s;
        }

        public Employee(double s)
        {
            this("Employee #" + nextId, s);
        }

        public Employee()
        {

        }

        public double getSalary()
        {
            return salary;
        }

        public String getName()
        {
            return name;
        }

        public int getId()
        {
            return id;
        }
    }
}
