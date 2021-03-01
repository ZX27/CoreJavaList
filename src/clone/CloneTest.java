package clone;

import javax.xml.transform.sax.SAXTransformerFactory;

/**
 * This program demonstrates cloning
 *
 * @author ZX27
 */

public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("Chandler Bing", 10000);
            original.setHireDay(1999, 12, 13);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2000, 10, 12);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
