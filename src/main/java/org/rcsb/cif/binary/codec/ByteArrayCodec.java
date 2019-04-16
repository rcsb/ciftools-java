package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.Encoding;

import java.nio.ByteOrder;
import java.util.LinkedList;

public class ByteArrayCodec {
//    private static final Logger logger = LoggerFactory.getLogger(ByteArrayCodec.class);

    public <D> ByteArray encode(NumberArray<D> data, ByteArrayEncoding encoding) {
        int type = determineType(data);
        byte[] bytes = ensureOrder(data.toByteArray(), data.getNumberOfBytes());

        LinkedList<Encoding> enc = new LinkedList<>(data.getEncoding());
        encoding.setType(type);
        enc.add(encoding);

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
