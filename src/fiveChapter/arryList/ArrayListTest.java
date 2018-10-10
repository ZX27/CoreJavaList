package fiveChapter.arryList;

import java.time.LocalDate;
import java.util.*;

/**This program demonstrates the ArrayList class
 * @author ZX27
 */

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Chandler Bing", 80000, 1999, 12, 21));
        staff.add(new Employee("Rachel Green", 50000, 1998, 2, 3));
        staff.add(new Employee("Ross Geller", 30000, 1997, 10, 12));

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() +  ", hireday=" + e.getHireDay());
    }
}

class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
