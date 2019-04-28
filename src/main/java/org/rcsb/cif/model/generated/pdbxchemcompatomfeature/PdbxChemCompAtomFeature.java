package org.rcsb.cif.model.generated.pdbxchemcompatomfeature;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompAtomFeature extends BaseCategory {
    public PdbxChemCompAtomFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompAtomFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompAtomFeature(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_import.comp_id in the CHEM_COMP
     * category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * The identifier for the target atom to which the feature is assigned.
     * @return AtomId
     */
    public AtomId getAtomId() {
        return (AtomId) (isText ? textFields.computeIfAbsent("atom_id",
                AtomId::new) : getBinaryColumn("atom_id"));
    }

    /**
     * The feature assigned to this atom.
     * @return FeatureType
     */
    public FeatureType getFeatureType() {
        return (FeatureType) (isText ? textFields.computeIfAbsent("feature_type",
                FeatureType::new) : getBinaryColumn("feature_type"));
    }
}
