package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.Float32Array;
import org.rcsb.cif.binary.data.Int16Array;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.Int8Array;
import org.rcsb.cif.binary.data.NumberArray;
import org.rcsb.cif.binary.data.Uint16Array;
import org.rcsb.cif.binary.data.Uint32Array;
import org.rcsb.cif.binary.data.Uint8Array;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.Encoding;

import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * <p>Encodes an array of numbers of specified types as raw bytes. E.g. values in the range from 0...255 (i.e. an
 * {@link Uint8Array}) can be efficiently represented by single byte rather than int values which would require four
 * bytes.</p>
 *
 * <pre>
 * ByteArray {
 *     kind = "ByteArray"
 *     type: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Float32Array | Float64Array
 * }
 * </pre>
 */
public class ByteArrayCodec {
    public <D> ByteArray encode(NumberArray<D> data, ByteArrayEncoding encoding) {
        int type = determineType(data);
        byte[] bytes = ensureOrder(data.toByteArray(), data.getNumberOfBytes());

        Encoding[] dataEncoding = data.getEncoding();
        Encoding[] enc = Arrays.copyOf(dataEncoding, dataEncoding.length + 1);
        encoding.setType(type);
        enc[dataEncoding.length] = encoding;

        return EncodedDataFactory.byteArray(bytes, enc);
    }

    private int determineType(NumberArray data) {
        if (data instanceof Int8Array) {
            return 1;
        } else if (data instanceof Int16Array) {
            return 2;
        } else if (data instanceof Int32Array) {
            return 3;
        } else if (data instanceof Uint8Array) {
            return 4;
        } else if (data instanceof Uint16Array) {
            return 5;
        } else if (data instanceof Uint32Array) {
            return 6;
        } else if (data instanceof Float32Array) {
            return 32;
        } else {
            return 33;
        }
    }

    private static final boolean IS_NATIVE_LITTLE_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);

    private static byte[] flipByteOrder(byte[] data, int bytes) {
        byte[] buffer = new byte[data.length];
        for (int i = 0, n = data.length; i < n; i += bytes) {
            for (int j = 0; j < bytes; j++) {
                buffer[i + bytes - j - 1] = data[i + j];
            }
        }
        return buffer;
    }

    private static byte[] ensureOrder(byte[] bytes, int numberOfBytes) {
        if (!IS_NATIVE_LITTLE_ENDIAN) {
            bytes = flipByteOrder(bytes, numberOfBytes);
        }
        return bytes;
    }

    public NumberArray decode(ByteArray data, ByteArrayEncoding encoding) {
        int type = encoding.getType();

        switch (type) {
            case 1:
                return data.toInt8Array(data.getEncoding());
            case 2:
                return data.toInt16Array(data.getEncoding());
            case 3:
                return data.toInt32Array(data.getEncoding());
            case 4:
                return data.toUint8Array(data.getEncoding());
            case 5:
                return data.toUint16Array(data.getEncoding());
            case 6:
                return data.toUint32Array(data.getEncoding());
            case 32:
                return data.toFloat32Array(data.getEncoding());
            case 33:
                return data.toFloat64Array(data.getEncoding());
            default:
                throw new IllegalArgumentException("Unsupported byte type " + type);
        }
    }
}
