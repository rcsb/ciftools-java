package org.rcsb.cif.model;

/**
 * Reports whether a certain row in a certain {@link Column} is present.
 */
public enum ValueKind {
    /**
     * The value is present.
     */
    PRESENT,
    /**
     * The value is explicitly not present - <code>.</code> in CIF. String values will be empty, number values will be
     * 0.
     */
    NOT_PRESENT,
    /**
     * The value is unknown - <code>?</code> in CIF. String values will be empty, number values will be 0.
     */
    UNKNOWN
}
