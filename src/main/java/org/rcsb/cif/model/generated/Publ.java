package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PUBL category are used when submitting a
 * manuscript for publication.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The name and address of the author submitting the manuscript and
     * data block. This is the person contacted by the journal
     * editorial staff. It is preferable to use the separate data items
     * _publ.contact_author_name and _publ.contact_author_address.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getContactAuthor() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("contact_author", SingleRowStrColumn::new) :
                getBinaryColumn("contact_author"));
    }

    /**
     * The address of the author submitting the manuscript and data
     * block. This is the person contacted by the journal editorial
     * staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getContactAuthorAddress() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("contact_author_address", SingleRowStrColumn::new) :
                getBinaryColumn("contact_author_address"));
    }

    /**
     * E-mail address in a form recognizable to international networks.
     * The format of e-mail addresses is given in Section 3.4, Address
     * Specification, of Internet Message Format, RFC 2822, P. Resnick
     * (Editor), Network Standards Group, April 2001.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getContactAuthorEmail() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("contact_author_email", SingleRowStrColumn::new) :
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getContactAuthorFax() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("contact_author_fax", SingleRowStrColumn::new) :
                getBinaryColumn("contact_author_fax"));
    }

    /**
     * The name of the author submitting the manuscript and data
     * block. This is the person contacted by the journal editorial
     * staff.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getContactAuthorName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("contact_author_name", SingleRowStrColumn::new) :
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getContactAuthorPhone() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("contact_author_phone", SingleRowStrColumn::new) :
                getBinaryColumn("contact_author_phone"));
    }

    /**
     * A letter submitted to the journal editor by the contact author.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getContactLetter() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("contact_letter", SingleRowStrColumn::new) :
                getBinaryColumn("contact_letter"));
    }

    /**
     * A description of the word-processor package and computer used to
     * create the word-processed manuscript stored as
     * _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getManuscriptCreation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("manuscript_creation", SingleRowStrColumn::new) :
                getBinaryColumn("manuscript_creation"));
    }

    /**
     * The full manuscript of a paper (excluding possibly the figures
     * and the tables) output in ASCII characters from a word processor.
     * Information about the generation of this data item must be
     * specified in the data item _publ.manuscript_creation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getManuscriptProcessed() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("manuscript_processed", SingleRowStrColumn::new) :
                getBinaryColumn("manuscript_processed"));
    }

    /**
     * The full manuscript of a paper (excluding figures and possibly
     * the tables) output as standard ASCII text.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getManuscriptText() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("manuscript_text", SingleRowStrColumn::new) :
                getBinaryColumn("manuscript_text"));
    }

    /**
     * The category of paper submitted. For submission to
     * Acta Crystallographica Section C or
     * Acta Crystallographica Section E, ONLY the codes indicated
     * for use with these journals should be used.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRequestedCategory() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("requested_category", SingleRowStrColumn::new) :
                getBinaryColumn("requested_category"));
    }

    /**
     * The name of the co-editor whom the authors would like to
     * handle the submitted manuscript.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRequestedCoeditorName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("requested_coeditor_name", SingleRowStrColumn::new) :
                getBinaryColumn("requested_coeditor_name"));
    }

    /**
     * The name of the journal to which the manuscript is being
     * submitted.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRequestedJournal() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("requested_journal", SingleRowStrColumn::new) :
                getBinaryColumn("requested_journal"));
    }

    /**
     * The abstract section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionAbstract() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_abstract", SingleRowStrColumn::new) :
                getBinaryColumn("section_abstract"));
    }

    /**
     * The acknowledgements section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionAcknowledgements() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_acknowledgements", SingleRowStrColumn::new) :
                getBinaryColumn("section_acknowledgements"));
    }

    /**
     * The comment section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionComment() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_comment", SingleRowStrColumn::new) :
                getBinaryColumn("section_comment"));
    }

    /**
     * The discussion section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionDiscussion() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_discussion", SingleRowStrColumn::new) :
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionExperimental() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_experimental", SingleRowStrColumn::new) :
                getBinaryColumn("section_experimental"));
    }

    /**
     * The experimental preparation section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionExptlPrep() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_exptl_prep", SingleRowStrColumn::new) :
                getBinaryColumn("section_exptl_prep"));
    }

    /**
     * The experimental refinement section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionExptlRefinement() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_exptl_refinement", SingleRowStrColumn::new) :
                getBinaryColumn("section_exptl_refinement"));
    }

    /**
     * The experimental solution section of a manuscript if the
     * manuscript is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionExptlSolution() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_exptl_solution", SingleRowStrColumn::new) :
                getBinaryColumn("section_exptl_solution"));
    }

    /**
     * The figure captions section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionFigureCaptions() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_figure_captions", SingleRowStrColumn::new) :
                getBinaryColumn("section_figure_captions"));
    }

    /**
     * The introduction section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionIntroduction() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_introduction", SingleRowStrColumn::new) :
                getBinaryColumn("section_introduction"));
    }

    /**
     * The references section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionReferences() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_references", SingleRowStrColumn::new) :
                getBinaryColumn("section_references"));
    }

    /**
     * The synopsis section of a manuscript if the manuscript is
     * submitted in parts. As an alternative see _publ.manuscript_text
     * and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionSynopsis() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_synopsis", SingleRowStrColumn::new) :
                getBinaryColumn("section_synopsis"));
    }

    /**
     * The table legends section of a manuscript if the manuscript
     * is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionTableLegends() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_table_legends", SingleRowStrColumn::new) :
                getBinaryColumn("section_table_legends"));
    }

    /**
     * The title of a manuscript if the manuscript is submitted in
     * parts. As an alternative see _publ.manuscript_text and
     * _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionTitle() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_title", SingleRowStrColumn::new) :
                getBinaryColumn("section_title"));
    }

    /**
     * The footnote to the title of a manuscript if the manuscript
     * is submitted in parts. As an alternative see
     * _publ.manuscript_text and _publ.manuscript_processed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSectionTitleFootnote() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("section_title_footnote", SingleRowStrColumn::new) :
                getBinaryColumn("section_title_footnote"));
    }
}
