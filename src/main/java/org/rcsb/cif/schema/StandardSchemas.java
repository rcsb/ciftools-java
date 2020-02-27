package org.rcsb.cif.schema;

import org.rcsb.cif.ParsingException;
import org.rcsb.cif.model.BinaryFile;
import org.rcsb.cif.model.TextFile;
import org.rcsb.cif.schema.mm.BinaryMmCifFile;
import org.rcsb.cif.schema.mm.TextMmCifFile;

import java.lang.reflect.InvocationTargetException;

public enum StandardSchemas implements Schema {
//    BIRD(),
//    CCD(),
//    CIF_CORE(),
    MMCIF();

//    private final Class<? extends TextFile<?>> textBase;
//    private final Class<? extends BinaryFile<?>> binaryBase;
//
//    StandardSchemas(Class<? extends TextFile<?>> textBase, Class<? extends BinaryFile<?>> binaryBase) {
//        this.textBase = textBase;
//        this.binaryBase = binaryBase;
//    }
//
//    @SuppressWarnings("unchecked")
//    public <T extends TextFile<?>> T wrap(TextFile<?> cifFile) {
//        try {
//            return (T) textBase.getConstructor(TextFile.class).newInstance(cifFile);
//        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
//            throw new ParsingException("cannot apply " + name() + " to CifFile", e);
//        }
//    }
//
//    @SuppressWarnings("unchecked")
//    public <T extends BinaryFile<?>> T wrap(BinaryFile<?> cifFile) {
//        try {
//            return (T) binaryBase.getConstructor(BinaryFile.class).newInstance(cifFile);
//        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
//            throw new ParsingException("cannot apply " + name() + " to CifFile", e);
//        }
//    }
}
