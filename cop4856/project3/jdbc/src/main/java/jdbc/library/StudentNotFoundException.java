package jdbc.library;
/**
 *
 * @author Bernd OK
 */
public class StudentNotFoundException extends LibraryException {
    public StudentNotFoundException() { super(); }
    public StudentNotFoundException(String descr) { super(descr); }
}
