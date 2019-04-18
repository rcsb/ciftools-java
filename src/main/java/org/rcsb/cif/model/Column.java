package org.rcsb.cif.model;

public interface Column {
    String getStringData(int row);

    String getName();

    int getRowCount();

    ValueKind getValueKind(int row);

//    Optional<ByteArray> forceEncode();

//    Optional<DecimalFormat> defaultFormat();

//    Type inferType();
//
//    enum Type {
//        STRING,
//        INT,
//        FLOAT
//    }
}
