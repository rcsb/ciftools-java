package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SOLN_SCATTER_MODEL category record details about the
 * homology model fitting to the solution scatter data.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxSolnScatterModel extends BaseCategory {
    public PdbxSolnScatterModel(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSolnScatterModel(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSolnScatterModel(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to  _pdbx_soln_scatter.id in the  PDBX_SOLN_SCATTER category.
     * @return StrColumn
     */
    public StrColumn getScatterId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("scatter_id", StrColumn::new) :
                getBinaryColumn("scatter_id"));
    }

    /**
     * The value of _pdbx_soln_scatter_model.id must
     * uniquely identify the sample in the category PDBX_SOLN_SCATTER_MODEL
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A description of any additional details concerning the experiment.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * A description of the methods used in the modelling
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * A list of the software used in the modeeling
     * @return StrColumn
     */
    public StrColumn getSoftwareList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("software_list", StrColumn::new) :
                getBinaryColumn("software_list"));
    }

    /**
     * A list of the software authors
     * @return StrColumn
     */
    public StrColumn getSoftwareAuthorList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("software_author_list", StrColumn::new) :
                getBinaryColumn("software_author_list"));
    }

    /**
     * A list of the entries used to fit the model
     * to the scattering data
     * @return StrColumn
     */
    public StrColumn getEntryFittingList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_fitting_list", StrColumn::new) :
                getBinaryColumn("entry_fitting_list"));
    }

    /**
     * The number of model conformers calculated.
     * @return IntColumn
     */
    public IntColumn getNumConformersCalculated() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_conformers_calculated", IntColumn::new) :
                getBinaryColumn("num_conformers_calculated"));
    }

    /**
     * The number of model conformers submitted in the entry
     * @return IntColumn
     */
    public IntColumn getNumConformersSubmitted() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_conformers_submitted", IntColumn::new) :
                getBinaryColumn("num_conformers_submitted"));
    }

    /**
     * The index of the representative conformer among the submitted conformers for the entry
     * @return IntColumn
     */
    public IntColumn getRepresentativeConformer() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("representative_conformer", IntColumn::new) :
                getBinaryColumn("representative_conformer"));
    }

    /**
     * A description of the conformer selection criteria
     * used.
     * @return StrColumn
     */
    public StrColumn getConformerSelectionCriteria() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conformer_selection_criteria", StrColumn::new) :
                getBinaryColumn("conformer_selection_criteria"));
    }
}
