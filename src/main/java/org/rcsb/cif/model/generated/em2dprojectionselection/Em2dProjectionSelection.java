package org.rcsb.cif.model.generated.em2dprojectionselection;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Em2dProjectionSelection extends BaseCategory {
    public Em2dProjectionSelection(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Em2dProjectionSelection(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Em2dProjectionSelection(String name) {
        super(name);
    }

    /**
     * entry id
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * unique identifier for each projection selection description
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The number of particles selected from the projection set of images.
     * @return NumParticles
     */
    public NumParticles getNumParticles() {
        return (NumParticles) (isText ? textFields.computeIfAbsent("num_particles",
                NumParticles::new) : getBinaryColumn("num_particles"));
    }

    /**
     * The software used to select 2d projections.
     * @return SoftwareName
     */
    public SoftwareName getSoftwareName() {
        return (SoftwareName) (isText ? textFields.computeIfAbsent("software_name",
                SoftwareName::new) : getBinaryColumn("software_name"));
    }

    /**
     * The method used for selecting observed assemblies.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * Any additional details used for selecting observed assemblies.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _citation.id in the
     * CITATION category.
     * @return CitationId
     */
    public CitationId getCitationId() {
        return (CitationId) (isText ? textFields.computeIfAbsent("citation_id",
                CitationId::new) : getBinaryColumn("citation_id"));
    }
}
