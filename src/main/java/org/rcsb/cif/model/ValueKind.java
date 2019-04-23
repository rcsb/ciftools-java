package org.rcsb.cif.model;

/**
 * Reports whether a certain row in a certain Column is present.
 */
public enum ValueKind {
    PRESENT, // value
    NOT_PRESENT, // .
    UNKNOWN // ?
}
