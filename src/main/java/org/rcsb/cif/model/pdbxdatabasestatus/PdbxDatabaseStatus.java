package org.rcsb.cif.model.pdbxdatabasestatus;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return StatusCode
     */
    public StatusCode getStatusCode() {
        return (StatusCode) (isText ? textFields.computeIfAbsent("status_code",
                StatusCode::new) : getBinaryColumn("status_code"));
    }

    /**
     * The release status authorized by the depositor.
     * @return AuthorReleaseStatusCode
     */
    public AuthorReleaseStatusCode getAuthorReleaseStatusCode() {
        return (AuthorReleaseStatusCode) (isText ? textFields.computeIfAbsent("author_release_status_code",
                AuthorReleaseStatusCode::new) : getBinaryColumn("author_release_status_code"));
    }

    /**
     * Code for status of structure factor file.
     * @return StatusCodeSf
     */
    public StatusCodeSf getStatusCodeSf() {
        return (StatusCodeSf) (isText ? textFields.computeIfAbsent("status_code_sf",
                StatusCodeSf::new) : getBinaryColumn("status_code_sf"));
    }

    /**
     * Code for status of NMR constraints file.
     * @return StatusCodeMr
     */
    public StatusCodeMr getStatusCodeMr() {
        return (StatusCodeMr) (isText ? textFields.computeIfAbsent("status_code_mr",
                StatusCodeMr::new) : getBinaryColumn("status_code_mr"));
    }

    /**
     * 
     * The deposited coordinates for this deposition will be released according
     * the value of this item.
     * @return DepReleaseCodeCoordinates
     */
    public DepReleaseCodeCoordinates getDepReleaseCodeCoordinates() {
        return (DepReleaseCodeCoordinates) (isText ? textFields.computeIfAbsent("dep_release_code_coordinates",
                DepReleaseCodeCoordinates::new) : getBinaryColumn("dep_release_code_coordinates"));
    }

    /**
     * 
     * The sequence information for this deposition will be released according
     * the value of this item.  Setting this status code to "RELEASE NOW" indicates
     * that the macromolecular sequence(s) for this entry may be displayed in PDB
     * status reports prior to the release of the entry.   Setting this status
     * code to "HOLD FOR RELEASE" conceals the sequence information in PDB status
     * reports until the coordinate data for this entry are released.
     * @return DepReleaseCodeSequence
     */
    public DepReleaseCodeSequence getDepReleaseCodeSequence() {
        return (DepReleaseCodeSequence) (isText ? textFields.computeIfAbsent("dep_release_code_sequence",
                DepReleaseCodeSequence::new) : getBinaryColumn("dep_release_code_sequence"));
    }

    /**
     * 
     * The deposited structure factors for this deposition will be released according
     * the value of this item.
     * @return DepReleaseCodeStructFact
     */
    public DepReleaseCodeStructFact getDepReleaseCodeStructFact() {
        return (DepReleaseCodeStructFact) (isText ? textFields.computeIfAbsent("dep_release_code_struct_fact",
                DepReleaseCodeStructFact::new) : getBinaryColumn("dep_release_code_struct_fact"));
    }

    /**
     * 
     * The deposited NMR constrait data for this deposition will be released according
     * the value of this item.
     * @return DepReleaseCodeNmrConstraints
     */
    public DepReleaseCodeNmrConstraints getDepReleaseCodeNmrConstraints() {
        return (DepReleaseCodeNmrConstraints) (isText ? textFields.computeIfAbsent("dep_release_code_nmr_constraints",
                DepReleaseCodeNmrConstraints::new) : getBinaryColumn("dep_release_code_nmr_constraints"));
    }

    /**
     * The value of _pdbx_database_status.entry_id identifies the data block.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * This code indicates whether the deposition form for an entry
     * has been received.
     * @return RecvdDepositForm
     */
    public RecvdDepositForm getRecvdDepositForm() {
        return (RecvdDepositForm) (isText ? textFields.computeIfAbsent("recvd_deposit_form",
                RecvdDepositForm::new) : getBinaryColumn("recvd_deposit_form"));
    }

    /**
     * The date the deposition form is received.
     * @return DateDepositionForm
     */
    public DateDepositionForm getDateDepositionForm() {
        return (DateDepositionForm) (isText ? textFields.computeIfAbsent("date_deposition_form",
                DateDepositionForm::new) : getBinaryColumn("date_deposition_form"));
    }

    /**
     * The starting date for the deposition session.
     * @return DateBeginDeposition
     */
    public DateBeginDeposition getDateBeginDeposition() {
        return (DateBeginDeposition) (isText ? textFields.computeIfAbsent("date_begin_deposition",
                DateBeginDeposition::new) : getBinaryColumn("date_begin_deposition"));
    }

    /**
     * The starting date for data processing.
     * @return DateBeginProcessing
     */
    public DateBeginProcessing getDateBeginProcessing() {
        return (DateBeginProcessing) (isText ? textFields.computeIfAbsent("date_begin_processing",
                DateBeginProcessing::new) : getBinaryColumn("date_begin_processing"));
    }

    /**
     * The completion date for data processing.
     * @return DateEndProcessing
     */
    public DateEndProcessing getDateEndProcessing() {
        return (DateEndProcessing) (isText ? textFields.computeIfAbsent("date_end_processing",
                DateEndProcessing::new) : getBinaryColumn("date_end_processing"));
    }

    /**
     * The date on which release processing began.
     * @return DateBeginReleasePreparation
     */
    public DateBeginReleasePreparation getDateBeginReleasePreparation() {
        return (DateBeginReleasePreparation) (isText ? textFields.computeIfAbsent("date_begin_release_preparation",
                DateBeginReleasePreparation::new) : getBinaryColumn("date_begin_release_preparation"));
    }

    /**
     * The date on which the author requests entry release.
     * @return DateAuthorReleaseRequest
     */
    public DateAuthorReleaseRequest getDateAuthorReleaseRequest() {
        return (DateAuthorReleaseRequest) (isText ? textFields.computeIfAbsent("date_author_release_request",
                DateAuthorReleaseRequest::new) : getBinaryColumn("date_author_release_request"));
    }

    /**
     * This code indicates whether the coordinates for an entry
     * have been received.
     * @return RecvdCoordinates
     */
    public RecvdCoordinates getRecvdCoordinates() {
        return (RecvdCoordinates) (isText ? textFields.computeIfAbsent("recvd_coordinates",
                RecvdCoordinates::new) : getBinaryColumn("recvd_coordinates"));
    }

    /**
     * The date the coordinates are received.
     * @return DateCoordinates
     */
    public DateCoordinates getDateCoordinates() {
        return (DateCoordinates) (isText ? textFields.computeIfAbsent("date_coordinates",
                DateCoordinates::new) : getBinaryColumn("date_coordinates"));
    }

    /**
     * This code indicates whether the structure factors for an entry
     * have been received.
     * @return RecvdStructFact
     */
    public RecvdStructFact getRecvdStructFact() {
        return (RecvdStructFact) (isText ? textFields.computeIfAbsent("recvd_struct_fact",
                RecvdStructFact::new) : getBinaryColumn("recvd_struct_fact"));
    }

    /**
     * The date the structure factors are received.
     * @return DateStructFact
     */
    public DateStructFact getDateStructFact() {
        return (DateStructFact) (isText ? textFields.computeIfAbsent("date_struct_fact",
                DateStructFact::new) : getBinaryColumn("date_struct_fact"));
    }

    /**
     * This code indicates whether the NMR contraint data for an entry
     * have been received.
     * @return RecvdNmrConstraints
     */
    public RecvdNmrConstraints getRecvdNmrConstraints() {
        return (RecvdNmrConstraints) (isText ? textFields.computeIfAbsent("recvd_nmr_constraints",
                RecvdNmrConstraints::new) : getBinaryColumn("recvd_nmr_constraints"));
    }

    /**
     * The date the structure factors are received.
     * @return DateNmrConstraints
     */
    public DateNmrConstraints getDateNmrConstraints() {
        return (DateNmrConstraints) (isText ? textFields.computeIfAbsent("date_nmr_constraints",
                DateNmrConstraints::new) : getBinaryColumn("date_nmr_constraints"));
    }

    /**
     * This code indicates whether the internal approval for an entry
     * have been received.
     * @return RecvdInternalApproval
     */
    public RecvdInternalApproval getRecvdInternalApproval() {
        return (RecvdInternalApproval) (isText ? textFields.computeIfAbsent("recvd_internal_approval",
                RecvdInternalApproval::new) : getBinaryColumn("recvd_internal_approval"));
    }

    /**
     * This code indicates whether the manuscript for an entry
     * has been received.
     * @return RecvdManuscript
     */
    public RecvdManuscript getRecvdManuscript() {
        return (RecvdManuscript) (isText ? textFields.computeIfAbsent("recvd_manuscript",
                RecvdManuscript::new) : getBinaryColumn("recvd_manuscript"));
    }

    /**
     * The date the manuscript is received.
     * @return DateManuscript
     */
    public DateManuscript getDateManuscript() {
        return (DateManuscript) (isText ? textFields.computeIfAbsent("date_manuscript",
                DateManuscript::new) : getBinaryColumn("date_manuscript"));
    }

    /**
     * The last name of the depositor to be used in correspondance.
     * @return NameDepositor
     */
    public NameDepositor getNameDepositor() {
        return (NameDepositor) (isText ? textFields.computeIfAbsent("name_depositor",
                NameDepositor::new) : getBinaryColumn("name_depositor"));
    }

    /**
     * This code indicates whether the author's approval for
     * an entry has been received.
     * @return RecvdAuthorApproval
     */
    public RecvdAuthorApproval getRecvdAuthorApproval() {
        return (RecvdAuthorApproval) (isText ? textFields.computeIfAbsent("recvd_author_approval",
                RecvdAuthorApproval::new) : getBinaryColumn("recvd_author_approval"));
    }

    /**
     * This code indicates whether the author's approval for
     * an entry was received explicitly or implicitly.  The
     * latter is automatically implied by failure to respond
     * to the validation summary within the prescribed period.
     * @return AuthorApprovalType
     */
    public AuthorApprovalType getAuthorApprovalType() {
        return (AuthorApprovalType) (isText ? textFields.computeIfAbsent("author_approval_type",
                AuthorApprovalType::new) : getBinaryColumn("author_approval_type"));
    }

    /**
     * The date the author's approval is received.
     * @return DateAuthorApproval
     */
    public DateAuthorApproval getDateAuthorApproval() {
        return (DateAuthorApproval) (isText ? textFields.computeIfAbsent("date_author_approval",
                DateAuthorApproval::new) : getBinaryColumn("date_author_approval"));
    }

    /**
     * The date of initial deposition.  (The first message for
     * deposition has been received.)
     * @return RecvdInitialDepositionDate
     */
    public RecvdInitialDepositionDate getRecvdInitialDepositionDate() {
        return (RecvdInitialDepositionDate) (isText ? textFields.computeIfAbsent("recvd_initial_deposition_date",
                RecvdInitialDepositionDate::new) : getBinaryColumn("recvd_initial_deposition_date"));
    }

    /**
     * The date of complete deposition.  This corresponds to the date
     * at which the PDB identifier is assigned.
     * @return DateSubmitted
     */
    public DateSubmitted getDateSubmitted() {
        return (DateSubmitted) (isText ? textFields.computeIfAbsent("date_submitted",
                DateSubmitted::new) : getBinaryColumn("date_submitted"));
    }

    /**
     * The initials of the annotator processing this entry.
     * @return RcsbAnnotator
     */
    public RcsbAnnotator getRcsbAnnotator() {
        return (RcsbAnnotator) (isText ? textFields.computeIfAbsent("rcsb_annotator",
                RcsbAnnotator::new) : getBinaryColumn("rcsb_annotator"));
    }

    /**
     * The date of PDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return DateOfSfRelease
     */
    public DateOfSfRelease getDateOfSfRelease() {
        return (DateOfSfRelease) (isText ? textFields.computeIfAbsent("date_of_sf_release",
                DateOfSfRelease::new) : getBinaryColumn("date_of_sf_release"));
    }

    /**
     * The date of PDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return DateOfMrRelease
     */
    public DateOfMrRelease getDateOfMrRelease() {
        return (DateOfMrRelease) (isText ? textFields.computeIfAbsent("date_of_mr_release",
                DateOfMrRelease::new) : getBinaryColumn("date_of_mr_release"));
    }

    /**
     * PDB release date.  This is the date that appears in the PDB
     * REVDAT record.
     * @return DateOfPDBRelease
     */
    public DateOfPDBRelease getDateOfPDBRelease() {
        return (DateOfPDBRelease) (isText ? textFields.computeIfAbsent("date_of_PDB_release",
                DateOfPDBRelease::new) : getBinaryColumn("date_of_PDB_release"));
    }

    /**
     * At an author's request, a coordinate entry may be held after
     * processing for some period of time.
     * @return DateHoldCoordinates
     */
    public DateHoldCoordinates getDateHoldCoordinates() {
        return (DateHoldCoordinates) (isText ? textFields.computeIfAbsent("date_hold_coordinates",
                DateHoldCoordinates::new) : getBinaryColumn("date_hold_coordinates"));
    }

    /**
     * At an author's request, the structure factors may be held after
     * processing for some period of time.
     * @return DateHoldStructFact
     */
    public DateHoldStructFact getDateHoldStructFact() {
        return (DateHoldStructFact) (isText ? textFields.computeIfAbsent("date_hold_struct_fact",
                DateHoldStructFact::new) : getBinaryColumn("date_hold_struct_fact"));
    }

    /**
     * At an author's request, the NMR constraint data may be held after
     * processing for some period of time.
     * @return DateHoldNmrConstraints
     */
    public DateHoldNmrConstraints getDateHoldNmrConstraints() {
        return (DateHoldNmrConstraints) (isText ? textFields.computeIfAbsent("date_hold_nmr_constraints",
                DateHoldNmrConstraints::new) : getBinaryColumn("date_hold_nmr_constraints"));
    }

    /**
     * At an author's request, an entry is to be held until
     * publication.
     * @return HoldForPublication
     */
    public HoldForPublication getHoldForPublication() {
        return (HoldForPublication) (isText ? textFields.computeIfAbsent("hold_for_publication",
                HoldForPublication::new) : getBinaryColumn("hold_for_publication"));
    }

    /**
     * This code indicates whether the entry belongs to
     * Structural Genomics Project.
     * @return SGEntry
     */
    public SGEntry getSGEntry() {
        return (SGEntry) (isText ? textFields.computeIfAbsent("SG_entry",
                SGEntry::new) : getBinaryColumn("SG_entry"));
    }

    /**
     * This is the date when PDB received the author's approval for an
     * entry which has been processed by NDB.  (This is a place holder
     * for entries processed before Jan. 1, 1996.)
     * @return PdbDateOfAuthorApproval
     */
    public PdbDateOfAuthorApproval getPdbDateOfAuthorApproval() {
        return (PdbDateOfAuthorApproval) (isText ? textFields.computeIfAbsent("pdb_date_of_author_approval",
                PdbDateOfAuthorApproval::new) : getBinaryColumn("pdb_date_of_author_approval"));
    }

    /**
     * The site where the file was deposited.
     * @return DepositSite
     */
    public DepositSite getDepositSite() {
        return (DepositSite) (isText ? textFields.computeIfAbsent("deposit_site",
                DepositSite::new) : getBinaryColumn("deposit_site"));
    }

    /**
     * The site where the file was deposited.
     * @return ProcessSite
     */
    public ProcessSite getProcessSite() {
        return (ProcessSite) (isText ? textFields.computeIfAbsent("process_site",
                ProcessSite::new) : getBinaryColumn("process_site"));
    }

    /**
     * 
     * The deposited chemical shift data for this deposition will be released according
     * the value of this item.
     * @return DepReleaseCodeChemicalShifts
     */
    public DepReleaseCodeChemicalShifts getDepReleaseCodeChemicalShifts() {
        return (DepReleaseCodeChemicalShifts) (isText ? textFields.computeIfAbsent("dep_release_code_chemical_shifts",
                DepReleaseCodeChemicalShifts::new) : getBinaryColumn("dep_release_code_chemical_shifts"));
    }

    /**
     * This code indicates whether the chemical shift data for an entry
     * have been received.
     * @return RecvdChemicalShifts
     */
    public RecvdChemicalShifts getRecvdChemicalShifts() {
        return (RecvdChemicalShifts) (isText ? textFields.computeIfAbsent("recvd_chemical_shifts",
                RecvdChemicalShifts::new) : getBinaryColumn("recvd_chemical_shifts"));
    }

    /**
     * The date the chemical shift data are received.
     * @return DateChemicalShifts
     */
    public DateChemicalShifts getDateChemicalShifts() {
        return (DateChemicalShifts) (isText ? textFields.computeIfAbsent("date_chemical_shifts",
                DateChemicalShifts::new) : getBinaryColumn("date_chemical_shifts"));
    }

    /**
     * At an author's request, the chemical shift data may be held after
     * processing for some period of time.
     * @return DateHoldChemicalShifts
     */
    public DateHoldChemicalShifts getDateHoldChemicalShifts() {
        return (DateHoldChemicalShifts) (isText ? textFields.computeIfAbsent("date_hold_chemical_shifts",
                DateHoldChemicalShifts::new) : getBinaryColumn("date_hold_chemical_shifts"));
    }

    /**
     * Code for status of chemical shift data file.
     * @return StatusCodeCs
     */
    public StatusCodeCs getStatusCodeCs() {
        return (StatusCodeCs) (isText ? textFields.computeIfAbsent("status_code_cs",
                StatusCodeCs::new) : getBinaryColumn("status_code_cs"));
    }

    /**
     * The date of PDB release.  This corresponds to the date
     * at which the chemical shift data is placed into the public archive.
     * @return DateOfCsRelease
     */
    public DateOfCsRelease getDateOfCsRelease() {
        return (DateOfCsRelease) (isText ? textFields.computeIfAbsent("date_of_cs_release",
                DateOfCsRelease::new) : getBinaryColumn("date_of_cs_release"));
    }

    /**
     * The methods development category in which this
     * entry has been placed.
     * @return MethodsDevelopmentCategory
     */
    public MethodsDevelopmentCategory getMethodsDevelopmentCategory() {
        return (MethodsDevelopmentCategory) (isText ? textFields.computeIfAbsent("methods_development_category",
                MethodsDevelopmentCategory::new) : getBinaryColumn("methods_development_category"));
    }

    /**
     * A flag indicating that the entry is compatible with the PDB format.
     * 
     * A value of 'N' indicates that the no PDB format data file is
     * corresponding to this entry is available in the PDB archive.
     * @return PdbFormatCompatible
     */
    public PdbFormatCompatible getPdbFormatCompatible() {
        return (PdbFormatCompatible) (isText ? textFields.computeIfAbsent("pdb_format_compatible",
                PdbFormatCompatible::new) : getBinaryColumn("pdb_format_compatible"));
    }

    /**
     * The release date requested by the depositor.
     * 
     * This is used when the depositor has provided
     * the release hold date expiration or a one year
     * hold interval.
     * @return AuthReqRelDate
     */
    public AuthReqRelDate getAuthReqRelDate() {
        return (AuthReqRelDate) (isText ? textFields.computeIfAbsent("auth_req_rel_date",
                AuthReqRelDate::new) : getBinaryColumn("auth_req_rel_date"));
    }

    /**
     * Temporary NDB ID.
     * @return NdbTid
     */
    public NdbTid getNdbTid() {
        return (NdbTid) (isText ? textFields.computeIfAbsent("ndb_tid",
                NdbTid::new) : getBinaryColumn("ndb_tid"));
    }

    /**
     * Give information about status of coordinates of an entry in NDB.
     * @return StatusCoordinatesInNDB
     */
    public StatusCoordinatesInNDB getStatusCoordinatesInNDB() {
        return (StatusCoordinatesInNDB) (isText ? textFields.computeIfAbsent("status_coordinates_in_NDB",
                StatusCoordinatesInNDB::new) : getBinaryColumn("status_coordinates_in_NDB"));
    }

    /**
     * The date of a revision.  This corresponds to the date
     * at which the entry was updated and a revision entry created.
     * @return DateRevised
     */
    public DateRevised getDateRevised() {
        return (DateRevised) (isText ? textFields.computeIfAbsent("date_revised",
                DateRevised::new) : getBinaryColumn("date_revised"));
    }

    /**
     * The NDB ID that this entry replaced.
     * @return ReplacedEntryId
     */
    public ReplacedEntryId getReplacedEntryId() {
        return (ReplacedEntryId) (isText ? textFields.computeIfAbsent("replaced_entry_id",
                ReplacedEntryId::new) : getBinaryColumn("replaced_entry_id"));
    }

    /**
     * The NDB ID for entry that replaces this entry.
     * @return RevisionId
     */
    public RevisionId getRevisionId() {
        return (RevisionId) (isText ? textFields.computeIfAbsent("revision_id",
                RevisionId::new) : getBinaryColumn("revision_id"));
    }

    /**
     * A description of the revision to this entry.
     * @return RevisionDescription
     */
    public RevisionDescription getRevisionDescription() {
        return (RevisionDescription) (isText ? textFields.computeIfAbsent("revision_description",
                RevisionDescription::new) : getBinaryColumn("revision_description"));
    }

    /**
     * The initials of the annotator processing this entry.
     * @return PdbxAnnotator
     */
    public PdbxAnnotator getPdbxAnnotator() {
        return (PdbxAnnotator) (isText ? textFields.computeIfAbsent("pdbx_annotator",
                PdbxAnnotator::new) : getBinaryColumn("pdbx_annotator"));
    }

    /**
     * The date of NDB/RCSB release.  This corresponds to the date
     * at which the entry is placed into the public archive.
     * @return DateOfNDBRelease
     */
    public DateOfNDBRelease getDateOfNDBRelease() {
        return (DateOfNDBRelease) (isText ? textFields.computeIfAbsent("date_of_NDB_release",
                DateOfNDBRelease::new) : getBinaryColumn("date_of_NDB_release"));
    }

    /**
     * The date on which the entry is sent to PDB.
     * @return DateReleasedToPDB
     */
    public DateReleasedToPDB getDateReleasedToPDB() {
        return (DateReleasedToPDB) (isText ? textFields.computeIfAbsent("date_released_to_PDB",
                DateReleasedToPDB::new) : getBinaryColumn("date_released_to_PDB"));
    }

    /**
     * This code indicates whether to skip production of
     * PDB REMARK 500 for this file.
     * @return SkipPDBREMARK500
     */
    public SkipPDBREMARK500 getSkipPDBREMARK500() {
        return (SkipPDBREMARK500) (isText ? textFields.computeIfAbsent("skip_PDB_REMARK_500",
                SkipPDBREMARK500::new) : getBinaryColumn("skip_PDB_REMARK_500"));
    }

    /**
     * This code indicates whether to skip production of
     * a PDB REMARK for this file.
     * @return SkipPDBREMARK
     */
    public SkipPDBREMARK getSkipPDBREMARK() {
        return (SkipPDBREMARK) (isText ? textFields.computeIfAbsent("skip_PDB_REMARK",
                SkipPDBREMARK::new) : getBinaryColumn("skip_PDB_REMARK"));
    }

    /**
     * This code indicates whether to suppress the entry title.
     * @return TitleSuppression
     */
    public TitleSuppression getTitleSuppression() {
        return (TitleSuppression) (isText ? textFields.computeIfAbsent("title_suppression",
                TitleSuppression::new) : getBinaryColumn("title_suppression"));
    }
}
