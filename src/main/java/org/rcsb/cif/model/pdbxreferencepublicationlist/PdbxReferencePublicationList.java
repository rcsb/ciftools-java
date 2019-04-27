package org.rcsb.cif.model.pdbxreferencepublicationlist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return PublicationAbbrev
     */
    public PublicationAbbrev getPublicationAbbrev() {
        return (PublicationAbbrev) (isText ? textFields.computeIfAbsent("publication_abbrev",
                PublicationAbbrev::new) : getBinaryColumn("publication_abbrev"));
    }

    /**
     * The American Society for Testing and Materials (ASTM) code
     * type.
     * @return ASTMCodeType
     */
    public ASTMCodeType getASTMCodeType() {
        return (ASTMCodeType) (isText ? textFields.computeIfAbsent("ASTM_code_type",
                ASTMCodeType::new) : getBinaryColumn("ASTM_code_type"));
    }

    /**
     * The American Society for Testing and Materials (ASTM) code
     * assignment.
     * @return ASTMCodeValue
     */
    public ASTMCodeValue getASTMCodeValue() {
        return (ASTMCodeValue) (isText ? textFields.computeIfAbsent("ASTM_code_value",
                ASTMCodeValue::new) : getBinaryColumn("ASTM_code_value"));
    }

    /**
     * The International Standard Serial Number (ISSN/ISBN/ESSN) code type.
     * @return ISSNCodeType
     */
    public ISSNCodeType getISSNCodeType() {
        return (ISSNCodeType) (isText ? textFields.computeIfAbsent("ISSN_code_type",
                ISSNCodeType::new) : getBinaryColumn("ISSN_code_type"));
    }

    /**
     * The International Standard Serial Number (ISSN) code value.
     * @return ISSNCodeValue
     */
    public ISSNCodeValue getISSNCodeValue() {
        return (ISSNCodeValue) (isText ? textFields.computeIfAbsent("ISSN_code_value",
                ISSNCodeValue::new) : getBinaryColumn("ISSN_code_value"));
    }

    /**
     * The country of publication.
     * @return Country
     */
    public Country getCountry() {
        return (Country) (isText ? textFields.computeIfAbsent("country",
                Country::new) : getBinaryColumn("country"));
    }

    /**
     * Year in which publications began operation..
     * @return StartYear
     */
    public StartYear getStartYear() {
        return (StartYear) (isText ? textFields.computeIfAbsent("start_year",
                StartYear::new) : getBinaryColumn("start_year"));
    }

    /**
     * Year in which publication terminated operation.
     * @return EndYear
     */
    public EndYear getEndYear() {
        return (EndYear) (isText ? textFields.computeIfAbsent("end_year",
                EndYear::new) : getBinaryColumn("end_year"));
    }
}
