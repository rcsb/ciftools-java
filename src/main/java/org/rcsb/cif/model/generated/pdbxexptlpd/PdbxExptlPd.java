package org.rcsb.cif.model.generated.pdbxexptlpd;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxExptlPd extends BaseCategory {
    public PdbxExptlPd(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxExptlPd(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxExptlPd(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_exptl_pd.entry_id uniquely identifies a
     * record in the PDBX_EXPTL_PD category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The pH at which the powder sample was prepared.
     * @return SpecPreparationPH
     */
    public SpecPreparationPH getSpecPreparationPH() {
        return (SpecPreparationPH) (isText ? textFields.computeIfAbsent("spec_preparation_pH",
                SpecPreparationPH::new) : getBinaryColumn("spec_preparation_pH"));
    }

    /**
     * The range of pH values at which the sample was prepared.   Used when
     * a point estimate of pH is not appropriate.
     * @return SpecPreparationPHRange
     */
    public SpecPreparationPHRange getSpecPreparationPHRange() {
        return (SpecPreparationPHRange) (isText ? textFields.computeIfAbsent("spec_preparation_pH_range",
                SpecPreparationPHRange::new) : getBinaryColumn("spec_preparation_pH_range"));
    }

    /**
     * A description of preparation steps for producing the
     * diffraction specimen from the sample. Include any procedures
     * related to grinding, sieving, spray drying, etc.
     * @return SpecPreparation
     */
    public SpecPreparation getSpecPreparation() {
        return (SpecPreparation) (isText ? textFields.computeIfAbsent("spec_preparation",
                SpecPreparation::new) : getBinaryColumn("spec_preparation"));
    }
}
