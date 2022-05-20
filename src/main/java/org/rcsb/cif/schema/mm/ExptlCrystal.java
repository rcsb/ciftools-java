package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EXPTL_CRYSTAL category record the results of
 * experimental measurements on the crystal or crystals used,
 * such as shape, size or density.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ExptlCrystal extends DelegatingCategory {
    public ExptlCrystal(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "colour":
                return getColour();
            case "density_diffrn":
                return getDensityDiffrn();
            case "density_Matthews":
                return getDensityMatthews();
            case "density_method":
                return getDensityMethod();
            case "density_percent_sol":
                return getDensityPercentSol();
            case "description":
                return getDescription();
            case "F_000":
                return getF000();
            case "id":
                return getId();
            case "preparation":
                return getPreparation();
            case "size_max":
                return getSizeMax();
            case "size_mid":
                return getSizeMid();
            case "size_min":
                return getSizeMin();
            case "size_rad":
                return getSizeRad();
            case "colour_lustre":
                return getColourLustre();
            case "colour_modifier":
                return getColourModifier();
            case "colour_primary":
                return getColourPrimary();
            case "density_meas":
                return getDensityMeas();
            case "density_meas_esd":
                return getDensityMeasEsd();
            case "density_meas_gt":
                return getDensityMeasGt();
            case "density_meas_lt":
                return getDensityMeasLt();
            case "density_meas_temp":
                return getDensityMeasTemp();
            case "density_meas_temp_esd":
                return getDensityMeasTempEsd();
            case "density_meas_temp_gt":
                return getDensityMeasTempGt();
            case "density_meas_temp_lt":
                return getDensityMeasTempLt();
            case "pdbx_crystal_image_url":
                return getPdbxCrystalImageUrl();
            case "pdbx_crystal_image_format":
                return getPdbxCrystalImageFormat();
            case "pdbx_mosaicity":
                return getPdbxMosaicity();
            case "pdbx_mosaicity_esd":
                return getPdbxMosaicityEsd();
            case "pdbx_crystal_image":
                return getPdbxCrystalImage();
            case "pdbx_x-ray_image":
                return getPdbxX_rayImage();
            case "pdbx_x-ray_image_type":
                return getPdbxX_rayImageType();
            case "pdbx_crystal_diffrn_limit":
                return getPdbxCrystalDiffrnLimit();
            case "pdbx_crystal_diffrn_lifetime":
                return getPdbxCrystalDiffrnLifetime();
            case "pdbx_crystal_direction_1":
                return getPdbxCrystalDirection1();
            case "pdbx_crystal_direction_2":
                return getPdbxCrystalDirection2();
            case "pdbx_crystal_direction_3":
                return getPdbxCrystalDirection3();
            case "pdbx_mosaic_method":
                return getPdbxMosaicMethod();
            case "pdbx_mosaic_block_size":
                return getPdbxMosaicBlockSize();
            case "pdbx_mosaic_block_size_esd":
                return getPdbxMosaicBlockSizeEsd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The colour of the crystal.
     * @return StrColumn
     */
    public StrColumn getColour() {
        return delegate.getColumn("colour", DelegatingStrColumn::new);
    }

    /**
     * Density values calculated from the crystal cell and contents. The
     * units are megagrams per cubic metre (grams per cubic centimetre).
     * @return FloatColumn
     */
    public FloatColumn getDensityDiffrn() {
        return delegate.getColumn("density_diffrn", DelegatingFloatColumn::new);
    }

    /**
     * The density of the crystal, expressed as the ratio of the
     * volume of the asymmetric unit to the molecular mass of a
     * monomer of the structure, in units of angstroms^3^ per dalton.
     * 
     * Ref: Matthews, B. W. (1968). J. Mol. Biol. 33, 491-497.
     * @return FloatColumn
     */
    public FloatColumn getDensityMatthews() {
        return delegate.getColumn("density_Matthews", DelegatingFloatColumn::new);
    }

    /**
     * The method used to measure _exptl_crystal.density_meas.
     * @return StrColumn
     */
    public StrColumn getDensityMethod() {
        return delegate.getColumn("density_method", DelegatingStrColumn::new);
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
     * @return FloatColumn
     */
    public FloatColumn getDensityPercentSol() {
        return delegate.getColumn("density_percent_sol", DelegatingFloatColumn::new);
    }

    /**
     * A description of the quality and habit of the crystal.
     * The crystal dimensions should not normally be reported here;
     * use instead the specific items in the EXPTL_CRYSTAL category
     * relating to size for the gross dimensions of the crystal and
     * data items in the EXPTL_CRYSTAL_FACE category to describe the
     * relationship between individual faces.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
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
     * @return IntColumn
     */
    public IntColumn getF000() {
        return delegate.getColumn("F_000", DelegatingIntColumn::new);
    }

    /**
     * The value of _exptl_crystal.id must uniquely identify a record in
     * the EXPTL_CRYSTAL list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Details of crystal growth and preparation of the crystal (e.g.
     * mounting) prior to the intensity measurements.
     * @return StrColumn
     */
    public StrColumn getPreparation() {
        return delegate.getColumn("preparation", DelegatingStrColumn::new);
    }

    /**
     * The maximum dimension of the crystal. This item may appear in a
     * list with _exptl_crystal.id if multiple crystals are used in the
     * experiment.
     * @return FloatColumn
     */
    public FloatColumn getSizeMax() {
        return delegate.getColumn("size_max", DelegatingFloatColumn::new);
    }

    /**
     * The medial dimension of the crystal. This item may appear in a
     * list with _exptl_crystal.id if multiple crystals are used in the
     * experiment.
     * @return FloatColumn
     */
    public FloatColumn getSizeMid() {
        return delegate.getColumn("size_mid", DelegatingFloatColumn::new);
    }

    /**
     * The minimum dimension of the crystal. This item may appear in a
     * list with _exptl_crystal.id if multiple crystals are used in the
     * experiment.
     * @return FloatColumn
     */
    public FloatColumn getSizeMin() {
        return delegate.getColumn("size_min", DelegatingFloatColumn::new);
    }

    /**
     * The radius of the crystal, if the crystal is a sphere or a
     * cylinder. This item may appear in a list with _exptl_crystal.id
     * if multiple crystals are used in the experiment.
     * @return FloatColumn
     */
    public FloatColumn getSizeRad() {
        return delegate.getColumn("size_rad", DelegatingFloatColumn::new);
    }

    /**
     * The enumeration list of standardized names developed for the
     * International Centre for Diffraction Data.
     * The colour of a crystal is given by the combination of
     * _exptl_crystal.colour_modifier with
     * _exptl_crystal.colour_primary, as in 'dark-green' or
     * 'bluish-violet', if necessary combined with
     * _exptl_crystal.colour_lustre, as in 'metallic-green'.
     * @return StrColumn
     */
    public StrColumn getColourLustre() {
        return delegate.getColumn("colour_lustre", DelegatingStrColumn::new);
    }

    /**
     * The enumeration list of standardized names developed for the
     * International Centre for Diffraction Data.
     * The colour of a crystal is given by the combination of
     * _exptl_crystal.colour_modifier with
     * _exptl_crystal.colour_primary, as in 'dark-green' or
     * 'bluish-violet', if necessary combined with
     * _exptl_crystal.colour_lustre, as in 'metallic-green'.
     * @return StrColumn
     */
    public StrColumn getColourModifier() {
        return delegate.getColumn("colour_modifier", DelegatingStrColumn::new);
    }

    /**
     * The enumeration list of standardized names developed for the
     * International Centre for Diffraction Data.
     * The colour of a crystal is given by the combination of
     * _exptl_crystal.colour_modifier with
     * _exptl_crystal.colour_primary, as in 'dark-green' or
     * 'bluish-violet', if necessary combined with
     * _exptl_crystal.colour_lustre, as in 'metallic-green'.
     * @return StrColumn
     */
    public StrColumn getColourPrimary() {
        return delegate.getColumn("colour_primary", DelegatingStrColumn::new);
    }

    /**
     * Density values measured using standard chemical and physical
     * methods. The units are megagrams per cubic metre (grams per
     * cubic centimetre).
     * @return FloatColumn
     */
    public FloatColumn getDensityMeas() {
        return delegate.getColumn("density_meas", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _exptl_crystal.density_meas.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasEsd() {
        return delegate.getColumn("density_meas_esd", DelegatingFloatColumn::new);
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
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasGt() {
        return delegate.getColumn("density_meas_gt", DelegatingFloatColumn::new);
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
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasLt() {
        return delegate.getColumn("density_meas_lt", DelegatingFloatColumn::new);
    }

    /**
     * Temperature in kelvins at which _exptl_crystal.density_meas
     * was determined.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasTemp() {
        return delegate.getColumn("density_meas_temp", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of
     * _exptl_crystal.density_meas_temp.
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasTempEsd() {
        return delegate.getColumn("density_meas_temp_esd", DelegatingFloatColumn::new);
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
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasTempGt() {
        return delegate.getColumn("density_meas_temp_gt", DelegatingFloatColumn::new);
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
     * @return FloatColumn
     */
    public FloatColumn getDensityMeasTempLt() {
        return delegate.getColumn("density_meas_temp_lt", DelegatingFloatColumn::new);
    }

    /**
     * The URL for an a file containing the image of crystal.
     * @return StrColumn
     */
    public StrColumn getPdbxCrystalImageUrl() {
        return delegate.getColumn("pdbx_crystal_image_url", DelegatingStrColumn::new);
    }

    /**
     * The image format for the file containing the image of crystal specified
     * as an RFC2045/RFC2046 mime type.
     * @return StrColumn
     */
    public StrColumn getPdbxCrystalImageFormat() {
        return delegate.getColumn("pdbx_crystal_image_format", DelegatingStrColumn::new);
    }

    /**
     * Isotropic approximation of the distribution of mis-orientation angles
     * specified in degrees of all the mosaic domain blocks in the crystal,
     * represented as a standard deviation. Here, a mosaic block is a set of
     * contiguous unit cells assumed to be perfectly aligned. Lower mosaicity
     * indicates better ordered crystals. See for example:
     * 
     * Nave, C. (1998). Acta Cryst. D54, 848-853.
     * 
     * Note that many software packages estimate the mosaic rotation distribution
     * differently and may combine several physical properties of the experiment
     * into a single mosaic term. This term will help fit the modeled spots
     * to the observed spots without necessarily being directly related to the
     * physics of the crystal itself.
     * @return FloatColumn
     */
    public FloatColumn getPdbxMosaicity() {
        return delegate.getColumn("pdbx_mosaicity", DelegatingFloatColumn::new);
    }

    /**
     * The uncertainty in the mosaicity estimate for the crystal.
     * @return FloatColumn
     */
    public FloatColumn getPdbxMosaicityEsd() {
        return delegate.getColumn("pdbx_mosaicity_esd", DelegatingFloatColumn::new);
    }

    /**
     * A code to indicate that a crystal image is available
     * for this crystal.
     * @return StrColumn
     */
    public StrColumn getPdbxCrystalImage() {
        return delegate.getColumn("pdbx_crystal_image", DelegatingStrColumn::new);
    }

    /**
     * A code to indicate that an x-ray image is available for
     * this crystal.
     * @return StrColumn
     */
    public StrColumn getPdbxX_rayImage() {
        return delegate.getColumn("pdbx_x-ray_image", DelegatingStrColumn::new);
    }

    /**
     * A description of the type of x-ray image for this crystal.
     * @return StrColumn
     */
    public StrColumn getPdbxX_rayImageType() {
        return delegate.getColumn("pdbx_x-ray_image_type", DelegatingStrColumn::new);
    }

    /**
     * The measured diffraction limit for this crystal.
     * @return FloatColumn
     */
    public FloatColumn getPdbxCrystalDiffrnLimit() {
        return delegate.getColumn("pdbx_crystal_diffrn_limit", DelegatingFloatColumn::new);
    }

    /**
     * The measured diffraction limit for this crystal.
     * @return FloatColumn
     */
    public FloatColumn getPdbxCrystalDiffrnLifetime() {
        return delegate.getColumn("pdbx_crystal_diffrn_lifetime", DelegatingFloatColumn::new);
    }

    /**
     * The crystal size along the first measured direction in millimeters.
     * @return FloatColumn
     */
    public FloatColumn getPdbxCrystalDirection1() {
        return delegate.getColumn("pdbx_crystal_direction_1", DelegatingFloatColumn::new);
    }

    /**
     * The crystal size along the second measured direction in millimeters.
     * @return FloatColumn
     */
    public FloatColumn getPdbxCrystalDirection2() {
        return delegate.getColumn("pdbx_crystal_direction_2", DelegatingFloatColumn::new);
    }

    /**
     * The crystal size along the third measured direction in millimeters.
     * @return FloatColumn
     */
    public FloatColumn getPdbxCrystalDirection3() {
        return delegate.getColumn("pdbx_crystal_direction_3", DelegatingFloatColumn::new);
    }

    /**
     * How parameters derived from the spot shape (such as mosaic block
     * size and rotation, beam divergence, and crossfire) and their
     * errors were estimated. See the related items section.
     * 
     * This can be a written description or a citation to a specific
     * software package that determined these parameters.
     * 
     * Note, these parameters are considered derived terms from the
     * data, as opposed to measured terms from the instrument (such
     * as diffrn_radiation.div_x_source, a term similar to
     * pdbx_crystal_alignment.crossfire_x).
     * @return StrColumn
     */
    public StrColumn getPdbxMosaicMethod() {
        return delegate.getColumn("pdbx_mosaic_method", DelegatingStrColumn::new);
    }

    /**
     * Isotropic and resolution-independent term representing the average size of
     * mosaic domains in the crystal specified in Angstroms.  Larger size indicates
     * better ordered crystals.
     * @return FloatColumn
     */
    public FloatColumn getPdbxMosaicBlockSize() {
        return delegate.getColumn("pdbx_mosaic_block_size", DelegatingFloatColumn::new);
    }

    /**
     * The uncertainty in the mosaic block size estimate for the crystal.
     * @return FloatColumn
     */
    public FloatColumn getPdbxMosaicBlockSizeEsd() {
        return delegate.getColumn("pdbx_mosaic_block_size_esd", DelegatingFloatColumn::new);
    }

}