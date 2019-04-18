package org.rcsb.cif.model.cell;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class Cell extends BaseCategory {
    public Cell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Cell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Cell(String name) {
        super(name);
    }

    /**
     * Unit-cell angle alpha of the reported structure in degrees.
     * @return AngleAlpha
     */
    public AngleAlpha getAngleAlpha() {
        return (AngleAlpha) (isText ? getTextColumn("angle_alpha") : getBinaryColumn("angle_alpha"));
    }

    /**
     * Unit-cell angle beta of the reported structure in degrees.
     * @return AngleBeta
     */
    public AngleBeta getAngleBeta() {
        return (AngleBeta) (isText ? getTextColumn("angle_beta") : getBinaryColumn("angle_beta"));
    }

    /**
     * Unit-cell angle gamma of the reported structure in degrees.
     * @return AngleGamma
     */
    public AngleGamma getAngleGamma() {
        return (AngleGamma) (isText ? getTextColumn("angle_gamma") : getBinaryColumn("angle_gamma"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? getTextColumn("entry_id") : getBinaryColumn("entry_id"));
    }

    /**
     * Unit-cell length a corresponding to the structure reported in
     * angstroms.
     * @return LengthA
     */
    public LengthA getLengthA() {
        return (LengthA) (isText ? getTextColumn("length_a") : getBinaryColumn("length_a"));
    }

    /**
     * Unit-cell length b corresponding to the structure reported in
     * angstroms.
     * @return LengthB
     */
    public LengthB getLengthB() {
        return (LengthB) (isText ? getTextColumn("length_b") : getBinaryColumn("length_b"));
    }

    /**
     * Unit-cell length c corresponding to the structure reported in
     * angstroms.
     * @return LengthC
     */
    public LengthC getLengthC() {
        return (LengthC) (isText ? getTextColumn("length_c") : getBinaryColumn("length_c"));
    }

    /**
     * The number of the polymeric chains in a unit cell. In the case
     * of heteropolymers, Z is the number of occurrences of the most
     * populous chain.
     * 
     * This data item is provided for compatibility with the original
     * Protein Data Bank format, and only for that purpose.
     * @return ZPDB
     */
    public ZPDB getZPDB() {
        return (ZPDB) (isText ? getTextColumn("Z_PDB") : getBinaryColumn("Z_PDB"));
    }

    /**
     * To further identify unique axis if necessary.  E.g., P 21 with
     * an unique C axis will have 'C' in this field.
     * @return PdbxUniqueAxis
     */
    public PdbxUniqueAxis getPdbxUniqueAxis() {
        return (PdbxUniqueAxis) (isText ? getTextColumn("pdbx_unique_axis") : getBinaryColumn("pdbx_unique_axis"));
    }
}
