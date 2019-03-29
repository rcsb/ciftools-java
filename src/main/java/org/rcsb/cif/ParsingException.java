package org.rcsb.cif;

public class ParsingException extends Exception {
    public ParsingException(String message, int line) {
        super(message + " [" + line + "]");
    }
}
