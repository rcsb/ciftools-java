package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the SOFTWARE category record details about
 * the software used in the structure analysis, which implies
 * any software used in the generation of any data items
 * associated with the structure determination and
 * structure representation.
 * 
 * These data items allow computer programs to be referenced
 * in more detail than data items in the COMPUTING category do.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Software extends DelegatingCategory {
    public Software(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "citation_id":
                return getCitationId();
            case "classification":
                return getClassification();
            case "compiler_name":
                return getCompilerName();
            case "compiler_version":
                return getCompilerVersion();
            case "contact_author":
                return getContactAuthor();
            case "contact_author_email":
                return getContactAuthorEmail();
            case "date":
                return getDate();
            case "description":
                return getDescription();
            case "dependencies":
                return getDependencies();
            case "hardware":
                return getHardware();
            case "language":
                return getLanguage();
            case "location":
                return getLocation();
            case "mods":
                return getMods();
            case "name":
                return getName();
            case "os":
                return getOs();
            case "os_version":
                return getOsVersion();
            case "type":
                return getType();
            case "version":
                return getVersion();
            case "pdbx_ordinal":
                return getPdbxOrdinal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _citation.id in the CITATION
     * category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return delegate.getColumn("citation_id", DelegatingStrColumn::new);
    }

    /**
     * The classification of the program according to its
     * major function.
     * @return StrColumn
     */
    public StrColumn getClassification() {
        return delegate.getColumn("classification", DelegatingStrColumn::new);
    }

    /**
     * The compiler used to compile the software.
     * @return StrColumn
     */
    public StrColumn getCompilerName() {
        return delegate.getColumn("compiler_name", DelegatingStrColumn::new);
    }

    /**
     * The version of the compiler used to compile the software.
     * @return StrColumn
     */
    public StrColumn getCompilerVersion() {
        return delegate.getColumn("compiler_version", DelegatingStrColumn::new);
    }

    /**
     * The recognized contact author of the software. This could be
     * the original author, someone who has modified the code or
     * someone who maintains the code.  It should be the person
     * most commonly associated with the code.
     * @return StrColumn
     */
    public StrColumn getContactAuthor() {
        return delegate.getColumn("contact_author", DelegatingStrColumn::new);
    }

    /**
     * The e-mail address of the person specified in
     * _software.contact_author.
     * @return StrColumn
     */
    public StrColumn getContactAuthorEmail() {
        return delegate.getColumn("contact_author_email", DelegatingStrColumn::new);
    }

    /**
     * The date the software was released.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * Description of the software.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * Any prerequisite software required to run _software.name.
     * @return StrColumn
     */
    public StrColumn getDependencies() {
        return delegate.getColumn("dependencies", DelegatingStrColumn::new);
    }

    /**
     * The hardware upon which the software was run.
     * @return StrColumn
     */
    public StrColumn getHardware() {
        return delegate.getColumn("hardware", DelegatingStrColumn::new);
    }

    /**
     * The major computing language in which the software is
     * coded.
     * @return StrColumn
     */
    public StrColumn getLanguage() {
        return delegate.getColumn("language", DelegatingStrColumn::new);
    }

    /**
     * The URL for an Internet address at which
     * details of the software can be found.
     * @return StrColumn
     */
    public StrColumn getLocation() {
        return delegate.getColumn("location", DelegatingStrColumn::new);
    }

    /**
     * Any noteworthy modifications to the base software, if applicable.
     * @return StrColumn
     */
    public StrColumn getMods() {
        return delegate.getColumn("mods", DelegatingStrColumn::new);
    }

    /**
     * The name of the software.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The name of the operating system under which the software
     * runs.
     * @return StrColumn
     */
    public StrColumn getOs() {
        return delegate.getColumn("os", DelegatingStrColumn::new);
    }

    /**
     * The version of the operating system under which the software
     * runs.
     * @return StrColumn
     */
    public StrColumn getOsVersion() {
        return delegate.getColumn("os_version", DelegatingStrColumn::new);
    }

    /**
     * The classification of the software according to the most
     * common types.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The version of the software.
     * @return StrColumn
     */
    public StrColumn getVersion() {
        return delegate.getColumn("version", DelegatingStrColumn::new);
    }

    /**
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return delegate.getColumn("pdbx_ordinal", DelegatingIntColumn::new);
    }

}