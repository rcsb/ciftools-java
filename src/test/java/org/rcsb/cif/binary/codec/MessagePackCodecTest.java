package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.TestHelper;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.rcsb.cif.binary.codec.MessagePackCodec.MESSAGE_PACK_CODEC;

public class MessagePackCodecTest {
    @Test
    public void testForwards() {
        // create test case
        Map<String, Object> originalMap = new HashMap<>();
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

        // encode by MessagePack
        byte[] packed = MESSAGE_PACK_CODEC.encode(originalMap);

        // decode by MessagePack
        Map<String, Object> unpacked = MESSAGE_PACK_CODEC.decode(packed);

        assertNotNull(packed);
        assertNotNull(unpacked);
        assertEquals(originalMap, unpacked);
    }

    @Test
    public void testBackwards() {
        // obtain example file
        byte[] bytes = TestHelper.getBytes("bcif/1acj.bcif");

        // decode
        Map<String, Object> unpacked = MESSAGE_PACK_CODEC.decode(bytes);
        // encode
        byte[] packed = MESSAGE_PACK_CODEC.encode(unpacked);

        assertArrayEquals(bytes, packed);

    }
}