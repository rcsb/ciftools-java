package org.rcsb.cif.model;

public interface CifColumn {
    String getStringData(int row);

    String getName();

    int getRowCount();

    ValueKind getValueKind(int row);

    String format(double val); // TODO should be part of getStringData

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
