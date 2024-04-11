package studentdriver;

//imports needed things
import java.util.*;
import java.io.*;

public class StudentDriver {

    //start of main method
    public static void main(String[] args) throws FileNotFoundException {

        //variables created for the averages at the bottom of the program
        int scholarshipCountUG = 0;
        int totalCoursesUG = 0;
        double scholarshipSubtract = 0;

        int graduateAssistantCountGS = 0;
        int totalCoursesGS = 0;

        int totalCoursesOS = 0;
        //creates the array that can store the students (12 students)
        StudentFees[] students = new StudentFees[12];

        //goes throught the file depending on the users inputs and sotres the data from the students
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

        //sets a student index so we can use it as a count variable
        int stuIndex = 0;

        //starts a while loop that will go through the file line by line
        while (inputFile.hasNextLine()) {

            //goes through the line and splits the information by commas
            String line = inputFile.nextLine();
            String[] data = line.split(",");

            //uses this to get the id number for the selection structure below
            String name = data[1];
            int id = Integer.parseInt(data[0]);
            boolean enrolled = Boolean.parseBoolean(data[2]);
            int coursesEnrolled = Integer.parseInt(data[3]);

            //a selection structure that will decide the student based on ID number
            if (id < 200) {

                //this is for the scholarship count
                boolean hasScholarship = Boolean.parseBoolean(data[4]);
                if (hasScholarship) {
                    scholarshipCountUG++;
                }

                //scholarship amount and also adding the students to the array based on the index and information
                double scholarshipAmount = Double.parseDouble(data[5]);
                scholarshipSubtract += scholarshipAmount;
                students[stuIndex] = new UGStudent(name, id, enrolled, hasScholarship, scholarshipAmount, coursesEnrolled);
                totalCoursesUG += coursesEnrolled;
            } else if (id < 300) {

                //also used for the graduate assistant count
                boolean gradAssistantship = Boolean.parseBoolean(data[4]);
                if (gradAssistantship) {
                    graduateAssistantCountGS++;
                }
                //if its more than 5 it will add it with the data from "data[5]" and if not will just add the generic
                if (data.length > 5) {
                    String gradAssistantType = data[5];

                    //adds to the array
                    students[stuIndex] = new GraduateStudent(name, id, enrolled, gradAssistantship, gradAssistantType, coursesEnrolled);
                } else {
                    String gradAssistantType = " ";

                    //adds to the array
                    students[stuIndex] = new GraduateStudent(name, id, enrolled, gradAssistantship, gradAssistantType, coursesEnrolled);

                }
                //uses this for the averages at the end of the program
                totalCoursesGS += coursesEnrolled;

            } else if (id < 400) {

                //this tells us the number of months and information for the online students
                int numOfMonths = Integer.parseInt(data[3]);
                students[stuIndex] = new OnlineStudent(name, id, enrolled, numOfMonths);
            } else {
                System.out.println("File doesn't contain any data.");
            }
            totalCoursesOS += coursesEnrolled;

            //makes the student index add every run through while loop
            stuIndex++;
        }

        //closes the file open
        inputFile.close();

        //an enhanced for loop that runs through the array.
        for (StudentFees student : students) {
            System.out.println(student.toString());
            System.out.println("");
        }

        //calculates the averages based on courses, total hours, money per hour, and number of students
        double averageStudentFeeGS = (((totalCoursesGS * 3) * 543.50)) / 5;
        double averageStudentFeeUG = (((totalCoursesUG * 3) * 543.50) - scholarshipSubtract) / 4;
        double averageStudentFeeOS = ((totalCoursesOS * 3) * 543.50) / 3;

        //prints out the final calculations in the correct format for the program
        System.out.println("**********Undergraduate Students details**********\n Average Students fee:" + averageStudentFeeUG
                + "\nScholarship count: " + scholarshipCountUG + "\nTotal number of courses: " + totalCoursesUG + "\n");

        System.out.println("**********Graduate Students details**********\n" + "Average Students fee: " + averageStudentFeeGS
                + "\nGraduate Assistantship count: " + graduateAssistantCountGS + "\nTotal number of courses: "
                + totalCoursesGS + "\n");

        System.out.println("**********Online Students details**********\n"
                + "Average Students fee: " + averageStudentFeeOS);
    }

}
