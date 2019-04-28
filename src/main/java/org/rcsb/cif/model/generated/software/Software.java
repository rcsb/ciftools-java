package org.rcsb.cif.model.generated.software;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Software extends BaseCategory {
    public Software(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Software(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Software(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _citation.id in the CITATION
     * category.
     * @return CitationId
     */
    public CitationId getCitationId() {
        return (CitationId) (isText ? textFields.computeIfAbsent("citation_id",
                CitationId::new) : getBinaryColumn("citation_id"));
    }

    /**
     * The classification of the program according to its
     * major function.
     * @return Classification
     */
    public Classification getClassification() {
        return (Classification) (isText ? textFields.computeIfAbsent("classification",
                Classification::new) : getBinaryColumn("classification"));
    }

    /**
     * The compiler used to compile the software.
     * @return CompilerName
     */
    public CompilerName getCompilerName() {
        return (CompilerName) (isText ? textFields.computeIfAbsent("compiler_name",
                CompilerName::new) : getBinaryColumn("compiler_name"));
    }

    /**
     * The version of the compiler used to compile the software.
     * @return CompilerVersion
     */
    public CompilerVersion getCompilerVersion() {
        return (CompilerVersion) (isText ? textFields.computeIfAbsent("compiler_version",
                CompilerVersion::new) : getBinaryColumn("compiler_version"));
    }

    /**
     * The recognized contact author of the software. This could be
     * the original author, someone who has modified the code or
     * someone who maintains the code.  It should be the person
     * most commonly associated with the code.
     * @return ContactAuthor
     */
    public ContactAuthor getContactAuthor() {
        return (ContactAuthor) (isText ? textFields.computeIfAbsent("contact_author",
                ContactAuthor::new) : getBinaryColumn("contact_author"));
    }

    /**
     * The e-mail address of the person specified in
     * _software.contact_author.
     * @return ContactAuthorEmail
     */
    public ContactAuthorEmail getContactAuthorEmail() {
        return (ContactAuthorEmail) (isText ? textFields.computeIfAbsent("contact_author_email",
                ContactAuthorEmail::new) : getBinaryColumn("contact_author_email"));
    }

    /**
     * The date the software was released.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * Description of the software.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }

    /**
     * Any prerequisite software required to run _software.name.
     * @return Dependencies
     */
    public Dependencies getDependencies() {
        return (Dependencies) (isText ? textFields.computeIfAbsent("dependencies",
                Dependencies::new) : getBinaryColumn("dependencies"));
    }

    /**
     * The hardware upon which the software was run.
     * @return Hardware
     */
    public Hardware getHardware() {
        return (Hardware) (isText ? textFields.computeIfAbsent("hardware",
                Hardware::new) : getBinaryColumn("hardware"));
    }

    /**
     * The major computing language in which the software is
     * coded.
     * @return Language
     */
    public Language getLanguage() {
        return (Language) (isText ? textFields.computeIfAbsent("language",
                Language::new) : getBinaryColumn("language"));
    }

    /**
     * The URL for an Internet address at which
     * details of the software can be found.
     * @return Location
     */
    public Location getLocation() {
        return (Location) (isText ? textFields.computeIfAbsent("location",
                Location::new) : getBinaryColumn("location"));
    }

    /**
     * Any noteworthy modifications to the base software, if applicable.
     * @return Mods
     */
    public Mods getMods() {
        return (Mods) (isText ? textFields.computeIfAbsent("mods",
                Mods::new) : getBinaryColumn("mods"));
    }

    /**
     * The name of the software.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The name of the operating system under which the software
     * runs.
     * @return Os
     */
    public Os getOs() {
        return (Os) (isText ? textFields.computeIfAbsent("os",
                Os::new) : getBinaryColumn("os"));
    }

    /**
     * The version of the operating system under which the software
     * runs.
     * @return OsVersion
     */
    public OsVersion getOsVersion() {
        return (OsVersion) (isText ? textFields.computeIfAbsent("os_version",
                OsVersion::new) : getBinaryColumn("os_version"));
    }

    /**
     * The classification of the software according to the most
     * common types.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * The version of the software.
     * @return Version
     */
    public Version getVersion() {
        return (Version) (isText ? textFields.computeIfAbsent("version",
                Version::new) : getBinaryColumn("version"));
    }

    /**
     * 
     * An ordinal index for this category
     * @return PdbxOrdinal
     */
    public PdbxOrdinal getPdbxOrdinal() {
        return (PdbxOrdinal) (isText ? textFields.computeIfAbsent("pdbx_ordinal",
                PdbxOrdinal::new) : getBinaryColumn("pdbx_ordinal"));
    }
}
