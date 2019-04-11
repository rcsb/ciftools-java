package org.rcsb.cif.model.internal;

import org.rcsb.cif.ParsingException;

public class UnknownFieldException extends ParsingException {
    public UnknownFieldException(String fieldName) {
        super("Cannot find field with name: " + fieldName);
    }
}
