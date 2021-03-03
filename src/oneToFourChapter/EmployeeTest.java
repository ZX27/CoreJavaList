package oneToFourChapter;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 5);
        staff[1] = new Employee("Luke Skywalker", 100000, 1988, 8, 21);
        staff[2] = new Employee("Rachel Green", 12034, 1998, 5, 23);

        for (Employee e : staff) {
            //raise everyone's salary by 5%
            e.raiseSalary(5);
        }

        //print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
        }

    }

    static class Employee {
        private String name;
        private double salary;
        private LocalDate hireDay;

        public Employee(String n, double s, int year, int month, int day) {
            name = n;
            salary = s;
            hireDay = LocalDate.of(year, month, day);
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public LocalDate getHireDay() {
            return hireDay;
        }

        public void raiseSalary(double byPercent) {
            double raise = salary * byPercent / 100;
            salary += raise;
        }
    }
}
