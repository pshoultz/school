package jdbc.library;

/**
 *
 * @author Bernd OK
 */
public class BookNotUniqueException extends LibraryException {
    public BookNotUniqueException() { super(); }
    public BookNotUniqueException(String descr) { super(descr); }
}