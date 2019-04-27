package org.rcsb.cif.model.chemical;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Chemical extends BaseCategory {
    public Chemical(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Chemical(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Chemical(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Description of the source of the compound under study, or of the
     * parent  molecule if a simple derivative is studied. This includes
     * the place of discovery for minerals or the actual source of a
     * natural product.
     * @return CompoundSource
     */
    public CompoundSource getCompoundSource() {
        return (CompoundSource) (isText ? textFields.computeIfAbsent("compound_source",
                CompoundSource::new) : getBinaryColumn("compound_source"));
    }

    /**
     * The temperature in kelvins at which the crystalline solid changes
     * to a liquid.
     * @return MeltingPoint
     */
    public MeltingPoint getMeltingPoint() {
        return (MeltingPoint) (isText ? textFields.computeIfAbsent("melting_point",
                MeltingPoint::new) : getBinaryColumn("melting_point"));
    }

    /**
     * Trivial name by which the compound is commonly known.
     * @return NameCommon
     */
    public NameCommon getNameCommon() {
        return (NameCommon) (isText ? textFields.computeIfAbsent("name_common",
                NameCommon::new) : getBinaryColumn("name_common"));
    }

    /**
     * Mineral name accepted by the International Mineralogical
     * Association. Use only for natural minerals. See also
     * _chemical.compound_source.
     * @return NameMineral
     */
    public NameMineral getNameMineral() {
        return (NameMineral) (isText ? textFields.computeIfAbsent("name_mineral",
                NameMineral::new) : getBinaryColumn("name_mineral"));
    }

    /**
     * Commonly used structure-type name. Usually only applied to
     * minerals or inorganic compounds.
     * @return NameStructureType
     */
    public NameStructureType getNameStructureType() {
        return (NameStructureType) (isText ? textFields.computeIfAbsent("name_structure_type",
                NameStructureType::new) : getBinaryColumn("name_structure_type"));
    }

    /**
     * IUPAC or Chemical Abstracts full name of the compound.
     * @return NameSystematic
     */
    public NameSystematic getNameSystematic() {
        return (NameSystematic) (isText ? textFields.computeIfAbsent("name_systematic",
                NameSystematic::new) : getBinaryColumn("name_systematic"));
    }

    /**
     * Necessary conditions for the assignment of
     * _chemical.absolute_configuration are given by H. D. Flack and
     * G. Bernardinelli (1999, 2000).
     * 
     * Ref: Flack, H. D. & Bernardinelli, G. (1999). Acta Cryst. A55,
     * 908-915. (http://www.iucr.org/paper?sh0129)
     * Flack, H. D. & Bernardinelli, G. (2000). J. Appl. Cryst.
     * 33, 1143-1148. (http://www.iucr.org/paper?ks0021)
     * @return AbsoluteConfiguration
     */
    public AbsoluteConfiguration getAbsoluteConfiguration() {
        return (AbsoluteConfiguration) (isText ? textFields.computeIfAbsent("absolute_configuration",
                AbsoluteConfiguration::new) : getBinaryColumn("absolute_configuration"));
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
     * @return MeltingPointGt
     */
    public MeltingPointGt getMeltingPointGt() {
        return (MeltingPointGt) (isText ? textFields.computeIfAbsent("melting_point_gt",
                MeltingPointGt::new) : getBinaryColumn("melting_point_gt"));
    }

    /**
     * A temperature in kelvins below which the melting point (the
     * temperature at which the crystalline solid changes to a liquid)
     * lies. _chemical.melting_point_gt and _chemical.melting_point_lt
     * allow a range of temperatures to be given.
     * 
     * _chemical.melting_point should always be used in preference
     * to these two items whenever possible.
     * @return MeltingPointLt
     */
    public MeltingPointLt getMeltingPointLt() {
        return (MeltingPointLt) (isText ? textFields.computeIfAbsent("melting_point_lt",
                MeltingPointLt::new) : getBinaryColumn("melting_point_lt"));
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
     * @return OpticalRotation
     */
    public OpticalRotation getOpticalRotation() {
        return (OpticalRotation) (isText ? textFields.computeIfAbsent("optical_rotation",
                OpticalRotation::new) : getBinaryColumn("optical_rotation"));
    }

    /**
     * A free-text description of the biological properties of the
     * material.
     * @return PropertiesBiological
     */
    public PropertiesBiological getPropertiesBiological() {
        return (PropertiesBiological) (isText ? textFields.computeIfAbsent("properties_biological",
                PropertiesBiological::new) : getBinaryColumn("properties_biological"));
    }

    /**
     * A free-text description of the physical properties of the material.
     * @return PropertiesPhysical
     */
    public PropertiesPhysical getPropertiesPhysical() {
        return (PropertiesPhysical) (isText ? textFields.computeIfAbsent("properties_physical",
                PropertiesPhysical::new) : getBinaryColumn("properties_physical"));
    }

    /**
     * The temperature in kelvins at which the solid decomposes.
     * @return TemperatureDecomposition
     */
    public TemperatureDecomposition getTemperatureDecomposition() {
        return (TemperatureDecomposition) (isText ? textFields.computeIfAbsent("temperature_decomposition",
                TemperatureDecomposition::new) : getBinaryColumn("temperature_decomposition"));
    }

    /**
     * The estimated standard deviation of
     * _chemical.temperature_decomposition.
     * @return TemperatureDecompositionEsd
     */
    public TemperatureDecompositionEsd getTemperatureDecompositionEsd() {
        return (TemperatureDecompositionEsd) (isText ? textFields.computeIfAbsent("temperature_decomposition_esd",
                TemperatureDecompositionEsd::new) : getBinaryColumn("temperature_decomposition_esd"));
    }

    /**
     * A temperature in kelvins above which the solid is known to
     * decompose. _chemical.temperature_decomposition_gt and
     * _chemical.temperature_decomposition_lt allow
     * a range of temperatures to be given.
     * 
     * _chemical.temperature_decomposition should always be used in
     * preference to these two items whenever possible.
     * @return TemperatureDecompositionGt
     */
    public TemperatureDecompositionGt getTemperatureDecompositionGt() {
        return (TemperatureDecompositionGt) (isText ? textFields.computeIfAbsent("temperature_decomposition_gt",
                TemperatureDecompositionGt::new) : getBinaryColumn("temperature_decomposition_gt"));
    }

    /**
     * A temperature in kelvins below which the solid is known to
     * decompose. _chemical.temperature_decomposition_gt and
     * _chemical.temperature_decomposition_lt allow
     * a range of temperatures to be given.
     * 
     * _chemical.temperature_decomposition should always be used in
     * preference to these two items whenever possible.
     * @return TemperatureDecompositionLt
     */
    public TemperatureDecompositionLt getTemperatureDecompositionLt() {
        return (TemperatureDecompositionLt) (isText ? textFields.computeIfAbsent("temperature_decomposition_lt",
                TemperatureDecompositionLt::new) : getBinaryColumn("temperature_decomposition_lt"));
    }

    /**
     * The temperature in kelvins at which the solid sublimes.
     * @return TemperatureSublimation
     */
    public TemperatureSublimation getTemperatureSublimation() {
        return (TemperatureSublimation) (isText ? textFields.computeIfAbsent("temperature_sublimation",
                TemperatureSublimation::new) : getBinaryColumn("temperature_sublimation"));
    }

    /**
     * The estimated standard deviation of
     * _chemical.temperature_sublimation.
     * @return TemperatureSublimationEsd
     */
    public TemperatureSublimationEsd getTemperatureSublimationEsd() {
        return (TemperatureSublimationEsd) (isText ? textFields.computeIfAbsent("temperature_sublimation_esd",
                TemperatureSublimationEsd::new) : getBinaryColumn("temperature_sublimation_esd"));
    }

    /**
     * A temperature in kelvins above which the solid is known to
     * sublime. _chemical.temperature_sublimation_gt and
     * _chemical.temperature_sublimation_lt allow a
     * range of temperatures to be given.
     * 
     * _chemical.temperature_sublimation should always be used in
     * preference to these two items whenever possible.
     * @return TemperatureSublimationGt
     */
    public TemperatureSublimationGt getTemperatureSublimationGt() {
        return (TemperatureSublimationGt) (isText ? textFields.computeIfAbsent("temperature_sublimation_gt",
                TemperatureSublimationGt::new) : getBinaryColumn("temperature_sublimation_gt"));
    }

    /**
     * A temperature in kelvins below which the solid is known to
     * sublime. _chemical.temperature_sublimation_gt and
     * _chemical.temperature_sublimation_lt allow a
     * range of temperatures to be given.
     * 
     * _chemical.temperature_sublimation should always be used in
     * preference to these two items whenever possible.
     * @return TemperatureSublimationLt
     */
    public TemperatureSublimationLt getTemperatureSublimationLt() {
        return (TemperatureSublimationLt) (isText ? textFields.computeIfAbsent("temperature_sublimation_lt",
                TemperatureSublimationLt::new) : getBinaryColumn("temperature_sublimation_lt"));
    }
}
