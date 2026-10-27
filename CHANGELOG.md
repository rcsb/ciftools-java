CIFTools Changelog
=============

This project uses semantic versioning. Furthermore, this project provides code that was generated from schemata. Any schema change that introduces a breaking change in the generated code is considered as breaking for the whole project. Additional information is provided below when this occurs (named `Breaking schema changes`). Most of these occur in experimental categories and are unlikely to affect your code. `Breaking API changes` will be avoided starting with version 1.0.0.

ciftools-java 8.0.2 - October 2026
-------------
### Bug fixes
* BinaryCIF: MessagePack strings are written and read as UTF-8 (were US-ASCII: non-ASCII characters became `?` or
  U+FFFD, and a character outside the BMP made a written file unreadable)
* schema categories: `getColumn(name)` decodes and wraps only that column (it wrapped, and for BinaryCIF decoded, every
  column of the category on each call); `getCategory(name)` of schema blocks wraps only that category
* BinaryCIF: column lookup is a hash lookup; a column that fails to decode no longer fails the other columns of its
  category
* text CIF is read as UTF-8 (was the platform charset), and a leading byte order mark is skipped
* format detection takes any MessagePack map (`0x80`-`0x8f`, `0xde`, `0xdf`) for BinaryCIF (was only `0x83`)
* text writer perf: number formats are per writer; shared ones made concurrent text writes run one at a time
* text CIF: a loop whose value count is not a multiple of its column count, or a loop without data names, is a
  `ParsingException` (ragged loops used to get accepted with columns of different lengths)
* BinaryCIF: MessagePack lengths are bounded by the input (a few bytes could request a 2 GiB allocation); truncated
  data is a `ParsingException`
* BinaryCIF: fixed-point values are decoded by division, so they read as the double nearest to their decimal value,
  as from text (multiplying by the reciprocal was 1 ulp off for 13-50% of values, e.g. `0.9785300000000001`)
* BinaryCIF writer: float values printed in E-notation (below 1e-3 or from 1e7), and text numbers in E-notation, are
  written as float columns (they turned the whole column into strings)
* BinaryCIF writer: fixed point rounds half-even on the exact value, as text output does (`26.5325` -> `26.532`, was
  `26.533`)
* BinaryCIF writer: an encoding hint with a precision but no encoding applies that precision (the encoding was chosen
  from the unrounded values, which usually meant plain doubles); writing no longer modifies hints (their state leaked
  between columns and files)
* BinaryCIF writer: fixed point that would overflow an int falls back to plain doubles
* BinaryCIF writer: numbers are written little-endian on big-endian platforms too (their bytes were reversed there,
  so the files did not read back)
* BinaryCIF writer: the size estimates that choose an encoding no longer overflow for columns of millions of values

### Behavior changes
* BinaryCIF writer: fixed point is used for up to 6 decimal places (was 3); float columns of up to 64 values are
  written as plain doubles where that is smaller than fixed point with its encoding parameters
* builders: built int, float and string columns hold typed arrays (were text columns, parsed on access) and read the
  same; `getValues()` of int and float column builders and `getMask()` of all column builders are read-only views

### Performance
* BinaryCIF writing is more than 2x faster with about a fifth of the allocation:
  * column types are decided from typed values instead of their text
  * integer encodings (Delta, RunLength, IntegerPacking) are written in one pass straight to bytes instead of an array
    per step; the classifier sizes all encodings in one pass, in integer arithmetic
  * string columns take one map lookup per value, none for a repeated value
  * value kinds are not copied per call, and a mask is only allocated for columns with missing values
  * ASCII strings are written without an intermediate array, and output is assembled from chunks instead of a growing
    array
* files created by builders are written about 2x faster (no round trip through text); `add(int...)`/`add(double...)`
  copy in bulk, `addMasked` and `addNullable` no longer go through a one-element array per value
* typed schema columns (`DelegatingIntColumn`, `DelegatingFloatColumn`) read a typed delegate directly (any
  `IntColumn`/`FloatColumn`, e.g. a view) instead of formatting and parsing each value
* `CifOptions`: no per-column work for column filters or encoding hints when none are set

### New features
* `DelegatingColumn#getDelegate()`

ciftools-java 8.0.1 - January 2026
-------------
### Bug fixes
* ValueKind: resolve `""` -> `ValueKind.NOT_PRESENT`

ciftools-java 8.0.0 - January 2026
-------------
### Breaking schema changes
* cif-core:
  * `atom_type_key` removed 
  * `cell_formula_units_z`: `int` -> `float`
  * `cell_angle` category removed
  * `diffrn_radiation_wavelength_id` removed
  * `geom_bond_distance_min` renamed to `geom_min_bond_distance_cutoff`

### New features
* improved builder ergonomics
  * added overloads that make it easier to build columns with missing values
  * validate that all columns in a category are equal in size

ciftools-java 7.0.2 - September 2025
-------------
### Bug fixes
* BCIF writing: fix behavior when the model contains empty categories

ciftools-java 7.0.1 - March 2025
-------------
### Bug fixes
* cache results of `DelegatingColumn#getArray()` to avoid performance penalty if schema type and actual data type differ (fixes #13)

ciftools-java 7.0.0 - March 2025
-------------
### Breaking schema changes
* cif-core:
  * removal of `Atom`, `CifCore`, `Diffraction`, `DiffrnOrient`, `Display`, `Model`, `Publication`, `Structure`, and `Valence` categories

### General
* dependency and schema updates

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
