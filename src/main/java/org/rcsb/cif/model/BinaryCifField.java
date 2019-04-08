package org.rcsb.cif.model;

import org.rcsb.cif.ParsingException;
import org.rcsb.cif.binary.array.FloatArray;
import org.rcsb.cif.binary.array.IntArray;
import org.rcsb.cif.binary.codec.Codec;

import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BinaryCifField implements CifField {
    private final int[] mask;
    private final int[] intData;
    private final double[] doubleData;
    private final String[] stringData;
    private final int rowCount;
    private final boolean isNumeric;
    private final DataType dataType;
    private final boolean hasMask;
    private final String name;
    @SuppressWarnings("unchecked")
    public BinaryCifField(Map<String, Object> encodedColumn) {
        this.hasMask = encodedColumn.containsKey("mask") && encodedColumn.get("mask") != null && !((Map) encodedColumn.get("mask")).isEmpty();
        this.mask = hasMask ? ((IntArray) Codec.decodeMap((Map<String, Object>) encodedColumn.get("mask"))).getArray() : null;
        Object data = Codec.decodeMap((Map<String, Object>) encodedColumn.get("data"));

        // decide data type and store in a type-safe way
        if (data instanceof IntArray) {
            this.intData = ((IntArray) data).getArray();
            this.doubleData = null;
            this.stringData = null;
            this.dataType = DataType.Int;
            this.rowCount = intData.length;
        } else if (data instanceof FloatArray) {
            this.intData = null;
            this.doubleData = ((FloatArray) data).getArray();
            this.stringData = null;
            this.dataType = DataType.Float;
            this.rowCount = doubleData.length;
        } else if (data instanceof String[]) {
            this.intData = null;
            this.doubleData = null;
            this.stringData = (String[]) data;
            this.dataType = DataType.Str;
            this.rowCount = stringData.length;
        } else {
            throw new ParsingException("novel data type: " + data.getClass().getSimpleName());
        }
        this.isNumeric = dataType == DataType.Int || dataType == DataType.Float;
        this.name = (String) encodedColumn.get("name");
    }

    public boolean isNumeric() {
        return isNumeric;
    }

    @Override
    public DataType getDataType() {
        return dataType;
    }

    @Override
    public boolean isDefined() {
        return true;
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public String getString(int row) {
        if (dataType == DataType.Str) {
            return !hasMask || mask[row] == ValueKind.PRESENT.ordinal() ? stringData[row] : "";
        }
        return !hasMask || mask[row] == ValueKind.PRESENT.ordinal() ?
                String.valueOf(dataType == DataType.Int ? intData[row] : doubleData[row]) : "";
    }

    @Override
    public int getInt(int row) {
        if (isNumeric) {
            return dataType == DataType.Int ? intData[row] : (int) doubleData[row];
        }
        return Integer.parseInt(stringData[row]);
    }

    @Override
    public double getFloat(int row) {
        if (isNumeric) {
            return dataType == DataType.Int ? intData[row] : doubleData[row];
        }
        return Double.parseDouble(stringData[row]);
    }

    @Override
    public ValueKind getValueKind(int row) {
        if (!hasMask) {
            return ValueKind.PRESENT;
        }
        return ValueKind.values()[mask[row]];
    }

    @Override
    public boolean areEqualByValue(int rowA, int rowB) {
        switch (dataType) {
            case Int:
                return intData[rowA] == intData[rowB];
            case Float:
                // TODO address rounding errors?
                return doubleData[rowA] == doubleData[rowB];
            case Str:
                return stringData[rowA].equals(stringData[rowB]);
            default:
                throw new RuntimeException("Unrecognized data type.");
        }
    }

    @Override
    public Stream<String> strings() {
        return IntStream.range(0, rowCount)
                .mapToObj(this::getString);
    }

    @Override
    public IntStream ints() {
        if (isNumeric) {
            return dataType == DataType.Int ? IntStream.of(intData) :
                    DoubleStream.of(doubleData).mapToInt(d -> (int) d);
        }
        return Stream.of(stringData)
                .mapToInt(Integer::parseInt);
    }

    @Override
    public DoubleStream floats() {
        if (isNumeric) {
            return dataType == DataType.Int ? IntStream.of(intData).mapToDouble(i -> i) :
                    DoubleStream.of(doubleData);
        }
        return Stream.of(stringData)
                .mapToDouble(Double::parseDouble);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Stream<ValueKind> valueKinds() {
        return IntStream.range(0, rowCount)
                .mapToObj(this::getValueKind);
    }
}
