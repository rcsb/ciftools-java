package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT category record details about the
 * description of the crystallographic structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Struct extends DelegatingCategory {
    public Struct(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "title":
                return getTitle();
            case "pdbx_center_of_mass_x":
                return getPdbxCenterOfMassX();
            case "pdbx_center_of_mass_y":
                return getPdbxCenterOfMassY();
            case "pdbx_center_of_mass_z":
                return getPdbxCenterOfMassZ();
            case "pdbx_structure_determination_methodology":
                return getPdbxStructureDeterminationMethodology();
            case "pdbx_descriptor":
                return getPdbxDescriptor();
            case "pdbx_model_details":
                return getPdbxModelDetails();
            case "pdbx_formula_weight":
                return getPdbxFormulaWeight();
            case "pdbx_formula_weight_method":
                return getPdbxFormulaWeightMethod();
            case "pdbx_model_type_details":
                return getPdbxModelTypeDetails();
            case "pdbx_CASP_flag":
                return getPdbxCASPFlag();
            case "pdbx_details":
                return getPdbxDetails();
            case "pdbx_title_text":
                return getPdbxTitleText();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * A title for the data block. The author should attempt to convey
     * the essence of the structure archived in the CIF in the title,
     * and to distinguish this structural result from others.
     * @return StrColumn
     */
    public StrColumn getTitle() {
        return delegate.getColumn("title", DelegatingStrColumn::new);
    }

    /**
     * This data item is the X component of a calculation of the center of mass of polymer chains
     * @return FloatColumn
     */
    public FloatColumn getPdbxCenterOfMassX() {
        return delegate.getColumn("pdbx_center_of_mass_x", DelegatingFloatColumn::new);
    }

    /**
     * This data item is the Y component of a calculation of the center of mass of polymer chains
     * @return FloatColumn
     */
    public FloatColumn getPdbxCenterOfMassY() {
        return delegate.getColumn("pdbx_center_of_mass_y", DelegatingFloatColumn::new);
    }

    /**
     * This data item is the Z component of a calculation of the center of mass of polymer chains
     * @return FloatColumn
     */
    public FloatColumn getPdbxCenterOfMassZ() {
        return delegate.getColumn("pdbx_center_of_mass_z", DelegatingFloatColumn::new);
    }

    /**
     * Indicates if the structure was determined using experimental, computational, or integrative methods
     * @return StrColumn
     */
    public StrColumn getPdbxStructureDeterminationMethodology() {
        return delegate.getColumn("pdbx_structure_determination_methodology", DelegatingStrColumn::new);
    }

    /**
     * An automatically generated descriptor for an NDB structure or
     * the unstructured content of the PDB COMPND record.
     * @return StrColumn
     */
    public StrColumn getPdbxDescriptor() {
        return delegate.getColumn("pdbx_descriptor", DelegatingStrColumn::new);
    }

    /**
     * Text description of the methodology which produced this
     * model structure.
     * @return StrColumn
     */
    public StrColumn getPdbxModelDetails() {
        return delegate.getColumn("pdbx_model_details", DelegatingStrColumn::new);
    }

    /**
     * Estimated formula mass in daltons of the
     * deposited structure assembly.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFormulaWeight() {
        return delegate.getColumn("pdbx_formula_weight", DelegatingFloatColumn::new);
    }

    /**
     * Method used to determine _struct.pdbx_formula_weight.
     * @return StrColumn
     */
    public StrColumn getPdbxFormulaWeightMethod() {
        return delegate.getColumn("pdbx_formula_weight_method", DelegatingStrColumn::new);
    }

    /**
     * A description of the type of structure model.
     * @return StrColumn
     */
    public StrColumn getPdbxModelTypeDetails() {
        return delegate.getColumn("pdbx_model_type_details", DelegatingStrColumn::new);
    }

    /**
     * The item indicates whether the entry is a CASP target, a CASD-NMR target,
     * or similar target participating in methods development experiments.
     * @return StrColumn
     */
    public StrColumn getPdbxCASPFlag() {
        return delegate.getColumn("pdbx_CASP_flag", DelegatingStrColumn::new);
    }

    /**
     * Additional remarks related to this structure deposition that have not
     * been included in details data items elsewhere.
     * @return StrColumn
     */
    public StrColumn getPdbxDetails() {
        return delegate.getColumn("pdbx_details", DelegatingStrColumn::new);
    }

    /**
     * A title for the experiment or analysis that is represented in
     * the entry.  The default value is the primary citation of the entry.
     * @return StrColumn
     */
    public StrColumn getPdbxTitleText() {
        return delegate.getColumn("pdbx_title_text", DelegatingStrColumn::new);
    }

}