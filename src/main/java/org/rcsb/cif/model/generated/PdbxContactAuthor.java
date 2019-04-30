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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 1 of 3.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAddress1() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("address_1", SingleRowStrColumn::new) :
                getBinaryColumn("address_1"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 2 of 3.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAddress2() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("address_2", SingleRowStrColumn::new) :
                getBinaryColumn("address_2"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 3 of 3.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAddress3() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("address_3", SingleRowStrColumn::new) :
                getBinaryColumn("address_3"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed transfered from
     * _audit_contact_author.address
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLegacyAddress() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("legacy_address", SingleRowStrColumn::new) :
                getBinaryColumn("legacy_address"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, city.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCity() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("city", SingleRowStrColumn::new) :
                getBinaryColumn("city"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, state or province.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStateProvince() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("state_province", SingleRowStrColumn::new) :
                getBinaryColumn("state_province"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, zip code.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPostalCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("postal_code", SingleRowStrColumn::new) :
                getBinaryColumn("postal_code"));
    }

    /**
     * The electronic mail address of the author of the data block to
     * whom correspondence should be addressed, in a form recognisable
     * to international networks.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEmail() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("email", SingleRowStrColumn::new) :
                getBinaryColumn("email"));
    }

    /**
     * The facsimile telephone number of the author of the data
     * block to whom correspondence should be addressed.
     * 
     * The recommended style includes the international dialing
     * prefix, the area code in parentheses, followed by the
     * local number with no spaces.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFax() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("fax", SingleRowStrColumn::new) :
                getBinaryColumn("fax"));
    }

    /**
     * The first name of the author of the data block to whom correspondence
     * should be addressed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameFirst() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_first", SingleRowStrColumn::new) :
                getBinaryColumn("name_first"));
    }

    /**
     * The last name of the author of the data block to whom correspondence
     * should be addressed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameLast() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_last", SingleRowStrColumn::new) :
                getBinaryColumn("name_last"));
    }

    /**
     * The middle initial(s) of the author of the data block to whom correspondence
     * should be addressed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameMi() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_mi", SingleRowStrColumn::new) :
                getBinaryColumn("name_mi"));
    }

    /**
     * The salutation of the author of the data block to whom correspondence
     * should be addressed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameSalutation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_salutation", SingleRowStrColumn::new) :
                getBinaryColumn("name_salutation"));
    }

    /**
     * The country of the author of the data block to whom
     * correspondence should be addressed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCountry() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("country", SingleRowStrColumn::new) :
                getBinaryColumn("country"));
    }

    /**
     * The continent of the author of the data block to whom
     * correspondence should be addressed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getContinent() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("continent", SingleRowStrColumn::new) :
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPhone() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("phone", SingleRowStrColumn::new) :
                getBinaryColumn("phone"));
    }

    /**
     * The role of this author in the project depositing this data.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRole() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("role", SingleRowStrColumn::new) :
                getBinaryColumn("role"));
    }

    /**
     * The organization type to which this author is affiliated.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getOrganizationType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("organization_type", SingleRowStrColumn::new) :
                getBinaryColumn("organization_type"));
    }

    /**
     * The Open Researcher and Contributor ID (ORCID).
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getIdentifierORCID() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("identifier_ORCID", SingleRowStrColumn::new) :
                getBinaryColumn("identifier_ORCID"));
    }
}
