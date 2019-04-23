package org.rcsb.cif.model;

public interface SingleRowColumn extends Column {
    ValueKind getValueKind();

    Object getData();
}
