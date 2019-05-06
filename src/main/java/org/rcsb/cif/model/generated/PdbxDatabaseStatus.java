package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * These are internal RCSB records to keep track of data processing
 * and status of the entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDatabaseStatus extends BaseCategory {
    public PdbxDatabaseStatus(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDatabaseStatus(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDatabaseStatus(String name) {
        super(name);
    }

    /**
     * Code for status of file.
     * @return StrColumn
     */
    public StrColumn getStatusCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("status_code", StrColumn::new) :
                getBinaryColumn("status_code"));
    }

    /**
     * The release status authorized by the depositor.
     * @return StrColumn
     */
    public StrColumn getAuthorReleaseStatusCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("author_release_status_code", StrColumn::new) :
                getBinaryColumn("author_release_status_code"));
    }

    /**
     * Code for status of structure factor file.
     * @return StrColumn
     */
    public StrColumn getStatusCodeSf() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("status_code_sf", StrColumn::new) :
                getBinaryColumn("status_code_sf"));
    }

    /**
     * Code for status of NMR constraints file.
     * @return StrColumn
     */
    public StrColumn getStatusCodeMr() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("status_code_mr", StrColumn::new) :
                getBinaryColumn("status_code_mr"));
    }

    /**
     * 
     * The deposited coordinates for this deposition will be released according
     * the value of this item.
     * @return StrColumn
     */
    public StrColumn getDepReleaseCodeCoordinates() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dep_release_code_coordinates", StrColumn::new) :
                getBinaryColumn("dep_release_code_coordinates"));
    }

    /**
     * 
     * The sequence information for this deposition will be released according
     * the value of this item.  Setting this status code to "RELEASE NOW" indicates
     * that the macromolecular sequence(s) for this entry may be displayed in PDB
     * status reports prior to the release of the entry.   Setting this status
     * code to "HOLD FOR RELEASE" conceals the sequence information in PDB status
     * reports until the coordinate data for this entry are released.
     * @return StrColumn
     */
    public StrColumn getDepReleaseCodeSequence() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dep_release_code_sequence", StrColumn::new) :
                getBinaryColumn("dep_release_code_sequence"));
    }

    /**
     * 
     * The deposited structure factors for this deposition will be released according
     * the value of this item.
     * @return StrColumn
     */
    public StrColumn getDepReleaseCodeStructFact() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dep_release_code_struct_fact", StrColumn::new) :
                getBinaryColumn("dep_release_code_struct_fact"));
    }

    /**
     * 
     * The deposited NMR constrait data for this deposition will be released according
     * the value of this item.
     * @return StrColumn
     */
    public StrColumn getDepReleaseCodeNmrConstraints() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dep_release_code_nmr_constraints", StrColumn::new) :
                getBinaryColumn("dep_release_code_nmr_constraints"));
    }

    /**
     * The value of _pdbx_database_status.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * This code indicates whether the deposition form for an entry
     * has been received.
     * @return StrColumn
     */
    public StrColumn getRecvdDepositForm() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("recvd_deposit_form", StrColumn::new) :
                getBinaryColumn("recvd_deposit_form"));
    }

    /**
     * The date the deposition form is received.
     * @return StrColumn
     */
    public StrColumn getDateDepositionForm() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_deposition_form", StrColumn::new) :
                getBinaryColumn("date_deposition_form"));
    }

    /**
     * The starting date for the deposition session.
     * @return StrColumn
     */
    public StrColumn getDateBeginDeposition() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_begin_deposition", StrColumn::new) :
                getBinaryColumn("date_begin_deposition"));
    }

    /**
     * The starting date for data processing.
     * @return StrColumn
     */
    public StrColumn getDateBeginProcessing() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_begin_processing", StrColumn::new) :
                getBinaryColumn("date_begin_processing"));
    }

    /**
     * The completion date for data processing.
     * @return StrColumn
     */
    public StrColumn getDateEndProcessing() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_end_processing", StrColumn::new) :
                getBinaryColumn("date_end_processing"));
    }

    /**
     * The date on which release processing began.
     * @return StrColumn
     */
    public StrColumn getDateBeginReleasePreparation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_begin_release_preparation", StrColumn::new) :
                getBinaryColumn("date_begin_release_preparation"));
    }

    /**
     * The date on which the author requests entry release.
     * @return StrColumn
     */
    public StrColumn getDateAuthorReleaseRequest() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_author_release_request", StrColumn::new) :
                getBinaryColumn("date_author_release_request"));
    }

    /**
     * This code indicates whether the coordinates for an entry
     * have been received.
     * @return StrColumn
     */
    public StrColumn getRecvdCoordinates() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("recvd_coordinates", StrColumn::new) :
                getBinaryColumn("recvd_coordinates"));
    }

    /**
     * The date the coordinates are received.
     * @return StrColumn
     */
    public StrColumn getDateCoordinates() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_coordinates", StrColumn::new) :
                getBinaryColumn("date_coordinates"));
    }

    /**
     * This code indicates whether the structure factors for an entry
     * have been received.
     * @return StrColumn
     */
    public StrColumn getRecvdStructFact() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("recvd_struct_fact", StrColumn::new) :
                getBinaryColumn("recvd_struct_fact"));
    }

    /**
     * The date the structure factors are received.
     * @return StrColumn
     */
    public StrColumn getDateStructFact() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_struct_fact", StrColumn::new) :
                getBinaryColumn("date_struct_fact"));
    }

    /**
     * This code indicates whether the NMR contraint data for an entry
     * have been received.
     * @return StrColumn
     */
    public StrColumn getRecvdNmrConstraints() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("recvd_nmr_constraints", StrColumn::new) :
                getBinaryColumn("recvd_nmr_constraints"));
    }

    /**
     * The date the structure factors are received.
     * @return StrColumn
     */
    public StrColumn getDateNmrConstraints() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_nmr_constraints", StrColumn::new) :
                getBinaryColumn("date_nmr_constraints"));
    }

    /**
     * This code indicates whether the internal approval for an entry
     * have been received.
     * @return StrColumn
     */
    public StrColumn getRecvdInternalApproval() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("recvd_internal_approval", StrColumn::new) :
                getBinaryColumn("recvd_internal_approval"));
    }

    /**
     * This code indicates whether the manuscript for an entry
     * has been received.
     * @return StrColumn
     */
    public StrColumn getRecvdManuscript() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("recvd_manuscript", StrColumn::new) :
                getBinaryColumn("recvd_manuscript"));
    }

    /**
     * The date the manuscript is received.
     * @return StrColumn
     */
    public StrColumn getDateManuscript() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_manuscript", StrColumn::new) :
                getBinaryColumn("date_manuscript"));
    }

    /**
     * The last name of the depositor to be used in correspondance.
     * @return StrColumn
     */
    public StrColumn getNameDepositor() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_depositor", StrColumn::new) :
                getBinaryColumn("name_depositor"));
    }

    /**
     * This code indicates whether the author's approval for
     * an entry has been received.
     * @return StrColumn
     */
    public StrColumn getRecvdAuthorApproval() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("recvd_author_approval", StrColumn::new) :
                getBinaryColumn("recvd_author_approval"));
    }

    /**
     * This code indicates whether the author's approval for
     * an entry was received explicitly or implicitly.  The
     * latter is automatically implied by failure to respond
     * to the validation summary within the prescribed period.
     * @return StrColumn
     */
    public StrColumn getAuthorApprovalType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("author_approval_type", StrColumn::new) :
                getBinaryColumn("author_approval_type"));
    }

    /**
     * The date the author's approval is received.
     * @return StrColumn
     */
    public StrColumn getDateAuthorApproval() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_author_approval", StrColumn::new) :
                getBinaryColumn("date_author_approval"));
    }

    /**
     * The date of initial deposition.  (The first message for
     * deposition has been received.)
     * @return StrColumn
     */
    public StrColumn getRecvdInitialDepositionDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("recvd_initial_deposition_date", StrColumn::new) :
                getBinaryColumn("recvd_initial_deposition_date"));
    }

    /**
     * The date of complete deposition.  This corresponds to the date
     * at which the PDB identifier is assigned.
     * @return StrColumn
     */
    public StrColumn getDateSubmitted() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_submitted", StrColumn::new) :
                getBinaryColumn("date_submitted"));
    }

    /**
     * The initials of the annotator processing this entry.
     * @return StrColumn
     */
    public StrColumn getRcsbAnnotator() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("rcsb_annotator", StrColumn::new) :
                getBinaryColumn("rcsb_annotator"));
    }

    /**
     * The date of PDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return StrColumn
     */
    public StrColumn getDateOfSfRelease() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_of_sf_release", StrColumn::new) :
                getBinaryColumn("date_of_sf_release"));
    }

    /**
     * The date of PDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return StrColumn
     */
    public StrColumn getDateOfMrRelease() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_of_mr_release", StrColumn::new) :
                getBinaryColumn("date_of_mr_release"));
    }

    /**
     * PDB release date.  This is the date that appears in the PDB
     * REVDAT record.
     * @return StrColumn
     */
    public StrColumn getDateOfPDBRelease() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_of_PDB_release", StrColumn::new) :
                getBinaryColumn("date_of_PDB_release"));
    }

    /**
     * At an author's request, a coordinate entry may be held after
     * processing for some period of time.
     * @return StrColumn
     */
    public StrColumn getDateHoldCoordinates() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_hold_coordinates", StrColumn::new) :
                getBinaryColumn("date_hold_coordinates"));
    }

    /**
     * At an author's request, the structure factors may be held after
     * processing for some period of time.
     * @return StrColumn
     */
    public StrColumn getDateHoldStructFact() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_hold_struct_fact", StrColumn::new) :
                getBinaryColumn("date_hold_struct_fact"));
    }

    /**
     * At an author's request, the NMR constraint data may be held after
     * processing for some period of time.
     * @return StrColumn
     */
    public StrColumn getDateHoldNmrConstraints() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_hold_nmr_constraints", StrColumn::new) :
                getBinaryColumn("date_hold_nmr_constraints"));
    }

    /**
     * At an author's request, an entry is to be held until
     * publication.
     * @return StrColumn
     */
    public StrColumn getHoldForPublication() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("hold_for_publication", StrColumn::new) :
                getBinaryColumn("hold_for_publication"));
    }

    /**
     * This code indicates whether the entry belongs to
     * Structural Genomics Project.
     * @return StrColumn
     */
    public StrColumn getSGEntry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("SG_entry", StrColumn::new) :
                getBinaryColumn("SG_entry"));
    }

    /**
     * This is the date when PDB received the author's approval for an
     * entry which has been processed by NDB.  (This is a place holder
     * for entries processed before Jan. 1, 1996.)
     * @return StrColumn
     */
    public StrColumn getPdbDateOfAuthorApproval() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_date_of_author_approval", StrColumn::new) :
                getBinaryColumn("pdb_date_of_author_approval"));
    }

    /**
     * The site where the file was deposited.
     * @return StrColumn
     */
    public StrColumn getDepositSite() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("deposit_site", StrColumn::new) :
                getBinaryColumn("deposit_site"));
    }

    /**
     * The site where the file was deposited.
     * @return StrColumn
     */
    public StrColumn getProcessSite() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("process_site", StrColumn::new) :
                getBinaryColumn("process_site"));
    }

    /**
     * 
     * The deposited chemical shift data for this deposition will be released according
     * the value of this item.
     * @return StrColumn
     */
    public StrColumn getDepReleaseCodeChemicalShifts() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dep_release_code_chemical_shifts", StrColumn::new) :
                getBinaryColumn("dep_release_code_chemical_shifts"));
    }

    /**
     * This code indicates whether the chemical shift data for an entry
     * have been received.
     * @return StrColumn
     */
    public StrColumn getRecvdChemicalShifts() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("recvd_chemical_shifts", StrColumn::new) :
                getBinaryColumn("recvd_chemical_shifts"));
    }

    /**
     * The date the chemical shift data are received.
     * @return StrColumn
     */
    public StrColumn getDateChemicalShifts() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_chemical_shifts", StrColumn::new) :
                getBinaryColumn("date_chemical_shifts"));
    }

    /**
     * At an author's request, the chemical shift data may be held after
     * processing for some period of time.
     * @return StrColumn
     */
    public StrColumn getDateHoldChemicalShifts() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_hold_chemical_shifts", StrColumn::new) :
                getBinaryColumn("date_hold_chemical_shifts"));
    }

    /**
     * Code for status of chemical shift data file.
     * @return StrColumn
     */
    public StrColumn getStatusCodeCs() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("status_code_cs", StrColumn::new) :
                getBinaryColumn("status_code_cs"));
    }

    /**
     * The date of PDB release.  This corresponds to the date
     * at which the chemical shift data is placed into the public archive.
     * @return StrColumn
     */
    public StrColumn getDateOfCsRelease() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_of_cs_release", StrColumn::new) :
                getBinaryColumn("date_of_cs_release"));
    }

    /**
     * The methods development category in which this
     * entry has been placed.
     * @return StrColumn
     */
    public StrColumn getMethodsDevelopmentCategory() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("methods_development_category", StrColumn::new) :
                getBinaryColumn("methods_development_category"));
    }

    /**
     * A flag indicating that the entry is compatible with the PDB format.
     * 
     * A value of 'N' indicates that the no PDB format data file is
     * corresponding to this entry is available in the PDB archive.
     * @return StrColumn
     */
    public StrColumn getPdbFormatCompatible() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_format_compatible", StrColumn::new) :
                getBinaryColumn("pdb_format_compatible"));
    }

    /**
     * The release date requested by the depositor.
     * 
     * This is used when the depositor has provided
     * the release hold date expiration or a one year
     * hold interval.
     * @return StrColumn
     */
    public StrColumn getAuthReqRelDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_req_rel_date", StrColumn::new) :
                getBinaryColumn("auth_req_rel_date"));
    }

    /**
     * Temporary NDB ID.
     * @return StrColumn
     */
    public StrColumn getNdbTid() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ndb_tid", StrColumn::new) :
                getBinaryColumn("ndb_tid"));
    }

    /**
     * Give information about status of coordinates of an entry in NDB.
     * @return StrColumn
     */
    public StrColumn getStatusCoordinatesInNDB() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("status_coordinates_in_NDB", StrColumn::new) :
                getBinaryColumn("status_coordinates_in_NDB"));
    }

    /**
     * The date of a revision.  This corresponds to the date
     * at which the entry was updated and a revision entry created.
     * @return StrColumn
     */
    public StrColumn getDateRevised() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_revised", StrColumn::new) :
                getBinaryColumn("date_revised"));
    }

    /**
     * The NDB ID that this entry replaced.
     * @return StrColumn
     */
    public StrColumn getReplacedEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("replaced_entry_id", StrColumn::new) :
                getBinaryColumn("replaced_entry_id"));
    }

    /**
     * The NDB ID for entry that replaces this entry.
     * @return StrColumn
     */
    public StrColumn getRevisionId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("revision_id", StrColumn::new) :
                getBinaryColumn("revision_id"));
    }

    /**
     * A description of the revision to this entry.
     * @return StrColumn
     */
    public StrColumn getRevisionDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("revision_description", StrColumn::new) :
                getBinaryColumn("revision_description"));
    }

    /**
     * The initials of the annotator processing this entry.
     * @return StrColumn
     */
    public StrColumn getPdbxAnnotator() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_annotator", StrColumn::new) :
                getBinaryColumn("pdbx_annotator"));
    }

    /**
     * The date of NDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return StrColumn
     */
    public StrColumn getDateOfNDBRelease() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_of_NDB_release", StrColumn::new) :
                getBinaryColumn("date_of_NDB_release"));
    }

    /**
     * The date on which the entry is sent to PDB.
     * @return StrColumn
     */
    public StrColumn getDateReleasedToPDB() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_released_to_PDB", StrColumn::new) :
                getBinaryColumn("date_released_to_PDB"));
    }

    /**
     * This code indicates whether to skip production of
     * PDB REMARK 500 for this file.
     * @return StrColumn
     */
    public StrColumn getSkipPDBREMARK500() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("skip_PDB_REMARK_500", StrColumn::new) :
                getBinaryColumn("skip_PDB_REMARK_500"));
    }

    /**
     * This code indicates whether to skip production of
     * a PDB REMARK for this file.
     * @return StrColumn
     */
    public StrColumn getSkipPDBREMARK() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("skip_PDB_REMARK", StrColumn::new) :
                getBinaryColumn("skip_PDB_REMARK"));
    }

    /**
     * This code indicates whether to suppress the entry title.
     * @return StrColumn
     */
    public StrColumn getTitleSuppression() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("title_suppression", StrColumn::new) :
                getBinaryColumn("title_suppression"));
    }
}
