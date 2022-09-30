public class StudentNotExistException extends RuntimeException {
    public StudentNotExistException() {

    }

    public StudentNotExistException(String message) {
        System.err.println("Student Not Found ::" + message);
    }
}
