package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EXPTL_CRYSTAL category record the results of
 * experimental measurements on the crystal or crystals used,
 * such as shape, size or density.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ExptlCrystal extends BaseCategory {
    public ExptlCrystal(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ExptlCrystal(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ExptlCrystal(String name) {
        super(name);
    }

    /**
     * The colour of the crystal.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getColour() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("colour", SingleRowStrColumn::new) :
                getBinaryColumn("colour"));
    }

    /**
     * Density values calculated from the crystal cell and contents. The
     * units are megagrams per cubic metre (grams per cubic centimetre).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDensityDiffrn() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("density_diffrn", SingleRowFloatColumn::new) :
                getBinaryColumn("density_diffrn"));
    }

    /**
     * The density of the crystal, expressed as the ratio of the
     * volume of the asymmetric unit to the molecular mass of a
     * monomer of the structure, in units of angstroms^3^ per dalton.
     * 
     * Ref: Matthews, B. W. (1968). J. Mol. Biol. 33, 491-497.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDensityMatthews() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("density_Matthews", SingleRowFloatColumn::new) :
                getBinaryColumn("density_Matthews"));
    }

    /**
     * The method used to measure _exptl_crystal.density_meas.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDensityMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("density_method", SingleRowStrColumn::new) :
                getBinaryColumn("density_method"));
    }

    /**
     * Density value P calculated from the crystal cell and contents,
     * expressed as per cent solvent.
     * 
     * P = 1 - (1.23 N MMass) / V
     * 
     * N     = the number of molecules in the unit cell
     * MMass = the molecular mass of each molecule (gm/mole)
     * V     = the volume of the unit cell (A^3^)
     * 1.23  = a conversion factor evaluated as:
     * 
     * (0.74 cm^3^/g) (10^24^ A^3^/cm^3^)
     * --------------------------------------
     * (6.02*10^23^) molecules/mole
     * 
     * where 0.74 is an assumed value for the partial specific
     * volume of the molecule
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDensityPercentSol() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("density_percent_sol", SingleRowFloatColumn::new) :
                getBinaryColumn("density_percent_sol"));
    }

    /**
     * A description of the quality and habit of the crystal.
     * The crystal dimensions should not normally be reported here;
     * use instead the specific items in the EXPTL_CRYSTAL category
     * relating to size for the gross dimensions of the crystal and
     * data items in the EXPTL_CRYSTAL_FACE category to describe the
     * relationship between individual faces.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDescription() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("description", SingleRowStrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * The effective number of electrons in the crystal unit cell
     * contributing to F(000). This may contain dispersion contributions
     * and is calculated as
     * 
     * F(000) = [ sum (f~r~^2^ + f~i~^2^) ]^1/2^
     * 
     * f~r~ = real part of the scattering factors at theta = 0 degree
     * f~i~ = imaginary part of the scattering factors at
     * theta = 0 degree
     * 
     * the sum is taken over each atom in the unit cell
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getF000() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("F_000", SingleRowIntColumn::new) :
                getBinaryColumn("F_000"));
    }

    /**
     * The value of _exptl_crystal.id must uniquely identify a record in
     * the EXPTL_CRYSTAL list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Details of crystal growth and preparation of the crystal (e.g.
     * mounting) prior to the intensity measurements.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPreparation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("preparation", SingleRowStrColumn::new) :
                getBinaryColumn("preparation"));
    }

    /**
     * The maximum dimension of the crystal. This item may appear in a
     * list with _exptl_crystal.id if multiple crystals are used in the
     * experiment.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSizeMax() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("size_max", SingleRowFloatColumn::new) :
                getBinaryColumn("size_max"));
    }

    /**
     * The medial dimension of the crystal. This item may appear in a
     * list with _exptl_crystal.id if multiple crystals are used in the
     * experiment.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSizeMid() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("size_mid", SingleRowFloatColumn::new) :
                getBinaryColumn("size_mid"));
    }

    /**
     * The minimum dimension of the crystal. This item may appear in a
     * list with _exptl_crystal.id if multiple crystals are used in the
     * experiment.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSizeMin() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("size_min", SingleRowFloatColumn::new) :
                getBinaryColumn("size_min"));
    }

    /**
     * The radius of the crystal, if the crystal is a sphere or a
     * cylinder. This item may appear in a list with _exptl_crystal.id
     * if multiple crystals are used in the experiment.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSizeRad() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("size_rad", SingleRowFloatColumn::new) :
                getBinaryColumn("size_rad"));
    }

    /**
     * The enumeration list of standardized names developed for the
     * International Centre for Diffraction Data.
     * The colour of a crystal is given by the combination of
     * _exptl_crystal.colour_modifier with
     * _exptl_crystal.colour_primary, as in 'dark-green' or
     * 'bluish-violet', if necessary combined with
     * _exptl_crystal.colour_lustre, as in 'metallic-green'.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getColourLustre() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("colour_lustre", SingleRowStrColumn::new) :
                getBinaryColumn("colour_lustre"));
    }

    /**
     * The enumeration list of standardized names developed for the
     * International Centre for Diffraction Data.
     * The colour of a crystal is given by the combination of
     * _exptl_crystal.colour_modifier with
     * _exptl_crystal.colour_primary, as in 'dark-green' or
     * 'bluish-violet', if necessary combined with
     * _exptl_crystal.colour_lustre, as in 'metallic-green'.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getColourModifier() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("colour_modifier", SingleRowStrColumn::new) :
                getBinaryColumn("colour_modifier"));
    }

    /**
     * The enumeration list of standardized names developed for the
     * International Centre for Diffraction Data.
     * The colour of a crystal is given by the combination of
     * _exptl_crystal.colour_modifier with
     * _exptl_crystal.colour_primary, as in 'dark-green' or
     * 'bluish-violet', if necessary combined with
     * _exptl_crystal.colour_lustre, as in 'metallic-green'.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getColourPrimary() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("colour_primary", SingleRowStrColumn::new) :
                getBinaryColumn("colour_primary"));
    }

    /**
     * Density values measured using standard chemical and physical
     * methods. The units are megagrams per cubic metre (grams per
     * cubic centimetre).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDensityMeas() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("density_meas", SingleRowFloatColumn::new) :
                getBinaryColumn("density_meas"));
    }

    /**
     * The estimated standard deviation of _exptl_crystal.density_meas.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDensityMeasEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("density_meas_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("density_meas_esd"));
    }

    /**
     * The value above which the density measured using standard
     * chemical and physical methods lies. The units are megagrams
     * per cubic metre (grams per cubic centimetre).
     * _exptl_crystal.density_meas_gt and _exptl_crystal.density_meas_lt
     * should not be used to report new experimental work, for which
     * _exptl_crystal.density_meas should be used.  These items are
     * intended for use in reporting information in existing databases
     * and archives which would be misleading if reported under
     * _exptl_crystal.density_meas.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDensityMeasGt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("density_meas_gt", SingleRowFloatColumn::new) :
                getBinaryColumn("density_meas_gt"));
    }

    /**
     * The value below which the density measured using standard
     * chemical and physical methods lies. The units are megagrams
     * per cubic metre (grams per cubic centimetre).
     * _exptl_crystal.density_meas_gt and _exptl_crystal.density_meas_lt
     * should not be used to report new experimental work, for which
     * _exptl_crystal.density_meas should be used.  These items are
     * intended for use in reporting information in existing databases
     * and archives which would be misleading if reported under
     * _exptl_crystal.density_meas.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDensityMeasLt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("density_meas_lt", SingleRowFloatColumn::new) :
                getBinaryColumn("density_meas_lt"));
    }

    /**
     * Temperature in kelvins at which _exptl_crystal.density_meas
     * was determined.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDensityMeasTemp() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("density_meas_temp", SingleRowFloatColumn::new) :
                getBinaryColumn("density_meas_temp"));
    }

    /**
     * The estimated standard deviation of
     * _exptl_crystal.density_meas_temp.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDensityMeasTempEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("density_meas_temp_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("density_meas_temp_esd"));
    }

    /**
     * Temperature in kelvins above which _exptl_crystal.density_meas
     * was determined. _exptl_crystal.density_meas_temp_gt and
     * _exptl_crystal.density_meas_temp_lt should not be used for
     * reporting new work,  for which the correct temperature of
     * measurement should be given. These items are intended for
     * use in reporting information stored in databases or archives
     * which would be misleading if reported under
     * _exptl_crystal.density_meas_temp.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDensityMeasTempGt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("density_meas_temp_gt", SingleRowFloatColumn::new) :
                getBinaryColumn("density_meas_temp_gt"));
    }

    /**
     * Temperature in kelvins below which _exptl_crystal.density_meas
     * was determined. _exptl_crystal.density_meas_temp_gt and
     * _exptl_crystal.density_meas_temp_lt should not be used for
     * reporting new work,  for which the correct temperature of
     * measurement should be given. These items are intended for
     * use in reporting information stored in databases or archives
     * which would be misleading if reported under
     * _exptl_crystal.density_meas_temp.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDensityMeasTempLt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("density_meas_temp_lt", SingleRowFloatColumn::new) :
                getBinaryColumn("density_meas_temp_lt"));
    }

    /**
     * The URL for an a file containing the image of crystal.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxCrystalImageUrl() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_crystal_image_url", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_crystal_image_url"));
    }

    /**
     * The image format for the file containing the image of crystal specified
     * as an RFC2045/RFC2046 mime type.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxCrystalImageFormat() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_crystal_image_format", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_crystal_image_format"));
    }

    /**
     * 
     * The of the distribution of mis-orientation angles specified in degrees
     * of all the unit cells in the crystal. Lower mosaicity indicates better
     * ordered crystals.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxMosaicity() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_mosaicity", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_mosaicity"));
    }

    /**
     * The uncertainty in the mosaicity estimate for the crystal.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxMosaicityEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_mosaicity_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_mosaicity_esd"));
    }

    /**
     * A code to indicate that a crystal image is available
     * for this crystal.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxCrystalImage() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_crystal_image", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_crystal_image"));
    }

    /**
     * A code to indicate that an x-ray image is available for
     * this crystal.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxX_rayImage() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_x-ray_image", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_x-ray_image"));
    }

    /**
     * A description of the type of x-ray image for this crystal.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxX_rayImageType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_x-ray_image_type", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_x-ray_image_type"));
    }

    /**
     * The measured diffraction limit for this crystal.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxCrystalDiffrnLimit() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_crystal_diffrn_limit", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_crystal_diffrn_limit"));
    }

    /**
     * The measured diffraction limit for this crystal.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxCrystalDiffrnLifetime() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_crystal_diffrn_lifetime", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_crystal_diffrn_lifetime"));
    }

    /**
     * The crystal size along the first measured direction in millimeters.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxCrystalDirection1() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_crystal_direction_1", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_crystal_direction_1"));
    }

    /**
     * The crystal size along the second measured direction in millimeters.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxCrystalDirection2() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_crystal_direction_2", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_crystal_direction_2"));
    }

    /**
     * The crystal size along the third measured direction in millimeters.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxCrystalDirection3() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_crystal_direction_3", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_crystal_direction_3"));
    }
}
