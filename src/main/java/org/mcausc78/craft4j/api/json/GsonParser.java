package org.mcausc78.craft4j.api.json;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonParser {
    private String text;
    private JsonParser parser;
    private JsonObject object;
    public GsonParser(String text) {
        this.text = text;
        this.init();
    }
    private void init() {
        this.parser = new JsonParser();
    }
    public GsonParser parse() {
        this.object = this.parser.parse(this.text).getAsJsonObject();
        return this;
    }
    public JsonObject getObject() {
        return this.object;
    }
}
