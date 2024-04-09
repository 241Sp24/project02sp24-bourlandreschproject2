package studentdriver;

public class StudentDriver {

<<<<<<< HEAD
    
    public static void main(String[] args) throws FileNotFoundException {
        StudentFees[] students = new StudentFees[12];
        int stuIndex = 0;
        
        File file = new File("input.csv");
        Scanner inputFile = new Scanner(file);
        Scanner userInput = new Scanner(System.in);

        while(inputFile.hasNextLine()) {
            String line = inputFile.nextLine();
            String[] data = line.split(",");


            String name = data[1];
            int id = Integer.parseInt(data[0]);
            boolean enrolled = Boolean.parseBoolean(data[2]);
            int coursesEnrolled = Integer.parseInt(data[3]);

            if(id < 200) {
                boolean hasScholarship = Boolean.parseBoolean(data[4]);
                double scholarshipAmount = Double.parseDouble(data[5]);
                students[stuIndex] = new UGStudent(name, id, enrolled, hasScholarship, scholarshipAmount, coursesEnrolled);
            }
            else if(id < 300) {
                boolean gradAssistantship = Boolean.parseBoolean(data[4]);
                if(data.length > 5) {
                    String gradAssistantType = data[5];
                    students[stuIndex] = new GraduateStudent(name, id, enrolled, gradAssistantship, gradAssistantType, coursesEnrolled);
                }
                else {
                    String gradAssistantType = " ";
                    students[stuIndex] = new GraduateStudent(name, id, enrolled, gradAssistantship, gradAssistantType, coursesEnrolled);
                }
                    
            }
            else if(id < 400) {
                int numOfMonths = Integer.parseInt(data[3]);
                students[stuIndex] = new OnlineStudent(name, id, enrolled, numOfMonths);
            }
            else {
                System.out.println("File doesn't contain any data.");
            }
            stuIndex++;
=======
    public static void main(String[] args) {

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
>>>>>>> fd21ba0485fc503ad5714f72b507a6d3d47b1aab
        }
            
            inputFile.close();

            for(StudentFees student: students) {
                System.out.println(student.toString());
                System.out.println("");
            }
        }
        
    }

