package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the COMPUTING category record details about the
 * computer programs used in the crystal structure analysis.
 * 
 * Data items in this category would not, in general, be used in
 * a macromolecular CIF.  The category SOFTWARE, which allows
 * a more detailed description of computer programs and
 * their attributes to be given, would be used instead.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Computing extends BaseCategory {
    public Computing(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Computing(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Computing(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Software used for cell refinement.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getCellRefinement() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cell_refinement", StrColumn::new) :
                getBinaryColumn("cell_refinement"));
    }

    /**
     * Software used for data collection.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getDataCollection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_collection", StrColumn::new) :
                getBinaryColumn("data_collection"));
    }

    /**
     * Software used for data reduction.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getDataReduction() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_reduction", StrColumn::new) :
                getBinaryColumn("data_reduction"));
    }

    /**
     * Software used for molecular graphics.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getMolecularGraphics() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("molecular_graphics", StrColumn::new) :
                getBinaryColumn("molecular_graphics"));
    }

    /**
     * Software used for generating material for publication.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getPublicationMaterial() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("publication_material", StrColumn::new) :
                getBinaryColumn("publication_material"));
    }

    /**
     * Software used for refinement of the structure.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getStructureRefinement() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("structure_refinement", StrColumn::new) :
                getBinaryColumn("structure_refinement"));
    }

    /**
     * Software used for solution of the structure.
     * 
     * Give the program or package name and a brief reference.
     * @return StrColumn
     */
    public StrColumn getStructureSolution() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("structure_solution", StrColumn::new) :
                getBinaryColumn("structure_solution"));
    }

    /**
     * Program/package name for structure refinement method.
     * @return StrColumn
     */
    public StrColumn getPdbxStructureRefinementMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_structure_refinement_method", StrColumn::new) :
                getBinaryColumn("pdbx_structure_refinement_method"));
    }

    /**
     * Program/package name for data reduction/intensity integration software
     * @return StrColumn
     */
    public StrColumn getPdbxDataReductionIi() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_data_reduction_ii", StrColumn::new) :
                getBinaryColumn("pdbx_data_reduction_ii"));
    }

    /**
     * Program/package name for data reduction/data scaling
     * @return StrColumn
     */
    public StrColumn getPdbxDataReductionDs() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_data_reduction_ds", StrColumn::new) :
                getBinaryColumn("pdbx_data_reduction_ds"));
    }
}
