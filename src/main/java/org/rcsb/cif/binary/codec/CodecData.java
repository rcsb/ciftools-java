package org.rcsb.cif.binary.codec;

import java.util.LinkedHashMap;
import java.util.Map;

public class CodecData<T> {
    private final T data;
    private final Map<String, Object> parameters;

    public CodecData(T data) {
        this.data = data;
        this.parameters = new LinkedHashMap<>();
    }

    public CodecData(CodecDataBuilder<T> builder) {
        this.data = builder.data;
        this.parameters = builder.parameters;
    }

    public T getData() {
        return data;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public static <T> CodecDataBuilder<T> of(T data) {
        return new CodecDataBuilder<>(data);
    }

    public static <T> CodecData<T> of(T data, Map<String, Object> parameterMap) {
        CodecData<T> codecData = new CodecData<>(data);
        for (Map.Entry<String, Object> entry : parameterMap.entrySet()) {
            codecData.parameters.put(entry.getKey(), entry.getValue());
        }
        return codecData;
    }

    public static class CodecDataBuilder<T> {
        private final T data;
        private final Map<String, Object> parameters;

        CodecDataBuilder(T data) {
            this.data = data;
            this.parameters = new LinkedHashMap<>();
        }

        public CodecDataBuilder<T> addParameter(String key, Object value) {
            parameters.put(key, value);
            return this;
        }

        public CodecData<T> create(String kind) {
            addParameter("kind", kind);
            return new CodecData<>(this);
        }
    }
}
