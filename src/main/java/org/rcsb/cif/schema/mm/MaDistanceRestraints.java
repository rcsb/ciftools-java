package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_DISTANCE_RESTRAINTS category records the
 * list of distance restraints used in the modeling.
 * These distances can be atomic or residue-wise distances.
 * This has been adapted from the widely used CASP RR format
 * (http://www.predictioncenter.org/casp8/index.cgi?page=format#RR).
 * These distances may be derived from various coevolution MSA or other
 * exeperimental or computational methods.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaDistanceRestraints extends DelegatingCategory {
    public MaDistanceRestraints(Category delegate) {
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
            case "asym_id_1":
                return getAsymId1();
            case "asym_id_2":
                return getAsymId2();
            case "comp_id_1":
                return getCompId1();
            case "comp_id_2":
                return getCompId2();
            case "seq_id_1":
                return getSeqId1();
            case "seq_id_2":
                return getSeqId2();
            case "atom_id_1":
                return getAtomId1();
            case "atom_id_2":
                return getAtomId2();
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
            case "granularity":
                return getGranularity();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the distance restraint record.
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
     * The entity identifier for the first partner in the distance restraint.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId1() {
        return delegate.getColumn("entity_id_1", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier for the second partner in the distance restraint.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId2() {
        return delegate.getColumn("entity_id_2", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the first partner in the distance restraint.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASY category.
     * @return StrColumn
     */
    public StrColumn getAsymId1() {
        return delegate.getColumn("asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the second partner in the distance restraint.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASY category.
     * @return StrColumn
     */
    public StrColumn getAsymId2() {
        return delegate.getColumn("asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the first partner in the distance restraint.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the second partner in the distance restraint.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The sequence index for the first partner in the distance restraint.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId1() {
        return delegate.getColumn("seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * The sequence index for the second partner in the distance restraint.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId2() {
        return delegate.getColumn("seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * A atom identifier for the first partner in the distance restraint.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * A atom identifier for the second partner in the distance restraint.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The lower limit of the distance threshold.
     * @return FloatColumn
     */
    public FloatColumn getLowerLimit() {
        return delegate.getColumn("lower_limit", DelegatingFloatColumn::new);
    }

    /**
     * The upper limit of the distance threshold.
     * @return FloatColumn
     */
    public FloatColumn getUpperLimit() {
        return delegate.getColumn("upper_limit", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the lower limit distance threshold applied to this distance restraint.
     * @return FloatColumn
     */
    public FloatColumn getLowerLimitEsd() {
        return delegate.getColumn("lower_limit_esd", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of the upper limit distance threshold applied to this distance restraint.
     * @return FloatColumn
     */
    public FloatColumn getUpperLimitEsd() {
        return delegate.getColumn("upper_limit_esd", DelegatingFloatColumn::new);
    }

    /**
     * The real number that indicates the probability that the distance restraint
     * is correct. This number should fall between 0.0 and 1.0.
     * @return FloatColumn
     */
    public FloatColumn getProbability() {
        return delegate.getColumn("probability", DelegatingFloatColumn::new);
    }

    /**
     * The type of distance restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return delegate.getColumn("restraint_type", DelegatingStrColumn::new);
    }

    /**
     * The granularity of the predicted contact as applied to the model.
     * @return StrColumn
     */
    public StrColumn getGranularity() {
        return delegate.getColumn("granularity", DelegatingStrColumn::new);
    }

}