CIFTools Changelog
=============

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
