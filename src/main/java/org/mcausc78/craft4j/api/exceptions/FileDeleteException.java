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
public class FileDeleteException extends Exception {

    /**
     *
     * Constructs a FileDeleteException with null as its error detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public FileDeleteException() {
        super();
    }

    /**
     *
     * Constructs a FileDeleteException with the specified detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param message
     *
     */
    public FileDeleteException(String message) {
        super(message);
    }

    /**
     *
     * Constructs a FileDeleteException with the specified detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param exception
     *
     */
    public FileDeleteException(Exception exception) {
        super(exception);
    }
}
