package studentdriver;

public class UGStudent extends StudentFees {

    //instance variables for the class
    double scholarshipAmount;
    int coursesEnrolled;
    boolean hasScholarship;
    double ADDITIONAL_FEE = 820.70;

    //the constructor for UGStudent
    public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled;
    }
//getters

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    //method to calculate the payable amounts
    @Override
    public double getPayableAmount() {

        int coursesEnrolled = getCoursesEnrolled();
        int totalCredits = coursesEnrolled * getCREDITS_PER_COURSE();
        double payableAmount = (totalCredits * getPER_CREDIT_FEE()) - getScholarshipAmount() + ADDITIONAL_FEE;
        if (!isIsEnrolled()) {
            payableAmount = 0.0;
        }
        return payableAmount;

    }

    //the toString methods to print out
    @Override
    public String toString() {

        return super.toString() + "\nScholarship: " + isHasScholarship() + "\nScholarship Amount: "
                + String.format("%.2f", getScholarshipAmount()) + "\nCourses Enrolled: "
                + getCoursesEnrolled() + "\nPayable Amount: " + String.format("%.2f", getPayableAmount());
    }

}
