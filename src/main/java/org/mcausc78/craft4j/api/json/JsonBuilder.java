package org.mcausc78.craft4j.api.json;

import org.mcausc78.craft4j.api.util.ArraysUtil;

/**
 *
 * Represents a JSON builder.
 *
 * @since 1.0.0
 * @author mcausc78
 * @version 1.0.0
 *
 */
public class JsonBuilder {

    /**
     *
     * A string builder that used to build JSON.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    private StringBuilder sb;

    /**
     *
     * Constructs a JSON builder with no fields in it.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public JsonBuilder() {
        this.sb = new StringBuilder();
        this.sb.append("{");
    }
    /**
     * Constructs a JSON builder with no fields in it and your own string builder.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param sb string builder that used to build JSON
     *
     */
    private JsonBuilder(StringBuilder sb) {
        this.sb = sb;
    }

    /**
     *
     * Appends the string representation of the {@link java.lang.String string} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param value a value
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, String value) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":\""+value+"\"");
        else this.sb.append(",\""+key+"\":\""+value+"\"");
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Byte byte} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param value a value
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, byte value) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+value);
        else this.sb.append(",\""+key+"\":"+value);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Short short} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param value a value
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, short value) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+value);
        else this.sb.append(",\""+key+"\":"+value);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Integer int} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param value a value
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, int value) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+value);
        else this.sb.append(",\""+key+"\":"+value);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Long long} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param value a value
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, long value) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+value);
        else this.sb.append(",\""+key+"\":"+value);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Float float} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param keya key field
     * @param value a value
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, float value) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+value);
        else this.sb.append(",\""+key+"\":"+value);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Boolean boolean} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param value a value
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, boolean value) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+value);
        else this.sb.append(",\""+key+"\":"+value);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Character char} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param value a value
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, char value) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":'"+value+"'");
        else this.sb.append(",\""+key+"\":'"+value+"'");
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link org.mcausc78.craft4j.api.json.JsonBuilder dict} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param value a value
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, JsonBuilder value) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+value.build());
        else this.sb.append(",\""+key+"\":"+value.build());
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.String string array} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param values a values
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, String[] values) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":\"["+ArraysUtil.joinToQuotes(values)+"]");
        else this.sb.append(",\""+key+"\":\"["+ArraysUtil.joinToQuotes(values)+"]");
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Byte bytes array} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param values a values
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, byte[] values) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+ArraysUtil.numArrayToString(values));
        else this.sb.append(",\""+key+"\":"+values);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Short short array} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param values a values
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, short[] values) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+ArraysUtil.numArrayToString(values));
        else this.sb.append(",\""+key+"\":"+values);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Integer int array} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param values a values
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, int[] values) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+ArraysUtil.numArrayToString(values));
        else this.sb.append(",\""+key+"\":"+values);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Long long array} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param values a values
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, long[] values) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+ArraysUtil.numArrayToString(values));
        else this.sb.append(",\""+key+"\":"+values);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Float float array} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param values a values
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, float[] values) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+ArraysUtil.numArrayToString(values));
        else this.sb.append(",\""+key+"\":"+values);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Boolean boolean array} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param values a values
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, boolean[] values) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":"+ArraysUtil.boolArrayToString(values));
        else this.sb.append(",\""+key+"\":"+values);
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link java.lang.Character char array} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param values a values
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, char[] values) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":\"["+ArraysUtil.joinToQuotes(values)+"]");
        else this.sb.append(",\""+key+"\":\"["+ArraysUtil.joinToQuotes(values)+"]");
        return new JsonBuilder(this.sb);
    }
    /**
     *
     * Appends the string representation of the {@link org.mcausc78.craft4j.api.json.JsonBuilder dict array} argument to this sequence.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param key a key field
     * @param values a value
     * @return a reference to this object.
     *
     */
    public JsonBuilder put(String key, JsonBuilder[] values) {
        if(this.sb.toString().equals("{")) this.sb.append("\""+key+"\":["+ArraysUtil.joinBuildersToQuotes(values)+"]");
        else this.sb.append(",\""+key+"\":["+ArraysUtil.joinBuildersToQuotes(values)+"]");
        return new JsonBuilder(this.sb);
    }

    /**
     *
     * Build a JSON string.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @return a string representation of JSON.
     *
     */
    public String build() {
        return this.sb.toString()+"}";
    }

    /**
     *
     * Clear a JSON builder.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public JsonBuilder clear() {
        this.sb = new StringBuilder("{");
        return new JsonBuilder(this.sb);
    }

    /**
     *
     * Get a string builder.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @return a string builder of JSON
     *
     */
    public StringBuilder getBuilder() {
        return this.sb;
    }
}
