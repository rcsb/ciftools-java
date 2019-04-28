package org.rcsb.cif.model.generated.computing;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Software used for cell refinement.
     * 
     * Give the program or package name and a brief reference.
     * @return CellRefinement
     */
    public CellRefinement getCellRefinement() {
        return (CellRefinement) (isText ? textFields.computeIfAbsent("cell_refinement",
                CellRefinement::new) : getBinaryColumn("cell_refinement"));
    }

    /**
     * Software used for data collection.
     * 
     * Give the program or package name and a brief reference.
     * @return DataCollection
     */
    public DataCollection getDataCollection() {
        return (DataCollection) (isText ? textFields.computeIfAbsent("data_collection",
                DataCollection::new) : getBinaryColumn("data_collection"));
    }

    /**
     * Software used for data reduction.
     * 
     * Give the program or package name and a brief reference.
     * @return DataReduction
     */
    public DataReduction getDataReduction() {
        return (DataReduction) (isText ? textFields.computeIfAbsent("data_reduction",
                DataReduction::new) : getBinaryColumn("data_reduction"));
    }

    /**
     * Software used for molecular graphics.
     * 
     * Give the program or package name and a brief reference.
     * @return MolecularGraphics
     */
    public MolecularGraphics getMolecularGraphics() {
        return (MolecularGraphics) (isText ? textFields.computeIfAbsent("molecular_graphics",
                MolecularGraphics::new) : getBinaryColumn("molecular_graphics"));
    }

    /**
     * Software used for generating material for publication.
     * 
     * Give the program or package name and a brief reference.
     * @return PublicationMaterial
     */
    public PublicationMaterial getPublicationMaterial() {
        return (PublicationMaterial) (isText ? textFields.computeIfAbsent("publication_material",
                PublicationMaterial::new) : getBinaryColumn("publication_material"));
    }

    /**
     * Software used for refinement of the structure.
     * 
     * Give the program or package name and a brief reference.
     * @return StructureRefinement
     */
    public StructureRefinement getStructureRefinement() {
        return (StructureRefinement) (isText ? textFields.computeIfAbsent("structure_refinement",
                StructureRefinement::new) : getBinaryColumn("structure_refinement"));
    }

    /**
     * Software used for solution of the structure.
     * 
     * Give the program or package name and a brief reference.
     * @return StructureSolution
     */
    public StructureSolution getStructureSolution() {
        return (StructureSolution) (isText ? textFields.computeIfAbsent("structure_solution",
                StructureSolution::new) : getBinaryColumn("structure_solution"));
    }

    /**
     * Program/package name for structure refinement method.
     * @return PdbxStructureRefinementMethod
     */
    public PdbxStructureRefinementMethod getPdbxStructureRefinementMethod() {
        return (PdbxStructureRefinementMethod) (isText ? textFields.computeIfAbsent("pdbx_structure_refinement_method",
                PdbxStructureRefinementMethod::new) : getBinaryColumn("pdbx_structure_refinement_method"));
    }

    /**
     * Program/package name for data reduction/intensity integration software
     * @return PdbxDataReductionIi
     */
    public PdbxDataReductionIi getPdbxDataReductionIi() {
        return (PdbxDataReductionIi) (isText ? textFields.computeIfAbsent("pdbx_data_reduction_ii",
                PdbxDataReductionIi::new) : getBinaryColumn("pdbx_data_reduction_ii"));
    }

    /**
     * Program/package name for data reduction/data scaling
     * @return PdbxDataReductionDs
     */
    public PdbxDataReductionDs getPdbxDataReductionDs() {
        return (PdbxDataReductionDs) (isText ? textFields.computeIfAbsent("pdbx_data_reduction_ds",
                PdbxDataReductionDs::new) : getBinaryColumn("pdbx_data_reduction_ds"));
    }
}
