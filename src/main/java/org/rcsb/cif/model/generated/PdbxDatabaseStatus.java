package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * These are internal RCSB records to keep track of data processing
 * and status of the entry.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStatusCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("status_code", SingleRowStrColumn::new) :
                getBinaryColumn("status_code"));
    }

    /**
     * The release status authorized by the depositor.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthorReleaseStatusCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("author_release_status_code", SingleRowStrColumn::new) :
                getBinaryColumn("author_release_status_code"));
    }

    /**
     * Code for status of structure factor file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStatusCodeSf() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("status_code_sf", SingleRowStrColumn::new) :
                getBinaryColumn("status_code_sf"));
    }

    /**
     * Code for status of NMR constraints file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStatusCodeMr() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("status_code_mr", SingleRowStrColumn::new) :
                getBinaryColumn("status_code_mr"));
    }

    /**
     * 
     * The deposited coordinates for this deposition will be released according
     * the value of this item.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepReleaseCodeCoordinates() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dep_release_code_coordinates", SingleRowStrColumn::new) :
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepReleaseCodeSequence() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dep_release_code_sequence", SingleRowStrColumn::new) :
                getBinaryColumn("dep_release_code_sequence"));
    }

    /**
     * 
     * The deposited structure factors for this deposition will be released according
     * the value of this item.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepReleaseCodeStructFact() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dep_release_code_struct_fact", SingleRowStrColumn::new) :
                getBinaryColumn("dep_release_code_struct_fact"));
    }

    /**
     * 
     * The deposited NMR constrait data for this deposition will be released according
     * the value of this item.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepReleaseCodeNmrConstraints() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dep_release_code_nmr_constraints", SingleRowStrColumn::new) :
                getBinaryColumn("dep_release_code_nmr_constraints"));
    }

    /**
     * The value of _pdbx_database_status.entry_id identifies the data block.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * This code indicates whether the deposition form for an entry
     * has been received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRecvdDepositForm() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("recvd_deposit_form", SingleRowStrColumn::new) :
                getBinaryColumn("recvd_deposit_form"));
    }

    /**
     * The date the deposition form is received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateDepositionForm() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_deposition_form", SingleRowStrColumn::new) :
                getBinaryColumn("date_deposition_form"));
    }

    /**
     * The starting date for the deposition session.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateBeginDeposition() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_begin_deposition", SingleRowStrColumn::new) :
                getBinaryColumn("date_begin_deposition"));
    }

    /**
     * The starting date for data processing.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateBeginProcessing() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_begin_processing", SingleRowStrColumn::new) :
                getBinaryColumn("date_begin_processing"));
    }

    /**
     * The completion date for data processing.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateEndProcessing() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_end_processing", SingleRowStrColumn::new) :
                getBinaryColumn("date_end_processing"));
    }

    /**
     * The date on which release processing began.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateBeginReleasePreparation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_begin_release_preparation", SingleRowStrColumn::new) :
                getBinaryColumn("date_begin_release_preparation"));
    }

    /**
     * The date on which the author requests entry release.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateAuthorReleaseRequest() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_author_release_request", SingleRowStrColumn::new) :
                getBinaryColumn("date_author_release_request"));
    }

    /**
     * This code indicates whether the coordinates for an entry
     * have been received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRecvdCoordinates() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("recvd_coordinates", SingleRowStrColumn::new) :
                getBinaryColumn("recvd_coordinates"));
    }

    /**
     * The date the coordinates are received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateCoordinates() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_coordinates", SingleRowStrColumn::new) :
                getBinaryColumn("date_coordinates"));
    }

    /**
     * This code indicates whether the structure factors for an entry
     * have been received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRecvdStructFact() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("recvd_struct_fact", SingleRowStrColumn::new) :
                getBinaryColumn("recvd_struct_fact"));
    }

    /**
     * The date the structure factors are received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateStructFact() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_struct_fact", SingleRowStrColumn::new) :
                getBinaryColumn("date_struct_fact"));
    }

    /**
     * This code indicates whether the NMR contraint data for an entry
     * have been received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRecvdNmrConstraints() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("recvd_nmr_constraints", SingleRowStrColumn::new) :
                getBinaryColumn("recvd_nmr_constraints"));
    }

    /**
     * The date the structure factors are received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateNmrConstraints() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_nmr_constraints", SingleRowStrColumn::new) :
                getBinaryColumn("date_nmr_constraints"));
    }

    /**
     * This code indicates whether the internal approval for an entry
     * have been received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRecvdInternalApproval() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("recvd_internal_approval", SingleRowStrColumn::new) :
                getBinaryColumn("recvd_internal_approval"));
    }

    /**
     * This code indicates whether the manuscript for an entry
     * has been received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRecvdManuscript() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("recvd_manuscript", SingleRowStrColumn::new) :
                getBinaryColumn("recvd_manuscript"));
    }

    /**
     * The date the manuscript is received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateManuscript() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_manuscript", SingleRowStrColumn::new) :
                getBinaryColumn("date_manuscript"));
    }

    /**
     * The last name of the depositor to be used in correspondance.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameDepositor() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_depositor", SingleRowStrColumn::new) :
                getBinaryColumn("name_depositor"));
    }

    /**
     * This code indicates whether the author's approval for
     * an entry has been received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRecvdAuthorApproval() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("recvd_author_approval", SingleRowStrColumn::new) :
                getBinaryColumn("recvd_author_approval"));
    }

    /**
     * This code indicates whether the author's approval for
     * an entry was received explicitly or implicitly.  The
     * latter is automatically implied by failure to respond
     * to the validation summary within the prescribed period.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthorApprovalType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("author_approval_type", SingleRowStrColumn::new) :
                getBinaryColumn("author_approval_type"));
    }

    /**
     * The date the author's approval is received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateAuthorApproval() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_author_approval", SingleRowStrColumn::new) :
                getBinaryColumn("date_author_approval"));
    }

    /**
     * The date of initial deposition.  (The first message for
     * deposition has been received.)
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRecvdInitialDepositionDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("recvd_initial_deposition_date", SingleRowStrColumn::new) :
                getBinaryColumn("recvd_initial_deposition_date"));
    }

    /**
     * The date of complete deposition.  This corresponds to the date
     * at which the PDB identifier is assigned.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateSubmitted() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_submitted", SingleRowStrColumn::new) :
                getBinaryColumn("date_submitted"));
    }

    /**
     * The initials of the annotator processing this entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRcsbAnnotator() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("rcsb_annotator", SingleRowStrColumn::new) :
                getBinaryColumn("rcsb_annotator"));
    }

    /**
     * The date of PDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateOfSfRelease() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_of_sf_release", SingleRowStrColumn::new) :
                getBinaryColumn("date_of_sf_release"));
    }

    /**
     * The date of PDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateOfMrRelease() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_of_mr_release", SingleRowStrColumn::new) :
                getBinaryColumn("date_of_mr_release"));
    }

    /**
     * PDB release date.  This is the date that appears in the PDB
     * REVDAT record.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateOfPDBRelease() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_of_PDB_release", SingleRowStrColumn::new) :
                getBinaryColumn("date_of_PDB_release"));
    }

    /**
     * At an author's request, a coordinate entry may be held after
     * processing for some period of time.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateHoldCoordinates() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_hold_coordinates", SingleRowStrColumn::new) :
                getBinaryColumn("date_hold_coordinates"));
    }

    /**
     * At an author's request, the structure factors may be held after
     * processing for some period of time.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateHoldStructFact() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_hold_struct_fact", SingleRowStrColumn::new) :
                getBinaryColumn("date_hold_struct_fact"));
    }

    /**
     * At an author's request, the NMR constraint data may be held after
     * processing for some period of time.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateHoldNmrConstraints() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_hold_nmr_constraints", SingleRowStrColumn::new) :
                getBinaryColumn("date_hold_nmr_constraints"));
    }

    /**
     * At an author's request, an entry is to be held until
     * publication.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getHoldForPublication() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("hold_for_publication", SingleRowStrColumn::new) :
                getBinaryColumn("hold_for_publication"));
    }

    /**
     * This code indicates whether the entry belongs to
     * Structural Genomics Project.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSGEntry() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("SG_entry", SingleRowStrColumn::new) :
                getBinaryColumn("SG_entry"));
    }

    /**
     * This is the date when PDB received the author's approval for an
     * entry which has been processed by NDB.  (This is a place holder
     * for entries processed before Jan. 1, 1996.)
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbDateOfAuthorApproval() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdb_date_of_author_approval", SingleRowStrColumn::new) :
                getBinaryColumn("pdb_date_of_author_approval"));
    }

    /**
     * The site where the file was deposited.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepositSite() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("deposit_site", SingleRowStrColumn::new) :
                getBinaryColumn("deposit_site"));
    }

    /**
     * The site where the file was deposited.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getProcessSite() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("process_site", SingleRowStrColumn::new) :
                getBinaryColumn("process_site"));
    }

    /**
     * 
     * The deposited chemical shift data for this deposition will be released according
     * the value of this item.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepReleaseCodeChemicalShifts() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dep_release_code_chemical_shifts", SingleRowStrColumn::new) :
                getBinaryColumn("dep_release_code_chemical_shifts"));
    }

    /**
     * This code indicates whether the chemical shift data for an entry
     * have been received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRecvdChemicalShifts() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("recvd_chemical_shifts", SingleRowStrColumn::new) :
                getBinaryColumn("recvd_chemical_shifts"));
    }

    /**
     * The date the chemical shift data are received.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateChemicalShifts() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_chemical_shifts", SingleRowStrColumn::new) :
                getBinaryColumn("date_chemical_shifts"));
    }

    /**
     * At an author's request, the chemical shift data may be held after
     * processing for some period of time.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateHoldChemicalShifts() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_hold_chemical_shifts", SingleRowStrColumn::new) :
                getBinaryColumn("date_hold_chemical_shifts"));
    }

    /**
     * Code for status of chemical shift data file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStatusCodeCs() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("status_code_cs", SingleRowStrColumn::new) :
                getBinaryColumn("status_code_cs"));
    }

    /**
     * The date of PDB release.  This corresponds to the date
     * at which the chemical shift data is placed into the public archive.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateOfCsRelease() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_of_cs_release", SingleRowStrColumn::new) :
                getBinaryColumn("date_of_cs_release"));
    }

    /**
     * The methods development category in which this
     * entry has been placed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethodsDevelopmentCategory() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("methods_development_category", SingleRowStrColumn::new) :
                getBinaryColumn("methods_development_category"));
    }

    /**
     * A flag indicating that the entry is compatible with the PDB format.
     * 
     * A value of 'N' indicates that the no PDB format data file is
     * corresponding to this entry is available in the PDB archive.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbFormatCompatible() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdb_format_compatible", SingleRowStrColumn::new) :
                getBinaryColumn("pdb_format_compatible"));
    }

    /**
     * The release date requested by the depositor.
     * 
     * This is used when the depositor has provided
     * the release hold date expiration or a one year
     * hold interval.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthReqRelDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("auth_req_rel_date", SingleRowStrColumn::new) :
                getBinaryColumn("auth_req_rel_date"));
    }

    /**
     * Temporary NDB ID.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNdbTid() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ndb_tid", SingleRowStrColumn::new) :
                getBinaryColumn("ndb_tid"));
    }

    /**
     * Give information about status of coordinates of an entry in NDB.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStatusCoordinatesInNDB() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("status_coordinates_in_NDB", SingleRowStrColumn::new) :
                getBinaryColumn("status_coordinates_in_NDB"));
    }

    /**
     * The date of a revision.  This corresponds to the date
     * at which the entry was updated and a revision entry created.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateRevised() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_revised", SingleRowStrColumn::new) :
                getBinaryColumn("date_revised"));
    }

    /**
     * The NDB ID that this entry replaced.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getReplacedEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("replaced_entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("replaced_entry_id"));
    }

    /**
     * The NDB ID for entry that replaces this entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRevisionId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("revision_id", SingleRowStrColumn::new) :
                getBinaryColumn("revision_id"));
    }

    /**
     * A description of the revision to this entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRevisionDescription() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("revision_description", SingleRowStrColumn::new) :
                getBinaryColumn("revision_description"));
    }

    /**
     * The initials of the annotator processing this entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxAnnotator() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_annotator", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_annotator"));
    }

    /**
     * The date of NDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateOfNDBRelease() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_of_NDB_release", SingleRowStrColumn::new) :
                getBinaryColumn("date_of_NDB_release"));
    }

    /**
     * The date on which the entry is sent to PDB.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDateReleasedToPDB() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date_released_to_PDB", SingleRowStrColumn::new) :
                getBinaryColumn("date_released_to_PDB"));
    }

    /**
     * This code indicates whether to skip production of
     * PDB REMARK 500 for this file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSkipPDBREMARK500() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("skip_PDB_REMARK_500", SingleRowStrColumn::new) :
                getBinaryColumn("skip_PDB_REMARK_500"));
    }

    /**
     * This code indicates whether to skip production of
     * a PDB REMARK for this file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSkipPDBREMARK() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("skip_PDB_REMARK", SingleRowStrColumn::new) :
                getBinaryColumn("skip_PDB_REMARK"));
    }

    /**
     * This code indicates whether to suppress the entry title.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTitleSuppression() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("title_suppression", SingleRowStrColumn::new) :
                getBinaryColumn("title_suppression"));
    }
}
