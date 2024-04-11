package studentdriver;

public class OnlineStudent extends StudentFees {

    //instance variables
    public int noOfMonths;
    public double MONTHLY_FEE = 1245.25;

    //contructor
    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int noOfMonths) {
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
    }

    //calculates the payable amount for the online students
    @Override
    public double getPayableAmount() {
        double totalFee = noOfMonths * MONTHLY_FEE;

        return totalFee;
    }

    //prints it as a string in the correct format
    @Override
    public String toString() {
        return super.toString() + "\nNo of months: " + noOfMonths
                + "\nPayable Amount: " + String.format("%.2f", getPayableAmount());

    }
}
