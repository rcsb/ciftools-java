package org.rcsb.cif.binary.codec;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.CifBuilder;
import org.rcsb.cif.CifIO;
import org.rcsb.cif.ParsingException;
import org.rcsb.cif.TestHelper;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.StrColumn;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.rcsb.cif.TestHelper.convertToIntArray;

/**
 * - Obtain MessagePacked data at: <a href="https://msgpack.org/">msgpack.com</a>
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
    void encodeNonAsciiStringAsUtf8() {
        // {"s":"é"}
        assertArrayEquals(convertToIntArray("81 a1 73 a2 c3 a9"), convertToIntArray(MessagePackCodec.encode(Map.of("s", "é"))));
        // {"s":"🧬"}: one character outside the Basic Multilingual Plane, 2 UTF-16 units, 4 UTF-8 bytes
        assertArrayEquals(convertToIntArray("81 a1 73 a4 f0 9f a7 ac"), convertToIntArray(MessagePackCodec.encode(Map.of("s", "🧬"))));
    }

    @Test
    void encodeStringHeaderFromUtf8Length() {
        // 16 characters but 32 bytes: needs str8, not fixstr
        byte[] packed = MessagePackCodec.encode(Map.of("s", "é".repeat(16)));

        assertArrayEquals(convertToIntArray("81 a1 73 d9 20"), convertToIntArray(Arrays.copyOf(packed, 5)));
        assertEquals(5 + 32, packed.length);
    }

    @Test
    void decodeUtf8String() throws IOException {
        Map<String, Object> unpacked = MessagePackCodec.decode(new ByteArrayInputStream(toBytes("82 a1 61 a2 c3 a9 a1 62 a4 f0 9f a7 ac")));

        assertEquals("é", unpacked.get("a"));
        assertEquals("🧬", unpacked.get("b"));
    }

    @Test
    void roundTripNonAsciiStringColumn() throws IOException {
        CifFile cifFile = CifBuilder.enterFile()
                .enterBlock("test")
                .enterCategory("test")
                .enterStrColumn("names")
                .add("é", "🧬", "a", "é")
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();

        byte[] binary = CifIO.writeBinary(cifFile);
        StrColumn names = (StrColumn) CifIO.readFromInputStream(new ByteArrayInputStream(binary))
                .getBlocks().get(0)
                .getCategory("test")
                .getColumn("names");

        assertArrayEquals(new String[] { "é", "🧬", "a", "é" }, names.values().toArray());
        // offsets count UTF-16 units, as in JavaScript (Mol*)
        assertArrayEquals(new int[] { 0, 1, 3, 4 }, stringArrayOffsets(binary));
    }

    @SuppressWarnings("unchecked")
    private static int[] stringArrayOffsets(byte[] binary) throws IOException {
        Map<String, Object> file = MessagePackCodec.decode(new ByteArrayInputStream(binary));
        Map<String, Object> block = (Map<String, Object>) ((Object[]) file.get("dataBlocks"))[0];
        Map<String, Object> category = (Map<String, Object>) ((Object[]) block.get("categories"))[0];
        Map<String, Object> column = (Map<String, Object>) ((Object[]) category.get("columns"))[0];
        Map<String, Object> data = (Map<String, Object>) column.get("data");
        Map<String, Object> stringArray = (Map<String, Object>) ((Object[]) data.get("encoding"))[0];
        assertEquals("StringArray", stringArray.get("kind"));

        Map<String, Object> offsets = new LinkedHashMap<>();
        offsets.put("data", stringArray.get("offsets"));
        offsets.put("encoding", stringArray.get("offsetEncoding"));
        return (int[]) BinaryCifCodec.decode(offsets);
    }

    private static byte[] toBytes(String hex) {
        int[] values = convertToIntArray(hex);
        byte[] bytes = new byte[values.length];
        for (int i = 0; i < values.length; i++) {
            bytes[i] = (byte) values[i];
        }
        return bytes;
    }

    @Test
    void decodeRejectsLengthsBeyondTheInput() {
        String[] inputs = {
                // bin32 claiming ~2 GiB with 4 bytes of payload
                "81 a1 62 c6 7f ff ff f0 01 02 03 04",
                // str32, the same
                "81 a1 62 db 7f ff ff f0 61 62 63 64",
                // array32 with 2^32 - 1 elements (read as a negative int)
                "81 a1 62 dd ff ff ff ff 01",
                // nested array32 headers of ~2^31 elements each
                "81 a1 62 dd 7f ff ff f0 dd 7f ff ff f0 dd 7f ff ff f0 01"
        };
        for (String input : inputs) {
            long before = allocatedBytes();

            assertThrows(ParsingException.class, () -> MessagePackCodec.decode(new ByteArrayInputStream(toBytes(input))), input);

            long allocated = allocatedBytes() - before;
            assertTrue(allocated < 32 * 1024 * 1024, input + " allocated " + allocated + " bytes");
        }
    }

    @Test
    void readingTruncatedBinaryReportsTheCause() {
        ParsingException e = assertThrows(ParsingException.class,
                () -> CifIO.readFromInputStream(new ByteArrayInputStream(toBytes("81 a1 62 c6 7f ff ff f0 01 02 03 04"))));

        assertTrue(e.getMessage().contains("truncated"), e.getMessage());
    }

    private static long allocatedBytes() {
        com.sun.management.ThreadMXBean threadMXBean = (com.sun.management.ThreadMXBean) ManagementFactory.getThreadMXBean();
        return threadMXBean.getThreadAllocatedBytes(Thread.currentThread().getId());
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