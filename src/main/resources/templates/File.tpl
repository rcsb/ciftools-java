package org.rcsb.cif.schema.{packageName};

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.DelegatingCifFile;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class {schemaName}File extends DelegatingCifFile<{schemaName}Block> {
    public {schemaName}File(CifFile delegate) {
        super(delegate);
    }

    @Override
    protected {schemaName}Block getTypedBlock(Block block) {
        return new {schemaName}Block(block);
    }
}
