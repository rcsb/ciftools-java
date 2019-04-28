package org.rcsb.cif.model.generated.valenceparam;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Atom1
     */
    public Atom1 getAtom1() {
        return (Atom1) (isText ? textFields.computeIfAbsent("atom_1",
                Atom1::new) : getBinaryColumn("atom_1"));
    }

    /**
     * The valence (formal charge) of the first atom whose
     * bond-valence parameters are given in this category.
     * @return Atom1Valence
     */
    public Atom1Valence getAtom1Valence() {
        return (Atom1Valence) (isText ? textFields.computeIfAbsent("atom_1_valence",
                Atom1Valence::new) : getBinaryColumn("atom_1_valence"));
    }

    /**
     * The element symbol of the second atom forming the bond whose
     * bond-valence parameters are given in this category.
     * @return Atom2
     */
    public Atom2 getAtom2() {
        return (Atom2) (isText ? textFields.computeIfAbsent("atom_2",
                Atom2::new) : getBinaryColumn("atom_2"));
    }

    /**
     * The valence (formal charge) of the second atom whose
     * bond-valence parameters are given in this category.
     * @return Atom2Valence
     */
    public Atom2Valence getAtom2Valence() {
        return (Atom2Valence) (isText ? textFields.computeIfAbsent("atom_2_valence",
                Atom2Valence::new) : getBinaryColumn("atom_2_valence"));
    }

    /**
     * The bond-valence parameter B used in the expression
     * 
     * s = exp[(Ro - R)/B]
     * 
     * where s is the valence of a bond of length R.
     * @return B
     */
    public B getB() {
        return (B) (isText ? textFields.computeIfAbsent("B",
                B::new) : getBinaryColumn("B"));
    }

    /**
     * Details of or comments on the bond-valence parameters.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * An identifier for the valence parameters of a bond between
     * the given atoms.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * An identifier which links to the reference to the source
     * from which the bond-valence parameters are taken. A child
     * of _valence_ref.id which it must match.
     * @return RefId
     */
    public RefId getRefId() {
        return (RefId) (isText ? textFields.computeIfAbsent("ref_id",
                RefId::new) : getBinaryColumn("ref_id"));
    }

    /**
     * The bond-valence parameter Ro used in the expression
     * 
     * s = exp[(Ro - R)/B]
     * 
     * where s is the valence of a bond of length R.
     * @return Ro
     */
    public Ro getRo() {
        return (Ro) (isText ? textFields.computeIfAbsent("Ro",
                Ro::new) : getBinaryColumn("Ro"));
    }
}
