package org.rcsb.cif.reader;

public class ParsingException extends Exception {
    public ParsingException(String message) {
        super(message);
    }

    public ParsingException(String message, int line) {
        super(message + " [" + line + "]");
    }

    public ParsingException(String message, Exception e) {
        super(message, e);
    }
}
