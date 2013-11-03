package airiva.graphics.color;

/**
 *
 * @author benji
 */
public class InvalidColorFormatException extends Exception {

    /**
     * Creates a new instance of <code>InvalidColorFormatException</code>
     * without detail message.
     */
    public InvalidColorFormatException() {
    }

    /**
     * Constructs an instance of <code>InvalidColorFormatException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidColorFormatException(String msg) {
        super(msg);
    }
}
