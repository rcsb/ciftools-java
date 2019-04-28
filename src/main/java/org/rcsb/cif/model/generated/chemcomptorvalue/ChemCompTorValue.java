package org.rcsb.cif.model.generated.chemcomptorvalue;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemCompTorValue extends BaseCategory {
    public ChemCompTorValue(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemCompTorValue(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemCompTorValue(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _chem_comp_atom.comp_id in the
     * CHEM_COMP_ATOM category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * This data item is a pointer to _chem_comp_tor.id in the
     * CHEM_COMP_TOR category.
     * @return TorId
     */
    public TorId getTorId() {
        return (TorId) (isText ? textFields.computeIfAbsent("tor_id",
                TorId::new) : getBinaryColumn("tor_id"));
    }

    /**
     * A value that should be taken as a potential target value for the
     * torsion angle associated with the specified atoms, expressed in
     * degrees.
     * @return Angle
     */
    public Angle getAngle() {
        return (Angle) (isText ? textFields.computeIfAbsent("angle",
                Angle::new) : getBinaryColumn("angle"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_tor_value.angle.
     * @return AngleEsd
     */
    public AngleEsd getAngleEsd() {
        return (AngleEsd) (isText ? textFields.computeIfAbsent("angle_esd",
                AngleEsd::new) : getBinaryColumn("angle_esd"));
    }

    /**
     * A value that should be taken as a potential target value for the
     * torsion angle associated with the specified atoms, expressed as
     * the distance between the atoms specified by
     * _chem_comp_tor.atom_id_1 and _chem_comp_tor.atom_id_4 in the
     * referenced record in the CHEM_COMP_TOR list. Note that the
     * torsion angle cannot be fully specified by a distance (for
     * instance, a torsion angle of -60  degree will yield the same
     * distance as a 60 degree angle). However, the distance
     * specification can be useful for refinement in situations
     * in which the angle is already close to the desired value.
     * @return Dist
     */
    public Dist getDist() {
        return (Dist) (isText ? textFields.computeIfAbsent("dist",
                Dist::new) : getBinaryColumn("dist"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_tor_value.dist.
     * @return DistEsd
     */
    public DistEsd getDistEsd() {
        return (DistEsd) (isText ? textFields.computeIfAbsent("dist_esd",
                DistEsd::new) : getBinaryColumn("dist_esd"));
    }
}
