package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the COMPUTING category record details about the
 * computer programs used in the crystal structure analysis.
 * 
 * Data items in this category would not, in general, be used in
 * a macromolecular CIF.  The category SOFTWARE, which allows
 * a more detailed description of computer programs and
 * their attributes to be given, would be used instead.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Computing extends DelegatingCategory {
    public Computing(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "cell_refinement":
                return getCellRefinement();
            case "data_collection":
                return getDataCollection();
            case "data_reduction":
                return getDataReduction();
            case "molecular_graphics":
                return getMolecularGraphics();
            case "publication_material":
                return getPublicationMaterial();
            case "structure_refinement":
                return getStructureRefinement();
            case "structure_solution":
                return getStructureSolution();
            case "pdbx_structure_refinement_method":
                return getPdbxStructureRefinementMethod();
            case "pdbx_data_reduction_ii":
                return getPdbxDataReductionIi();
            case "pdbx_data_reduction_ds":
                return getPdbxDataReductionDs();
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
     * Software used for cell refinement.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getCellRefinement() {
        return delegate.getColumn("cell_refinement", DelegatingStrColumn::new);
    }

    /**
     * Software used for data collection.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getDataCollection() {
        return delegate.getColumn("data_collection", DelegatingStrColumn::new);
    }

    /**
     * Software used for data reduction.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getDataReduction() {
        return delegate.getColumn("data_reduction", DelegatingStrColumn::new);
    }

    /**
     * Software used for molecular graphics.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getMolecularGraphics() {
        return delegate.getColumn("molecular_graphics", DelegatingStrColumn::new);
    }

    /**
     * Software used for generating material for publication.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getPublicationMaterial() {
        return delegate.getColumn("publication_material", DelegatingStrColumn::new);
    }

    /**
     * Software used for refinement of the structure.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getStructureRefinement() {
        return delegate.getColumn("structure_refinement", DelegatingStrColumn::new);
    }

    /**
     * Software used for solution of the structure.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getStructureSolution() {
        return delegate.getColumn("structure_solution", DelegatingStrColumn::new);
    }

    /**
     * Program/package name for structure refinement method.
     * @return StrColumn
     */
    public StrColumn getPdbxStructureRefinementMethod() {
        return delegate.getColumn("pdbx_structure_refinement_method", DelegatingStrColumn::new);
    }

    /**
     * Program/package name for data reduction/intensity integration software
     * @return StrColumn
     */
    public StrColumn getPdbxDataReductionIi() {
        return delegate.getColumn("pdbx_data_reduction_ii", DelegatingStrColumn::new);
    }

    /**
     * Program/package name for data reduction/data scaling
     * @return StrColumn
     */
    public StrColumn getPdbxDataReductionDs() {
        return delegate.getColumn("pdbx_data_reduction_ds", DelegatingStrColumn::new);
    }

}