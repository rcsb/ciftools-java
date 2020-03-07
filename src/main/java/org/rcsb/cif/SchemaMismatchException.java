package org.rcsb.cif;

/**
 * Indicates potential schema validations by using incorrect schemata.
 */
public class SchemaMismatchException extends RuntimeException {
    public SchemaMismatchException(String message) {
        super(message);
    }

    public SchemaMismatchException(String message, Exception e) {
        super(message, e);
    }
}
