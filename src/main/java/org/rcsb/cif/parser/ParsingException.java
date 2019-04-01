package org.rcsb.cif.parser;

public class ParsingException extends Exception {
    public ParsingException(String message) {
        super(message);
    }

    public ParsingException(String message, int line) {
        super(message + " [" + line + "]");
    }
}
