package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CONTACT_AUTHOR category record details
 * about the name and address of the author to be contacted
 * concerning the contents of this data block.  This category atomizes
 * information to a greater degree than the standard AUDIT_CONTACT_AUTHOR
 * category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxContactAuthor extends BaseCategory {
    public PdbxContactAuthor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxContactAuthor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxContactAuthor(String name) {
        super(name);
    }

    /**
     * A unique integer identifier for this author
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 1 of 3.
     * @return StrColumn
     */
    public StrColumn getAddress1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("address_1", StrColumn::new) :
                getBinaryColumn("address_1"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 2 of 3.
     * @return StrColumn
     */
    public StrColumn getAddress2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("address_2", StrColumn::new) :
                getBinaryColumn("address_2"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 3 of 3.
     * @return StrColumn
     */
    public StrColumn getAddress3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("address_3", StrColumn::new) :
                getBinaryColumn("address_3"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed transfered from
     * _audit_contact_author.address
     * @return StrColumn
     */
    public StrColumn getLegacyAddress() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("legacy_address", StrColumn::new) :
                getBinaryColumn("legacy_address"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, city.
     * @return StrColumn
     */
    public StrColumn getCity() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("city", StrColumn::new) :
                getBinaryColumn("city"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, state or province.
     * @return StrColumn
     */
    public StrColumn getStateProvince() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("state_province", StrColumn::new) :
                getBinaryColumn("state_province"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, zip code.
     * @return StrColumn
     */
    public StrColumn getPostalCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("postal_code", StrColumn::new) :
                getBinaryColumn("postal_code"));
    }

    /**
     * The electronic mail address of the author of the data block to
     * whom correspondence should be addressed, in a form recognisable
     * to international networks.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("email", StrColumn::new) :
                getBinaryColumn("email"));
    }

    /**
     * The facsimile telephone number of the author of the data
     * block to whom correspondence should be addressed.
     * 
     * The recommended style includes the international dialing
     * prefix, the area code in parentheses, followed by the
     * local number with no spaces.
     * @return StrColumn
     */
    public StrColumn getFax() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("fax", StrColumn::new) :
                getBinaryColumn("fax"));
    }

    /**
     * The first name of the author of the data block to whom correspondence
     * should be addressed.
     * @return StrColumn
     */
    public StrColumn getNameFirst() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_first", StrColumn::new) :
                getBinaryColumn("name_first"));
    }

    /**
     * The last name of the author of the data block to whom correspondence
     * should be addressed.
     * @return StrColumn
     */
    public StrColumn getNameLast() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_last", StrColumn::new) :
                getBinaryColumn("name_last"));
    }

    /**
     * The middle initial(s) of the author of the data block to whom correspondence
     * should be addressed.
     * @return StrColumn
     */
    public StrColumn getNameMi() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_mi", StrColumn::new) :
                getBinaryColumn("name_mi"));
    }

    /**
     * The salutation of the author of the data block to whom correspondence
     * should be addressed.
     * @return StrColumn
     */
    public StrColumn getNameSalutation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_salutation", StrColumn::new) :
                getBinaryColumn("name_salutation"));
    }

    /**
     * The country of the author of the data block to whom
     * correspondence should be addressed.
     * @return StrColumn
     */
    public StrColumn getCountry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("country", StrColumn::new) :
                getBinaryColumn("country"));
    }

    /**
     * The continent of the author of the data block to whom
     * correspondence should be addressed.
     * @return StrColumn
     */
    public StrColumn getContinent() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("continent", StrColumn::new) :
                getBinaryColumn("continent"));
    }

    /**
     * The telephone number of the author of the data block to whom
     * correspondence should be addressed.
     * 
     * The recommended style includes the international dialing
     * prefix, the area code in parentheses, followed by the
     * local number and any extension number prefixed by 'x',
     * with no spaces. The earlier convention of including
     * the international dialing prefixes in parentheses is no longer
     * recommended.
     * @return StrColumn
     */
    public StrColumn getPhone() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("phone", StrColumn::new) :
                getBinaryColumn("phone"));
    }

    /**
     * The role of this author in the project depositing this data.
     * @return StrColumn
     */
    public StrColumn getRole() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("role", StrColumn::new) :
                getBinaryColumn("role"));
    }

    /**
     * The organization type to which this author is affiliated.
     * @return StrColumn
     */
    public StrColumn getOrganizationType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("organization_type", StrColumn::new) :
                getBinaryColumn("organization_type"));
    }

    /**
     * The Open Researcher and Contributor ID (ORCID).
     * @return StrColumn
     */
    public StrColumn getIdentifierORCID() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("identifier_ORCID", StrColumn::new) :
                getBinaryColumn("identifier_ORCID"));
    }
}
