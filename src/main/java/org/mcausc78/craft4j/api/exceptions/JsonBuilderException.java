package org.mcausc78.craft4j.api.exceptions;

/**
 *
 * Represents json building exception.
 *
 * @since 1.0.0
 * @author mcausc78
 * @version 1.0.0
 *
 */
public class JsonBuilderException extends Exception {

    /**
     *
     * Constructs a JsonBuilderException with null as its error detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public JsonBuilderException() {
        super();
    }

    /**
     *
     * Constructs a JsonBuilderException with the specified detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param message
     *
     */
    public JsonBuilderException(String message) {
        super(message);
    }

    /**
     *
     * Constructs a JsonBuilderException with the specified detail message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param exception
     *
     */
    public JsonBuilderException(Exception exception) {
        super(exception);
    }
}
