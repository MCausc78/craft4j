package org.mcausc78.craft4j.api.exceptions;

/**
 *
 * Represents a file deletion exception.
 *
 * @since 1.0.0
 * @author mcausc78
 * @version 1.0.0
 *
 */
public class FileCreateException extends Exception {

    /**
     *
     * Constructs a FileCreateException with null as its error detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public FileCreateException() {
        super();
    }

    /**
     *
     * Constructs a FileCreateException with the specified detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param message
     *
     */
    public FileCreateException(String message) {
        super(message);
    }

    /**
     *
     * Constructs a FileCreateException with the specified detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param exception
     *
     */
    public FileCreateException(Exception exception) {
        super(exception);
    }
}
