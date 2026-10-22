package day01.classesandobjects;
/*Class:  Class is a blueprint or template that defines state and behavior
then objects of that class can have.
 */

public class Customer {
    private final String name;
    private final String email;
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("Customer created! with name " + name + " and email " + email);
    }
}
