package org.rcsb.cif.model;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface CifField {
    DataType getDataType();

    boolean isDefined();
    int getRowCount();

    String getString(int row);
    int getInt(int row);
    double getDouble(int row);

    ValueKind getValueKind(int row);

    boolean areEqualByValue(int rowA, int rowB);

    Stream<String> strings();
    IntStream ints();
    DoubleStream doubles();
}