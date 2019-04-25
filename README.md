# CIFTools

CIFTools implements reading and writing of CIF files ([specification](http://www.iucr.org/resources/cif/spec/version1.1/cifsyntax))
as well as their efficiently encoded counterpart, called BinaryCIF. The idea is to have a robust, type-safe 
implementation for the handling of CIF files which does not care about the origin of the data: both conventional text-based
and binary files should be handled the same way.

## Performance

## Getting Started

## File Parsing Example

```Java
class Demo {
    public static void main(String[] args) {
        String pdbId = "1acj";
        boolean parseBinary = true;

        // CIF and BinaryCIF are stored in the same data structure
        // to access the data, it does not matter where and in which format the data came from
        CifFile cifFile;
        if (parseBinary) {
            // parse binary CIF from ModelServer
            InputStream inputStream = new URL("https://webchem.ncbr.muni.cz/ModelServer/static/bcif/"
                    + pdbId).openStream();
            cifFile = CifReader.parseBinary(inputStream);
        } else {
            // parse CIF from PDB
            InputStream inputStream = new URL("https://files.rcsb.org/download/" + pdbId
                    + ".cif").openStream();
            cifFile = CifReader.parseText(inputStream);
        }

        // get first block of CIF
        Block data = cifFile.getFirstBlock();

        // get category with name '_atom_site' from first block - access is type-safe, all classes are
        // inferred from the CIF schema
        AtomSite atomSite = data.getAtomSite();
        CartnX cartnX = atomSite.getCartnX();

        // by definition, some categories can only contain a single row of data
        String entryId = data.getEntry().getId().get();
        System.out.println(entryId);

        // calculate the average x-coordinate - #values() returns as DoubleStream as defined in the
        // schema for column 'cartn_x'
        OptionalDouble averageCartnX = cartnX.values().average();
        averageCartnX.ifPresent(System.out::println);

        // print the last residue sequence id - this time #values() returns an IntStream
        OptionalInt lastLabelSeqId = atomSite.getLabelSeqId().values().max();
        lastLabelSeqId.ifPresent(System.out::println);

        // print record type - or #values() may be text
        Optional<String> groupPdb = data.getAtomSite().getGroupPDB().values().findFirst();
        groupPdb.ifPresent(System.out::println);
    }
}
```

Just as in Mol* implementation, all parsing and decoding is done as lazily as possible.

## Model Creation Example
```Java
class Demo {
    public static void main(String[] args) {
        CifFile cifFile = CifFile.enterFile()
                // create a block
                .enterBlock("1EXP")
                // create a category with name 'entry'
                .enterCategory("entry")
                // set value of column 'id'
                .enterStrColumn("id")
                // to '1EXP'
                .stringValues("1EXP")
                // leave current column and category
                .leaveColumn()
                .leaveCategory()

                // create atom site category
                .enterCategory("atom_site")
                // and specify some x-coordinates
                .enterFloatColumn("Cartn_x")
                .floatValues(1.0, -2.4, 4.5)
                // values can be unknown or not specified
                .markNextUnknown()
                .floatValues(-3.14, 5.0)

                // leaving the builder will release the CifFile instance
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();
    }
}
```

## Contributions

This implementation is based on a number of other projects, namely:
- [CIFtools.js](https://github.com/dsehnal/CIFTools.js) by David Sehnal
- [Mol*](https://molstar.github.io) by Alexander Rose and David Sehnal
- [MMTF](https://mmtf.rcsb.org/)
