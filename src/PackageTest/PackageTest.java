package PackageTest;

import com.sun.xml.internal.messaging.saaj.util.CharReader;
import com.horstmann.corejava.Employee;
import static java.lang.System.*;

public class PackageTest
{
    public static void main(String[] args)
    {
        //because of the import statement, we don't have to use
        //com.horstmann.corejava.Employee here
        Employee Chandler = new Employee("Chandler", 20000, 1999, 10, 1);

        Chandler.raiseSalary(5);

        //because of the static import statement, we don't have to use System.out here
        out.println("name=" + Chandler.getName() + ", salary=" + Chandler.getSalary());
    }
}
