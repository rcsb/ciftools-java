package org.rcsb.cif.binary.codec;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CodecData<T> {
    private final T data;
    private final List<Map<String, Object>> encoding;

    CodecData(T data) {
        this.data = data;
        this.encoding = new ArrayList<>();
    }

    CodecData(CodecDataBuilder<T> builder) {
        this.data = builder.data;
        this.encoding = builder.encoding;
    }

    public T getData() {
        return data;
    }

    public Object[] getEncoding() {
        Object[] enc = new Object[encoding.size()];
        for (int i = 0; i < encoding.size(); i++) {
            enc[i] = encoding.get(i);
        }
        return enc;
    }

    public Map<String, Object> getParameters() {
        return encoding.get(0);
    }

    public static <T> CodecDataBuilder<T> of(T data) {
        return new CodecDataBuilder<>(data);
    }

    public static <T> CodecData<T> of(T data, Object[] encoding) {
        CodecData<T> codecData = new CodecData<>(data);
        for (Object entry : encoding) {
            Map<String, Object> map = new LinkedHashMap<>();
            Map<String, Object> e = (Map<String, Object>) entry;
            for (Map.Entry<String, Object> parameter : e.entrySet()) {
                map.put(parameter.getKey(), parameter.getValue());
            }
            codecData.encoding.add(map);
        }
        return codecData;
    }

    public static <T> CodecData<T> of(T data, Map<String, Object> encoding) {
        CodecData<T> codecData = new CodecData<>(data);

        Map<String, Object> map = new LinkedHashMap<>();
        for (Map.Entry<String, Object> parameter : encoding.entrySet()) {
            map.put(parameter.getKey(), parameter.getValue());
        }
        codecData.encoding.add(map);

        return codecData;
    }

    // TODO could use a better/safer builder which cares about all parameters being present and types being compatible
    public static class CodecDataBuilder<T> {
        private final T data;
        private final List<Map<String, Object>> encoding;

        CodecDataBuilder(T data) {
            this.data = data;
            this.encoding = new ArrayList<>();
        }

        public EncodingBuilder<T> startEncoding(String kind) {
            Map<String, Object> tmpMap = new LinkedHashMap<>();
            tmpMap.put("kind", kind);
            encoding.add(tmpMap);
            return new EncodingBuilder<>(this, tmpMap);
        }
    }

    public static class EncodingBuilder<T> {
        private final CodecDataBuilder<T> codecDataBuilder;
        private final Map<String, Object> tmpMap;

        public EncodingBuilder(CodecDataBuilder codecDataBuilder, Map<String, Object> tmpMap) {
            this.codecDataBuilder = codecDataBuilder;
            this.tmpMap = tmpMap;
        }

        public EncodingBuilder<T> addParameter(String key, Object value) {
            tmpMap.put(key, value);
            return this;
        }

        public EncodingBuilder<T> startEncoding(String kind) {
            Map<String, Object> tmpMap = new LinkedHashMap<>();
            tmpMap.put("kind", kind);
            codecDataBuilder.encoding.add(tmpMap);
            return new EncodingBuilder<>(codecDataBuilder, tmpMap);
        }

        public CodecData<T> build() {
            return new CodecData<>(this.codecDataBuilder);
        }
    }
}
