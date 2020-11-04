package jdbc.library;

/**
 *
 * @author Bernd OK
 */
public class BookNotFoundException extends LibraryException {
    public BookNotFoundException() { super(); }
    public BookNotFoundException(String descr) { super(descr); }
}
