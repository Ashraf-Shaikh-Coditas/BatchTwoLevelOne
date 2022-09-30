public class DuplicateStudentException extends RuntimeException {
    public DuplicateStudentException() {

    }

    public DuplicateStudentException(String message) {
        System.err.println("Student already present");
    }

}
