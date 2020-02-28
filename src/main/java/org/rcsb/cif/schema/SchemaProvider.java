package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.builder.CifBuilder;

public interface SchemaProvider<F extends CifFile, B extends CifBuilder> {
    F handle(CifFile cifFile);

    B handle(CifBuilder cifBuilder);
}
