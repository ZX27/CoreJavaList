package equals;

/**This program demonstrates the equals method.
 * @author ZX27
 */

public class EqualsTest
{
    public static void main(String[] args)
    {
        Employee chandler1 = new Employee("Chandler Bing", 50000, 1999, 12, 21);
        Employee chandler2 = chandler1;
        Employee chandler3 = new Employee("Chandler Bing", 50000, 1999, 12, 21);
        Employee ross = new Employee("Ross Geller", 40000, 1998, 10, 20);

        System.out.println("chandler1 == chandler2: " + (chandler1 == chandler2));
        System.out.println("chandler1 == chandler3: " + (chandler1 == chandler3)); //不指向同一个对象，返回false
        System.out.println("chandler1.equals(chandler3): " + chandler1.equals(chandler3));//值相等，equals返回true
        System.out.println("chandler1.equals(ross): " + chandler1.equals(ross));
        System.out.println("ross.toString(): " + ross);

        Manager monica = new Manager("Monica Geller", 80000, 1998, 5, 18);
        Manager boss = new Manager("Monica Geller", 80000, 1998, 5, 18);
        boss.setBonus(5000);

        System.out.println("boss.toString(): " + boss);
        System.out.println("monica.equals(boss): " + monica.equals(boss));//boss对象的bonus值为5000，和monica不同，返回false
        System.out.println("chandler1.hashCode(): " + chandler1.hashCode());
        System.out.println("chandler3.hashCode(): " + chandler3.hashCode());
        System.out.println("ross.hashCode(): " + ross.hashCode());
        System.out.println("monica.hashCode(): " + monica.hashCode());
        System.out.println("boss.hashCode(): " + boss.hashCode());
    }
}
