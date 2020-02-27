package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the pdbx_exptl_pd record information about
 * powder sample preparations.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The pH at which the powder sample was prepared.
     * @return FloatColumn
     */
    public FloatColumn getSpecPreparationPH() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("spec_preparation_pH", FloatColumn::new) :
                getBinaryColumn("spec_preparation_pH"));
    }

    /**
     * The range of pH values at which the sample was prepared.   Used when
     * a point estimate of pH is not appropriate.
     * @return StrColumn
     */
    public StrColumn getSpecPreparationPHRange() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("spec_preparation_pH_range", StrColumn::new) :
                getBinaryColumn("spec_preparation_pH_range"));
    }

    /**
     * A description of preparation steps for producing the
     * diffraction specimen from the sample. Include any procedures
     * related to grinding, sieving, spray drying, etc.
     * @return StrColumn
     */
    public StrColumn getSpecPreparation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("spec_preparation", StrColumn::new) :
                getBinaryColumn("spec_preparation"));
    }
}
