package abstractClasses;

/**
 * This program demonstrate classes
 * @author by ZX27
 */
public class PersonTest
{
    public static void main(String[] args)
    {
        //抽象超类，这里是数组元素，但是不能new出实体的对象，只能让继承的子类实体化
        Person[] people = new Person[2];
        people[0] = new Employee("Chandler Bing", 40000, 1999, 12, 13);
        people[1] = new Student("Ross Geller", "Paleontology");

        for (Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());
    }
}
