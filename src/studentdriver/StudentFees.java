package studentdriver;

public abstract class StudentFees {

    public String studentName;
    public int studentId;
    public boolean isEnrolled;
    int CREDITS_PER_COURSE = 3;
    public double PER_CREDIT_FEE = 543.50;

    public StudentFees(String studentName, int studentId, boolean isEnrolled) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.isEnrolled = isEnrolled;
    }

    public boolean isIsEnrolled() {
        return isEnrolled;
    }

    public int getCREDITS_PER_COURSE() {
        return CREDITS_PER_COURSE;
    }

    public double getPER_CREDIT_FEE() {
        return PER_CREDIT_FEE;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setIsEnrolled(boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
    }

    public abstract double getPayableAmount();

    @Override
    public String toString() {
        return "Student name: " + getStudentName() + "\nStudent id: " + getStudentId();
    }

}
