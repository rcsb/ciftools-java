package org.rcsb.cif.model;

import org.rcsb.cif.parser.ParsingException;

public interface CifCategory {
    String getName();

    CifField getField(String name) throws ParsingException;

    int getRowCount();
}
