package studentdriver;

public class GraduateStudent extends StudentFees {
    int coursesEnrolled;
    boolean isGraduateAssistant = true;
    String graduateAssistantType;
    double ADDITIONAL_FEES = 654.45;
    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, 
            boolean isGraduateStudent, String graduateAssistantType, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateStudent;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, 
            boolean isGraduateAssistant, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    public boolean isIsGraduateAssistant() {
        if(!isGraduateAssistant) {
            graduateAssistantType = " ";
        }
        return isGraduateAssistant;
    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }
    @Override
    public double getPayableAmount() {
        int coursesEnrolled = getCoursesEnrolled();
        int totalCredits = coursesEnrolled * getCREDITS_PER_COURSE();
        double payableAmount = (totalCredits * getPER_CREDIT_FEE());
        
        if(graduateAssistantType.equals("full")) {
            payableAmount = 0.0;
        }
        else if(graduateAssistantType.equals("half")) {
            payableAmount /= 2;
        }
        payableAmount += ADDITIONAL_FEES;
        return payableAmount;
    }
    @Override
    public String toString() {
        return super.toString() + "\nGraduate assistant: " + isIsGraduateAssistant() + 
                "\nGraduate assistant type: "+ graduateAssistantType + 
                "\nCourses enrolled: " + getCoursesEnrolled() + "\nPayable amount: " + String.format("%.2f", getPayableAmount());
    }

}

