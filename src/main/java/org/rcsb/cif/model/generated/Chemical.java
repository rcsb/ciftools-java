package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Description of the source of the compound under study, or of the
     * parent  molecule if a simple derivative is studied. This includes
     * the place of discovery for minerals or the actual source of a
     * natural product.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCompoundSource() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("compound_source", SingleRowStrColumn::new) :
                getBinaryColumn("compound_source"));
    }

    /**
     * The temperature in kelvins at which the crystalline solid changes
     * to a liquid.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMeltingPoint() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("melting_point", SingleRowFloatColumn::new) :
                getBinaryColumn("melting_point"));
    }

    /**
     * Trivial name by which the compound is commonly known.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameCommon() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_common", SingleRowStrColumn::new) :
                getBinaryColumn("name_common"));
    }

    /**
     * Mineral name accepted by the International Mineralogical
     * Association. Use only for natural minerals. See also
     * _chemical.compound_source.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameMineral() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_mineral", SingleRowStrColumn::new) :
                getBinaryColumn("name_mineral"));
    }

    /**
     * Commonly used structure-type name. Usually only applied to
     * minerals or inorganic compounds.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameStructureType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_structure_type", SingleRowStrColumn::new) :
                getBinaryColumn("name_structure_type"));
    }

    /**
     * IUPAC or Chemical Abstracts full name of the compound.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameSystematic() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_systematic", SingleRowStrColumn::new) :
                getBinaryColumn("name_systematic"));
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAbsoluteConfiguration() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("absolute_configuration", SingleRowStrColumn::new) :
                getBinaryColumn("absolute_configuration"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMeltingPointGt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("melting_point_gt", SingleRowFloatColumn::new) :
                getBinaryColumn("melting_point_gt"));
    }

    /**
     * A temperature in kelvins below which the melting point (the
     * temperature at which the crystalline solid changes to a liquid)
     * lies. _chemical.melting_point_gt and _chemical.melting_point_lt
     * allow a range of temperatures to be given.
     * 
     * _chemical.melting_point should always be used in preference
     * to these two items whenever possible.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMeltingPointLt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("melting_point_lt", SingleRowFloatColumn::new) :
                getBinaryColumn("melting_point_lt"));
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getOpticalRotation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("optical_rotation", SingleRowStrColumn::new) :
                getBinaryColumn("optical_rotation"));
    }

    /**
     * A free-text description of the biological properties of the
     * material.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPropertiesBiological() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("properties_biological", SingleRowStrColumn::new) :
                getBinaryColumn("properties_biological"));
    }

    /**
     * A free-text description of the physical properties of the material.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPropertiesPhysical() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("properties_physical", SingleRowStrColumn::new) :
                getBinaryColumn("properties_physical"));
    }

    /**
     * The temperature in kelvins at which the solid decomposes.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemperatureDecomposition() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temperature_decomposition", SingleRowFloatColumn::new) :
                getBinaryColumn("temperature_decomposition"));
    }

    /**
     * The estimated standard deviation of
     * _chemical.temperature_decomposition.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemperatureDecompositionEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temperature_decomposition_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("temperature_decomposition_esd"));
    }

    /**
     * A temperature in kelvins above which the solid is known to
     * decompose. _chemical.temperature_decomposition_gt and
     * _chemical.temperature_decomposition_lt allow
     * a range of temperatures to be given.
     * 
     * _chemical.temperature_decomposition should always be used in
     * preference to these two items whenever possible.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemperatureDecompositionGt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temperature_decomposition_gt", SingleRowFloatColumn::new) :
                getBinaryColumn("temperature_decomposition_gt"));
    }

    /**
     * A temperature in kelvins below which the solid is known to
     * decompose. _chemical.temperature_decomposition_gt and
     * _chemical.temperature_decomposition_lt allow
     * a range of temperatures to be given.
     * 
     * _chemical.temperature_decomposition should always be used in
     * preference to these two items whenever possible.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemperatureDecompositionLt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temperature_decomposition_lt", SingleRowFloatColumn::new) :
                getBinaryColumn("temperature_decomposition_lt"));
    }

    /**
     * The temperature in kelvins at which the solid sublimes.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemperatureSublimation() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temperature_sublimation", SingleRowFloatColumn::new) :
                getBinaryColumn("temperature_sublimation"));
    }

    /**
     * The estimated standard deviation of
     * _chemical.temperature_sublimation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemperatureSublimationEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temperature_sublimation_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("temperature_sublimation_esd"));
    }

    /**
     * A temperature in kelvins above which the solid is known to
     * sublime. _chemical.temperature_sublimation_gt and
     * _chemical.temperature_sublimation_lt allow a
     * range of temperatures to be given.
     * 
     * _chemical.temperature_sublimation should always be used in
     * preference to these two items whenever possible.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemperatureSublimationGt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temperature_sublimation_gt", SingleRowFloatColumn::new) :
                getBinaryColumn("temperature_sublimation_gt"));
    }

    /**
     * A temperature in kelvins below which the solid is known to
     * sublime. _chemical.temperature_sublimation_gt and
     * _chemical.temperature_sublimation_lt allow a
     * range of temperatures to be given.
     * 
     * _chemical.temperature_sublimation should always be used in
     * preference to these two items whenever possible.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemperatureSublimationLt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temperature_sublimation_lt", SingleRowFloatColumn::new) :
                getBinaryColumn("temperature_sublimation_lt"));
    }
}
