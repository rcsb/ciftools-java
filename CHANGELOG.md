CIFTools Changelog
=============

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
