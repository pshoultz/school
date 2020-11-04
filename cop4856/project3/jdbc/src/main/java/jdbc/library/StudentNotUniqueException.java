package jdbc.library;

/**
 *
 * @author Bernd OK
 */
public class StudentNotUniqueException extends LibraryException {
    public StudentNotUniqueException() { super(); }
    public StudentNotUniqueException(String descr) { super(descr); }
}