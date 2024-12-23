// Base class for common attributes of a person
public class Person {
    private String firstName;
    private String lastName;

    // Constructor to initialize the person's name
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Returns the person's full name as a string
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
