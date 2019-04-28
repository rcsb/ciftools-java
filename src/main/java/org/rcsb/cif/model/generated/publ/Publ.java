package org.rcsb.cif.model.generated.publ;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Publ extends BaseCategory {
    public Publ(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Publ(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Publ(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The name and address of the author submitting the manuscript and
     * data block. This is the person contacted by the journal
     * editorial staff. It is preferable to use the separate data items
     * _publ.contact_author_name and _publ.contact_author_address.
     * @return ContactAuthor
     */
    public ContactAuthor getContactAuthor() {
        return (ContactAuthor) (isText ? textFields.computeIfAbsent("contact_author",
                ContactAuthor::new) : getBinaryColumn("contact_author"));
    }

    /**
     * The address of the author submitting the manuscript and data
     * block. This is the person contacted by the journal editorial
     * staff.
     * @return ContactAuthorAddress
     */
    public ContactAuthorAddress getContactAuthorAddress() {
        return (ContactAuthorAddress) (isText ? textFields.computeIfAbsent("contact_author_address",
                ContactAuthorAddress::new) : getBinaryColumn("contact_author_address"));
    }

    /**
     * E-mail address in a form recognizable to international networks.
     * The format of e-mail addresses is given in Section 3.4, Address
     * Specification, of Internet Message Format, RFC 2822, P. Resnick
     * (Editor), Network Standards Group, April 2001.
     * @return ContactAuthorEmail
     */
    public ContactAuthorEmail getContactAuthorEmail() {
        return (ContactAuthorEmail) (isText ? textFields.computeIfAbsent("contact_author_email",
                ContactAuthorEmail::new) : getBinaryColumn("contact_author_email"));
    }

    /**
     * Facsimile telephone number of the author submitting the
     * manuscript and data block.
     * 
     * The recommended style starts with the international dialing
     * prefix, followed by the area code in parentheses, followed by the
     * local number with no spaces. The earlier convention of including
     * the international dialing prefix in parentheses is no longer
     * recommended.
     * @return ContactAuthorFax
     */
    public ContactAuthorFax getContactAuthorFax() {
        return (ContactAuthorFax) (isText ? textFields.computeIfAbsent("contact_author_fax",
                ContactAuthorFax::new) : getBinaryColumn("contact_author_fax"));
    }

    /**
     * The name of the author submitting the manuscript and data
     * block. This is the person contacted by the journal editorial
     * staff.
     * @return ContactAuthorName
     */
    public ContactAuthorName getContactAuthorName() {
        return (ContactAuthorName) (isText ? textFields.computeIfAbsent("contact_author_name",
                ContactAuthorName::new) : getBinaryColumn("contact_author_name"));
    }

    /**
     * Telephone number of the author submitting the manuscript and
     * data block.
     * 
     * The recommended style starts with the international dialing
     * prefix, followed by the area code in parentheses, followed by the
     * local number and any extension number prefixed by 'x',
     * with no spaces. The earlier convention of including
     * the international dialing prefix in parentheses is no longer
     * recommended.
     * @return ContactAuthorPhone
     */
    public ContactAuthorPhone getContactAuthorPhone() {
        return (ContactAuthorPhone) (isText ? textFields.computeIfAbsent("contact_author_phone",
                ContactAuthorPhone::new) : getBinaryColumn("contact_author_phone"));
    }

    /**
     * A letter submitted to the journal editor by the contact author.
     * @return ContactLetter
     */
    public ContactLetter getContactLetter() {
        return (ContactLetter) (isText ? textFields.computeIfAbsent("contact_letter",
                ContactLetter::new) : getBinaryColumn("contact_letter"));
    }

    /**
     * A description of the word-processor package and computer used to
     * create the word-processed manuscript stored as
     * _publ.manuscript_processed.
     * @return ManuscriptCreation
     */
    public ManuscriptCreation getManuscriptCreation() {
        return (ManuscriptCreation) (isText ? textFields.computeIfAbsent("manuscript_creation",
                ManuscriptCreation::new) : getBinaryColumn("manuscript_creation"));
    }

    /**
     * The full manuscript of a paper (excluding possibly the figures
     * and the tables) output in ASCII characters from a word processor.
     * Information about the generation of this data item must be
     * specified in the data item _publ.manuscript_creation.
     * @return ManuscriptProcessed
     */
    public ManuscriptProcessed getManuscriptProcessed() {
        return (ManuscriptProcessed) (isText ? textFields.computeIfAbsent("manuscript_processed",
                ManuscriptProcessed::new) : getBinaryColumn("manuscript_processed"));
    }

    /**
     * The full manuscript of a paper (excluding figures and possibly
     * the tables) output as standard ASCII text.
     * @return ManuscriptText
     */
    public ManuscriptText getManuscriptText() {
        return (ManuscriptText) (isText ? textFields.computeIfAbsent("manuscript_text",
                ManuscriptText::new) : getBinaryColumn("manuscript_text"));
    }

    /**
     * The category of paper submitted. For submission to
     * Acta Crystallographica Section C or
     * Acta Crystallographica Section E, ONLY the codes indicated
     * for use with these journals should be used.
     * @return RequestedCategory
     */
    public RequestedCategory getRequestedCategory() {
        return (RequestedCategory) (isText ? textFields.computeIfAbsent("requested_category",
                RequestedCategory::new) : getBinaryColumn("requested_category"));
    }

    /**
     * The name of the co-editor whom the authors would like to
     * handle the submitted manuscript.
     * @return RequestedCoeditorName
     */
    public RequestedCoeditorName getRequestedCoeditorName() {
        return (RequestedCoeditorName) (isText ? textFields.computeIfAbsent("requested_coeditor_name",
                RequestedCoeditorName::new) : getBinaryColumn("requested_coeditor_name"));
    }

    /**
     * The name of the journal to which the manuscript is being
     * submitted.
     * @return RequestedJournal
     */
    public RequestedJournal getRequestedJournal() {
        return (RequestedJournal) (isText ? textFields.computeIfAbsent("requested_journal",
                RequestedJournal::new) : getBinaryColumn("requested_journal"));
    }

    /**
     * The abstract section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SectionAbstract
     */
    public SectionAbstract getSectionAbstract() {
        return (SectionAbstract) (isText ? textFields.computeIfAbsent("section_abstract",
                SectionAbstract::new) : getBinaryColumn("section_abstract"));
    }

    /**
     * The acknowledgements section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SectionAcknowledgements
     */
    public SectionAcknowledgements getSectionAcknowledgements() {
        return (SectionAcknowledgements) (isText ? textFields.computeIfAbsent("section_acknowledgements",
                SectionAcknowledgements::new) : getBinaryColumn("section_acknowledgements"));
    }

    /**
     * The comment section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SectionComment
     */
    public SectionComment getSectionComment() {
        return (SectionComment) (isText ? textFields.computeIfAbsent("section_comment",
                SectionComment::new) : getBinaryColumn("section_comment"));
    }

    /**
     * The discussion section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SectionDiscussion
     */
    public SectionDiscussion getSectionDiscussion() {
        return (SectionDiscussion) (isText ? textFields.computeIfAbsent("section_discussion",
                SectionDiscussion::new) : getBinaryColumn("section_discussion"));
    }

    /**
     * The experimental section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * The _publ.section_exptl_prep, _publ.section_exptl_solution and
     * _publ.section_exptl_refinement items are preferred for
     * separating the chemical preparation, structure solution and
     * refinement aspects of the description of the experiment.
     * @return SectionExperimental
     */
    public SectionExperimental getSectionExperimental() {
        return (SectionExperimental) (isText ? textFields.computeIfAbsent("section_experimental",
                SectionExperimental::new) : getBinaryColumn("section_experimental"));
    }

    /**
     * The experimental preparation section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return SectionExptlPrep
     */
    public SectionExptlPrep getSectionExptlPrep() {
        return (SectionExptlPrep) (isText ? textFields.computeIfAbsent("section_exptl_prep",
                SectionExptlPrep::new) : getBinaryColumn("section_exptl_prep"));
    }

    /**
     * The experimental refinement section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return SectionExptlRefinement
     */
    public SectionExptlRefinement getSectionExptlRefinement() {
        return (SectionExptlRefinement) (isText ? textFields.computeIfAbsent("section_exptl_refinement",
                SectionExptlRefinement::new) : getBinaryColumn("section_exptl_refinement"));
    }

    /**
     * The experimental solution section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return SectionExptlSolution
     */
    public SectionExptlSolution getSectionExptlSolution() {
        return (SectionExptlSolution) (isText ? textFields.computeIfAbsent("section_exptl_solution",
                SectionExptlSolution::new) : getBinaryColumn("section_exptl_solution"));
    }

    /**
     * The figure captions section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SectionFigureCaptions
     */
    public SectionFigureCaptions getSectionFigureCaptions() {
        return (SectionFigureCaptions) (isText ? textFields.computeIfAbsent("section_figure_captions",
                SectionFigureCaptions::new) : getBinaryColumn("section_figure_captions"));
    }

    /**
     * The introduction section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SectionIntroduction
     */
    public SectionIntroduction getSectionIntroduction() {
        return (SectionIntroduction) (isText ? textFields.computeIfAbsent("section_introduction",
                SectionIntroduction::new) : getBinaryColumn("section_introduction"));
    }

    /**
     * The references section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SectionReferences
     */
    public SectionReferences getSectionReferences() {
        return (SectionReferences) (isText ? textFields.computeIfAbsent("section_references",
                SectionReferences::new) : getBinaryColumn("section_references"));
    }

    /**
     * The synopsis section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SectionSynopsis
     */
    public SectionSynopsis getSectionSynopsis() {
        return (SectionSynopsis) (isText ? textFields.computeIfAbsent("section_synopsis",
                SectionSynopsis::new) : getBinaryColumn("section_synopsis"));
    }

    /**
     * The table legends section of a manuscript if the manuscript
     * is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return SectionTableLegends
     */
    public SectionTableLegends getSectionTableLegends() {
        return (SectionTableLegends) (isText ? textFields.computeIfAbsent("section_table_legends",
                SectionTableLegends::new) : getBinaryColumn("section_table_legends"));
    }

    /**
     * The title of a manuscript if the manuscript is submitted in
     * parts. As an alternative see _publ.manuscript_text and
     * _publ.manuscript_processed.
     * @return SectionTitle
     */
    public SectionTitle getSectionTitle() {
        return (SectionTitle) (isText ? textFields.computeIfAbsent("section_title",
                SectionTitle::new) : getBinaryColumn("section_title"));
    }

    /**
     * The footnote to the title of a manuscript if the manuscript
     * is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return SectionTitleFootnote
     */
    public SectionTitleFootnote getSectionTitleFootnote() {
        return (SectionTitleFootnote) (isText ? textFields.computeIfAbsent("section_title_footnote",
                SectionTitleFootnote::new) : getBinaryColumn("section_title_footnote"));
    }
}
