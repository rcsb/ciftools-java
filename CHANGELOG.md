CIFTools Changelog
=============

This project uses semantic versioning. Furthermore, this project provides code that was generated from schemata. Any schema change that introduces a breaking change in the generated code is considered as breaking for the whole project. Additional information is provided below when this occurs (named `Breaking schema changes`). Most of these occur in experimental categories and are unlikely to affect your code. `Breaking API changes` will be avoided starting with version 1.0.0.

ciftools-java 6.0.0 - March 2024
-------------
### Breaking schema changes
* cif-core:
  * renaming of `atom_site` tensors
  * `atom_type_scat_versus_stol_list` from float to String
  * drops `citation_author_key`
  * drops `citation_editor_id`
  * `journal_index_id` from int to String
  * `refln_f_complex_su` from float to String
* mmCIF/ihm-extension:
  * drops `ihm_entry_collection_mapping.id`

ciftools-java 5.0.2 - October 2023
-------------
### Bug fixes
* treat numbers that exceed `Integer.MAX_VALUE` as String

ciftools-java 5.0.1 - May 2023
-------------
### Bug fixes
* harden detection of scientific notation in number type logic

ciftools-java 5.0.0 - January 2023
-------------
### Breaking schema changes
* cif-core:
  * dropped `diffrn_standard` (duplicate of `diffrn_standards`) and renaming/retyping of several diffraction-related categories

ciftools-java 4.0.5 - January 2023
-------------
### Bug fixes
* fix text writing when non-English number formats are used on the platform

