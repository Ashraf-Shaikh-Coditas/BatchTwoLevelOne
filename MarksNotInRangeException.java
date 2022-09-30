public class MarksNotInRangeException extends RuntimeException {
    public MarksNotInRangeException() {

    }

    public MarksNotInRangeException(String message) {
        System.err.println("Marks Not in Range : ");
    }
}
