package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PUBL category are used when submitting a
 * manuscript for publication.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The name and address of the author submitting the manuscript and
     * data block. This is the person contacted by the journal
     * editorial staff. It is preferable to use the separate data items
     * _publ.contact_author_name and _publ.contact_author_address.
     * @return StrColumn
     */
    public StrColumn getContactAuthor() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("contact_author", StrColumn::new) :
                getBinaryColumn("contact_author"));
    }

    /**
     * The address of the author submitting the manuscript and data
     * block. This is the person contacted by the journal editorial
     * staff.
     * @return StrColumn
     */
    public StrColumn getContactAuthorAddress() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("contact_author_address", StrColumn::new) :
                getBinaryColumn("contact_author_address"));
    }

    /**
     * E-mail address in a form recognizable to international networks.
     * The format of e-mail addresses is given in Section 3.4, Address
     * Specification, of Internet Message Format, RFC 2822, P. Resnick
     * (Editor), Network Standards Group, April 2001.
     * @return StrColumn
     */
    public StrColumn getContactAuthorEmail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("contact_author_email", StrColumn::new) :
                getBinaryColumn("contact_author_email"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("contact_author_fax", StrColumn::new) :
                getBinaryColumn("contact_author_fax"));
    }

    /**
     * The name of the author submitting the manuscript and data
     * block. This is the person contacted by the journal editorial
     * staff.
     * @return StrColumn
     */
    public StrColumn getContactAuthorName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("contact_author_name", StrColumn::new) :
                getBinaryColumn("contact_author_name"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("contact_author_phone", StrColumn::new) :
                getBinaryColumn("contact_author_phone"));
    }

    /**
     * A letter submitted to the journal editor by the contact author.
     * @return StrColumn
     */
    public StrColumn getContactLetter() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("contact_letter", StrColumn::new) :
                getBinaryColumn("contact_letter"));
    }

    /**
     * A description of the word-processor package and computer used to
     * create the word-processed manuscript stored as
     * _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getManuscriptCreation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("manuscript_creation", StrColumn::new) :
                getBinaryColumn("manuscript_creation"));
    }

    /**
     * The full manuscript of a paper (excluding possibly the figures
     * and the tables) output in ASCII characters from a word processor.
     * Information about the generation of this data item must be
     * specified in the data item _publ.manuscript_creation.
     * @return StrColumn
     */
    public StrColumn getManuscriptProcessed() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("manuscript_processed", StrColumn::new) :
                getBinaryColumn("manuscript_processed"));
    }

    /**
     * The full manuscript of a paper (excluding figures and possibly
     * the tables) output as standard ASCII text.
     * @return StrColumn
     */
    public StrColumn getManuscriptText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("manuscript_text", StrColumn::new) :
                getBinaryColumn("manuscript_text"));
    }

    /**
     * The category of paper submitted. For submission to
     * Acta Crystallographica Section C or
     * Acta Crystallographica Section E, ONLY the codes indicated
     * for use with these journals should be used.
     * @return StrColumn
     */
    public StrColumn getRequestedCategory() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("requested_category", StrColumn::new) :
                getBinaryColumn("requested_category"));
    }

    /**
     * The name of the co-editor whom the authors would like to
     * handle the submitted manuscript.
     * @return StrColumn
     */
    public StrColumn getRequestedCoeditorName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("requested_coeditor_name", StrColumn::new) :
                getBinaryColumn("requested_coeditor_name"));
    }

    /**
     * The name of the journal to which the manuscript is being
     * submitted.
     * @return StrColumn
     */
    public StrColumn getRequestedJournal() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("requested_journal", StrColumn::new) :
                getBinaryColumn("requested_journal"));
    }

    /**
     * The abstract section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionAbstract() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_abstract", StrColumn::new) :
                getBinaryColumn("section_abstract"));
    }

    /**
     * The acknowledgements section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionAcknowledgements() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_acknowledgements", StrColumn::new) :
                getBinaryColumn("section_acknowledgements"));
    }

    /**
     * The comment section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionComment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_comment", StrColumn::new) :
                getBinaryColumn("section_comment"));
    }

    /**
     * The discussion section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionDiscussion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_discussion", StrColumn::new) :
                getBinaryColumn("section_discussion"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_experimental", StrColumn::new) :
                getBinaryColumn("section_experimental"));
    }

    /**
     * The experimental preparation section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionExptlPrep() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_exptl_prep", StrColumn::new) :
                getBinaryColumn("section_exptl_prep"));
    }

    /**
     * The experimental refinement section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionExptlRefinement() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_exptl_refinement", StrColumn::new) :
                getBinaryColumn("section_exptl_refinement"));
    }

    /**
     * The experimental solution section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionExptlSolution() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_exptl_solution", StrColumn::new) :
                getBinaryColumn("section_exptl_solution"));
    }

    /**
     * The figure captions section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionFigureCaptions() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_figure_captions", StrColumn::new) :
                getBinaryColumn("section_figure_captions"));
    }

    /**
     * The introduction section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionIntroduction() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_introduction", StrColumn::new) :
                getBinaryColumn("section_introduction"));
    }

    /**
     * The references section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionReferences() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_references", StrColumn::new) :
                getBinaryColumn("section_references"));
    }

    /**
     * The synopsis section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionSynopsis() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_synopsis", StrColumn::new) :
                getBinaryColumn("section_synopsis"));
    }

    /**
     * The table legends section of a manuscript if the manuscript
     * is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionTableLegends() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_table_legends", StrColumn::new) :
                getBinaryColumn("section_table_legends"));
    }

    /**
     * The title of a manuscript if the manuscript is submitted in
     * parts. As an alternative see _publ.manuscript_text and
     * _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionTitle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_title", StrColumn::new) :
                getBinaryColumn("section_title"));
    }

    /**
     * The footnote to the title of a manuscript if the manuscript
     * is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return StrColumn
     */
    public StrColumn getSectionTitleFootnote() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("section_title_footnote", StrColumn::new) :
                getBinaryColumn("section_title_footnote"));
    }
}
