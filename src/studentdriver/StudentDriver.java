/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdriver;

public class StudentDriver {

    public static void main(String[] args) {

        System.out.println("Project02");
        StudentFees[] students = new StudentFees[12];
        students[0] = new UGStudent("Bob", 101, true, true, 400, 3);
        students[1] = new UGStudent("Dave", 102, true, false, 0, 2);
        students[2] = new UGStudent("John", 103, false, false, 0, 2);
        students[3] = new UGStudent("Harry", 104, true, true, 800, 4);
        students[4] = new UGStudent("Steve", 105, true, false, 0, 3);
        students[5] = new UGStudent("Bob", 101, true, true, 400, 3);
        students[6] = new UGStudent("Dave", 102, true, false, 0, 2);
        students[7] = new UGStudent("John", 103, false, false, 0, 2);
        students[8] = new UGStudent("Harry", 104, true, true, 800, 4);
        students[9] = new UGStudent("Steve", 105, true, false, 0, 3);
        students[10] = new UGStudent("John", 103, false, false, 0, 2);
        students[11] = new UGStudent("Harry", 104, true, true, 800, 4);

        for (StudentFees student : students) {
            System.out.println(student.toString());
            System.out.println("");
        }
    }

}
