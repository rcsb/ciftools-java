package org.rcsb.cif.binary.codec;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.TestHelper;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.rcsb.cif.TestHelper.convertToIntArray;

/**
 * - Obtain MessagePacked data at: https://msgpack.org/
 * - Always use a sorted Map implementation (e.g. LinkedHashMap) as order matters.
 */
class MessagePackCodecTest {
    @Test
    void encodeString() {
        int[] expected = convertToIntArray("82 a2 53 31 a0 a2 53 32 ab 4c 6f 72 65 6d 20 69 70 73 75 6d");

        // {"S1":"","S2":"Lorem ipsum"}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("S1", "");
        originalMap.put("S2", "Lorem ipsum");

        int[] actual = convertToIntArray(MessagePackCodec.encode(originalMap));

        assertArrayEquals(expected, actual);
    }

    @Test
    void encodeNumbers() {
        int[] expected = convertToIntArray("82 a2 49 31 11 a2 44 31 cb c0 50 6c cc cc cc cc cd");

        // {"I1": 17,"D1":-65.7}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("I1", 17);
        originalMap.put("D1", -65.7);

        int[] actual = convertToIntArray(MessagePackCodec.encode(originalMap));

        assertArrayEquals(expected, actual);
    }

    @Test
    void encodeNull() {
        int[] expected = convertToIntArray("81 a4 6e 75 6c 6c c0");

        // {"null":null}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("null", null);

        int[] actual = convertToIntArray(MessagePackCodec.encode(originalMap));

        assertArrayEquals(expected, actual);
    }

    @Test
    void encodeBoolean() {
        int[] expected = convertToIntArray("82 a4 74 72 75 65 c3 a5 66 61 6c 73 65 c2");

        // {"true":true}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("true", true);
        originalMap.put("false", false);

        int[] actual = convertToIntArray(MessagePackCodec.encode(originalMap));

        assertArrayEquals(expected, actual);
    }

    @Test
    void encodeEmptyMap() {
        int[] expected = convertToIntArray("81 a3 6f 62 6a 80");

        // {"obj":{}}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("obj", new LinkedHashMap<>());

        int[] actual = convertToIntArray(MessagePackCodec.encode(originalMap));

        assertArrayEquals(expected, actual);
    }

    @Test
    void encodeMap() {
        int[] expected = convertToIntArray("81 a3 6f 62 6a 83 a2 53 31 a3 73 74 72 a2 49 31 f4 a2 44 31 cb 40 5f d4 b0 f2 7b b2 ff");

        // {"obj":{"S1":"str","I1":-12,"D1":127.3233}}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        Map<String, Object> internal = new LinkedHashMap<>();
        internal.put("S1", "str");
        internal.put("I1", -12);
        internal.put("D1", 127.3233);
        originalMap.put("obj", internal);

        int[] actual = convertToIntArray(MessagePackCodec.encode(originalMap));

        assertArrayEquals(expected, actual);
    }

    @Test
    void encodeEmptyArray() {
        int[] expected = convertToIntArray("81 a3 61 72 72 90");

        // {"arr":[]}
        Map<String, Object> originalMap = new HashMap<>();
        originalMap.put("arr", new Object[0]);

        int[] actual = convertToIntArray(MessagePackCodec.encode(originalMap));

        assertArrayEquals(expected, actual);
    }

    @Test
    void testForward() throws IOException {
        // create test case
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("S1", "Lorem");
        originalMap.put("S2", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor " +
                "invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.");
        originalMap.put("S3", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor " +
                "invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo " +
                "duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit " +
                "amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt " +
                "ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo " +
                "dolores et ea rebum.");
        originalMap.put("S4", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor " +
                "invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo " +
                "duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit " +
                "amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt " +
                "ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo " +
                "dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit " +
                "amet.");
        originalMap.put("null", null);

        // encode by MessagePack
        byte[] packed = MessagePackCodec.encode(originalMap);

        // decode by MessagePack
        Map<String, Object> unpacked = MessagePackCodec.decode(new ByteArrayInputStream(packed));

        assertEquals(originalMap, unpacked);
    }

    @Test
    void testNegFixInt() throws IOException {
        // there was a strange case when negative int values with length of 1 byte where horribly misinterpreted as 4
        // bytes of information
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("entry", -5);

        byte[] packed = MessagePackCodec.encode(originalMap);

        Map<String, Object> unpacked = MessagePackCodec.decode(new ByteArrayInputStream(packed));

        assertEquals(originalMap, unpacked);
        assertEquals(-5, unpacked.get("entry"));
    }

    @Test
    void testBackward() throws IOException {
        // obtain example file
        InputStream inputStream = TestHelper.getInputStream("bcif/1pga.bcif");

        // decode
        Map<String, Object> unpacked = MessagePackCodec.decode(inputStream);
        // encode
        byte[] packed = MessagePackCodec.encode(unpacked);

        assertArrayEquals(TestHelper.getBytes("bcif/1pga.bcif"), packed);
    }
}