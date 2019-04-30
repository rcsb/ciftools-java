package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Holds details of NCS restraints in cases where multiple
 * conditions are provided for each domain.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxRefineLsRestrNcs extends BaseCategory {
    public PdbxRefineLsRestrNcs(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRefineLsRestrNcs(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRefineLsRestrNcs(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return StrColumn
     */
    public StrColumn getDomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dom_id", StrColumn::new) :
                getBinaryColumn("dom_id"));
    }

    /**
     * 
     * The the type of restraint applied to the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id and in the domains
     * against which it was restrained.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * 
     * The the number of this type of restraint applied to the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id and in the domains
     * against which it was restrained.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number", IntColumn::new) :
                getBinaryColumn("number"));
    }

    /**
     * 
     * The root-mean-square deviation in restraints for the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id and in the domains
     * against which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getRmsDev() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_dev", FloatColumn::new) :
                getBinaryColumn("rms_dev"));
    }

    /**
     * 
     * The value of the weighting coefficient used in
     * non-crystalographic restaint in the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id
     * to equivalent atomic positions in the domains
     * against which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getWeight() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("weight", FloatColumn::new) :
                getBinaryColumn("weight"));
    }
}
