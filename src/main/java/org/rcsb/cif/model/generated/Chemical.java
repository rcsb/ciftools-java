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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Description of the source of the compound under study, or of the
     * parent  molecule if a simple derivative is studied. This includes
     * the place of discovery for minerals or the actual source of a
     * natural product.
     * @return StrColumn
     */
    public StrColumn getCompoundSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("compound_source", StrColumn::new) :
                getBinaryColumn("compound_source"));
    }

    /**
     * The temperature in kelvins at which the crystalline solid changes
     * to a liquid.
     * @return FloatColumn
     */
    public FloatColumn getMeltingPoint() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("melting_point", FloatColumn::new) :
                getBinaryColumn("melting_point"));
    }

    /**
     * Trivial name by which the compound is commonly known.
     * @return StrColumn
     */
    public StrColumn getNameCommon() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_common", StrColumn::new) :
                getBinaryColumn("name_common"));
    }

    /**
     * Mineral name accepted by the International Mineralogical
     * Association. Use only for natural minerals. See also
     * _chemical.compound_source.
     * @return StrColumn
     */
    public StrColumn getNameMineral() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_mineral", StrColumn::new) :
                getBinaryColumn("name_mineral"));
    }

    /**
     * Commonly used structure-type name. Usually only applied to
     * minerals or inorganic compounds.
     * @return StrColumn
     */
    public StrColumn getNameStructureType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_structure_type", StrColumn::new) :
                getBinaryColumn("name_structure_type"));
    }

    /**
     * IUPAC or Chemical Abstracts full name of the compound.
     * @return StrColumn
     */
    public StrColumn getNameSystematic() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_systematic", StrColumn::new) :
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
     * @return StrColumn
     */
    public StrColumn getAbsoluteConfiguration() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("absolute_configuration", StrColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getMeltingPointGt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("melting_point_gt", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getMeltingPointLt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("melting_point_lt", FloatColumn::new) :
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
     * @return StrColumn
     */
    public StrColumn getOpticalRotation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("optical_rotation", StrColumn::new) :
                getBinaryColumn("optical_rotation"));
    }

    /**
     * A free-text description of the biological properties of the
     * material.
     * @return StrColumn
     */
    public StrColumn getPropertiesBiological() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("properties_biological", StrColumn::new) :
                getBinaryColumn("properties_biological"));
    }

    /**
     * A free-text description of the physical properties of the material.
     * @return StrColumn
     */
    public StrColumn getPropertiesPhysical() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("properties_physical", StrColumn::new) :
                getBinaryColumn("properties_physical"));
    }

    /**
     * The temperature in kelvins at which the solid decomposes.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureDecomposition() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature_decomposition", FloatColumn::new) :
                getBinaryColumn("temperature_decomposition"));
    }

    /**
     * The estimated standard deviation of
     * _chemical.temperature_decomposition.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureDecompositionEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature_decomposition_esd", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getTemperatureDecompositionGt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature_decomposition_gt", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getTemperatureDecompositionLt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature_decomposition_lt", FloatColumn::new) :
                getBinaryColumn("temperature_decomposition_lt"));
    }

    /**
     * The temperature in kelvins at which the solid sublimes.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureSublimation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature_sublimation", FloatColumn::new) :
                getBinaryColumn("temperature_sublimation"));
    }

    /**
     * The estimated standard deviation of
     * _chemical.temperature_sublimation.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureSublimationEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature_sublimation_esd", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getTemperatureSublimationGt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature_sublimation_gt", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getTemperatureSublimationLt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature_sublimation_lt", FloatColumn::new) :
                getBinaryColumn("temperature_sublimation_lt"));
    }
}
