package inheritance;

/**
 * This programme demonstrates inheritance
 * @author ZX27
 */
public class ManagerTest
{
    public static void main(String[] args)
    {
        //construct a Manager Object
        Manager boss = new Manager("Chandler", 80000, 1998, 12, 23);
        boss.setBonus(10000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Monica", 30000, 1997, 10, 20);
        staff[2] = new Employee("Joey", 40000, 1999, 3, 11);

        for (Employee e : staff)
        {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }
}
