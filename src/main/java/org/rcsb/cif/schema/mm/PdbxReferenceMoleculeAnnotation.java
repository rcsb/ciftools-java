package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE_ANNOTATION category specify
 * additional annotation relevant to the molecular entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceMoleculeAnnotation extends DelegatingCategory {
    public PdbxReferenceMoleculeAnnotation(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "family_prd_id":
                return getFamilyPrdId();
            case "prd_id":
                return getPrdId();
            case "ordinal":
                return getOrdinal();
            case "text":
                return getText();
            case "type":
                return getType();
            case "support":
                return getSupport();
            case "source":
                return getSource();
            case "chem_comp_id":
                return getChemCompId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_molecule_annotation.family_prd_id is a reference to
     * _pdbx_reference_molecule_list.family_prd_id in category PDBX_REFERENCE_MOLECULE_FAMILY_LIST.
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return delegate.getColumn("family_prd_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_reference_molecule.prd_id in the
     * PDB_REFERENCE_MOLECULE category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * This data item distinguishes anotations for this entity.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * Text describing the annotation for this entity.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }

    /**
     * Type of annotation for this entity.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Text describing the experimentation or computational evidence for
     * the annotation.
     * @return StrColumn
     */
    public StrColumn getSupport() {
        return delegate.getColumn("support", DelegatingStrColumn::new);
    }

    /**
     * The source of the annoation for this entity.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return delegate.getColumn("source", DelegatingStrColumn::new);
    }

    /**
     * For entities represented as single molecules, the identifier
     * corresponding to the chemical definition for the molecule.
     * @return StrColumn
     */
    public StrColumn getChemCompId() {
        return delegate.getColumn("chem_comp_id", DelegatingStrColumn::new);
    }

}