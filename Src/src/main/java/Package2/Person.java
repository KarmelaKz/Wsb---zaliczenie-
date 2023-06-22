package Package2;
/**
 * Represents a person data
 */
public class Person {
    public static String name;
    public static int age;
    public static String gender;
    /**
     Constructs a mailing address.
     @param name the recipient name
     @param age the age
     @param gender the gender
     */
    public Person(String name, int age, String gender) {
        Person.name =name;
        Person.age =age;
        Person.gender =gender;
    }
    /**
     * Returns a string representation of the person.
     *
     * @return a string representation of the person
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    /**
     * Prints the information about the person.
     */
    public static void Info(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}