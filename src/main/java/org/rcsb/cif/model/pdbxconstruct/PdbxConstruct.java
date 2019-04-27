package org.rcsb.cif.model.pdbxconstruct;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxConstruct extends BaseCategory {
    public PdbxConstruct(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxConstruct(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxConstruct(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_construct.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_construct.id must uniquely identify a record
     * in the PDBX_CONSTRUCT list and should be arranged so that it is
     * composed of a site-speicific prefix combined with a value that is
     * unique within a given site.Note that this item need not be a
     * number; it can be any unique identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * _pdbx_construct.name  provides a placeholder for the local name
     * of the construct, for example the plasmid name if this category
     * is used to list plasmids.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * _pdbx_construct.organisation describes the organisation in which
     * the _pdbx_construct.id is unique. This will normally be the lab
     * in which the constrcut originated. It is envisaged that this item
     * will permit a globally unique identifier to be constructed in cases
     * where this is not possible from the _pdbx_construct.id alone.
     * @return Organisation
     */
    public Organisation getOrganisation() {
        return (Organisation) (isText ? textFields.computeIfAbsent("organisation",
                Organisation::new) : getBinaryColumn("organisation"));
    }

    /**
     * In cases where the construct IS found in the co-ordinates then this
     * item provides a  pointer to _entity.id in the ENTITY category for
     * the corresponding molecule.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * In cases where the sequence has been determined by a robot this
     * data item provides a pointer to pdbx_robot_system.id in the
     * PDBX_ROBOT_SYSTEM category for the robot responsible
     * @return RobotId
     */
    public RobotId getRobotId() {
        return (RobotId) (isText ? textFields.computeIfAbsent("robot_id",
                RobotId::new) : getBinaryColumn("robot_id"));
    }

    /**
     * The date that the sequence was determined.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * Additional details about the construct that cannot be
     * represented in the category _pdbx_construct_feature.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The primary function of the construct. This should be considered
     * as a guideline only.
     * @return Clazz
     */
    public Clazz getClazz() {
        return (Clazz) (isText ? textFields.computeIfAbsent("class",
                Clazz::new) : getBinaryColumn("class"));
    }

    /**
     * The type of nucleic acid sequence in the construct. Note that
     * to find all the DNA molecules it is necessary to search for
     * DNA + cDNA and for RNA, RNA + mRNA + tRNA.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * sequence expressed as string of one-letter base codes or one
     * letter amino acid codes. Unusual residues may be represented
     * either using the appropriate one letter code wild cards or
     * by the three letter code in parentheses.
     * @return Seq
     */
    public Seq getSeq() {
        return (Seq) (isText ? textFields.computeIfAbsent("seq",
                Seq::new) : getBinaryColumn("seq"));
    }
}
