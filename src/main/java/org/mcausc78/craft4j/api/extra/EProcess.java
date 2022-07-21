package org.mcausc78.craft4j.api.extra;

import org.mcausc78.craft4j.api.exceptions.GetProcessException;

import java.io.*;
import java.util.List;

/**
 *
 * Represents a extra process.
 *
 * @since 1.0.0
 * @author mcausc78
 * @version 1.0.0
 *
 */
public class EProcess {
    private final ProcessBuilder builder;
    private final Process process;
    public EProcess(String command) {
        this.builder = new ProcessBuilder(command);
    }
    public EProcess(String[] commands) {
        this.builder = new ProcessBuilder(commands);
    }
    public EProcess(List<String> commands) {
        this.builder = new ProcessBuilder(commands);
    }
    public ProcessBuilder getBuilder() {
        return this.builder;
    }
    public InputStream getInputStream() {
        return this.process.getInputStream();
    }
    public InputStream getErrorStream() {
        return this.process.getErrorStream();
    }
    public InputStreamReader getInputStreamReader() {
        return new InputStreamReader(this.getInputStream());
    }
    public InputStreamReader getErrorStreamReader() {
        return new InputStreamReader(this.getErrorStream());
    }
    public BufferedReader getBufferedReader() {
        return new BufferedReader(this.getInputStreamReader());
    }
    public BufferedReader getErrorBufferedReader() {
        return new BufferedReader(this.getErrorStreamReader());
    }
    public BufferedWriter getBufferedWriter() {
        return new BufferedWriter(new OutputStreamWriter(this.getProcess().getOutputStream()));
    }
    public Process getProcess() {
        return this.process;
    }
    public void start() throws GetProcessException {
        if(process != null) throw new GetProcessException("Process already running");
        try {
            this.process = this.builder.start();
        } catch (IOException e) {
            throw new GetProcessException(e);
        }
    }
}
