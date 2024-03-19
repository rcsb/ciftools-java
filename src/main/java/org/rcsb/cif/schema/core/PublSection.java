package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Manuscript section data if submitted in parts. See also
 * _publ_manuscript.text and _publ_manuscript.processed.
 * The _publ_section.exptl_prep, _publ_section.exptl_refinement
 * and _publ_section.exptl_solution items are preferred for
 * separating the chemical preparation, refinement and structure
 * solution aspects of the experimental description.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PublSection extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "publ_section";

    public PublSection(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The abstract of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getAbstract() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_abstract"));
    }

    /**
     * The acknowledgements section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getAcknowledgements() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_acknowledgements"));
    }

    /**
     * The comment section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getComment() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_comment"));
    }

    /**
     * The discussion section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getDiscussion() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_discussion"));
    }

    /**
     * The experimental section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getExperimental() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_experimental"));
    }

    /**
     * The experimental preparation section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getExptlPrep() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_exptl_prep"));
    }

    /**
     * The experimental refinement section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getExptlRefinement() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_exptl_refinement"));
    }

    /**
     * The experimental solution section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getExptlSolution() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_exptl_solution"));
    }

    /**
     * The figure captions of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getFigureCaptions() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_figure_captions"));
    }

    /**
     * The introduction section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getIntroduction() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_introduction"));
    }

    /**
     * The keywords of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getKeywords() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_keywords"));
    }

    /**
     * The references section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getReferences() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_references"));
    }

    /**
     * The related literature section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getRelatedLiterature() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_related_literature"));
    }

    /**
     * The synopsis of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSynopsis() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_synopsis"));
    }

    /**
     * The table legends of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getTableLegends() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_table_legends"));
    }

    /**
     * The full title of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getTitle() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_title"));
    }

    /**
     * Footnote (if any) to the title of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getTitleFootnote() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_section_title_footnote"));
    }

}