package org.rcsb.cif.model.generated.pdbxdataprocessingcell;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDataProcessingCell extends BaseCategory {
    public PdbxDataProcessingCell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDataProcessingCell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDataProcessingCell(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_data_processing_cell.entry_id identifies the data block.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Unit cell length A
     * @return A
     */
    public A getA() {
        return (A) (isText ? textFields.computeIfAbsent("a",
                A::new) : getBinaryColumn("a"));
    }

    /**
     * Tolerance in unit cell length A
     * @return ATolerance
     */
    public ATolerance getATolerance() {
        return (ATolerance) (isText ? textFields.computeIfAbsent("a_tolerance",
                ATolerance::new) : getBinaryColumn("a_tolerance"));
    }

    /**
     * Unit cell length B
     * @return B
     */
    public B getB() {
        return (B) (isText ? textFields.computeIfAbsent("b",
                B::new) : getBinaryColumn("b"));
    }

    /**
     * Tolerance in unit cell length B
     * @return BTolerance
     */
    public BTolerance getBTolerance() {
        return (BTolerance) (isText ? textFields.computeIfAbsent("b_tolerance",
                BTolerance::new) : getBinaryColumn("b_tolerance"));
    }

    /**
     * Unit cell length C
     * @return C
     */
    public C getC() {
        return (C) (isText ? textFields.computeIfAbsent("c",
                C::new) : getBinaryColumn("c"));
    }

    /**
     * Tolerance in unit cell length C
     * @return CTolerance
     */
    public CTolerance getCTolerance() {
        return (CTolerance) (isText ? textFields.computeIfAbsent("c_tolerance",
                CTolerance::new) : getBinaryColumn("c_tolerance"));
    }

    /**
     * Unit cell angle alpha.
     * @return Alpha
     */
    public Alpha getAlpha() {
        return (Alpha) (isText ? textFields.computeIfAbsent("alpha",
                Alpha::new) : getBinaryColumn("alpha"));
    }

    /**
     * Tolerance in unit cell angle alpha.
     * @return AlphaTolerance
     */
    public AlphaTolerance getAlphaTolerance() {
        return (AlphaTolerance) (isText ? textFields.computeIfAbsent("alpha_tolerance",
                AlphaTolerance::new) : getBinaryColumn("alpha_tolerance"));
    }

    /**
     * Unit cell angle beta.
     * @return Beta
     */
    public Beta getBeta() {
        return (Beta) (isText ? textFields.computeIfAbsent("beta",
                Beta::new) : getBinaryColumn("beta"));
    }

    /**
     * Tolerance in unit cell angle beta.
     * @return BetaTolerance
     */
    public BetaTolerance getBetaTolerance() {
        return (BetaTolerance) (isText ? textFields.computeIfAbsent("beta_tolerance",
                BetaTolerance::new) : getBinaryColumn("beta_tolerance"));
    }

    /**
     * Unit cell angle gamma.
     * @return Gamma
     */
    public Gamma getGamma() {
        return (Gamma) (isText ? textFields.computeIfAbsent("gamma",
                Gamma::new) : getBinaryColumn("gamma"));
    }

    /**
     * Tolerance in unit cell angle gamma.
     * @return GammaTolerance
     */
    public GammaTolerance getGammaTolerance() {
        return (GammaTolerance) (isText ? textFields.computeIfAbsent("gamma_tolerance",
                GammaTolerance::new) : getBinaryColumn("gamma_tolerance"));
    }

    /**
     * Unit cell volume.
     * @return Volume
     */
    public Volume getVolume() {
        return (Volume) (isText ? textFields.computeIfAbsent("volume",
                Volume::new) : getBinaryColumn("volume"));
    }

    /**
     * Unit cell mosaicity.
     * @return Mosaicity
     */
    public Mosaicity getMosaicity() {
        return (Mosaicity) (isText ? textFields.computeIfAbsent("mosaicity",
                Mosaicity::new) : getBinaryColumn("mosaicity"));
    }

    /**
     * Resolution range.
     * @return ResolutionRange
     */
    public ResolutionRange getResolutionRange() {
        return (ResolutionRange) (isText ? textFields.computeIfAbsent("resolution_range",
                ResolutionRange::new) : getBinaryColumn("resolution_range"));
    }

    /**
     * Space group name.
     * @return SpaceGroup
     */
    public SpaceGroup getSpaceGroup() {
        return (SpaceGroup) (isText ? textFields.computeIfAbsent("space_group",
                SpaceGroup::new) : getBinaryColumn("space_group"));
    }
}
