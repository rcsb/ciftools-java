package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEMICAL category would not in general be
 * used in a macromolecular CIF. See instead the ENTITY data
 * items.
 * 
 * Data items in the CHEMICAL category record details about the
 * composition and chemical properties of the compounds. The
 * formula data items must agree with those that specify the
 * density, unit-cell and Z values.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Chemical extends DelegatingCategory {
    public Chemical(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "compound_source":
                return getCompoundSource();
            case "melting_point":
                return getMeltingPoint();
            case "name_common":
                return getNameCommon();
            case "name_mineral":
                return getNameMineral();
            case "name_structure_type":
                return getNameStructureType();
            case "name_systematic":
                return getNameSystematic();
            case "absolute_configuration":
                return getAbsoluteConfiguration();
            case "melting_point_gt":
                return getMeltingPointGt();
            case "melting_point_lt":
                return getMeltingPointLt();
            case "optical_rotation":
                return getOpticalRotation();
            case "properties_biological":
                return getPropertiesBiological();
            case "properties_physical":
                return getPropertiesPhysical();
            case "temperature_decomposition":
                return getTemperatureDecomposition();
            case "temperature_decomposition_esd":
                return getTemperatureDecompositionEsd();
            case "temperature_decomposition_gt":
                return getTemperatureDecompositionGt();
            case "temperature_decomposition_lt":
                return getTemperatureDecompositionLt();
            case "temperature_sublimation":
                return getTemperatureSublimation();
            case "temperature_sublimation_esd":
                return getTemperatureSublimationEsd();
            case "temperature_sublimation_gt":
                return getTemperatureSublimationGt();
            case "temperature_sublimation_lt":
                return getTemperatureSublimationLt();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Description of the source of the compound under study, or of the
     * parent  molecule if a simple derivative is studied. This includes
     * the place of discovery for minerals or the actual source of a
     * natural product.
     * @return StrColumn
     */
    public StrColumn getCompoundSource() {
        return delegate.getColumn("compound_source", DelegatingStrColumn::new);
    }

    /**
     * The temperature in kelvins at which the crystalline solid changes
     * to a liquid.
     * @return FloatColumn
     */
    public FloatColumn getMeltingPoint() {
        return delegate.getColumn("melting_point", DelegatingFloatColumn::new);
    }

    /**
     * Trivial name by which the compound is commonly known.
     * @return StrColumn
     */
    public StrColumn getNameCommon() {
        return delegate.getColumn("name_common", DelegatingStrColumn::new);
    }

    /**
     * Mineral name accepted by the International Mineralogical
     * Association. Use only for natural minerals. See also
     * _chemical.compound_source.
     * @return StrColumn
     */
    public StrColumn getNameMineral() {
        return delegate.getColumn("name_mineral", DelegatingStrColumn::new);
    }

    /**
     * Commonly used structure-type name. Usually only applied to
     * minerals or inorganic compounds.
     * @return StrColumn
     */
    public StrColumn getNameStructureType() {
        return delegate.getColumn("name_structure_type", DelegatingStrColumn::new);
    }

    /**
     * IUPAC or Chemical Abstracts full name of the compound.
     * @return StrColumn
     */
    public StrColumn getNameSystematic() {
        return delegate.getColumn("name_systematic", DelegatingStrColumn::new);
    }

    /**
     * Necessary conditions for the assignment of
     * _chemical.absolute_configuration are given by H. D. Flack and
     * G. Bernardinelli (1999, 2000).
     * 
     * Ref: Flack, H. D. &amp; Bernardinelli, G. (1999). Acta Cryst. A55,
     * 908-915. (http://www.iucr.org/paper?sh0129)
     * Flack, H. D. &amp; Bernardinelli, G. (2000). J. Appl. Cryst.
     * 33, 1143-1148. (http://www.iucr.org/paper?ks0021)
     * @return StrColumn
     */
    public StrColumn getAbsoluteConfiguration() {
        return delegate.getColumn("absolute_configuration", DelegatingStrColumn::new);
    }

    /**
     * A temperature in kelvins above
     * which the melting point (the temperature at which the
     * crystalline solid changes to a liquid) lies.
     * _chemical.melting_point_gt and _chemical.melting_point_lt
     * allow a range of temperatures to be given.
     * 
     * _chemical.melting_point should always be used in preference
     * to these two items whenever possible.
     * @return FloatColumn
     */
    public FloatColumn getMeltingPointGt() {
        return delegate.getColumn("melting_point_gt", DelegatingFloatColumn::new);
    }

    /**
     * A temperature in kelvins below which the melting point (the
     * temperature at which the crystalline solid changes to a liquid)
     * lies. _chemical.melting_point_gt and _chemical.melting_point_lt
     * allow a range of temperatures to be given.
     * 
     * _chemical.melting_point should always be used in preference
     * to these two items whenever possible.
     * @return FloatColumn
     */
    public FloatColumn getMeltingPointLt() {
        return delegate.getColumn("melting_point_lt", DelegatingFloatColumn::new);
    }

    /**
     * The optical rotation in solution of the compound is
     * specified in the following format:
     * '[\a]^TEMP^~WAVE~ = SORT (c = CONC, SOLV)'
     * where:
     * TEMP is the temperature of the measurement in degrees
     * Celsius,
     * WAVE is an indication of the wavelength of the light
     * used for the measurement,
     * CONC is the concentration of the solution given as the
     * mass of the substance in g in 100 ml of solution,
     * SORT is the signed value (preceded by a + or a - sign)
     * of 100.\a/(l.c), where \a is the signed optical
     * rotation in degrees measured in a cell of length l in
     * dm and c is the value of CONC as defined above, and
     * SOLV is the chemical formula of the solvent.
     * @return StrColumn
     */
    public StrColumn getOpticalRotation() {
        return delegate.getColumn("optical_rotation", DelegatingStrColumn::new);
    }

    /**
     * A free-text description of the biological properties of the
     * material.
     * @return StrColumn
     */
    public StrColumn getPropertiesBiological() {
        return delegate.getColumn("properties_biological", DelegatingStrColumn::new);
    }

    /**
     * A free-text description of the physical properties of the material.
     * @return StrColumn
     */
    public StrColumn getPropertiesPhysical() {
        return delegate.getColumn("properties_physical", DelegatingStrColumn::new);
    }

    /**
     * The temperature in kelvins at which the solid decomposes.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureDecomposition() {
        return delegate.getColumn("temperature_decomposition", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of
     * _chemical.temperature_decomposition.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureDecompositionEsd() {
        return delegate.getColumn("temperature_decomposition_esd", DelegatingFloatColumn::new);
    }

    /**
     * A temperature in kelvins above which the solid is known to
     * decompose. _chemical.temperature_decomposition_gt and
     * _chemical.temperature_decomposition_lt allow
     * a range of temperatures to be given.
     * 
     * _chemical.temperature_decomposition should always be used in
     * preference to these two items whenever possible.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureDecompositionGt() {
        return delegate.getColumn("temperature_decomposition_gt", DelegatingFloatColumn::new);
    }

    /**
     * A temperature in kelvins below which the solid is known to
     * decompose. _chemical.temperature_decomposition_gt and
     * _chemical.temperature_decomposition_lt allow
     * a range of temperatures to be given.
     * 
     * _chemical.temperature_decomposition should always be used in
     * preference to these two items whenever possible.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureDecompositionLt() {
        return delegate.getColumn("temperature_decomposition_lt", DelegatingFloatColumn::new);
    }

    /**
     * The temperature in kelvins at which the solid sublimes.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureSublimation() {
        return delegate.getColumn("temperature_sublimation", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of
     * _chemical.temperature_sublimation.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureSublimationEsd() {
        return delegate.getColumn("temperature_sublimation_esd", DelegatingFloatColumn::new);
    }

    /**
     * A temperature in kelvins above which the solid is known to
     * sublime. _chemical.temperature_sublimation_gt and
     * _chemical.temperature_sublimation_lt allow a
     * range of temperatures to be given.
     * 
     * _chemical.temperature_sublimation should always be used in
     * preference to these two items whenever possible.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureSublimationGt() {
        return delegate.getColumn("temperature_sublimation_gt", DelegatingFloatColumn::new);
    }

    /**
     * A temperature in kelvins below which the solid is known to
     * sublime. _chemical.temperature_sublimation_gt and
     * _chemical.temperature_sublimation_lt allow a
     * range of temperatures to be given.
     * 
     * _chemical.temperature_sublimation should always be used in
     * preference to these two items whenever possible.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureSublimationLt() {
        return delegate.getColumn("temperature_sublimation_lt", DelegatingFloatColumn::new);
    }

}