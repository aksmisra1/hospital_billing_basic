import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Main class to test the hospital system
public class TestHospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect patient details
        System.out.print("Enter patient's ID: ");
        String patientID = scanner.nextLine();

        System.out.print("Enter patient's first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter patient's last name: ");
        String lastName = scanner.nextLine();

        // Collect doctor's details
        System.out.print("Enter doctor's first name: ");
        String doctorFirstName = scanner.nextLine();

        System.out.print("Enter doctor's last name: ");
        String doctorLastName = scanner.nextLine();

        System.out.print("Enter doctor's specialty: ");
        String specialty = scanner.nextLine();

        // Collect admit and discharge dates
        System.out.print("Enter Admit Date (day/month/year): ");
        int admitDay = scanner.nextInt();
        int admitMonth = scanner.nextInt();
        int admitYear = scanner.nextInt();
        Date admitDate = new Date(admitDay, admitMonth, admitYear);

        System.out.print("Enter Discharged Date (day/month/year): ");
        int dischargeDay = scanner.nextInt();
        int dischargeMonth = scanner.nextInt();
        int dischargeYear = scanner.nextInt();
        Date dischargeDate = new Date(dischargeDay, dischargeMonth, dischargeYear);

        // Collect billing details
        System.out.print("Enter pharmacy charges, room rent, and doctor fees: ");
        double pharmacyCharges = scanner.nextDouble();
        double roomCharges = scanner.nextDouble();
        double doctorFees = scanner.nextDouble();
        Bill bill = new Bill(pharmacyCharges, roomCharges, doctorFees);

        // Create doctor and patient objects
        Doctor doctor = new Doctor(doctorFirstName, doctorLastName, specialty);
        Patient patient = new Patient(patientID, firstName, lastName, null, doctor, admitDate, dischargeDate, bill);

        // Display patient details
        System.out.println("\n" + patient);

        // Save patient details to a file
        try (FileWriter writer = new FileWriter(patient.getFileName())) {
            writer.write(patient.toString());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}
