// Represents a date with day, month, and year
public class Date {
    private int day, month, year;

    // Constructor to initialize the date
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Returns a string representation of the date in dd-mm-yyyy format
    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
