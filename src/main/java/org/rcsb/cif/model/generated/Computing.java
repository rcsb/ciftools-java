package org.rcsb.cif.model.generated;

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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Software used for cell refinement.
     * 
     * Give the program or package name and a brief reference.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCellRefinement() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("cell_refinement", SingleRowStrColumn::new) :
                getBinaryColumn("cell_refinement"));
    }

    /**
     * Software used for data collection.
     * 
     * Give the program or package name and a brief reference.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDataCollection() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("data_collection", SingleRowStrColumn::new) :
                getBinaryColumn("data_collection"));
    }

    /**
     * Software used for data reduction.
     * 
     * Give the program or package name and a brief reference.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDataReduction() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("data_reduction", SingleRowStrColumn::new) :
                getBinaryColumn("data_reduction"));
    }

    /**
     * Software used for molecular graphics.
     * 
     * Give the program or package name and a brief reference.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMolecularGraphics() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("molecular_graphics", SingleRowStrColumn::new) :
                getBinaryColumn("molecular_graphics"));
    }

    /**
     * Software used for generating material for publication.
     * 
     * Give the program or package name and a brief reference.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPublicationMaterial() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("publication_material", SingleRowStrColumn::new) :
                getBinaryColumn("publication_material"));
    }

    /**
     * Software used for refinement of the structure.
     * 
     * Give the program or package name and a brief reference.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStructureRefinement() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("structure_refinement", SingleRowStrColumn::new) :
                getBinaryColumn("structure_refinement"));
    }

    /**
     * Software used for solution of the structure.
     * 
     * Give the program or package name and a brief reference.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStructureSolution() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("structure_solution", SingleRowStrColumn::new) :
                getBinaryColumn("structure_solution"));
    }

    /**
     * Program/package name for structure refinement method.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxStructureRefinementMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_structure_refinement_method", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_structure_refinement_method"));
    }

    /**
     * Program/package name for data reduction/intensity integration software
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDataReductionIi() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_data_reduction_ii", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_data_reduction_ii"));
    }

    /**
     * Program/package name for data reduction/data scaling
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDataReductionDs() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_data_reduction_ds", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_data_reduction_ds"));
    }
}
