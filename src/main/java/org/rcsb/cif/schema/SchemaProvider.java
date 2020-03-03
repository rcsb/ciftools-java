package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.builder.CifFileBuilder;

public interface SchemaProvider<F extends CifFile, B extends CifFileBuilder> {
    F handle(CifFile cifFile);

    B handle(CifFileBuilder cifBuilder);
}
