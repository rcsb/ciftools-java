package org.rcsb.cif.model.generated.pdbxnastructkeywds;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNaStructKeywds extends BaseCategory {
    public PdbxNaStructKeywds(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNaStructKeywds(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNaStructKeywds(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Provides overall idea about conformation type of NA.  Also,
     * it identifies tRNAs by assigning a 'T' here.
     * @return ConformationType
     */
    public ConformationType getConformationType() {
        return (ConformationType) (isText ? textFields.computeIfAbsent("conformation_type",
                ConformationType::new) : getBinaryColumn("conformation_type"));
    }

    /**
     * Gives general structural description of NA.
     * @return StrandDescription
     */
    public StrandDescription getStrandDescription() {
        return (StrandDescription) (isText ? textFields.computeIfAbsent("strand_description",
                StrandDescription::new) : getBinaryColumn("strand_description"));
    }

    /**
     * Describes special features of NA.
     * @return SpecialFeature
     */
    public SpecialFeature getSpecialFeature() {
        return (SpecialFeature) (isText ? textFields.computeIfAbsent("special_feature",
                SpecialFeature::new) : getBinaryColumn("special_feature"));
    }
}
