package org.rcsb.cif.model.entitykeywords;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * Keywords describing this entity.
     * @return Text
     */
    public Text getText() {
        return (Text) (isText ? textFields.computeIfAbsent("text",
                Text::new) : getBinaryColumn("text"));
    }

    /**
     * Entity mutation description(s).
     * @return PdbxMutation
     */
    public PdbxMutation getPdbxMutation() {
        return (PdbxMutation) (isText ? textFields.computeIfAbsent("pdbx_mutation",
                PdbxMutation::new) : getBinaryColumn("pdbx_mutation"));
    }

    /**
     * Entity fragment description(s).
     * @return PdbxFragment
     */
    public PdbxFragment getPdbxFragment() {
        return (PdbxFragment) (isText ? textFields.computeIfAbsent("pdbx_fragment",
                PdbxFragment::new) : getBinaryColumn("pdbx_fragment"));
    }

    /**
     * Enzyme Commission (EC) number(s)
     * @return PdbxEc
     */
    public PdbxEc getPdbxEc() {
        return (PdbxEc) (isText ? textFields.computeIfAbsent("pdbx_ec",
                PdbxEc::new) : getBinaryColumn("pdbx_ec"));
    }

    /**
     * PDB placeholder.
     * @return PdbxAntibodyIsotype
     */
    public PdbxAntibodyIsotype getPdbxAntibodyIsotype() {
        return (PdbxAntibodyIsotype) (isText ? textFields.computeIfAbsent("pdbx_antibody_isotype",
                PdbxAntibodyIsotype::new) : getBinaryColumn("pdbx_antibody_isotype"));
    }
}
