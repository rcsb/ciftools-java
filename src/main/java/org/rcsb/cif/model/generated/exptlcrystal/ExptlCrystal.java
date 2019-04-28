package org.rcsb.cif.model.generated.exptlcrystal;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Colour
     */
    public Colour getColour() {
        return (Colour) (isText ? textFields.computeIfAbsent("colour",
                Colour::new) : getBinaryColumn("colour"));
    }

    /**
     * Density values calculated from the crystal cell and contents. The
     * units are megagrams per cubic metre (grams per cubic centimetre).
     * @return DensityDiffrn
     */
    public DensityDiffrn getDensityDiffrn() {
        return (DensityDiffrn) (isText ? textFields.computeIfAbsent("density_diffrn",
                DensityDiffrn::new) : getBinaryColumn("density_diffrn"));
    }

    /**
     * The density of the crystal, expressed as the ratio of the
     * volume of the asymmetric unit to the molecular mass of a
     * monomer of the structure, in units of angstroms^3^ per dalton.
     * 
     * Ref: Matthews, B. W. (1968). J. Mol. Biol. 33, 491-497.
     * @return DensityMatthews
     */
    public DensityMatthews getDensityMatthews() {
        return (DensityMatthews) (isText ? textFields.computeIfAbsent("density_Matthews",
                DensityMatthews::new) : getBinaryColumn("density_Matthews"));
    }

    /**
     * The method used to measure _exptl_crystal.density_meas.
     * @return DensityMethod
     */
    public DensityMethod getDensityMethod() {
        return (DensityMethod) (isText ? textFields.computeIfAbsent("density_method",
                DensityMethod::new) : getBinaryColumn("density_method"));
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
     * @return DensityPercentSol
     */
    public DensityPercentSol getDensityPercentSol() {
        return (DensityPercentSol) (isText ? textFields.computeIfAbsent("density_percent_sol",
                DensityPercentSol::new) : getBinaryColumn("density_percent_sol"));
    }

    /**
     * A description of the quality and habit of the crystal.
     * The crystal dimensions should not normally be reported here;
     * use instead the specific items in the EXPTL_CRYSTAL category
     * relating to size for the gross dimensions of the crystal and
     * data items in the EXPTL_CRYSTAL_FACE category to describe the
     * relationship between individual faces.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
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
     * @return F000
     */
    public F000 getF000() {
        return (F000) (isText ? textFields.computeIfAbsent("F_000",
                F000::new) : getBinaryColumn("F_000"));
    }

    /**
     * The value of _exptl_crystal.id must uniquely identify a record in
     * the EXPTL_CRYSTAL list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Details of crystal growth and preparation of the crystal (e.g.
     * mounting) prior to the intensity measurements.
     * @return Preparation
     */
    public Preparation getPreparation() {
        return (Preparation) (isText ? textFields.computeIfAbsent("preparation",
                Preparation::new) : getBinaryColumn("preparation"));
    }

    /**
     * The maximum dimension of the crystal. This item may appear in a
     * list with _exptl_crystal.id if multiple crystals are used in the
     * experiment.
     * @return SizeMax
     */
    public SizeMax getSizeMax() {
        return (SizeMax) (isText ? textFields.computeIfAbsent("size_max",
                SizeMax::new) : getBinaryColumn("size_max"));
    }

    /**
     * The medial dimension of the crystal. This item may appear in a
     * list with _exptl_crystal.id if multiple crystals are used in the
     * experiment.
     * @return SizeMid
     */
    public SizeMid getSizeMid() {
        return (SizeMid) (isText ? textFields.computeIfAbsent("size_mid",
                SizeMid::new) : getBinaryColumn("size_mid"));
    }

    /**
     * The minimum dimension of the crystal. This item may appear in a
     * list with _exptl_crystal.id if multiple crystals are used in the
     * experiment.
     * @return SizeMin
     */
    public SizeMin getSizeMin() {
        return (SizeMin) (isText ? textFields.computeIfAbsent("size_min",
                SizeMin::new) : getBinaryColumn("size_min"));
    }

    /**
     * The radius of the crystal, if the crystal is a sphere or a
     * cylinder. This item may appear in a list with _exptl_crystal.id
     * if multiple crystals are used in the experiment.
     * @return SizeRad
     */
    public SizeRad getSizeRad() {
        return (SizeRad) (isText ? textFields.computeIfAbsent("size_rad",
                SizeRad::new) : getBinaryColumn("size_rad"));
    }

    /**
     * The enumeration list of standardized names developed for the
     * International Centre for Diffraction Data.
     * The colour of a crystal is given by the combination of
     * _exptl_crystal.colour_modifier with
     * _exptl_crystal.colour_primary, as in 'dark-green' or
     * 'bluish-violet', if necessary combined with
     * _exptl_crystal.colour_lustre, as in 'metallic-green'.
     * @return ColourLustre
     */
    public ColourLustre getColourLustre() {
        return (ColourLustre) (isText ? textFields.computeIfAbsent("colour_lustre",
                ColourLustre::new) : getBinaryColumn("colour_lustre"));
    }

    /**
     * The enumeration list of standardized names developed for the
     * International Centre for Diffraction Data.
     * The colour of a crystal is given by the combination of
     * _exptl_crystal.colour_modifier with
     * _exptl_crystal.colour_primary, as in 'dark-green' or
     * 'bluish-violet', if necessary combined with
     * _exptl_crystal.colour_lustre, as in 'metallic-green'.
     * @return ColourModifier
     */
    public ColourModifier getColourModifier() {
        return (ColourModifier) (isText ? textFields.computeIfAbsent("colour_modifier",
                ColourModifier::new) : getBinaryColumn("colour_modifier"));
    }

    /**
     * The enumeration list of standardized names developed for the
     * International Centre for Diffraction Data.
     * The colour of a crystal is given by the combination of
     * _exptl_crystal.colour_modifier with
     * _exptl_crystal.colour_primary, as in 'dark-green' or
     * 'bluish-violet', if necessary combined with
     * _exptl_crystal.colour_lustre, as in 'metallic-green'.
     * @return ColourPrimary
     */
    public ColourPrimary getColourPrimary() {
        return (ColourPrimary) (isText ? textFields.computeIfAbsent("colour_primary",
                ColourPrimary::new) : getBinaryColumn("colour_primary"));
    }

    /**
     * Density values measured using standard chemical and physical
     * methods. The units are megagrams per cubic metre (grams per
     * cubic centimetre).
     * @return DensityMeas
     */
    public DensityMeas getDensityMeas() {
        return (DensityMeas) (isText ? textFields.computeIfAbsent("density_meas",
                DensityMeas::new) : getBinaryColumn("density_meas"));
    }

    /**
     * The estimated standard deviation of _exptl_crystal.density_meas.
     * @return DensityMeasEsd
     */
    public DensityMeasEsd getDensityMeasEsd() {
        return (DensityMeasEsd) (isText ? textFields.computeIfAbsent("density_meas_esd",
                DensityMeasEsd::new) : getBinaryColumn("density_meas_esd"));
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
     * @return DensityMeasGt
     */
    public DensityMeasGt getDensityMeasGt() {
        return (DensityMeasGt) (isText ? textFields.computeIfAbsent("density_meas_gt",
                DensityMeasGt::new) : getBinaryColumn("density_meas_gt"));
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
     * @return DensityMeasLt
     */
    public DensityMeasLt getDensityMeasLt() {
        return (DensityMeasLt) (isText ? textFields.computeIfAbsent("density_meas_lt",
                DensityMeasLt::new) : getBinaryColumn("density_meas_lt"));
    }

    /**
     * Temperature in kelvins at which _exptl_crystal.density_meas
     * was determined.
     * @return DensityMeasTemp
     */
    public DensityMeasTemp getDensityMeasTemp() {
        return (DensityMeasTemp) (isText ? textFields.computeIfAbsent("density_meas_temp",
                DensityMeasTemp::new) : getBinaryColumn("density_meas_temp"));
    }

    /**
     * The estimated standard deviation of
     * _exptl_crystal.density_meas_temp.
     * @return DensityMeasTempEsd
     */
    public DensityMeasTempEsd getDensityMeasTempEsd() {
        return (DensityMeasTempEsd) (isText ? textFields.computeIfAbsent("density_meas_temp_esd",
                DensityMeasTempEsd::new) : getBinaryColumn("density_meas_temp_esd"));
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
     * @return DensityMeasTempGt
     */
    public DensityMeasTempGt getDensityMeasTempGt() {
        return (DensityMeasTempGt) (isText ? textFields.computeIfAbsent("density_meas_temp_gt",
                DensityMeasTempGt::new) : getBinaryColumn("density_meas_temp_gt"));
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
     * @return DensityMeasTempLt
     */
    public DensityMeasTempLt getDensityMeasTempLt() {
        return (DensityMeasTempLt) (isText ? textFields.computeIfAbsent("density_meas_temp_lt",
                DensityMeasTempLt::new) : getBinaryColumn("density_meas_temp_lt"));
    }

    /**
     * The URL for an a file containing the image of crystal.
     * @return PdbxCrystalImageUrl
     */
    public PdbxCrystalImageUrl getPdbxCrystalImageUrl() {
        return (PdbxCrystalImageUrl) (isText ? textFields.computeIfAbsent("pdbx_crystal_image_url",
                PdbxCrystalImageUrl::new) : getBinaryColumn("pdbx_crystal_image_url"));
    }

    /**
     * The image format for the file containing the image of crystal specified
     * as an RFC2045/RFC2046 mime type.
     * @return PdbxCrystalImageFormat
     */
    public PdbxCrystalImageFormat getPdbxCrystalImageFormat() {
        return (PdbxCrystalImageFormat) (isText ? textFields.computeIfAbsent("pdbx_crystal_image_format",
                PdbxCrystalImageFormat::new) : getBinaryColumn("pdbx_crystal_image_format"));
    }

    /**
     * 
     * The of the distribution of mis-orientation angles specified in degrees
     * of all the unit cells in the crystal. Lower mosaicity indicates better
     * ordered crystals.
     * @return PdbxMosaicity
     */
    public PdbxMosaicity getPdbxMosaicity() {
        return (PdbxMosaicity) (isText ? textFields.computeIfAbsent("pdbx_mosaicity",
                PdbxMosaicity::new) : getBinaryColumn("pdbx_mosaicity"));
    }

    /**
     * The uncertainty in the mosaicity estimate for the crystal.
     * @return PdbxMosaicityEsd
     */
    public PdbxMosaicityEsd getPdbxMosaicityEsd() {
        return (PdbxMosaicityEsd) (isText ? textFields.computeIfAbsent("pdbx_mosaicity_esd",
                PdbxMosaicityEsd::new) : getBinaryColumn("pdbx_mosaicity_esd"));
    }

    /**
     * A code to indicate that a crystal image is available
     * for this crystal.
     * @return PdbxCrystalImage
     */
    public PdbxCrystalImage getPdbxCrystalImage() {
        return (PdbxCrystalImage) (isText ? textFields.computeIfAbsent("pdbx_crystal_image",
                PdbxCrystalImage::new) : getBinaryColumn("pdbx_crystal_image"));
    }

    /**
     * A code to indicate that an x-ray image is available for
     * this crystal.
     * @return PdbxX_rayImage
     */
    public PdbxX_rayImage getPdbxX_rayImage() {
        return (PdbxX_rayImage) (isText ? textFields.computeIfAbsent("pdbx_x-ray_image",
                PdbxX_rayImage::new) : getBinaryColumn("pdbx_x-ray_image"));
    }

    /**
     * A description of the type of x-ray image for this crystal.
     * @return PdbxX_rayImageType
     */
    public PdbxX_rayImageType getPdbxX_rayImageType() {
        return (PdbxX_rayImageType) (isText ? textFields.computeIfAbsent("pdbx_x-ray_image_type",
                PdbxX_rayImageType::new) : getBinaryColumn("pdbx_x-ray_image_type"));
    }

    /**
     * The measured diffraction limit for this crystal.
     * @return PdbxCrystalDiffrnLimit
     */
    public PdbxCrystalDiffrnLimit getPdbxCrystalDiffrnLimit() {
        return (PdbxCrystalDiffrnLimit) (isText ? textFields.computeIfAbsent("pdbx_crystal_diffrn_limit",
                PdbxCrystalDiffrnLimit::new) : getBinaryColumn("pdbx_crystal_diffrn_limit"));
    }

    /**
     * The measured diffraction limit for this crystal.
     * @return PdbxCrystalDiffrnLifetime
     */
    public PdbxCrystalDiffrnLifetime getPdbxCrystalDiffrnLifetime() {
        return (PdbxCrystalDiffrnLifetime) (isText ? textFields.computeIfAbsent("pdbx_crystal_diffrn_lifetime",
                PdbxCrystalDiffrnLifetime::new) : getBinaryColumn("pdbx_crystal_diffrn_lifetime"));
    }

    /**
     * The crystal size along the first measured direction in millimeters.
     * @return PdbxCrystalDirection1
     */
    public PdbxCrystalDirection1 getPdbxCrystalDirection1() {
        return (PdbxCrystalDirection1) (isText ? textFields.computeIfAbsent("pdbx_crystal_direction_1",
                PdbxCrystalDirection1::new) : getBinaryColumn("pdbx_crystal_direction_1"));
    }

    /**
     * The crystal size along the second measured direction in millimeters.
     * @return PdbxCrystalDirection2
     */
    public PdbxCrystalDirection2 getPdbxCrystalDirection2() {
        return (PdbxCrystalDirection2) (isText ? textFields.computeIfAbsent("pdbx_crystal_direction_2",
                PdbxCrystalDirection2::new) : getBinaryColumn("pdbx_crystal_direction_2"));
    }

    /**
     * The crystal size along the third measured direction in millimeters.
     * @return PdbxCrystalDirection3
     */
    public PdbxCrystalDirection3 getPdbxCrystalDirection3() {
        return (PdbxCrystalDirection3) (isText ? textFields.computeIfAbsent("pdbx_crystal_direction_3",
                PdbxCrystalDirection3::new) : getBinaryColumn("pdbx_crystal_direction_3"));
    }
}
