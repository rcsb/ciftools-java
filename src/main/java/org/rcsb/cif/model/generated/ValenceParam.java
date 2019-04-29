package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the VALENCE_PARAM category define the
 * parameters used for calculating bond valences from bond
 * lengths.  In addition to the parameters, a pointer
 * is given to the reference (in VALENCE_REF) from which
 * the bond-valence parameters were taken.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ValenceParam extends BaseCategory {
    public ValenceParam(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ValenceParam(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ValenceParam(String name) {
        super(name);
    }

    /**
     * The element symbol of the first atom forming the bond whose
     * bond-valence parameters are given in this category.
     * @return StrColumn
     */
    public StrColumn getAtom1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_1", StrColumn::new) :
                getBinaryColumn("atom_1"));
    }

    /**
     * The valence (formal charge) of the first atom whose
     * bond-valence parameters are given in this category.
     * @return IntColumn
     */
    public IntColumn getAtom1Valence() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_1_valence", IntColumn::new) :
                getBinaryColumn("atom_1_valence"));
    }

    /**
     * The element symbol of the second atom forming the bond whose
     * bond-valence parameters are given in this category.
     * @return StrColumn
     */
    public StrColumn getAtom2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_2", StrColumn::new) :
                getBinaryColumn("atom_2"));
    }

    /**
     * The valence (formal charge) of the second atom whose
     * bond-valence parameters are given in this category.
     * @return IntColumn
     */
    public IntColumn getAtom2Valence() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_2_valence", IntColumn::new) :
                getBinaryColumn("atom_2_valence"));
    }

    /**
     * The bond-valence parameter B used in the expression
     * 
     * s = exp[(Ro - R)/B]
     * 
     * where s is the valence of a bond of length R.
     * @return FloatColumn
     */
    public FloatColumn getB() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B", FloatColumn::new) :
                getBinaryColumn("B"));
    }

    /**
     * Details of or comments on the bond-valence parameters.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * An identifier for the valence parameters of a bond between
     * the given atoms.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * An identifier which links to the reference to the source
     * from which the bond-valence parameters are taken. A child
     * of _valence_ref.id which it must match.
     * @return StrColumn
     */
    public StrColumn getRefId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_id", StrColumn::new) :
                getBinaryColumn("ref_id"));
    }

    /**
     * The bond-valence parameter Ro used in the expression
     * 
     * s = exp[(Ro - R)/B]
     * 
     * where s is the valence of a bond of length R.
     * @return FloatColumn
     */
    public FloatColumn getRo() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Ro", FloatColumn::new) :
                getBinaryColumn("Ro"));
    }
}
