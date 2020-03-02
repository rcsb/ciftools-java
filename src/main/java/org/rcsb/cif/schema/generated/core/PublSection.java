package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Manuscript section data if submitted in parts. see also
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
     * 
     * The abstract of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getAbstract() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_abstract"));
    }

    /**
     * 
     * The acknowledgements section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getAcknowledgements() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_acknowledgements"));
    }

    /**
     * 
     * The comment section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getComment() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_comment"));
    }

    /**
     * 
     * The discussion section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getDiscussion() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_discussion"));
    }

    /**
     * 
     * The experimental section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getExperimental() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_experimental"));
    }

    /**
     * 
     * The experimental preparation section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getExptlPrep() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_exptl_prep"));
    }

    /**
     * 
     * The experimental refinement section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getExptlRefinement() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_exptl_refinement"));
    }

    /**
     * 
     * The experimental solution section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getExptlSolution() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_exptl_solution"));
    }

    /**
     * 
     * The figure captions of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getFigureCaptions() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_figure_captions"));
    }

    /**
     * 
     * The introduction section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getIntroduction() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_introduction"));
    }

    /**
     * 
     * The keywords of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getKeywords() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_keywords"));
    }

    /**
     * 
     * The references section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getReferences() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_references"));
    }

    /**
     * 
     * The related literature section of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getRelatedLiterature() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_related_literature"));
    }

    /**
     * 
     * The synopsis of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getSynopsis() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_synopsis"));
    }

    /**
     * 
     * The table legends of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getTableLegends() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_table_legends"));
    }

    /**
     * 
     * The full title of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getTitle() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_title"));
    }

    /**
     * 
     * Footnote (if any) to the title of the submitted paper.
     * @return StrColumn
     */
    public StrColumn getTitleFootnote() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_title_footnote"));
    }
}
