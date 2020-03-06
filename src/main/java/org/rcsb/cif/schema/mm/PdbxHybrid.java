package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_HYBRID category are used to describe the chimeric
 * characteristics of a DNA/RNA structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxHybrid extends DelegatingCategory {
    public PdbxHybrid(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "sugar_name":
                return getSugarName();
            case "strand_id":
                return getStrandId();
            case "residue_names":
                return getResidueNames();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * ID code.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Name of sugar group of residue.
     * @return StrColumn
     */
    public StrColumn getSugarName() {
        return delegate.getColumn("sugar_name", DelegatingStrColumn::new);
    }

    /**
     * Strand id.
     * @return StrColumn
     */
    public StrColumn getStrandId() {
        return delegate.getColumn("strand_id", DelegatingStrColumn::new);
    }

    /**
     * List of residues + number (see example) which have the same sugar
     * group in a particular strand.
     * @return StrColumn
     */
    public StrColumn getResidueNames() {
        return delegate.getColumn("residue_names", DelegatingStrColumn::new);
    }

}