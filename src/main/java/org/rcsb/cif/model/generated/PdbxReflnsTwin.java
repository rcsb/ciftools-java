package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Details decribing crystallographic twinning.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxReflnsTwin extends BaseCategory {
    public PdbxReflnsTwin(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReflnsTwin(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReflnsTwin(String name) {
        super(name);
    }

    /**
     * The diffraction data set identifier.  A reference to
     * _diffrn.id in category DIFFRN.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * The crystal identifier.  A reference to
     * _exptl_crystal.id in category EXPTL_CRYSTAL.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_id", StrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * An identifier for the twin domain.
     * @return StrColumn
     */
    public StrColumn getDomainId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("domain_id", StrColumn::new) :
                getBinaryColumn("domain_id"));
    }

    /**
     * 
     * There are two types of twinning: merohedral or hemihedral
     * non-merohedral or epitaxial
     * 
     * For merohedral twinning the diffraction patterns from the different domains are
     * completely superimposable.   Hemihedral twinning is a special case of merohedral
     * twinning. It only involves two distinct domains.  Pseudo-merohedral twinning is
     * a subclass merohedral twinning in which lattice is coincidentally superimposable.
     * 
     * In the case of non-merohedral or epitaxial twinning  the reciprocal
     * lattices do not superimpose exactly. In this case the  diffraction pattern
     * consists of two (or more) interpenetrating lattices, which can in principle
     * be separated.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * 
     * 
     * The possible merohedral or hemihedral twinning operators for different
     * point groups are:
     * 
     * True point group  	Twin operation  	hkl related to
     * 3                      	2 along a,b             h,-h-k,-l
     * 2 along a*,b*           h+k,-k,-l
     * 2 along c               -h,-k,l
     * 4                       2 along a,b,a*,b*       h,-k,-l
     * 6                       2 along a,b,a*,b*       h,-h-k,-l
     * 321                     2 along a*,b*,c         -h,-k,l
     * 312                     2 along a,b,c           -h,-k,l
     * 23                      4 along a,b,c            k,-h,l
     * 
     * References:
     * Yeates, T.O. (1997) Methods in Enzymology 276, 344-358. Detecting and
     * Overcoming Crystal Twinning.
     * 
     * and information from the following on-line sites:
     * 
     * CNS site http://cns.csb.yale.edu/v1.1/
     * CCP4 site http://www.ccp4.ac.uk/dist/html/detwin.html
     * SHELX site http://shelx.uni-ac.gwdg.de/~rherbst/twin.html
     * @return StrColumn
     */
    public StrColumn getOperator() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("operator", StrColumn::new) :
                getBinaryColumn("operator"));
    }

    /**
     * 
     * The twin fraction or twin factor represents a quantitative parameter for the
     * crystal twinning.  The value 0 represents no twinning, &lt; 0.5 partial twinning,
     * = 0.5 for perfect twinning.
     * @return FloatColumn
     */
    public FloatColumn getFraction() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fraction", FloatColumn::new) :
                getBinaryColumn("fraction"));
    }

    /**
     * 
     * The ideal statistics for twinned crystals. The values calculated with the
     * acentric data are given below.
     * 
     * Statistic	Untwinned data	Perfect twinned data
     * &lt;I^2&gt;/&lt;I&gt;^2	2.0             1.5
     * &lt;F&gt;^2/&lt;F^2&gt;	0.785           0.865
     * 
     * References:
     * Yeates, T.O. (1997) Methods in Enzymology 276, 344-358. Detecting and
     * Overcoming Crystal Twinning.
     * 
     * and information from the following on-line sites:
     * CNS site http://cns.csb.yale.edu/v1.1/
     * CCP4 site http://www.ccp4.ac.uk/dist/html/detwin.html
     * SHELX site http://shelx.uni-ac.gwdg.de/~rherbst/twin.html
     * @return FloatColumn
     */
    public FloatColumn getMeanI2OverMeanISquare() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_I2_over_mean_I_square", FloatColumn::new) :
                getBinaryColumn("mean_I2_over_mean_I_square"));
    }

    /**
     * 
     * The ideal statistics for twinned crystals. The values calculated with the
     * acentric data are given below.
     * 
     * Statistic	Untwinned data	Perfect twinned data
     * &lt;I^2&gt;/&lt;I&gt;^2	2.0             1.5
     * &lt;F&gt;^2/&lt;F^2&gt;	0.785           0.865
     * 
     * References:
     * Yeates, T.O. (1997) Methods in Enzymology 276, 344-358. Detecting and
     * Overcoming Crystal Twinning.
     * 
     * and information from the following on-line sites:
     * CNS site http://cns.csb.yale.edu/v1.1/
     * CCP4 site http://www.ccp4.ac.uk/dist/html/detwin.html
     * SHELX site http://shelx.uni-ac.gwdg.de/~rherbst/twin.html
     * @return FloatColumn
     */
    public FloatColumn getMeanFSquareOverMeanF2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_F_square_over_mean_F2", FloatColumn::new) :
                getBinaryColumn("mean_F_square_over_mean_F2"));
    }
}
