package org.mcausc78.craft4j.api.exceptions;

/**
 *
 * Represents process starting exception.
 *
 * @since 1.0.0
 * @author mcausc78
 * @version 1.0.0
 *
 */
public class ProcessStartException extends Exception {

    /**
     *
     * Constructs a ProcessStartException with null as its error detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public ProcessStartException() {
        super();
    }

    /**
     *
     * Constructs a ProcessStartException with the specified detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param message
     *
     */
    public ProcessStartException(String message) {
        super(message);
    }

    /**
     *
     * Constructs a ProcessStartException with the specified detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param exception
     *
     */
    public ProcessStartException(Exception exception) {
        super(exception);
    }
}
