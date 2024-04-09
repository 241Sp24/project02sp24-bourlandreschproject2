package studentdriver;

import java.util.*;
import java.io.*;

public class StudentDriver {

    public static void main(String[] args) throws FileNotFoundException {
        StudentFees[] students = new StudentFees[12];

        File file = new File("input.csv");
        Scanner inputFile = new Scanner(file);
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the no of UG students: ");
        int noOfStudents = userInput.nextInt();
        System.out.print("Enter the no of Graduate students: ");
        int noOfGradStudents = userInput.nextInt();
        System.out.print("Enter the no of online students: ");
        int noOfOnlineStudents = userInput.nextInt();
        System.out.println("");
        int stuIndex = 0;
        while (inputFile.hasNextLine()) {

            String line = inputFile.nextLine();
            String[] data = line.split(",");

            String name = data[1];
            int id = Integer.parseInt(data[0]);
            boolean enrolled = Boolean.parseBoolean(data[2]);
            int coursesEnrolled = Integer.parseInt(data[3]);
            if (id < 200) {

                boolean hasScholarship = Boolean.parseBoolean(data[4]);
                double scholarshipAmount = Double.parseDouble(data[5]);
                students[stuIndex] = new UGStudent(name, id, enrolled, hasScholarship, scholarshipAmount, coursesEnrolled);

            } else if (id < 300) {

                boolean gradAssistantship = Boolean.parseBoolean(data[4]);

                if (data.length > 5) {
                    String gradAssistantType = data[5];
                    students[stuIndex] = new GraduateStudent(name, id, enrolled, gradAssistantship, gradAssistantType, coursesEnrolled);
                } else {
                    String gradAssistantType = " ";
                    students[stuIndex] = new GraduateStudent(name, id, enrolled, gradAssistantship, gradAssistantType, coursesEnrolled);

                }

            } else if (id < 400) {
                int numOfMonths = Integer.parseInt(data[3]);
                students[stuIndex] = new OnlineStudent(name, id, enrolled, numOfMonths);
            } else {
                System.out.println("File doesn't contain any data.");
            }

            stuIndex++;
        }
        inputFile.close();

        for (StudentFees student : students) {
            System.out.println(student.toString());
            System.out.println("");
        }
        double scholarshipCountUG = 0;
        double averageStudentFeeUG = 0;
        int totalCoursesUG = 0;

        int graduateAssistantCountGS = 0;
        int totalCoursesGS = 0;
        double averageStudentFeeGS = 0;

        double averageStudentFeeOS = 0;

        System.out.println("**********Undergraduate Students details**********\n Average Students fee:" + averageStudentFeeUG
                + "Scholarship count: " + scholarshipCountUG + "\nTotal number of courses: " + totalCoursesUG + "\n");

        System.out.println("**********Graduate Students details**********\n" + "Average Students fee: " + averageStudentFeeGS
                + "\nGraduate Assistantship count: " + graduateAssistantCountGS + "\nTotal number of courses: "
                + totalCoursesGS + "\n");

        System.out.println("**********Online Students details**********\n"
                + "Average Students fee: " + averageStudentFeeOS);
    }

}
