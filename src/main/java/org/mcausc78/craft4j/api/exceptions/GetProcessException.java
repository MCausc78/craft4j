package org.mcausc78.craft4j.api.exceptions;

/**
 *
 * Represents get process instance exception.
 *
 * @since 1.0.0
 * @author mcausc78
 * @version 1.0.0
 *
 */
public class GetProcessException extends Exception {

    /**
     *
     * Constructs a GetProcessException with null as its error detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public GetProcessException() {
        super();
    }

    /**
     *
     * Constructs a GetProcessException with the specified detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param message
     *
     */
    public GetProcessException(String message) {
        super(message);
    }

    /**
     *
     * Constructs a GetProcessException with the specified detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param exception
     *
     */
    public GetProcessException(Exception exception) {
        super(exception);
    }
}
