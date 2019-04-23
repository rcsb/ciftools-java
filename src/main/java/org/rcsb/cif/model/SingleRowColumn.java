package org.rcsb.cif.model;

/**
 * Convenience class for columns which only contain a single value.
 */
public interface SingleRowColumn extends Column {
    /**
     * Retrieve the ValueKind of the first element.
     * @see Column#getValueKind(int)
     */
    ValueKind getValueKind();
}
