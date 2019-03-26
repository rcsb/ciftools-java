package org.rcsb.cif.text;

import org.rcsb.cif.api.CIFFile;
import org.rcsb.cif.api.DataBlock;

import java.util.ArrayList;
import java.util.List;

public class TextCIFFile implements CIFFile {
    private final List<DataBlock> dataBlocks;
    private final String data;

    public TextCIFFile(String data) {
        this.dataBlocks = new ArrayList<>();
        this.data = data;
    }

    @Override
    public List<DataBlock> getDataBlocks() {
        return dataBlocks;
    }

    public String getData() {
        return data;
    }
}
