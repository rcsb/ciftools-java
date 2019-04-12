# CIFTools

CIFTools implements reading and writing of CIF files ([specification](http://www.iucr.org/resources/cif/spec/version1.1/cifsyntax))
as well as their efficiently encoded counterpart, called BinaryCIF.


## Example

```Java
class Demo {
    public static void main(String[] args){
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
        CifBlock data = cifFile.getBlocks().get(0);

        // get category with name '_atom_site' from first block - access is type-safe, all classes are
        // inferred from the CIF schema
        AtomSite _atom_site = data.getAtomSite();
        CartnX cartn_x = _atom_site.getCartnX();

        // calculate the average x-coordinate - #values() returns as DoubleStream as defined in the schema
        // for column 'cartn_x'
        OptionalDouble average_cartn_x = cartn_x.values().average();
        average_cartn_x.ifPresent(System.out::println);

        // print the last residue sequence id - this time #values() returns an IntStream
        OptionalInt last_label_seq_id = _atom_site.getLabelSeqId().values().max();
        last_label_seq_id.ifPresent(System.out::println);

        // print entry id - or values may be text
        Optional<String> stringValue = data.getEntry().getId().values().findFirst();
        stringValue.ifPresent(System.out::println);
    }
}
```

## Contributions

This implementation is based on a number of other projects, namely:
- [CIFtools.js](https://github.com/dsehnal/CIFTools.js) by David Sehnal
- [Mol*](https://molstar.github.io) by Alexander Rose and David Sehnal
- [MMTF](https://mmtf.rcsb.org/)
