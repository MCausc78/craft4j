package org.mcausc78.craft4j.api.extra;

import org.mcausc78.craft4j.api.exceptions.FileCreateException;
import org.mcausc78.craft4j.api.exceptions.FileDeleteException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

/**
 *
 * Represents an util to do something with files.
 *
 * @since 1.0.0
 * @author mcausc78
 * @version 1.0.0
 *
 */
public class EFile {

    /**
     * Represents a file.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    File file;

    /**
     *
     * Constructs a new file object with utils.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @param file
     *
     */
    public EFile(File file) {
        if(file == null) throw new NullPointerException("Cannot create file object with given value (null)");
        this.file = file;
    }
    public EFile(String file) {
        if(file == null) throw new NullPointerException("Cannot create file object with given value (null)");
        this.file = new File(file);
    }
    /**
     *
     * Try delete a file.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @return true, if file successfully deleted
     *
     *
     */
    public boolean delete() throws FileDeleteException {
        if(!this.file.exists())
            throw new FileDeleteException(String.format("Cannot delete file %s because f.exists() is false", file.getName()));
        return this.file.delete();
    }

    /**
     *
     * Try to create a file.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @return true if file successfully created
     *
     */
    public boolean create() throws FileCreateException {
        if(this.file.exists()) throw new FileCreateException(String.format("Cannot create file %s because f.exists() is true", file.getName()));
        try {
            return this.file.createNewFile();
        } catch (IOException ex) {
            throw new FileCreateException(ex.getMessage());
        }
    }

    /**
     *
     * Read a file.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @return list with lines from file
     *
     */
    public List<String> readLines() {
        try {
            Scanner scanner = new Scanner(this.file);
            List<String> strings = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                strings.add(string);
            }
            scanner.close();
            return strings;
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    /**
     *
     * Get a file.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     * @return file
     *
     */
    public File getFile() {
        return this.file;
    }

}
