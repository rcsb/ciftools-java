package org.rcsb.cif.model;

import org.rcsb.cif.ParsingException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class BinaryCifCategory implements CifCategory {
    private final String name;
    private final int rowCount;
    private final Object[] encodedFields;
    private final Map<String, BinaryCifField> decodedFields;

    public BinaryCifCategory(String name, int rowCount, Object[] encodedFields) {
        this.name = name;
        this.rowCount = rowCount;
        this.encodedFields = encodedFields;
        this.decodedFields = new LinkedHashMap<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @SuppressWarnings("unchecked")
    private Optional<Map<String, Object>> find(String name) {
        return Stream.of(encodedFields)
                .map(m -> (Map<String, Object>) m)
                .filter(m -> name.equals(m.get("name")))
                .findFirst();
    }

    @Override
    public BinaryCifField getField(String name) throws ParsingException {
        Optional<Map<String, Object>> optional = find(name);
        // cache decoded fields to reuse them if applicable
        if (!optional.isPresent()) {
            throw new UnknownFieldException(name);
        }
        if (decodedFields.containsKey(name)) {
            return decodedFields.get(name);
        }
        BinaryCifField decodedField = new BinaryCifField(optional.get());
        decodedFields.put(name, decodedField);
        return decodedField;
    }
}
