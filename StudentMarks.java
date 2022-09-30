import java.util.ArrayList;

public class StudentMarks {
    int marksheetId;
    int rollNumber;
    int mathsMarks;
    int physicsMarks;
    int chemistryMarks;
    int englishMarks;
    int hindiMarks;

    public StudentMarks(int marksheetId, int rollNumber, int mathsMarks, int physicsMarks, int chemistryMarks, int englishMarks, int hindiMarks) {
        this.marksheetId = marksheetId;
        this.rollNumber = rollNumber;
        this.mathsMarks = mathsMarks;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.englishMarks = englishMarks;
        this.hindiMarks = hindiMarks;
    }

    public StudentMarks() {

    }

    public static ArrayList<StudentMarks> studentMarksList = new ArrayList<>();

    @Override
    public String toString() {
        return "StudentMarks{" +
                "MarksheetId=" + marksheetId +
                ", RollNumber=" + rollNumber +
                ", MathsMarks=" + mathsMarks +
                ", PhysicsMarks=" + physicsMarks +
                ", ChemistryMarks=" + chemistryMarks +
                ", EnglishMarks=" + englishMarks +
                ", HindiMarks=" + hindiMarks +
                '}';
    }

    public void addStudentMarks() {
        StudentMarks s1 = new StudentMarks();
        StudentMarks studentMarks = new Student().addMarks(s1);
        s1 = studentMarks;
        studentMarksList.add(s1);
    }

    public void show() {
        System.out.println("Following marks details are present .");
        for (StudentMarks studentMarks : studentMarksList) {
            System.out.println(studentMarks);
        }
    }

}
