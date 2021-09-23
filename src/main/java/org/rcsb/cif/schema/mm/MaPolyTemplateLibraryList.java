package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_POLY_TEMPLATE_LIBRARY_LIST category carries the list of
 * templates used to build a template library.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaPolyTemplateLibraryList extends DelegatingCategory {
    public MaPolyTemplateLibraryList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "template_id":
                return getTemplateId();
            case "db_name":
                return getDbName();
            case "db_accession_code":
                return getDbAccessionCode();
            case "asym_id":
                return getAsymId();
            case "model_num":
                return getModelNum();
            case "residue_number_begin":
                return getResidueNumberBegin();
            case "residue_number_end":
                return getResidueNumberEnd();
            case "residue_name_begin":
                return getResidueNameBegin();
            case "residue_name_end":
                return getResidueNameEnd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the template.
     * @return IntColumn
     */
    public IntColumn getTemplateId() {
        return delegate.getColumn("template_id", DelegatingIntColumn::new);
    }

    /**
     * The name of the reference database.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

    /**
     * The accession code corresponding to the reference database entry.
     * @return StrColumn
     */
    public StrColumn getDbAccessionCode() {
        return delegate.getColumn("db_accession_code", DelegatingStrColumn::new);
    }

    /**
     * The asym id of the template used in the template library.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The model number of the template used in the template library.
     * @return StrColumn
     */
    public StrColumn getModelNum() {
        return delegate.getColumn("model_num", DelegatingStrColumn::new);
    }

    /**
     * The leading residue index for the template segment used in the template library.
     * @return IntColumn
     */
    public IntColumn getResidueNumberBegin() {
        return delegate.getColumn("residue_number_begin", DelegatingIntColumn::new);
    }

    /**
     * The trailing residue index for the template segment used in the template library.
     * @return IntColumn
     */
    public IntColumn getResidueNumberEnd() {
        return delegate.getColumn("residue_number_end", DelegatingIntColumn::new);
    }

    /**
     * The leading residue name (3-letter code) for the template segment
     * used in the template library.
     * @return StrColumn
     */
    public StrColumn getResidueNameBegin() {
        return delegate.getColumn("residue_name_begin", DelegatingStrColumn::new);
    }

    /**
     * The trailing residue name (3-letter code) for the template segment
     * used in the template library.
     * @return StrColumn
     */
    public StrColumn getResidueNameEnd() {
        return delegate.getColumn("residue_name_end", DelegatingStrColumn::new);
    }

}