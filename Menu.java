import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true ;

        while(flag) {
            System.out.println("\n0) Exit" +
                    "\n1) Add a Student" +
                    "\n2) Display Students" +
                    "\n3)Add Student Marks" +
                    "\n4)Display Student Result" +
                    "\nPlease Enter your Choice : ");

            int choice ;
            try {
                 choice = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            switch (choice) {
                case 0 :
                    flag = false;
                    break;
                case 1 :
                    new Student().addNewStudent();
                    break;
                case 2 :
                    new Student().displayStudents();
                    break;
                case 3 :
                    StudentMarks studentMarks = new StudentMarks();
//                    new Student().addMarks(studentMarks);
                    studentMarks.addStudentMarks();
                    break;
                case 4 :
                    new StudentMarks().show();
                    break;

            }
        }
    }
}
