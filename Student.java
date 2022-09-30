import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private int rollNumber;
    private String name;
    private String division;
    private int age;
    private String address;

    public static ArrayList<Integer> studentArrayList = new ArrayList<>();
    public static HashMap<Integer, Student> studentHashMap = new HashMap<>();

    public Student(int rollNumber, String name, String division, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.division = division;
        this.age = age;
        this.address = address;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", division='" + division + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void addNewStudent() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your roll number : ");
            rollNumber = Integer.parseInt(bufferedReader.readLine());

            try {
                if (studentHashMap.containsKey(rollNumber)) {
                    throw new DuplicateStudentException("Record already present");
                }
            } catch (DuplicateStudentException e) {
                System.out.println("Duplicate student found : ");
            }


            System.out.println("Enter your Name : ");
            name = bufferedReader.readLine();

            System.out.println("Enter your Division : ");
            division = bufferedReader.readLine();

            System.out.println("Enter your age : ");
            age = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Enter your address : ");
            address = bufferedReader.readLine();

            studentHashMap.put(rollNumber, new Student(rollNumber, name, division, age, address));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayStudents() {

        for (Map.Entry<Integer, Student> entry : studentHashMap.entrySet()) {
            System.out.println(entry.getValue());
        }


    }

    public StudentMarks addMarks(StudentMarks marks) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println(" Enter your Marksheet Id : ");
            marks.marksheetId = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Enter your Roll No. : ");
            marks.rollNumber = Integer.parseInt(bufferedReader.readLine());

            try {
                if (!studentHashMap.containsKey(marks.rollNumber)) {
                    throw new StudentNotExistException("Student Not Exists ");
                }

                System.out.println("Enter your Maths Marks : ");
                marks.mathsMarks = Integer.parseInt(bufferedReader.readLine());
                if (marks.mathsMarks > 100 || marks.mathsMarks < 0) {
                    throw new MarksNotInRangeException("Marks should be in range 0 to 100");
                }

                System.out.println("Enter your Physics Marks : ");
                marks.physicsMarks = Integer.parseInt(bufferedReader.readLine());
                if (marks.physicsMarks > 100 || marks.physicsMarks < 0) {
                    throw new MarksNotInRangeException("Marks should be in range 0 to 100");
                }

                System.out.println("Enter your Chemistry Marks : ");
                marks.chemistryMarks = Integer.parseInt(bufferedReader.readLine());
                if (marks.chemistryMarks > 100 || marks.chemistryMarks < 0) {
                    throw new MarksNotInRangeException("Marks should be in range 0 to 100");
                }

                System.out.println("Enter your English Marks : ");
                marks.englishMarks = Integer.parseInt(bufferedReader.readLine());
                if (marks.englishMarks > 100 || marks.englishMarks < 0) {
                    throw new MarksNotInRangeException("Marks should be in range 0 to 100");
                }

                System.out.println("Enter your Hindi Marks : ");
                marks.hindiMarks = Integer.parseInt(bufferedReader.readLine());
                if (marks.hindiMarks > 100 || marks.hindiMarks < 0) {
                    throw new MarksNotInRangeException("Marks should be in range 0 to 100");
                }

            } catch (StudentNotExistException | MarksNotInRangeException e) {
                System.out.println("Exception Occurred .");
            }

            return new StudentMarks(marks.marksheetId, marks.rollNumber, marks.mathsMarks, marks.physicsMarks,
                    marks.chemistryMarks, marks.englishMarks, marks.hindiMarks);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

// rollno, name , address
//select * from student order by name,rollno;