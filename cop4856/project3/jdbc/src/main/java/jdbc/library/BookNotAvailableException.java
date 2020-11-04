package jdbc.library;

/**
 *
 * @author Bernd OK
 */
public class BookNotAvailableException extends LibraryException {
    public BookNotAvailableException() { super(); }
    public BookNotAvailableException(String descr) { super(descr); }
}