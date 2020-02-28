package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;

public interface SchemaProvider<B extends CifFile> {
    B handle(CifFile cifFile);
}
