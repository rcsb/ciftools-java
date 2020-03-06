package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CONTACT_AUTHOR category record details
 * about the name and address of the author to be contacted
 * concerning the contents of this data block.  This category atomizes
 * information to a greater degree than the standard AUDIT_CONTACT_AUTHOR
 * category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxContactAuthor extends DelegatingCategory {
    public PdbxContactAuthor(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "address_1":
                return getAddress1();
            case "address_2":
                return getAddress2();
            case "address_3":
                return getAddress3();
            case "legacy_address":
                return getLegacyAddress();
            case "city":
                return getCity();
            case "state_province":
                return getStateProvince();
            case "postal_code":
                return getPostalCode();
            case "email":
                return getEmail();
            case "fax":
                return getFax();
            case "name_first":
                return getNameFirst();
            case "name_last":
                return getNameLast();
            case "name_mi":
                return getNameMi();
            case "name_salutation":
                return getNameSalutation();
            case "country":
                return getCountry();
            case "continent":
                return getContinent();
            case "phone":
                return getPhone();
            case "role":
                return getRole();
            case "organization_type":
                return getOrganizationType();
            case "identifier_ORCID":
                return getIdentifierORCID();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique integer identifier for this author
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 1 of 3.
     * @return StrColumn
     */
    public StrColumn getAddress1() {
        return delegate.getColumn("address_1", DelegatingStrColumn::new);
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 2 of 3.
     * @return StrColumn
     */
    public StrColumn getAddress2() {
        return delegate.getColumn("address_2", DelegatingStrColumn::new);
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, line 3 of 3.
     * @return StrColumn
     */
    public StrColumn getAddress3() {
        return delegate.getColumn("address_3", DelegatingStrColumn::new);
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed transfered from
     * _audit_contact_author.address
     * @return StrColumn
     */
    public StrColumn getLegacyAddress() {
        return delegate.getColumn("legacy_address", DelegatingStrColumn::new);
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, city.
     * @return StrColumn
     */
    public StrColumn getCity() {
        return delegate.getColumn("city", DelegatingStrColumn::new);
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, state or province.
     * @return StrColumn
     */
    public StrColumn getStateProvince() {
        return delegate.getColumn("state_province", DelegatingStrColumn::new);
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed, zip code.
     * @return StrColumn
     */
    public StrColumn getPostalCode() {
        return delegate.getColumn("postal_code", DelegatingStrColumn::new);
    }

    /**
     * The electronic mail address of the author of the data block to
     * whom correspondence should be addressed, in a form recognisable
     * to international networks.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return delegate.getColumn("email", DelegatingStrColumn::new);
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
        return delegate.getColumn("fax", DelegatingStrColumn::new);
    }

    /**
     * The first name of the author of the data block to whom correspondence
     * should be addressed.
     * @return StrColumn
     */
    public StrColumn getNameFirst() {
        return delegate.getColumn("name_first", DelegatingStrColumn::new);
    }

    /**
     * The last name of the author of the data block to whom correspondence
     * should be addressed.
     * @return StrColumn
     */
    public StrColumn getNameLast() {
        return delegate.getColumn("name_last", DelegatingStrColumn::new);
    }

    /**
     * The middle initial(s) of the author of the data block to whom correspondence
     * should be addressed.
     * @return StrColumn
     */
    public StrColumn getNameMi() {
        return delegate.getColumn("name_mi", DelegatingStrColumn::new);
    }

    /**
     * The salutation of the author of the data block to whom correspondence
     * should be addressed.
     * @return StrColumn
     */
    public StrColumn getNameSalutation() {
        return delegate.getColumn("name_salutation", DelegatingStrColumn::new);
    }

    /**
     * The country/region of the author of the data block to whom
     * correspondence should be addressed.
     * @return StrColumn
     */
    public StrColumn getCountry() {
        return delegate.getColumn("country", DelegatingStrColumn::new);
    }

    /**
     * The continent of the author of the data block to whom
     * correspondence should be addressed.
     * @return StrColumn
     */
    public StrColumn getContinent() {
        return delegate.getColumn("continent", DelegatingStrColumn::new);
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
        return delegate.getColumn("phone", DelegatingStrColumn::new);
    }

    /**
     * The role of this author in the project depositing this data.
     * @return StrColumn
     */
    public StrColumn getRole() {
        return delegate.getColumn("role", DelegatingStrColumn::new);
    }

    /**
     * The organization type to which this author is affiliated.
     * @return StrColumn
     */
    public StrColumn getOrganizationType() {
        return delegate.getColumn("organization_type", DelegatingStrColumn::new);
    }

    /**
     * The Open Researcher and Contributor ID (ORCID).
     * @return StrColumn
     */
    public StrColumn getIdentifierORCID() {
        return delegate.getColumn("identifier_ORCID", DelegatingStrColumn::new);
    }

}