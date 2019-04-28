package org.rcsb.cif.model.generated.pdbxsequenceannotation;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSequenceAnnotation extends BaseCategory {
    public PdbxSequenceAnnotation(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSequenceAnnotation(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSequenceAnnotation(String name) {
        super(name);
    }

    /**
     * PDB chain ID.
     * @return PdbChainId
     */
    public PdbChainId getPdbChainId() {
        return (PdbChainId) (isText ? textFields.computeIfAbsent("pdb_chain_id",
                PdbChainId::new) : getBinaryColumn("pdb_chain_id"));
    }

    /**
     * NCBI TaxID
     * @return NcbiTaxid
     */
    public NcbiTaxid getNcbiTaxid() {
        return (NcbiTaxid) (isText ? textFields.computeIfAbsent("ncbi_taxid",
                NcbiTaxid::new) : getBinaryColumn("ncbi_taxid"));
    }
}
