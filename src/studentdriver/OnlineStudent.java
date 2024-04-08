package studentdriver;

public class OnlineStudent extends StudentFees {

<<<<<<< HEAD
    public int noOfMonths;
    public double MONTHLY_FEE = 1245.25;

=======
public class OnlineStudent extends StudentFees {
    public int noOfMonths;
    public double MONTHLY_FEE = 1245.25;
>>>>>>> e71f5801472029e4f710321e1bfe7aa129e1684d
    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int noOfMonths) {
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
    }
<<<<<<< HEAD

    public double getPayableAmount() {
        double totalFee = noOfMonths * MONTHLY_FEE;

        return totalFee;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNo of months: " + noOfMonths
                + "\nPayableAmount:" + getPayableAmount();
=======
    @Override
    public double getPayableAmount() {
        double totalFee = noOfMonths * MONTHLY_FEE;
        
        return totalFee;
    }
    @Override
    public String toString() {
        return super.toString() + "\nNo of months: " + noOfMonths + 
                "\nPayable Amount: " + getPayableAmount();
>>>>>>> e71f5801472029e4f710321e1bfe7aa129e1684d
    }
}
