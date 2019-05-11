CIFTools Changelog
=============

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
