package org.rcsb.cif.model.pdbxsolnscattermodel;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return ScatterId
     */
    public ScatterId getScatterId() {
        return (ScatterId) (isText ? textFields.computeIfAbsent("scatter_id",
                ScatterId::new) : getBinaryColumn("scatter_id"));
    }

    /**
     * The value of _pdbx_soln_scatter_model.id must
     * uniquely identify the sample in the category PDBX_SOLN_SCATTER_MODEL
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * A description of any additional details concerning the experiment.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * A description of the methods used in the modelling
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * A list of the software used in the modeeling
     * @return SoftwareList
     */
    public SoftwareList getSoftwareList() {
        return (SoftwareList) (isText ? textFields.computeIfAbsent("software_list",
                SoftwareList::new) : getBinaryColumn("software_list"));
    }

    /**
     * A list of the software authors
     * @return SoftwareAuthorList
     */
    public SoftwareAuthorList getSoftwareAuthorList() {
        return (SoftwareAuthorList) (isText ? textFields.computeIfAbsent("software_author_list",
                SoftwareAuthorList::new) : getBinaryColumn("software_author_list"));
    }

    /**
     * A list of the entries used to fit the model
     * to the scattering data
     * @return EntryFittingList
     */
    public EntryFittingList getEntryFittingList() {
        return (EntryFittingList) (isText ? textFields.computeIfAbsent("entry_fitting_list",
                EntryFittingList::new) : getBinaryColumn("entry_fitting_list"));
    }

    /**
     * The number of model conformers calculated.
     * @return NumConformersCalculated
     */
    public NumConformersCalculated getNumConformersCalculated() {
        return (NumConformersCalculated) (isText ? textFields.computeIfAbsent("num_conformers_calculated",
                NumConformersCalculated::new) : getBinaryColumn("num_conformers_calculated"));
    }

    /**
     * The number of model conformers submitted in the entry
     * @return NumConformersSubmitted
     */
    public NumConformersSubmitted getNumConformersSubmitted() {
        return (NumConformersSubmitted) (isText ? textFields.computeIfAbsent("num_conformers_submitted",
                NumConformersSubmitted::new) : getBinaryColumn("num_conformers_submitted"));
    }

    /**
     * The index of the representative conformer among the submitted conformers for the entry
     * @return RepresentativeConformer
     */
    public RepresentativeConformer getRepresentativeConformer() {
        return (RepresentativeConformer) (isText ? textFields.computeIfAbsent("representative_conformer",
                RepresentativeConformer::new) : getBinaryColumn("representative_conformer"));
    }

    /**
     * A description of the conformer selection criteria
     * used.
     * @return ConformerSelectionCriteria
     */
    public ConformerSelectionCriteria getConformerSelectionCriteria() {
        return (ConformerSelectionCriteria) (isText ? textFields.computeIfAbsent("conformer_selection_criteria",
                ConformerSelectionCriteria::new) : getBinaryColumn("conformer_selection_criteria"));
    }
}
