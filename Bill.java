// Represents a patient's bill
public class Bill {
    private double pharmacyCharges;
    private double roomCharges;
    private double doctorFees;

    // Constructor to initialize bill details
    public Bill(double pharmacyCharges, double roomCharges, double doctorFees) {
        this.pharmacyCharges = pharmacyCharges;
        this.roomCharges = roomCharges;
        this.doctorFees = doctorFees;
    }

    // Calculate total charges
    public double getTotalCharges() {
        return pharmacyCharges + roomCharges + doctorFees;
    }

    // Returns a string representation of the bill
    @Override
    public String toString() {
        return String.format("Pharmacy Charges: $ %.2f\nRoom Charges: $ %.2f\nDoctor's Fees: $ %.2f\nTotal Charges: $ %.2f",
                pharmacyCharges, roomCharges, doctorFees, getTotalCharges());
    }
}
