package org.mcausc78.craft4j.api.object;

/**
 * Represents a Java Object.
 *
 * @since 1.0.0
 * @author mcausc78
 * @version 1.0.0
 *
 */
public class JObject<T> {
    T value;
    JObject parent;

    /**
     * Constructs a new Java Object.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public JObject() {
        this.value = null;
        this.parent = null;
    }
    /**
     * Constructs a new Java Object with the given value.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param value
     *
     */
    public JObject(T value) {
        this.value = value;
        this.parent = null;
    }

    /**
     * Constructs a new Java Object with the given value and parent.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param value
     * @param parent
     *
     */
    public JObject(T value, JObject parent) {
        this.value = value;
        this.parent = parent;
    }
    /**
     * Gets the value.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @return the value
     *
     */
    public T getValue() {
        return this.value;
    }
    /**
     * Gets the parent.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @return the parent
     *
     */
    public JObject getParent() {
        return this.parent;
    }

    /**
     * Sets the value.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param value
     *
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Sets the parent.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param parent
     *
     */
    public void setParent(JObject parent) {
        this.parent = parent;
    }
}
