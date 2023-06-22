package Package1;
/**
 * Represents a person data specifically adress
 */
public class Adress {
    public static String city;
    public static String street;
    public static int number;

    /**
     Constructs a mailing address.

     @param street the recipient street
     @param city the city
     @param number the recipient number
     */
    public Adress (String city, String street, int number){
        Adress.city =city;
        Adress.street =street;
        Adress.number =number;
    }
    /**
     * Returns a string representation of the address.
     *
     * @return a string representation of the address
     */
    @Override
    public String toString() {
        return "Adress{" +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                "number='" + number + '\'' +
                '}';
    }
    /**
     * Prints the information about the address.
     */
    public static void Info(){
        System.out.println("City: " + city);
        System.out.println("Street: " + street);
        System.out.println("Number: " + number);
    }
}