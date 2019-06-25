package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.TestHelper;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.rcsb.cif.TestHelper.convertToIntArray;
import static org.rcsb.cif.binary.codec.Codec.MESSAGE_PACK_CODEC;

/**
 * - Obtain MessagePacked data at: https://msgpack.org/
 * - Always use a sorted Map implementation (e.g. LinkedHashMap) as order matters.
 */
public class MessagePackCodecTest {
    @Test
    public void encodeString() {
        int[] expected = convertToIntArray("82 a2 53 31 a0 a2 53 32 ab 4c 6f 72 65 6d 20 69 70 73 75 6d");

        // {"S1":"","S2":"Lorem ipsum"}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("S1", "");
        originalMap.put("S2", "Lorem ipsum");

        int[] actual = convertToIntArray(MESSAGE_PACK_CODEC.encode(originalMap));

//        System.out.println(Arrays.toString(expected));
//        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }

    @Test
    public void encodeNumbers() {
        int[] expected = convertToIntArray("82 a2 49 31 11 a2 44 31 cb c0 50 6c cc cc cc cc cd");

        // {"I1": 17,"D1":-65.7}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("I1", 17);
        originalMap.put("D1", -65.7);

        int[] actual = convertToIntArray(MESSAGE_PACK_CODEC.encode(originalMap));

//        System.out.println(Arrays.toString(expected));
//        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }

    @Test
    public void encodeNull() {
        int[] expected = convertToIntArray("81 a4 6e 75 6c 6c c0");

        // {"null":null}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("null", null);

        int[] actual = convertToIntArray(MESSAGE_PACK_CODEC.encode(originalMap));

//        System.out.println(Arrays.toString(expected));
//        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }

    @Test
    public void encodeBoolean() {
        int[] expected = convertToIntArray("82 a4 74 72 75 65 c3 a5 66 61 6c 73 65 c2");

        // {"true":true}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("true", true);
        originalMap.put("false", false);

        int[] actual = convertToIntArray(MESSAGE_PACK_CODEC.encode(originalMap));

//        System.out.println(Arrays.toString(expected));
//        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }

    @Test
    public void encodeEmptyMap() {
        int[] expected = convertToIntArray("81 a3 6f 62 6a 80");

        // {"obj":{}}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("obj", new LinkedHashMap<>());

        int[] actual = convertToIntArray(MESSAGE_PACK_CODEC.encode(originalMap));

//        System.out.println(Arrays.toString(expected));
//        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }

    @Test
    public void encodeMap() {
        int[] expected = convertToIntArray("81 a3 6f 62 6a 83 a2 53 31 a3 73 74 72 a2 49 31 f4 a2 44 31 cb 40 5f d4 b0 f2 7b b2 ff");

        // {"obj":{"S1":"str","I1":-12,"D1":127.3233}}
        Map<String, Object> originalMap = new LinkedHashMap<>();
        Map<String, Object> internal = new LinkedHashMap<>();
        internal.put("S1", "str");
        internal.put("I1", -12);
        internal.put("D1", 127.3233);
        originalMap.put("obj", internal);

        int[] actual = convertToIntArray(MESSAGE_PACK_CODEC.encode(originalMap));

//        System.out.println(Arrays.toString(expected));
//        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }

    @Test
    public void encodeEmptyArray() {
        int[] expected = convertToIntArray("81 a3 61 72 72 90");

        // {"arr":[]}
        Map<String, Object> originalMap = new HashMap<>();
        originalMap.put("arr", new Object[0]);

        int[] actual = convertToIntArray(MESSAGE_PACK_CODEC.encode(originalMap));

//        System.out.println(Arrays.toString(expected));
//        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testForward() {
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
        byte[] packed = MESSAGE_PACK_CODEC.encode(originalMap);

        // decode by MessagePack
        Map<String, Object> unpacked = MESSAGE_PACK_CODEC.decode(packed);

        assertEquals(originalMap, unpacked);
    }

    @Test
    public void testNegFixInt() {
        // there was a strange case when negative int values with length of 1 byte where horribly misinterpreted as 4
        // bytes of information
        Map<String, Object> originalMap = new LinkedHashMap<>();
        originalMap.put("entry", -5);

        byte[] packed = MESSAGE_PACK_CODEC.encode(originalMap);

        Map<String, Object> unpacked = MESSAGE_PACK_CODEC.decode(packed);

        assertEquals(originalMap, unpacked);
        assertEquals(-5, unpacked.get("entry"));
    }

    @Test
    public void testBackward() throws IOException {
        // obtain example file
        byte[] bytes = TestHelper.getBytes("bcif/1pga.bcif");

        // decode
        Map<String, Object> unpacked = MESSAGE_PACK_CODEC.decode(bytes);
        // encode
        byte[] packed = MESSAGE_PACK_CODEC.encode(unpacked);

        assertArrayEquals(bytes, packed);
    }
}