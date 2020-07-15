package org.rcsb.cif;

public class EncodingException extends RuntimeException {
    public EncodingException(String message) {
        super(message);
    }

    public EncodingException(String message, Exception e) {
        super(message, e);
    }
}