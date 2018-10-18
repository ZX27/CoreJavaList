package interfaces;

import java.util.Arrays;

/**
 * This program demonstrates the use of the Comparable interface
 * @author ZX27
 */
public class EmployeeSortTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Ross Geller", 75000);
        staff[1] = new Employee("Chandler Bing", 100000);
        staff[2] = new Employee("Rachel Green", 80000);

        Arrays.sort(staff);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ", salary" + e.getSalary());

    }
}
