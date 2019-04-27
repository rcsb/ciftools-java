package org.rcsb.cif.model.pdbxdccrsccmapmanoverall;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Pdbid
     */
    public Pdbid getPdbid() {
        return (Pdbid) (isText ? textFields.computeIfAbsent("pdbid",
                Pdbid::new) : getBinaryColumn("pdbid"));
    }

    /**
     * The overall real space electron density correlation coefficient
     * (RSCC) for the structure.
     * @return Correlation
     */
    public Correlation getCorrelation() {
        return (Correlation) (isText ? textFields.computeIfAbsent("correlation",
                Correlation::new) : getBinaryColumn("correlation"));
    }

    /**
     * The overall standard deviation of the real space electron density
     * correlation coefficient (RSCC) for the structure.
     * @return CorrelationSigma
     */
    public CorrelationSigma getCorrelationSigma() {
        return (CorrelationSigma) (isText ? textFields.computeIfAbsent("correlation_sigma",
                CorrelationSigma::new) : getBinaryColumn("correlation_sigma"));
    }

    /**
     * The overall Real Space Rfactor (RSR) for the structure.
     * @return RealSpaceR
     */
    public RealSpaceR getRealSpaceR() {
        return (RealSpaceR) (isText ? textFields.computeIfAbsent("real_space_R",
                RealSpaceR::new) : getBinaryColumn("real_space_R"));
    }

    /**
     * The overall standard deviation of the Real Space Rfactor (RSR)
     * for the structure.
     * @return RealSpaceRSigma
     */
    public RealSpaceRSigma getRealSpaceRSigma() {
        return (RealSpaceRSigma) (isText ? textFields.computeIfAbsent("real_space_R_sigma",
                RealSpaceRSigma::new) : getBinaryColumn("real_space_R_sigma"));
    }
}