ciftools-java 4.0.4 - November 2022
-------------
### Bug fixes
* fix test failures on Java 17 (subtle gzip differences, #12)

ciftools-java 4.0.3 - October 2022
-------------
### General
* schema update (mainly description in EM sub-schema)

ciftools-java 4.0.2 - June 2022
-------------
### Bug fixes
* write `null` instead of empty map if all values are present and no mask is needed - otherwise other software might refuse to load files written by ciftools-java

ciftools-java 4.0.1 - June 2022
-------------
### Bug fixes
* fix encoding classification when converting text to binary without schema

ciftools-java 4.0.0 - May 2022
-------------
### Bug fixes
* update gson dependency to 2.8.9

### Breaking schema changes
* mmCIF/modelCIF:
  * `ma_protocol_step.method_type_other_details` -> `ma_protocol_step.details`
* cif-core:
  * case changes for many column names, this affects Java access methods unless explicitly aliased by the dictionary
  * changes to handling of value ranges and standard uncertainty values (e.g. for melting points & temperature values in `chemical` category)
  * `citation_journal_issue` changed from int to String type
  * `citation_year` changes from String to int type

ciftools-java 3.0.1 - November 2021
-------------
### Bug fixes
* proper handling of strings such as: `''cytochrome P450`

ciftools-java 3.0.0 - September 2021
-------------
### New features
* add support for the CIF model extension (https://raw.githubusercontent.com/ihmwg/MA-dictionary/master/mmcif_ma.dic), relevant for AlphaFold models and other predicted structures

### Bug fixes
* names in cifcore implementation now follow spec and are case-insensitive

### Breaking schema changes
* mmCIF:
  * `em_focused_ion_beam.duration` changed from int to float type
  * `em_map.symmetry_space_group` changed from String to int type
  * `pdbx_struct_ncs_virus_gen.oper_id` changed from String to int type
  * `struct_ncs_ens_gen.oper_id` changed from String to int type
  * `struct_ncs_oper.id` changed from String to int type
* cif-core:
  * case changes for many column names, this affects Java access methods unless explicitly aliased by the dictionary
  * `atom_type_scat_versus_stol_list` changed from String to float type
  * `model_site_adp_eigen_system` changed from String to `model_site_adp_eigenvalues` and `model_site_adp_eigenvectors` of float type

ciftools-java 2.0.2
-------------
### General
* expose #getColumnNames for categories
* minimized overhead by schema validation that implicitly happens when files are requested in a certain schema 
(previously validation would trigger decoding of all columns)

ciftools-java 2.0.1
-------------
### Bug fixes
* overflow could result in allocation of arrays with negative size

ciftools-java 2.0.0
-------------
### Bug fixes
* avoid enigmatic NullPointerException for #values() of empty columns - now returned Stream will be empty

### Breaking schema changes
* mmCIF: changes to IHM, EM, and branched entities (see https://github.com/rcsb/ciftools-java/commit/caf1bd678dc89d73291e344e2c8ec999735ffc87)

ciftools-java 1.0.0
-------------
### General
* stable release that targets Java 11

ciftools-java 0.10.1
-------------
### New features
* reintroduce Java 8 support

ciftools-java 0.10.0
-------------
### New features
* schema now validates that it is compatible to the provided `CifFile` instance

### Breaking API changes
* added `SchemaProvider#validate(CifFile)` that allows providers to set up hooks for validation
* introduces custom exceptions 
    * accessing an empty column throws `EmptyColumnException`
    * trying to apply an incorrect schema to a file throws `SchemaMismatchException`

ciftools-java 0.9.1
-------------
### Bug fixes
* adds missing cifcore categories/columns

ciftools-java 0.9.0
-------------
### New features
* access to (primitive) data array for all columns

### Breaking API changes
* renames #getBinaryDataUnsafe to #getArray

ciftools-java 0.8.0
-------------
### New features
* adds support for arbitrary schemata
    * clean mmCIF support
    * core-CIF support for CCDC files
    * schema support also during CifFile building

### Breaking API changes
* not compatible with java 8 anymore
* detaches CIF model from any schema - type-safe access now requires to specify SchemaProvider
* several package and class names changed

ciftools-java 0.7.1
-------------
### New features
* adds experimental support for CCDC files

ciftools-java 0.7.0
-------------
### New features
* support for case insensitive handling of category and column names
* `ProxyCategory` to delay class lookup for as long as possible
* generic parsing option (`new CifOptions.CifOptionsBuilder().generic(true).build()`) that completely bypasses the 
schema
* employs lazy loading of the class map used to instantiate categories and columns

### Breaking API changes
* internal: use `Deque` to handle encoding chain - make @cleberecht proud
* removes exposure of `LinkedHashMap`
* removes UTF-8 support, CIF is assumed to be plain ASCII

### Bug fixes
* updates fetch URL to RCSB

ciftools-java 0.6.3
-------------
### General
* change BinaryCIF URL to RCSB resources

ciftools-java 0.6.2
-------------
### Bug fixes
* avoids construction of `Gson` instance in `CifOptions` - thanks @BobHanson

ciftools-java 0.6.1
-------------
### Bug fixes
* file format specification during reading is now honored correctly

ciftools-java 0.6.0
-------------
### New features
* binaryCIF reading is now no-copy (i.e. the `InputStream` is directly consumed by readers/decoders rather than copied 
into a `byte[]`)

### Breaking API changes
* changes (internal) reader classes to work on an `InputStream` rather than on `byte[]`
* removes single-row encoding capabilities (performance was same but code complexity increased)

ciftools-java 0.5.4
-------------
### Bug fixes
* writing of text CIF is now thread-safe

ciftools-java 0.5.3
-------------
### General
* moving to Java 11 for development - build is still targeting Java 8

ciftools-java 0.5.2
-------------
### Bug fixes
* category builder keeps order of registered columns

ciftools-java 0.5.1
-------------
### New features
* tweaks to builder
     * no explicit call to `leaveColumn()` required any more when `Column` was created via `enterColumn()`
     * binaryCIF now retains types for non-standard columns - text data still handles them as `StrColumn` in any case
     
### Bug fixes
* stops leaking of GSON dependency to dependents

ciftools-java 0.5.0
-------------
### Breaking API changes
* addresses flaw in API definition where invoking `build()` on `IntColumnBuilder`, `FloatColumnBuilder`, or 
`StrColumnBuilder` returned a generic `Column` rather than the concrete implementation

ciftools-java 0.4.1
-------------
### Bug fixes
* fixed bug in IntervalQuantizationCodec

ciftools-java 0.4.0
-------------
### New features
* GZIP support
* automatic file type detection during reading: gzipped or plain, binary or text
* several convenience methods provided by `CifIO` and `CifOptions`
* support for other dictionary extensions: `chem_comp`, `entity_branch`, `ihm`
* category and column filtering during writing of files

### Breaking API changes
* merged `CifReader` and `CifWriter` into `CifIO` - e.g. `CifReader.readText(inputStream)` -> 
`CifIO.readFromInputStream(inputStream)`
* drop single row behavior due to difficult detection and the risk of misinterpretation: there are rare cases where 
categories only having a single row in the dictionary contain multiple values in reality

### Bug fixes
* removed instances of duplicated code
* typos in documentation

ciftools-java 0.3.0
-------------

### General
* initial release
