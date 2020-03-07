package org.rcsb.cif;

/**
 * Indicates that data for an empty column was requested.
 */
public class EmptyColumnException extends RuntimeException {
    public EmptyColumnException(String message) {
        super(message);
    }
}
