# CIFTools

CIFTools implements reading and writing of CIF files ([specification](http://www.iucr.org/resources/cif/spec/version1.1/cifsyntax))
as well as their efficiently encoded counterpart, called BinaryCIF.


## Example

```Java
class Demo {
    public static void main(String[] args){
        String pdbId = "1acj";
        boolean parseBinary = true;
        
        CifFile cifFile;
        // parse conventional CIF
        if (parseBinary) {
            // parse binary CIF from ModelServer
            InputStream inputStream = new URL("https://webchem.ncbr.muni.cz/ModelServer/static/bcif/" + pdbId).openStream();
            cifFile = CifReader.parseBinary(inputStream);
        } else {
            // parse CIF from PDB
            InputStream inputStream = new URL("https://files.rcsb.org/download/" + pdbId + ".cif").openStream();
            cifFile = CifReader.parseText(inputStream);
        }
        
        CifBlock data = cifFile.getBlocks().get(0);
        CifCategory _atom_site = data.getCategory("atom_site");
        CifField cartn_x = _atom_site.getField("Cartn_x");
        
        // print x-coordinates of the first 10 atoms
        cartn_x.doubles().limit(10).forEach(System.out::println);
        
        // print the last residue sequence id
        CifField label_seq_id = _atom_site.getField("label_seq_id");
        label_seq_id.ints().max().ifPresent(System.out::println);
        
        // print entry id
        String stringValue = data.getCategory("entry").getField("id").getString(0);
        System.out.println(stringValue);
    }
}
```

## Contributions

This implementation is based on a number of other projects, namely:
- [CIFtools.js](https://github.com/dsehnal/CIFTools.js) by David Sehnal
- [Mol*](https://molstar.github.io) by Alexander Rose and David Sehnal
- [MMTF](https://mmtf.rcsb.org/)
