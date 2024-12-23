// Subclass of Person, representing a doctor
public class Doctor extends Person {
    private String specialty;

    // Constructor to initialize doctor's details
    public Doctor(String firstName, String lastName, String specialty) {
        super(firstName, lastName); // Call to the superclass constructor
        this.specialty = specialty;
    }

    // Getter for doctor's specialty
    public String getSpecialty() {
        return specialty;
    }

    // Returns a string representation of the doctor
    @Override
    public String toString() {
        return super.toString() + " " + specialty;
    }
}
