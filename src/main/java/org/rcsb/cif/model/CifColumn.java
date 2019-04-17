package org.rcsb.cif.model;

import org.rcsb.cif.binary.data.ByteArray;

import java.text.DecimalFormat;
import java.util.Optional;

public interface CifColumn {
    String getStringData(int row);

    String getName();

    int getRowCount();

    ValueKind getValueKind(int row);

    Optional<ByteArray> forceEncode();

    Optional<DecimalFormat> defaultFormat();
}
