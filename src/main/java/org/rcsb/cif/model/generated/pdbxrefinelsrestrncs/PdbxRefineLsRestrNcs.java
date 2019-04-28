package org.rcsb.cif.model.generated.pdbxrefinelsrestrncs;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DomId
     */
    public DomId getDomId() {
        return (DomId) (isText ? textFields.computeIfAbsent("dom_id",
                DomId::new) : getBinaryColumn("dom_id"));
    }

    /**
     * 
     * The the type of restraint applied to the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id and in the domains
     * against which it was restrained.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * 
     * The the number of this type of restraint applied to the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id and in the domains
     * against which it was restrained.
     * @return Number
     */
    public Number getNumber() {
        return (Number) (isText ? textFields.computeIfAbsent("number",
                Number::new) : getBinaryColumn("number"));
    }

    /**
     * 
     * The root-mean-square deviation in restraints for the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id and in the domains
     * against which it was restrained.
     * @return RmsDev
     */
    public RmsDev getRmsDev() {
        return (RmsDev) (isText ? textFields.computeIfAbsent("rms_dev",
                RmsDev::new) : getBinaryColumn("rms_dev"));
    }

    /**
     * 
     * The value of the weighting coefficient used in
     * non-crystalographic restaint in the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id
     * to equivalent atomic positions in the domains
     * against which it was restrained.
     * @return Weight
     */
    public Weight getWeight() {
        return (Weight) (isText ? textFields.computeIfAbsent("weight",
                Weight::new) : getBinaryColumn("weight"));
    }
}
