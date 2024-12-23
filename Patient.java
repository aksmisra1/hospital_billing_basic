// Subclass of Person, representing a patient
public class Patient extends Person {
    private String patientID;
    private Date dateOfBirth; // Unused in this context but part of patient details
    private Doctor attendingPhysician;
    private Date admitDate;
    private Date dischargeDate;
    private Bill bill;

    // Constructor to initialize patient details
    public Patient(String patientID, String firstName, String lastName, Date dateOfBirth, Doctor attendingPhysician,
                   Date admitDate, Date dischargeDate, Bill bill) {
        super(firstName, lastName); // Call to the superclass constructor
        this.patientID = patientID;
        this.dateOfBirth = dateOfBirth;
        this.attendingPhysician = attendingPhysician;
        this.admitDate = admitDate;
        this.dischargeDate = dischargeDate;
        this.bill = bill;
    }

    // Returns a string representation of the patient and their details
    @Override
    public String toString() {
        return String.format("Patient: %s\nID: %s\nAttending Physician: %s\nAdmit Date: %s\nDischarge Date: %s\n%s",
                super.toString(), patientID, attendingPhysician, admitDate, dischargeDate, bill);
    }

    // Generates the filename based on the patient's name
    public String getFileName() {
        return getFirstName() + getLastName() + ".txt";
    }
}
