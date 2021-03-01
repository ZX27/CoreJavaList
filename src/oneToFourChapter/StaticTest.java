package oneToFourChapter;

import java.time.LocalDate;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000);
        staff[1] = new Employee("Luke Skywalker", 100000);
        staff[2] = new Employee("Rachel Green", 12034);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + "id=" + e.getId() + "salary=" + e.getSalary());
        }

        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);


    }
}

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        //hireDay = LocalDate.of(year, month, day);
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    //
//    public LocalDate getHireDay()
//    {
//        return hireDay;
//    }
//
    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

//    public void raiseSalary(double byPercent)
//    {
//        double raise = salary * byPercent / 100;
//        salary += raise;
//    }

    public static void main(String[] args)  //单元测试（一个类只能有一个main方法）
    {
        Employee e = new Employee("Luke Skywalker", 2000000);
        System.out.println(e.getName() + "" + e.getSalary());
    }
}
