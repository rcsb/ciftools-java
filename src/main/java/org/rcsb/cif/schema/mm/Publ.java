package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PUBL category are used when submitting a
 * manuscript for publication.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Publ extends DelegatingCategory {
    public Publ(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "contact_author":
                return getContactAuthor();
            case "contact_author_address":
                return getContactAuthorAddress();
            case "contact_author_email":
                return getContactAuthorEmail();
            case "contact_author_fax":
                return getContactAuthorFax();
            case "contact_author_name":
                return getContactAuthorName();
            case "contact_author_phone":
                return getContactAuthorPhone();
            case "contact_letter":
                return getContactLetter();
            case "manuscript_creation":
                return getManuscriptCreation();
            case "manuscript_processed":
                return getManuscriptProcessed();
            case "manuscript_text":
                return getManuscriptText();
            case "requested_category":
                return getRequestedCategory();
            case "requested_coeditor_name":
                return getRequestedCoeditorName();
            case "requested_journal":
                return getRequestedJournal();
            case "section_abstract":
                return getSectionAbstract();
            case "section_acknowledgements":
                return getSectionAcknowledgements();
            case "section_comment":
                return getSectionComment();
            case "section_discussion":
                return getSectionDiscussion();
            case "section_experimental":
                return getSectionExperimental();
            case "section_exptl_prep":
                return getSectionExptlPrep();
            case "section_exptl_refinement":
                return getSectionExptlRefinement();
            case "section_exptl_solution":
                return getSectionExptlSolution();
            case "section_figure_captions":
                return getSectionFigureCaptions();
            case "section_introduction":
                return getSectionIntroduction();
            case "section_references":
                return getSectionReferences();
            case "section_synopsis":
                return getSectionSynopsis();
            case "section_table_legends":
                return getSectionTableLegends();
            case "section_title":
                return getSectionTitle();
            case "section_title_footnote":
                return getSectionTitleFootnote();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The name and address of the author submitting the manuscript and
     * data block. This is the person contacted by the journal
     * editorial staff. It is preferable to use the separate data items
     * _publ.contact_author_name and _publ.contact_author_address.
     * @return StrColumn
     */
    public StrColumn getContactAuthor() {
        return delegate.getColumn("contact_author", DelegatingStrColumn::new);
    }

    /**
     * The address of the author submitting the manuscript and data
     * block. This is the person contacted by the journal editorial
     * staff.
     * @return StrColumn
     */
    public StrColumn getContactAuthorAddress() {
        return delegate.getColumn("contact_author_address", DelegatingStrColumn::new);
    }

    /**
     * E-mail address in a form recognizable to international networks.
     * The format of e-mail addresses is given in Section 3.4, Address
     * Specification, of Internet Message Format, RFC 2822, P. Resnick
     * (Editor), Network Standards Group, April 2001.
     * @return StrColumn
     */
    public StrColumn getContactAuthorEmail() {
        return delegate.getColumn("contact_author_email", DelegatingStrColumn::new);
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
     * @return StrColumn
     */
    public StrColumn getContactAuthorFax() {
        return delegate.getColumn("contact_author_fax", DelegatingStrColumn::new);
    }

    /**
     * The name of the author submitting the manuscript and data
     * block. This is the person contacted by the journal editorial
     * staff.
     * @return StrColumn
     */
    public StrColumn getContactAuthorName() {
        return delegate.getColumn("contact_author_name", DelegatingStrColumn::new);
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
     * @return StrColumn
     */
    public StrColumn getContactAuthorPhone() {
        return delegate.getColumn("contact_author_phone", DelegatingStrColumn::new);
    }

    /**
     * A letter submitted to the journal editor by the contact author.
     * @return StrColumn
     */
    public StrColumn getContactLetter() {
        return delegate.getColumn("contact_letter", DelegatingStrColumn::new);
    }

    /**
     * A description of the word-processor package and computer used to
     * create the word-processed manuscript stored as
     * _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getManuscriptCreation() {
        return delegate.getColumn("manuscript_creation", DelegatingStrColumn::new);
    }

    /**
     * The full manuscript of a paper (excluding possibly the figures
     * and the tables) output in ASCII characters from a word processor.
     * Information about the generation of this data item must be
     * specified in the data item _publ.manuscript_creation.
     * @return StrColumn
     */
    public StrColumn getManuscriptProcessed() {
        return delegate.getColumn("manuscript_processed", DelegatingStrColumn::new);
    }

    /**
     * The full manuscript of a paper (excluding figures and possibly
     * the tables) output as standard ASCII text.
     * @return StrColumn
     */
    public StrColumn getManuscriptText() {
        return delegate.getColumn("manuscript_text", DelegatingStrColumn::new);
    }

    /**
     * The category of paper submitted. For submission to
     * Acta Crystallographica Section C or
     * Acta Crystallographica Section E, ONLY the codes indicated
     * for use with these journals should be used.
     * @return StrColumn
     */
    public StrColumn getRequestedCategory() {
        return delegate.getColumn("requested_category", DelegatingStrColumn::new);
    }

    /**
     * The name of the co-editor whom the authors would like to
     * handle the submitted manuscript.
     * @return StrColumn
     */
    public StrColumn getRequestedCoeditorName() {
        return delegate.getColumn("requested_coeditor_name", DelegatingStrColumn::new);
    }

    /**
     * The name of the journal to which the manuscript is being
     * submitted.
     * @return StrColumn
     */
    public StrColumn getRequestedJournal() {
        return delegate.getColumn("requested_journal", DelegatingStrColumn::new);
    }

    /**
     * The abstract section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionAbstract() {
        return delegate.getColumn("section_abstract", DelegatingStrColumn::new);
    }

    /**
     * The acknowledgements section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionAcknowledgements() {
        return delegate.getColumn("section_acknowledgements", DelegatingStrColumn::new);
    }

    /**
     * The comment section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionComment() {
        return delegate.getColumn("section_comment", DelegatingStrColumn::new);
    }

    /**
     * The discussion section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionDiscussion() {
        return delegate.getColumn("section_discussion", DelegatingStrColumn::new);
    }

    /**
     * The experimental section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * The _publ.section_exptl_prep, _publ.section_exptl_solution and
     * _publ.section_exptl_refinement items are preferred for
     * separating the chemical preparation, structure solution and
     * refinement aspects of the description of the experiment.
     * @return StrColumn
     */
    public StrColumn getSectionExperimental() {
        return delegate.getColumn("section_experimental", DelegatingStrColumn::new);
    }

    /**
     * The experimental preparation section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionExptlPrep() {
        return delegate.getColumn("section_exptl_prep", DelegatingStrColumn::new);
    }

    /**
     * The experimental refinement section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionExptlRefinement() {
        return delegate.getColumn("section_exptl_refinement", DelegatingStrColumn::new);
    }

    /**
     * The experimental solution section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionExptlSolution() {
        return delegate.getColumn("section_exptl_solution", DelegatingStrColumn::new);
    }

    /**
     * The figure captions section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionFigureCaptions() {
        return delegate.getColumn("section_figure_captions", DelegatingStrColumn::new);
    }

    /**
     * The introduction section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionIntroduction() {
        return delegate.getColumn("section_introduction", DelegatingStrColumn::new);
    }

    /**
     * The references section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionReferences() {
        return delegate.getColumn("section_references", DelegatingStrColumn::new);
    }

    /**
     * The synopsis section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionSynopsis() {
        return delegate.getColumn("section_synopsis", DelegatingStrColumn::new);
    }

    /**
     * The table legends section of a manuscript if the manuscript
     * is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionTableLegends() {
        return delegate.getColumn("section_table_legends", DelegatingStrColumn::new);
    }

    /**
     * The title of a manuscript if the manuscript is submitted in
     * parts. As an alternative see _publ.manuscript_text and
     * _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionTitle() {
        return delegate.getColumn("section_title", DelegatingStrColumn::new);
    }

    /**
     * The footnote to the title of a manuscript if the manuscript
     * is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionTitleFootnote() {
        return delegate.getColumn("section_title_footnote", DelegatingStrColumn::new);
    }

}