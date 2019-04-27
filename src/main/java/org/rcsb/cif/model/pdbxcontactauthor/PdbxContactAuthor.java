package org.rcsb.cif.model.pdbxcontactauthor;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 1 of 3.
     * @return Address1
     */
    public Address1 getAddress1() {
        return (Address1) (isText ? textFields.computeIfAbsent("address_1",
                Address1::new) : getBinaryColumn("address_1"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 2 of 3.
     * @return Address2
     */
    public Address2 getAddress2() {
        return (Address2) (isText ? textFields.computeIfAbsent("address_2",
                Address2::new) : getBinaryColumn("address_2"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 3 of 3.
     * @return Address3
     */
    public Address3 getAddress3() {
        return (Address3) (isText ? textFields.computeIfAbsent("address_3",
                Address3::new) : getBinaryColumn("address_3"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed transfered from
     * _audit_contact_author.address
     * @return LegacyAddress
     */
    public LegacyAddress getLegacyAddress() {
        return (LegacyAddress) (isText ? textFields.computeIfAbsent("legacy_address",
                LegacyAddress::new) : getBinaryColumn("legacy_address"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, city.
     * @return City
     */
    public City getCity() {
        return (City) (isText ? textFields.computeIfAbsent("city",
                City::new) : getBinaryColumn("city"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, state or province.
     * @return StateProvince
     */
    public StateProvince getStateProvince() {
        return (StateProvince) (isText ? textFields.computeIfAbsent("state_province",
                StateProvince::new) : getBinaryColumn("state_province"));
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, zip code.
     * @return PostalCode
     */
    public PostalCode getPostalCode() {
        return (PostalCode) (isText ? textFields.computeIfAbsent("postal_code",
                PostalCode::new) : getBinaryColumn("postal_code"));
    }

    /**
     * The electronic mail address of the author of the data block to
     * whom correspondence should be addressed, in a form recognisable
     * to international networks.
     * @return Email
     */
    public Email getEmail() {
        return (Email) (isText ? textFields.computeIfAbsent("email",
                Email::new) : getBinaryColumn("email"));
    }

    /**
     * The facsimile telephone number of the author of the data
     * block to whom correspondence should be addressed.
     * 
     * The recommended style includes the international dialing
     * prefix, the area code in parentheses, followed by the
     * local number with no spaces.
     * @return Fax
     */
    public Fax getFax() {
        return (Fax) (isText ? textFields.computeIfAbsent("fax",
                Fax::new) : getBinaryColumn("fax"));
    }

    /**
     * The first name of the author of the data block to whom correspondence
     * should be addressed.
     * @return NameFirst
     */
    public NameFirst getNameFirst() {
        return (NameFirst) (isText ? textFields.computeIfAbsent("name_first",
                NameFirst::new) : getBinaryColumn("name_first"));
    }

    /**
     * The last name of the author of the data block to whom correspondence
     * should be addressed.
     * @return NameLast
     */
    public NameLast getNameLast() {
        return (NameLast) (isText ? textFields.computeIfAbsent("name_last",
                NameLast::new) : getBinaryColumn("name_last"));
    }

    /**
     * The middle initial(s) of the author of the data block to whom correspondence
     * should be addressed.
     * @return NameMi
     */
    public NameMi getNameMi() {
        return (NameMi) (isText ? textFields.computeIfAbsent("name_mi",
                NameMi::new) : getBinaryColumn("name_mi"));
    }

    /**
     * The salutation of the author of the data block to whom correspondence
     * should be addressed.
     * @return NameSalutation
     */
    public NameSalutation getNameSalutation() {
        return (NameSalutation) (isText ? textFields.computeIfAbsent("name_salutation",
                NameSalutation::new) : getBinaryColumn("name_salutation"));
    }

    /**
     * The country of the author of the data block to whom
     * correspondence should be addressed.
     * @return Country
     */
    public Country getCountry() {
        return (Country) (isText ? textFields.computeIfAbsent("country",
                Country::new) : getBinaryColumn("country"));
    }

    /**
     * The continent of the author of the data block to whom
     * correspondence should be addressed.
     * @return Continent
     */
    public Continent getContinent() {
        return (Continent) (isText ? textFields.computeIfAbsent("continent",
                Continent::new) : getBinaryColumn("continent"));
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
     * @return Phone
     */
    public Phone getPhone() {
        return (Phone) (isText ? textFields.computeIfAbsent("phone",
                Phone::new) : getBinaryColumn("phone"));
    }

    /**
     * The role of this author in the project depositing this data.
     * @return Role
     */
    public Role getRole() {
        return (Role) (isText ? textFields.computeIfAbsent("role",
                Role::new) : getBinaryColumn("role"));
    }

    /**
     * The organization type to which this author is affiliated.
     * @return OrganizationType
     */
    public OrganizationType getOrganizationType() {
        return (OrganizationType) (isText ? textFields.computeIfAbsent("organization_type",
                OrganizationType::new) : getBinaryColumn("organization_type"));
    }

    /**
     * The Open Researcher and Contributor ID (ORCID).
     * @return IdentifierORCID
     */
    public IdentifierORCID getIdentifierORCID() {
        return (IdentifierORCID) (isText ? textFields.computeIfAbsent("identifier_ORCID",
                IdentifierORCID::new) : getBinaryColumn("identifier_ORCID"));
    }
}
