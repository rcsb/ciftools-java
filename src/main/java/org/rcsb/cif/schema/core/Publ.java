package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Data items in the PUBL category are used when submitting a
 * manuscript for publication. They refer either to the paper as
 * a whole, or to specific named elements within a paper (such as
 * the title and abstract, or the Comment and Experimental
 * sections of Acta Crystallographica Section C). The data items
 * in the PUBL_BODY category should be used for the textual
 * content of other submissions. Typically, each journal will
 * supply a list of the specific items it requires in its Notes
 * for Authors.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Publ extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "publ";

    public Publ(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * A letter submitted to the journal editor by the contact author.
     * @return StrColumn
     */
    public StrColumn getContactLetter() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_letter"));
    }

    /**
     * The introduction section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionIntroduction() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_introduction"));
    }

    /**
     * The address of the author submitting the manuscript and
     * data block. This is the person contacted by the journal
     * editorial staff.
     * @return StrColumn
     */
    public StrColumn getContactAuthorAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_address"));
    }

    /**
     * E-mail address in a form recognizable to international networks.
     * The format of e-mail addresses is given in Section 3.4, Address
     * Specification, of Internet Message Format, RFC 2822, P. Resnick
     * (Editor), Network Standards Group, April 2001.
     * @return StrColumn
     */
    public StrColumn getContactAuthorEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_email"));
    }

    /**
     * The keywords of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionKeywords() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_keywords"));
    }

    /**
     * The related literature section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionRelatedLiterature() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_related_literature"));
    }

    /**
     * The full manuscript of a paper (excluding figures and possibly
     * the tables) output as standard ASCII text.
     * @return StrColumn
     */
    public StrColumn getManuscriptText() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_text"));
    }

    /**
     * The full title of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionTitle() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_title"));
    }

    /**
     * The full manuscript of a paper (excluding possibly the figures
     * and the tables) output in ASCII characters from a word processor.
     * Information about the generation of this data item must be
     * specified in the data item _publ_manuscript.creation.
     * @return StrColumn
     */
    public StrColumn getManuscriptProcessed() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_processed"));
    }

    /**
     * The experimental preparation section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionExptlPrep() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_exptl_prep"));
    }

    /**
     * The experimental refinement section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionExptlRefinement() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_exptl_refinement"));
    }

    /**
     * The discussion section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionDiscussion() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_discussion"));
    }

    /**
     * The table legends of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionTableLegends() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_table_legends"));
    }

    /**
     * The comment section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionComment() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_comment"));
    }

    /**
     * The synopsis of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionSynopsis() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_synopsis"));
    }

    /**
     * The name of the author(s) submitting the manuscript and
     * data block. This is the person contacted by the journal
     * editorial staff.
     * @return StrColumn
     */
    public StrColumn getContactAuthorName() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_name"));
    }

    /**
     * Name of the journal to which the manuscript is being submitted.
     * @return StrColumn
     */
    public StrColumn getRequestedJournal() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_requested_journal"));
    }

    /**
     * Footnote (if any) to the title of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionTitleFootnote() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_title_footnote"));
    }

    /**
     * Facsimile telephone number of the author submitting the manuscript
     * and data block.
     * The recommended style is the international dialing prefix, followed
     * by the area code in parentheses, followed by the local number with
     * no spaces. The earlier convention of including the international
     * dialing prefix in parentheses is no longer recommended.
     * @return StrColumn
     */
    public StrColumn getContactAuthorFax() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_fax"));
    }

    /**
     * The name of the Co-editor whom the authors would like to
     * process the submitted manuscript.
     * @return StrColumn
     */
    public StrColumn getRequestedCoeditorName() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_requested_coeditor_name"));
    }

    /**
     * The experimental solution section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionExptlSolution() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_exptl_solution"));
    }

    /**
     * The references section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionReferences() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_references"));
    }

    /**
     * The experimental section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionExperimental() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_experimental"));
    }

    /**
     * Telephone number of author submitting the manuscript and data block.
     * The recommended style is the international dialing prefix,
     * followed by the area code in parentheses, followed by the
     * local number and any extension number prefixed by 'x', with
     * no spaces. The earlier convention of including the international
     * dialing prefix in parentheses is no longer recommended.
     * @return StrColumn
     */
    public StrColumn getContactAuthorPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_phone"));
    }

    /**
     * The acknowledgements section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionAcknowledgements() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_acknowledgements"));
    }

    /**
     * The abstract of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionAbstract() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_abstract"));
    }

    /**
     * The figure captions of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSectionFigureCaptions() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_figure_captions"));
    }

    /**
     * A description of the wordprocessor package and computer used to
     * create the manuscript stored as _publ_manuscript.processed.
     * @return StrColumn
     */
    public StrColumn getManuscriptCreation() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_creation"));
    }

    /**
     * The name of the author(s) submitting the manuscript and
     * data block. This is the person contacted by the journal
     * editorial staff.
     * @return StrColumn
     */
    public StrColumn getContactAuthor() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_name"));
    }

    /**
     * The category of paper submitted. For submission to Acta
     * Crystallographica Section C or Acta Crystallographica
     * Section E, ONLY those codes indicated for use with those
     * journals should be used.
     * @return StrColumn
     */
    public StrColumn getRequestedCategory() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_requested_category"));
    }
}
