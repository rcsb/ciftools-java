package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.StringArray;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;

public class StringArrayCodecTest {
    @Test
    public void testForward() {
        // create test case
        StringArray plainArray = EncodedDataFactory.stringArray(new String[] { "a", "AB", "a" });

        // encode
        StringArrayEncoding stringArrayEncoding = new StringArrayEncoding();
        ByteArray encodedData = plainArray.encode(stringArrayEncoding);

        System.out.println(encodedData);

        // decode
        StringArray decodedArray = encodedData.decode(stringArrayEncoding);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    public void testRoundtrip() {
        StringArray plainArray = EncodedDataFactory.stringArray(IntStream.range(0, 536)
                .mapToObj(i -> "n")
                .toArray(String[]::new));

        // encode
        StringArrayEncoding stringArrayEncoding = new StringArrayEncoding();
        ByteArray encodedData = plainArray.encode(stringArrayEncoding);

        System.out.println(encodedData);

        // decode
        StringArray decodedArray = encodedData.decode(stringArrayEncoding);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }
}