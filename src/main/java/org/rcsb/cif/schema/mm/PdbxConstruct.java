package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CONSTRUCT category specify a sequence of
 * nucleic acids or amino acids. It is a catch-all that may be used to
 * provide details of sequences known to be relevant to the project as well
 * as primers, plasmids, proteins and such like that are either used or
 * produced during the protein production process. Molecules described
 * here are not necessarily complete, so for instance it would be
 * possible to include either a complete plasmid or just its insert.
 * This category may be considered as an abbreviated form of _entity where
 * the molecules described are not required to appear in the final co-ordinates.
 * 
 * Note that the details provided here all pertain to a single entry as defined
 * at deposition. It is anticipated that _pdbx_construct.id would also be
 * composed of a sequence that is unique within a given site prefixed by a code
 * that identifies that site and would, therefore, be GLOBALLY unique. Thus
 * this category could also be used locally to store details about the different
 * constructs used during protein production without reference to the entry_id
 * (which only becomes a  meaningful concept during deposition).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxConstruct extends DelegatingCategory {
    public PdbxConstruct(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "name":
                return getName();
            case "organisation":
                return getOrganisation();
            case "entity_id":
                return getEntityId();
            case "robot_id":
                return getRobotId();
            case "date":
                return getDate();
            case "details":
                return getDetails();
            case "class":
                return getClazz();
            case "type":
                return getType();
            case "seq":
                return getSeq();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_construct.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_construct.id must uniquely identify a record
     * in the PDBX_CONSTRUCT list and should be arranged so that it is
     * composed of a site-speicific prefix combined with a value that is
     * unique within a given site.Note that this item need not be a
     * number; it can be any unique identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_construct.name  provides a placeholder for the local name
     * of the construct, for example the plasmid name if this category
     * is used to list plasmids.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_construct.organisation describes the organisation in which
     * the _pdbx_construct.id is unique. This will normally be the lab
     * in which the constrcut originated. It is envisaged that this item
     * will permit a globally unique identifier to be constructed in cases
     * where this is not possible from the _pdbx_construct.id alone.
     * @return StrColumn
     */
    public StrColumn getOrganisation() {
        return delegate.getColumn("organisation", DelegatingStrColumn::new);
    }

    /**
     * In cases where the construct IS found in the co-ordinates then this
     * item provides a  pointer to _entity.id in the ENTITY category for
     * the corresponding molecule.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * In cases where the sequence has been determined by a robot this
     * data item provides a pointer to pdbx_robot_system.id in the
     * PDBX_ROBOT_SYSTEM category for the robot responsible
     * @return StrColumn
     */
    public StrColumn getRobotId() {
        return delegate.getColumn("robot_id", DelegatingStrColumn::new);
    }

    /**
     * The date that the sequence was determined.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the construct that cannot be
     * represented in the category _pdbx_construct_feature.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The primary function of the construct. This should be considered
     * as a guideline only.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return delegate.getColumn("class", DelegatingStrColumn::new);
    }

    /**
     * The type of nucleic acid sequence in the construct. Note that
     * to find all the DNA molecules it is necessary to search for
     * DNA + cDNA and for RNA, RNA + mRNA + tRNA.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * sequence expressed as string of one-letter base codes or one
     * letter amino acid codes. Unusual residues may be represented
     * either using the appropriate one letter code wild cards or
     * by the three letter code in parentheses.
     * @return StrColumn
     */
    public StrColumn getSeq() {
        return delegate.getColumn("seq", DelegatingStrColumn::new);
    }

}