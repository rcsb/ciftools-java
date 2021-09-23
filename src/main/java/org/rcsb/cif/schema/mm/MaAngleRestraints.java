package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_ANGLE_RESTRAINTS category captures the
 * details of angle restraints between atoms. Each angle is spanned
 * from atom one to atom three. Each atom defining the angle can be
 * part of any entity present and does not originate in the same
 * entity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaAngleRestraints extends DelegatingCategory {
    public MaAngleRestraints(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "restraint_id":
                return getRestraintId();
            case "entity_id_1":
                return getEntityId1();
            case "entity_id_2":
                return getEntityId2();
            case "entity_id_3":
                return getEntityId3();
            case "asym_id_1":
                return getAsymId1();
            case "asym_id_2":
                return getAsymId2();
            case "asym_id_3":
                return getAsymId3();
            case "comp_id_1":
                return getCompId1();
            case "comp_id_2":
                return getCompId2();
            case "comp_id_3":
                return getCompId3();
            case "seq_id_1":
                return getSeqId1();
            case "seq_id_2":
                return getSeqId2();
            case "seq_id_3":
                return getSeqId3();
            case "atom_id_1":
                return getAtomId1();
            case "atom_id_2":
                return getAtomId2();
            case "atom_id_3":
                return getAtomId3();
            case "lower_limit":
                return getLowerLimit();
            case "upper_limit":
                return getUpperLimit();
            case "lower_limit_esd":
                return getLowerLimitEsd();
            case "upper_limit_esd":
                return getUpperLimitEsd();
            case "probability":
                return getProbability();
            case "restraint_type":
                return getRestraintType();
            case "name":
                return getName();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the angle restraint record.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier pointing to the _ma_restraints.restraint_id in the MA_RESTRAINTS category.
     * @return IntColumn
     */
    public IntColumn getRestraintId() {
        return delegate.getColumn("restraint_id", DelegatingIntColumn::new);
    }

    /**
     * The entity identifier for the first partner in the angle restraint.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId1() {
        return delegate.getColumn("entity_id_1", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier for the second partner in the angle restraint.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId2() {
        return delegate.getColumn("entity_id_2", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier for the third partner in the angle restraint.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId3() {
        return delegate.getColumn("entity_id_3", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the first partner in the angle restraint.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASY category.
     * @return StrColumn
     */
    public StrColumn getAsymId1() {
        return delegate.getColumn("asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the second partner in the angle restraint.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASY category.
     * @return StrColumn
     */
    public StrColumn getAsymId2() {
        return delegate.getColumn("asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the third partner in the angle restraint.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASY category.
     * @return StrColumn
     */
    public StrColumn getAsymId3() {
        return delegate.getColumn("asym_id_3", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the first partner in the angle restraint.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the second partner in the angle restraint.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the third partner in the angle restraint.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId3() {
        return delegate.getColumn("comp_id_3", DelegatingStrColumn::new);
    }

    /**
     * The sequence index for the first partner in the angle restraint.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId1() {
        return delegate.getColumn("seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * The sequence index for the second partner in the angle restraint.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId2() {
        return delegate.getColumn("seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * The sequence index for the third partner in the angle restraint.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId3() {
        return delegate.getColumn("seq_id_3", DelegatingIntColumn::new);
    }

    /**
     * Atom identifier for the first partner in the angle restraint.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * Atom identifier for the second partner in the angle restraint.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * Atom identifier for the third partner in the angle restraint.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId3() {
        return delegate.getColumn("atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * The lower limit of the angle threshold.
     * @return FloatColumn
     */
    public FloatColumn getLowerLimit() {
        return delegate.getColumn("lower_limit", DelegatingFloatColumn::new);
    }

    /**
     * The upper limit of the angle threshold.
     * @return FloatColumn
     */
    public FloatColumn getUpperLimit() {
        return delegate.getColumn("upper_limit", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the lower limit applied to this angle restraint.
     * @return FloatColumn
     */
    public FloatColumn getLowerLimitEsd() {
        return delegate.getColumn("lower_limit_esd", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the upper limit applied to this angle restraint.
     * @return FloatColumn
     */
    public FloatColumn getUpperLimitEsd() {
        return delegate.getColumn("upper_limit_esd", DelegatingFloatColumn::new);
    }

    /**
     * The real number that indicates the probability that the angle restraint
     * is correct. This number should fall between 0.0 and 1.0.
     * @return FloatColumn
     */
    public FloatColumn getProbability() {
        return delegate.getColumn("probability", DelegatingFloatColumn::new);
    }

    /**
     * The type of restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return delegate.getColumn("restraint_type", DelegatingStrColumn::new);
    }

    /**
     * The angle name, if applicable.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

}