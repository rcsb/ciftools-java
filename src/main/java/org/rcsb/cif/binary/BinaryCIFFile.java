package org.rcsb.cif.binary;

import org.rcsb.cif.api.CIFFile;
import org.rcsb.cif.api.DataBlock;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BinaryCIFFile implements CIFFile {
    private final String version;
    private final String encoder;
    private final List<DataBlock> dataBlocks;

    public BinaryCIFFile(Map<String, Object> unpacked) {
        this.version = (String) unpacked.get("version");
        this.encoder = (String) unpacked.get("encoder");

        this.dataBlocks = new ArrayList<>();
        for (Object submap : (Object[]) unpacked.get("dataBlocks")) {
            dataBlocks.add(new BinaryDataBlock((Map<String, Object>) submap));
        }
    }

    public String getVersion() {
        return version;
    }

    public String getEncoder() {
        return encoder;
    }

    @Override
    public List<DataBlock> getDataBlocks() {
        return dataBlocks;
    }
}