package org.rcsb.cif.model;

public interface BinaryFile<B extends Block> extends CifFile<B> {
    /**
     * Reports the version of this {@link CifFile}.
     * @return the version <code>String</code>
     */
    String getVersion();

    /**
     * Reports the encoder which created this {@link CifFile}.
     * @return the encoder <code>String</code>
     */
    String getEncoder();
}
