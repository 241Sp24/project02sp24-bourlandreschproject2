
package studentdriver;
import java.util.*;
import java.io.*;
public class StudentDriver {

    
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("input.csv");
        Scanner scanner = new Scanner(inputFile);
        StudentFees[] students = new StudentFees[12];
        

        students[0] = new UGStudent("Bob", 101, true, true, 400, 3);
        students[1] = new UGStudent("Dave", 102, true, false, 0, 2);
        students[2] = new UGStudent("John", 103, false, false, 0, 2);
        students[3] = new UGStudent("Harry", 104, true, true, 800, 4);
        students[4] = new UGStudent("Steve", 105, true, false, 0, 3);
        students[5] = new GraduateStudent("Gary", 201, true, true, "full", 3);
        students[6] = new GraduateStudent("Brock", 202, true, false, 4);
        students[7] = new GraduateStudent("Drake", 203, true, true, "half", 3);
        students[8] = new GraduateStudent("Colin", 204, true, true, "half", 3);
        students[9] = new OnlineStudent("Victor", 301, true, 6);
        students[10] = new OnlineStudent("Annie", 302, true, 5);
        students[11] = new OnlineStudent("Mary", 303, true, 8);
        
        
        for(StudentFees student: students) {
            System.out.println(student.toString());
            System.out.println("");
        }
    }

}
