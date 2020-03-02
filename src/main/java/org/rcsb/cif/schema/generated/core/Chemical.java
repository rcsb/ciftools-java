package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which describe the composition and
 * chemical properties of the compound under study. The formula data
 * items must be consistent with the density, unit-cell and Z values.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Chemical extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "chemical";

    public Chemical(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Necessary conditions for this assignment are given by
     * Flack, H. D. &amp; Bernardinelli, G. (1999). Acta Cryst. A55,
     * 908-915. (http://www.iucr.org/paper?sh0129)
     * Flack, H. D. &amp; Bernardinelli, G. (2000). J. Appl. Cryst.
     * 33, 1143-1148. (http://www.iucr.org/paper?ks0021)
     * @return StrColumn
     */
    public StrColumn getAbsoluteConfiguration() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_absolute_configuration"));
    }

    /**
     * 
     * Description of the source of the compound under study, or of the
     * parent  molecule if a simple derivative is studied. This includes
     * the place of  discovery for minerals or the actual source of a
     * natural product.
     * @return StrColumn
     */
    public StrColumn getCompoundSource() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_compound_source"));
    }

    /**
     * 
     * The enantioexcess of the bulk material from which the crystals
     * were grown. A value of 0.0 indicates the racemate. A value of
     * 1.0 indicates that the compound is enantiomerically pure.
     * Enantioexcess is defined in the IUPAC Recommendations
     * (Moss et al., 1996). The composition of the crystal
     * and bulk must be the same.
     * Ref: Moss G. P. et al. (1996). Basic Terminology of
     * Stereochemistry. Pure Appl. Chem., 68, 2193-2222.
     * http://www.chem.qmul.ac.uk/iupac/stereo/index.html
     * @return StrColumn
     */
    public StrColumn getEnantioexcessBulk() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_enantioexcess_bulk"));
    }

    /**
     * 
     * Technique used to determine the enantioexcess of the bulk compound.
     * @return StrColumn
     */
    public StrColumn getEnantioexcessBulkTechnique() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_enantioexcess_bulk_technique"));
    }

    /**
     * 
     * The enantioexcess of the crystal used for the diffraction
     * study. A value of 0.0 indicates the racemate. A value of
     * 1.0 indicates that the crystal is enantiomerically pure.
     * Enantioexcess is defined in the IUPAC Recommendations
     * (Moss et al., 1996).
     * Ref: Moss G. P. et al. (1996). Basic Terminology of
     * Stereochemistry. Pure Appl. Chem., 68, 2193-2222.
     * http://www.chem.qmul.ac.uk/iupac/stereo/index.html
     * @return StrColumn
     */
    public StrColumn getEnantioexcessCrystal() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_enantioexcess_crystal"));
    }

    /**
     * 
     * Technique used to determine the enantioexcess of the crystal.
     * @return StrColumn
     */
    public StrColumn getEnantioexcessCrystalTechnique() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_enantioexcess_crystal_technique"));
    }

    /**
     * 
     * The IUPAC International Chemical Identifier (InChI) is a
     * textual identifier for chemical substances, designed to provide
     * a standard and human-readable way to encode molecular information
     * and to facilitate the search for such information in databases
     * and on the web.
     * Ref: McNaught, A. (2006). Chem. Int. (IUPAC), 28 (6), 12-14.
     * http://www.iupac.org/inchi/
     * @return StrColumn
     */
    public StrColumn getIdentifierInchi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_identifier_inchi"));
    }

    /**
     * 
     * The InChIKey is a compact hashed version of the full InChI
     * (IUPAC International Chemical Identifier), designed to allow
     * for easy web searches of chemical compounds. See
     * http://www.iupac.org/inchi/
     * @return StrColumn
     */
    public StrColumn getIdentifierInchiKey() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_identifier_inchi_key"));
    }

    /**
     * 
     * Version number of the InChI standard to which the associated
     * chemical identifier string applies.
     * @return StrColumn
     */
    public StrColumn getIdentifierInchiVersion() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_identifier_inchi_version"));
    }

    /**
     * 
     * The temperature at which a crystalline solid changes to a liquid.
     * @return StrColumn
     */
    public StrColumn getMeltingPoint() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_melting_point"));
    }

    /**
     * 
     * A temperature above which the melting point lies.
     * _chemical.melting_point should be used in preference where possible.
     * @return StrColumn
     */
    public StrColumn getMeltingPointGt() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_melting_point_gt"));
    }

    /**
     * 
     * A temperature below which the melting point lies.
     * _chemical.melting_point should be used in preference where possible.
     * @return StrColumn
     */
    public StrColumn getMeltingPointLt() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_melting_point_lt"));
    }

    /**
     * 
     * Trivial name by which the compound is commonly known.
     * @return StrColumn
     */
    public StrColumn getNameCommon() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_name_common"));
    }

    /**
     * 
     * Mineral name accepted by the International Mineralogical Association.
     * Use only for natural minerals.
     * @return StrColumn
     */
    public StrColumn getNameMineral() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_name_mineral"));
    }

    /**
     * 
     * Commonly used structure-type name. Usually only applied to
     * minerals or inorganic compounds.
     * @return StrColumn
     */
    public StrColumn getNameStructureType() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_name_structure_type"));
    }

    /**
     * 
     * IUPAC or Chemical Abstracts full name of compound.
     * @return StrColumn
     */
    public StrColumn getNameSystematic() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_name_systematic"));
    }

    /**
     * 
     * The optical rotation in solution of the compound is
     * specified in the following format:
     * 
     * '[\a]^TEMP^~WAVE~ = SORT (c = CONC, SOLV)'
     * 
     * where: TEMP is the temperature of the measurement in degrees Celsius,
     * WAVE is an indication of the wavelength of the light
     * used for the measurement,
     * CONC is the concentration of the solution given as the
     * mass of the substance in g in 100 ml of solution,
     * SORT is the signed value (preceded by a + or a - sign)
     * of 100.\a/(l.c), where \a is the signed optical
     * rotation in degrees measured in a cell of length l in
     * dm and c is the value of CONC in g, and
     * SOLV is the chemical formula of the solvent.
     * @return StrColumn
     */
    public StrColumn getOpticalRotation() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_optical_rotation"));
    }

    /**
     * 
     * A description of the biological properties of the material.
     * @return StrColumn
     */
    public StrColumn getPropertiesBiological() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_properties_biological"));
    }

    /**
     * 
     * A description of the physical properties of the material.
     * @return StrColumn
     */
    public StrColumn getPropertiesPhysical() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_properties_physical"));
    }

    /**
     * 
     * The temperature at which a crystalline solid decomposes.
     * @return StrColumn
     */
    public StrColumn getTemperatureDecomposition() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_temperature_decomposition"));
    }

    /**
     * 
     * The temperature above which a crystalline solid decomposes.
     * _chemical.temperature_decomposition should be used in preference.
     * @return StrColumn
     */
    public StrColumn getTemperatureDecompositionGt() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_temperature_decomposition_gt"));
    }

    /**
     * 
     * The temperature below which a crystalline solid decomposes.
     * _chemical.temperature_decomposition should be used in preference.
     * @return StrColumn
     */
    public StrColumn getTemperatureDecompositionLt() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_temperature_decomposition_lt"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * temperature at which a crystalline solid decomposes.
     * @return StrColumn
     */
    public StrColumn getTemperatureDecompositionSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_temperature_decomposition_su"));
    }

    /**
     * 
     * The temperature at which a crystalline solid sublimates.
     * @return StrColumn
     */
    public StrColumn getTemperatureSublimation() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_temperature_sublimation"));
    }

    /**
     * 
     * The temperature above which a crystalline solid sublimates.
     * _chemical.temperature_sublimation should be used in preference.
     * @return StrColumn
     */
    public StrColumn getTemperatureSublimationGt() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_temperature_sublimation_gt"));
    }

    /**
     * 
     * The temperature below which a crystalline solid sublimates.
     * _chemical.temperature_sublimation should be used in preference.
     * @return StrColumn
     */
    public StrColumn getTemperatureSublimationLt() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_temperature_sublimation_lt"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * temperature at which a crystalline solid sublimates.
     * @return StrColumn
     */
    public StrColumn getTemperatureSublimationSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_temperature_sublimation_su"));
    }
}
