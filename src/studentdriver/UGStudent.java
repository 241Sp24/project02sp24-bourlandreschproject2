
package studentdriver;


public class UGStudent extends StudentFees {
    double scholarshipAmount;
    int coursesEnrolled;
    boolean hasScholarship;
    double ADDITIONAL_FEE = 820.70;
    
    public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled)
    {
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
       int coursesEnrolled = getCoursesEnrolled();
       int totalCredits = coursesEnrolled * getCREDITS_PER_COURSE();
       double payableAmount = (totalCredits * getPER_CREDIT_FEE()) - getScholarshipAmount() + ADDITIONAL_FEE;
       
       return payableAmount;
    }
    @Override
    public String toString() {
        return  super.toString() + "\nEnrolled: " + isIsEnrolled() + "\nScholarship: " + isHasScholarship() + "\nScholarship Amount: " + 
                getScholarshipAmount() + "\nCourses Enrolled: " + 
                getCoursesEnrolled()+ "\nPayable Amount: " + getPayableAmount();
    }
        
}
