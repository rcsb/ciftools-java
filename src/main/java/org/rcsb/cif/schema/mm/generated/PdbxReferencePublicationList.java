package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_PUBLICATION_LIST hold reference information
 * related to PDB citation data.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxReferencePublicationList extends BaseCategory {
    public PdbxReferencePublicationList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferencePublicationList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferencePublicationList(String name) {
        super(name);
    }

    /**
     * Abbreviated name of the reference publication.
     * @return StrColumn
     */
    public StrColumn getPublicationAbbrev() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("publication_abbrev", StrColumn::new) :
                getBinaryColumn("publication_abbrev"));
    }

    /**
     * The American Society for Testing and Materials (ASTM) code
     * type.
     * @return StrColumn
     */
    public StrColumn getASTMCodeType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ASTM_code_type", StrColumn::new) :
                getBinaryColumn("ASTM_code_type"));
    }

    /**
     * The American Society for Testing and Materials (ASTM) code
     * assignment.
     * @return StrColumn
     */
    public StrColumn getASTMCodeValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ASTM_code_value", StrColumn::new) :
                getBinaryColumn("ASTM_code_value"));
    }

    /**
     * The International Standard Serial Number (ISSN/ISBN/ESSN) code type.
     * @return StrColumn
     */
    public StrColumn getISSNCodeType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ISSN_code_type", StrColumn::new) :
                getBinaryColumn("ISSN_code_type"));
    }

    /**
     * The International Standard Serial Number (ISSN) code value.
     * @return StrColumn
     */
    public StrColumn getISSNCodeValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ISSN_code_value", StrColumn::new) :
                getBinaryColumn("ISSN_code_value"));
    }

    /**
     * The country of publication.
     * @return StrColumn
     */
    public StrColumn getCountry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("country", StrColumn::new) :
                getBinaryColumn("country"));
    }

    /**
     * Year in which publications began operation..
     * @return StrColumn
     */
    public StrColumn getStartYear() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("start_year", StrColumn::new) :
                getBinaryColumn("start_year"));
    }

    /**
     * Year in which publication terminated operation.
     * @return StrColumn
     */
    public StrColumn getEndYear() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_year", StrColumn::new) :
                getBinaryColumn("end_year"));
    }
}
