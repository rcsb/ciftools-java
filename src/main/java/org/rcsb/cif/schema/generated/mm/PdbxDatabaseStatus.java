package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * These are internal RCSB records to keep track of data processing
 * and status of the entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDatabaseStatus extends DelegatingCategory {
    public PdbxDatabaseStatus(Category delegate) {
        super(delegate);
    }

    /**
     * Code for status of file.
     * @return StrColumn
     */
    public StrColumn getStatusCode() {
        return delegate.getColumn("status_code", DelegatingStrColumn::new);
    }

    /**
     * The release status authorized by the depositor.
     * @return StrColumn
     */
    public StrColumn getAuthorReleaseStatusCode() {
        return delegate.getColumn("author_release_status_code", DelegatingStrColumn::new);
    }

    /**
     * Code for status of structure factor file.
     * @return StrColumn
     */
    public StrColumn getStatusCodeSf() {
        return delegate.getColumn("status_code_sf", DelegatingStrColumn::new);
    }

    /**
     * Code for status of NMR constraints file.
     * @return StrColumn
     */
    public StrColumn getStatusCodeMr() {
        return delegate.getColumn("status_code_mr", DelegatingStrColumn::new);
    }

    /**
     * 
     * The deposited coordinates for this deposition will be released according
     * the value of this item.
     * @return StrColumn
     */
    public StrColumn getDepReleaseCodeCoordinates() {
        return delegate.getColumn("dep_release_code_coordinates", DelegatingStrColumn::new);
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
        return delegate.getColumn("dep_release_code_sequence", DelegatingStrColumn::new);
    }

    /**
     * 
     * The deposited structure factors for this deposition will be released according
     * the value of this item.
     * @return StrColumn
     */
    public StrColumn getDepReleaseCodeStructFact() {
        return delegate.getColumn("dep_release_code_struct_fact", DelegatingStrColumn::new);
    }

    /**
     * 
     * The deposited NMR constrait data for this deposition will be released according
     * the value of this item.
     * @return StrColumn
     */
    public StrColumn getDepReleaseCodeNmrConstraints() {
        return delegate.getColumn("dep_release_code_nmr_constraints", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_database_status.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether the deposition form for an entry
     * has been received.
     * @return StrColumn
     */
    public StrColumn getRecvdDepositForm() {
        return delegate.getColumn("recvd_deposit_form", DelegatingStrColumn::new);
    }

    /**
     * The date the deposition form is received.
     * @return StrColumn
     */
    public StrColumn getDateDepositionForm() {
        return delegate.getColumn("date_deposition_form", DelegatingStrColumn::new);
    }

    /**
     * The starting date for the deposition session.
     * @return StrColumn
     */
    public StrColumn getDateBeginDeposition() {
        return delegate.getColumn("date_begin_deposition", DelegatingStrColumn::new);
    }

    /**
     * The starting date for data processing.
     * @return StrColumn
     */
    public StrColumn getDateBeginProcessing() {
        return delegate.getColumn("date_begin_processing", DelegatingStrColumn::new);
    }

    /**
     * The completion date for data processing.
     * @return StrColumn
     */
    public StrColumn getDateEndProcessing() {
        return delegate.getColumn("date_end_processing", DelegatingStrColumn::new);
    }

    /**
     * The date on which release processing began.
     * @return StrColumn
     */
    public StrColumn getDateBeginReleasePreparation() {
        return delegate.getColumn("date_begin_release_preparation", DelegatingStrColumn::new);
    }

    /**
     * The date on which the author requests entry release.
     * @return StrColumn
     */
    public StrColumn getDateAuthorReleaseRequest() {
        return delegate.getColumn("date_author_release_request", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether the coordinates for an entry
     * have been received.
     * @return StrColumn
     */
    public StrColumn getRecvdCoordinates() {
        return delegate.getColumn("recvd_coordinates", DelegatingStrColumn::new);
    }

    /**
     * The date the coordinates are received.
     * @return StrColumn
     */
    public StrColumn getDateCoordinates() {
        return delegate.getColumn("date_coordinates", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether the structure factors for an entry
     * have been received.
     * @return StrColumn
     */
    public StrColumn getRecvdStructFact() {
        return delegate.getColumn("recvd_struct_fact", DelegatingStrColumn::new);
    }

    /**
     * The date the structure factors are received.
     * @return StrColumn
     */
    public StrColumn getDateStructFact() {
        return delegate.getColumn("date_struct_fact", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether the NMR contraint data for an entry
     * have been received.
     * @return StrColumn
     */
    public StrColumn getRecvdNmrConstraints() {
        return delegate.getColumn("recvd_nmr_constraints", DelegatingStrColumn::new);
    }

    /**
     * The date the structure factors are received.
     * @return StrColumn
     */
    public StrColumn getDateNmrConstraints() {
        return delegate.getColumn("date_nmr_constraints", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether the internal approval for an entry
     * have been received.
     * @return StrColumn
     */
    public StrColumn getRecvdInternalApproval() {
        return delegate.getColumn("recvd_internal_approval", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether the manuscript for an entry
     * has been received.
     * @return StrColumn
     */
    public StrColumn getRecvdManuscript() {
        return delegate.getColumn("recvd_manuscript", DelegatingStrColumn::new);
    }

    /**
     * The date the manuscript is received.
     * @return StrColumn
     */
    public StrColumn getDateManuscript() {
        return delegate.getColumn("date_manuscript", DelegatingStrColumn::new);
    }

    /**
     * The last name of the depositor to be used in correspondance.
     * @return StrColumn
     */
    public StrColumn getNameDepositor() {
        return delegate.getColumn("name_depositor", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether the author's approval for
     * an entry has been received.
     * @return StrColumn
     */
    public StrColumn getRecvdAuthorApproval() {
        return delegate.getColumn("recvd_author_approval", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether the author's approval for
     * an entry was received explicitly or implicitly.  The
     * latter is automatically implied by failure to respond
     * to the validation summary within the prescribed period.
     * @return StrColumn
     */
    public StrColumn getAuthorApprovalType() {
        return delegate.getColumn("author_approval_type", DelegatingStrColumn::new);
    }

    /**
     * The date the author's approval is received.
     * @return StrColumn
     */
    public StrColumn getDateAuthorApproval() {
        return delegate.getColumn("date_author_approval", DelegatingStrColumn::new);
    }

    /**
     * The date of initial deposition.  (The first message for
     * deposition has been received.)
     * @return StrColumn
     */
    public StrColumn getRecvdInitialDepositionDate() {
        return delegate.getColumn("recvd_initial_deposition_date", DelegatingStrColumn::new);
    }

    /**
     * The date of complete deposition.  This corresponds to the date
     * at which the PDB identifier is assigned.
     * @return StrColumn
     */
    public StrColumn getDateSubmitted() {
        return delegate.getColumn("date_submitted", DelegatingStrColumn::new);
    }

    /**
     * The initials of the annotator processing this entry.
     * @return StrColumn
     */
    public StrColumn getRcsbAnnotator() {
        return delegate.getColumn("rcsb_annotator", DelegatingStrColumn::new);
    }

    /**
     * The date of PDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return StrColumn
     */
    public StrColumn getDateOfSfRelease() {
        return delegate.getColumn("date_of_sf_release", DelegatingStrColumn::new);
    }

    /**
     * The date of PDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return StrColumn
     */
    public StrColumn getDateOfMrRelease() {
        return delegate.getColumn("date_of_mr_release", DelegatingStrColumn::new);
    }

    /**
     * PDB release date.  This is the date that appears in the PDB
     * REVDAT record.
     * @return StrColumn
     */
    public StrColumn getDateOfPDBRelease() {
        return delegate.getColumn("date_of_PDB_release", DelegatingStrColumn::new);
    }

    /**
     * At an author's request, a coordinate entry may be held after
     * processing for some period of time.
     * @return StrColumn
     */
    public StrColumn getDateHoldCoordinates() {
        return delegate.getColumn("date_hold_coordinates", DelegatingStrColumn::new);
    }

    /**
     * At an author's request, the structure factors may be held after
     * processing for some period of time.
     * @return StrColumn
     */
    public StrColumn getDateHoldStructFact() {
        return delegate.getColumn("date_hold_struct_fact", DelegatingStrColumn::new);
    }

    /**
     * At an author's request, the NMR constraint data may be held after
     * processing for some period of time.
     * @return StrColumn
     */
    public StrColumn getDateHoldNmrConstraints() {
        return delegate.getColumn("date_hold_nmr_constraints", DelegatingStrColumn::new);
    }

    /**
     * At an author's request, an entry is to be held until
     * publication.
     * @return StrColumn
     */
    public StrColumn getHoldForPublication() {
        return delegate.getColumn("hold_for_publication", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether the entry belongs to
     * Structural Genomics Project.
     * @return StrColumn
     */
    public StrColumn getSGEntry() {
        return delegate.getColumn("SG_entry", DelegatingStrColumn::new);
    }

    /**
     * This is the date when PDB received the author's approval for an
     * entry which has been processed by NDB.  (This is a place holder
     * for entries processed before Jan. 1, 1996.)
     * @return StrColumn
     */
    public StrColumn getPdbDateOfAuthorApproval() {
        return delegate.getColumn("pdb_date_of_author_approval", DelegatingStrColumn::new);
    }

    /**
     * The site where the file was deposited.
     * @return StrColumn
     */
    public StrColumn getDepositSite() {
        return delegate.getColumn("deposit_site", DelegatingStrColumn::new);
    }

    /**
     * The site where the file was deposited.
     * @return StrColumn
     */
    public StrColumn getProcessSite() {
        return delegate.getColumn("process_site", DelegatingStrColumn::new);
    }

    /**
     * 
     * The deposited chemical shift data for this deposition will be released according
     * the value of this item.
     * @return StrColumn
     */
    public StrColumn getDepReleaseCodeChemicalShifts() {
        return delegate.getColumn("dep_release_code_chemical_shifts", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether the chemical shift data for an entry
     * have been received.
     * @return StrColumn
     */
    public StrColumn getRecvdChemicalShifts() {
        return delegate.getColumn("recvd_chemical_shifts", DelegatingStrColumn::new);
    }

    /**
     * The date the chemical shift data are received.
     * @return StrColumn
     */
    public StrColumn getDateChemicalShifts() {
        return delegate.getColumn("date_chemical_shifts", DelegatingStrColumn::new);
    }

    /**
     * At an author's request, the chemical shift data may be held after
     * processing for some period of time.
     * @return StrColumn
     */
    public StrColumn getDateHoldChemicalShifts() {
        return delegate.getColumn("date_hold_chemical_shifts", DelegatingStrColumn::new);
    }

    /**
     * Code for status of chemical shift data file.
     * @return StrColumn
     */
    public StrColumn getStatusCodeCs() {
        return delegate.getColumn("status_code_cs", DelegatingStrColumn::new);
    }

    /**
     * The date of PDB release.  This corresponds to the date
     * at which the chemical shift data is placed into the public archive.
     * @return StrColumn
     */
    public StrColumn getDateOfCsRelease() {
        return delegate.getColumn("date_of_cs_release", DelegatingStrColumn::new);
    }

    /**
     * The methods development category in which this
     * entry has been placed.
     * @return StrColumn
     */
    public StrColumn getMethodsDevelopmentCategory() {
        return delegate.getColumn("methods_development_category", DelegatingStrColumn::new);
    }

    /**
     * A flag indicating that the entry is compatible with the PDB format.
     * 
     * A value of 'N' indicates that the no PDB format data file is
     * corresponding to this entry is available in the PDB archive.
     * @return StrColumn
     */
    public StrColumn getPdbFormatCompatible() {
        return delegate.getColumn("pdb_format_compatible", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_req_rel_date", DelegatingStrColumn::new);
    }

    /**
     * Temporary NDB ID.
     * @return StrColumn
     */
    public StrColumn getNdbTid() {
        return delegate.getColumn("ndb_tid", DelegatingStrColumn::new);
    }

    /**
     * Give information about status of coordinates of an entry in NDB.
     * @return StrColumn
     */
    public StrColumn getStatusCoordinatesInNDB() {
        return delegate.getColumn("status_coordinates_in_NDB", DelegatingStrColumn::new);
    }

    /**
     * The date of a revision.  This corresponds to the date
     * at which the entry was updated and a revision entry created.
     * @return StrColumn
     */
    public StrColumn getDateRevised() {
        return delegate.getColumn("date_revised", DelegatingStrColumn::new);
    }

    /**
     * The NDB ID that this entry replaced.
     * @return StrColumn
     */
    public StrColumn getReplacedEntryId() {
        return delegate.getColumn("replaced_entry_id", DelegatingStrColumn::new);
    }

    /**
     * The NDB ID for entry that replaces this entry.
     * @return StrColumn
     */
    public StrColumn getRevisionId() {
        return delegate.getColumn("revision_id", DelegatingStrColumn::new);
    }

    /**
     * A description of the revision to this entry.
     * @return StrColumn
     */
    public StrColumn getRevisionDescription() {
        return delegate.getColumn("revision_description", DelegatingStrColumn::new);
    }

    /**
     * The initials of the annotator processing this entry.
     * @return StrColumn
     */
    public StrColumn getPdbxAnnotator() {
        return delegate.getColumn("pdbx_annotator", DelegatingStrColumn::new);
    }

    /**
     * The date of NDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return StrColumn
     */
    public StrColumn getDateOfNDBRelease() {
        return delegate.getColumn("date_of_NDB_release", DelegatingStrColumn::new);
    }

    /**
     * The date on which the entry is sent to PDB.
     * @return StrColumn
     */
    public StrColumn getDateReleasedToPDB() {
        return delegate.getColumn("date_released_to_PDB", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether to skip production of
     * PDB REMARK 500 for this file.
     * @return StrColumn
     */
    public StrColumn getSkipPDBREMARK500() {
        return delegate.getColumn("skip_PDB_REMARK_500", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether to skip production of
     * a PDB REMARK for this file.
     * @return StrColumn
     */
    public StrColumn getSkipPDBREMARK() {
        return delegate.getColumn("skip_PDB_REMARK", DelegatingStrColumn::new);
    }

    /**
     * This code indicates whether to suppress the entry title.
     * @return StrColumn
     */
    public StrColumn getTitleSuppression() {
        return delegate.getColumn("title_suppression", DelegatingStrColumn::new);
    }
}
