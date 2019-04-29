package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the category record overall map properties such
 * as correlation, real space Rfactors and the Zscore calculated
 * from refmac and mapman.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDccRsccMapmanOverall extends BaseCategory {
    public PdbxDccRsccMapmanOverall(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDccRsccMapmanOverall(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDccRsccMapmanOverall(String name) {
        super(name);
    }

    /**
     * The PDB id code.
     * @return StrColumn
     */
    public StrColumn getPdbid() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbid", StrColumn::new) :
                getBinaryColumn("pdbid"));
    }

    /**
     * The overall real space electron density correlation coefficient
     * (RSCC) for the structure.
     * @return FloatColumn
     */
    public FloatColumn getCorrelation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correlation", FloatColumn::new) :
                getBinaryColumn("correlation"));
    }

    /**
     * The overall standard deviation of the real space electron density
     * correlation coefficient (RSCC) for the structure.
     * @return FloatColumn
     */
    public FloatColumn getCorrelationSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correlation_sigma", FloatColumn::new) :
                getBinaryColumn("correlation_sigma"));
    }

    /**
     * The overall Real Space Rfactor (RSR) for the structure.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceR() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("real_space_R", FloatColumn::new) :
                getBinaryColumn("real_space_R"));
    }

    /**
     * The overall standard deviation of the Real Space Rfactor (RSR)
     * for the structure.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceRSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("real_space_R_sigma", FloatColumn::new) :
                getBinaryColumn("real_space_R_sigma"));
    }
}
