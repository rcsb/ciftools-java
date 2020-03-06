package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SOLN_SCATTER_MODEL category record details about the
 * homology model fitting to the solution scatter data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSolnScatterModel extends DelegatingCategory {
    public PdbxSolnScatterModel(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "scatter_id":
                return getScatterId();
            case "id":
                return getId();
            case "details":
                return getDetails();
            case "method":
                return getMethod();
            case "software_list":
                return getSoftwareList();
            case "software_author_list":
                return getSoftwareAuthorList();
            case "entry_fitting_list":
                return getEntryFittingList();
            case "num_conformers_calculated":
                return getNumConformersCalculated();
            case "num_conformers_submitted":
                return getNumConformersSubmitted();
            case "representative_conformer":
                return getRepresentativeConformer();
            case "conformer_selection_criteria":
                return getConformerSelectionCriteria();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to  _pdbx_soln_scatter.id in the  PDBX_SOLN_SCATTER category.
     * @return StrColumn
     */
    public StrColumn getScatterId() {
        return delegate.getColumn("scatter_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_soln_scatter_model.id must
     * uniquely identify the sample in the category PDBX_SOLN_SCATTER_MODEL
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A description of any additional details concerning the experiment.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * A description of the methods used in the modelling
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * A list of the software used in the modeeling
     * @return StrColumn
     */
    public StrColumn getSoftwareList() {
        return delegate.getColumn("software_list", DelegatingStrColumn::new);
    }

    /**
     * A list of the software authors
     * @return StrColumn
     */
    public StrColumn getSoftwareAuthorList() {
        return delegate.getColumn("software_author_list", DelegatingStrColumn::new);
    }

    /**
     * A list of the entries used to fit the model
     * to the scattering data
     * @return StrColumn
     */
    public StrColumn getEntryFittingList() {
        return delegate.getColumn("entry_fitting_list", DelegatingStrColumn::new);
    }

    /**
     * The number of model conformers calculated.
     * @return IntColumn
     */
    public IntColumn getNumConformersCalculated() {
        return delegate.getColumn("num_conformers_calculated", DelegatingIntColumn::new);
    }

    /**
     * The number of model conformers submitted in the entry
     * @return IntColumn
     */
    public IntColumn getNumConformersSubmitted() {
        return delegate.getColumn("num_conformers_submitted", DelegatingIntColumn::new);
    }

    /**
     * The index of the representative conformer among the submitted conformers for the entry
     * @return IntColumn
     */
    public IntColumn getRepresentativeConformer() {
        return delegate.getColumn("representative_conformer", DelegatingIntColumn::new);
    }

    /**
     * A description of the conformer selection criteria
     * used.
     * @return StrColumn
     */
    public StrColumn getConformerSelectionCriteria() {
        return delegate.getColumn("conformer_selection_criteria", DelegatingStrColumn::new);
    }

}