package org.rcsb.cif.model;

/**
 * Convenience class for columns which only contain a single value. Allows to obtain the value by calling #get rather
 * than having to invoke #get(0).
 */
public interface SingleRowColumn extends Column {
    /**
     * Retrieve the ValueKind of the first element.
     * @see Column#getValueKind(int)
     */
    ValueKind getValueKind();
}
