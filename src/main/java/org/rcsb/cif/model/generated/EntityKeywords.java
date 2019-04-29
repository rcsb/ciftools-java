package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ENTITY_KEYWORDS category specify keywords
 * relevant to the molecular entities. Note that this list of
 * keywords is separate from the list that is used for the
 * STRUCT_BIOL data items and is intended to provide only the
 * information that one would know about the molecular entity *if
 * one did not know its structure*. Hence polypeptides are simply
 * polypeptides, not cytokines or beta-alpha-barrels, and
 * polyribonucleic acids are simply poly-RNA, not transfer-
 * RNA.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EntityKeywords extends BaseCategory {
    public EntityKeywords(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EntityKeywords(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EntityKeywords(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * Keywords describing this entity.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }

    /**
     * Entity mutation description(s).
     * @return StrColumn
     */
    public StrColumn getPdbxMutation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_mutation", StrColumn::new) :
                getBinaryColumn("pdbx_mutation"));
    }

    /**
     * Entity fragment description(s).
     * @return StrColumn
     */
    public StrColumn getPdbxFragment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_fragment", StrColumn::new) :
                getBinaryColumn("pdbx_fragment"));
    }

    /**
     * Enzyme Commission (EC) number(s)
     * @return StrColumn
     */
    public StrColumn getPdbxEc() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ec", StrColumn::new) :
                getBinaryColumn("pdbx_ec"));
    }

    /**
     * PDB placeholder.
     * @return StrColumn
     */
    public StrColumn getPdbxAntibodyIsotype() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_antibody_isotype", StrColumn::new) :
                getBinaryColumn("pdbx_antibody_isotype"));
    }
}
