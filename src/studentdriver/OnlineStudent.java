package studentdriver;

public class OnlineStudent extends StudentFees {

    public int noOfMonths;
    public double MONTHLY_FEE = 1245.25;

    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int noOfMonths) {
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
    }

    public double getPayableAmount() {
        double totalFee = noOfMonths * MONTHLY_FEE;

        return totalFee;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNo of months: " + noOfMonths
                + "\nPayableAmount:" + getPayableAmount();
    }
}
