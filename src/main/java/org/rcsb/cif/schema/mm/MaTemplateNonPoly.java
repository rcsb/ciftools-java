package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TEMPLATE_NON_POLY category record details about
 * the non-polymeric structural templates used in the homology/comparative
 * modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTemplateNonPoly extends DelegatingCategory {
    public MaTemplateNonPoly(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "template_id":
                return getTemplateId();
            case "comp_id":
                return getCompId();
            case "smiles":
                return getSmiles();
            case "smiles_canonical":
                return getSmilesCanonical();
            case "inchi":
                return getInchi();
            case "inchi_key":
                return getInchiKey();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the template.
     * This data item is a pointer to _ma_template_details.template_id
     * in the MA_TEMPLATE_DETAILS caategory.
     * @return IntColumn
     */
    public IntColumn getTemplateId() {
        return delegate.getColumn("template_id", DelegatingIntColumn::new);
    }

    /**
     * The component identifier of the non-polymeric template, if available.
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The smile string of the non-polymeric template.
     * @return StrColumn
     */
    public StrColumn getSmiles() {
        return delegate.getColumn("smiles", DelegatingStrColumn::new);
    }

    /**
     * The canonical smile string of the non-polymeric template.
     * @return StrColumn
     */
    public StrColumn getSmilesCanonical() {
        return delegate.getColumn("smiles_canonical", DelegatingStrColumn::new);
    }

    /**
     * The IUPAC INCHI descriptor of the non-polymeric template.
     * @return StrColumn
     */
    public StrColumn getInchi() {
        return delegate.getColumn("inchi", DelegatingStrColumn::new);
    }

    /**
     * The hashed INCHI key of the non-polymeric template.
     * @return StrColumn
     */
    public StrColumn getInchiKey() {
        return delegate.getColumn("inchi_key", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the non-polymeric template.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}