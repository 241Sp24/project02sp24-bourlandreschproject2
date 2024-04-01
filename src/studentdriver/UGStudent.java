/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S559828
 */
public class UGStudent extends StudentDriver {
    double scholarshipAmount;
    int coursesEnrolled;
    boolean hasScholarship;
    double ADDITIONAL_FEE = 820.70;
    
    //Jr is a poopy butthole
        public StudentFees(String studentName, int studentId, boolean isEnrolled, boolean hasScholarship, double ScholarshipAmount, int coursesEnrolled) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.isEnrolled = isEnrolled;
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled;
        this.hasScholarship = hasScholarship;
        }
}
