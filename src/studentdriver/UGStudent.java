package studentdriver;

public class UGStudent extends StudentFees {

    double scholarshipAmount;
    int coursesEnrolled;
    boolean hasScholarship;
    double ADDITIONAL_FEE = 820.70;

    public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    @Override
    public double getPayableAmount() {
<<<<<<< HEAD
        int coursesEnrolled = getCoursesEnrolled();
        int totalCredits = coursesEnrolled * getCREDITS_PER_COURSE();
        double payableAmount = (totalCredits * getPER_CREDIT_FEE()) - getScholarshipAmount() + ADDITIONAL_FEE;
        if (!isIsEnrolled()) {
            payableAmount = 0.0;
        }
        return payableAmount;
=======
       int coursesEnrolled = getCoursesEnrolled();
       int totalCredits = coursesEnrolled * getCREDITS_PER_COURSE();
       double payableAmount = (totalCredits * getPER_CREDIT_FEE()) - getScholarshipAmount() + ADDITIONAL_FEE;
       if(!isIsEnrolled()) {
           payableAmount = 0.0;
       }
       return payableAmount;
>>>>>>> e71f5801472029e4f710321e1bfe7aa129e1684d
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return super.toString() + "\nEnrolled: " + isIsEnrolled() + "\nScholarship: " + isHasScholarship() + "\nScholarship Amount: "
                + String.format("%.2f", getScholarshipAmount()) + "\nCourses Enrolled: "
                + getCoursesEnrolled() + "\nPayable Amount: " + String.format("%.2f", getPayableAmount());
=======
        return  super.toString() + "\nScholarship: " + isHasScholarship() + "\nScholarship Amount: " + 
                String.format("%.2f", getScholarshipAmount()) + "\nCourses Enrolled: " + 
                getCoursesEnrolled()+ "\nPayable Amount: " + String.format("%.2f", getPayableAmount());
>>>>>>> e71f5801472029e4f710321e1bfe7aa129e1684d
    }

}
