package org.rcsb.cif.model.internal;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CifBlock extends CifFrame {
    private final List<CifFrame> saveFrames;

    public CifBlock(Map<String, CifCategory> categories, String header, List<CifFrame> saveFrames) {
        super(categories, header);
        this.saveFrames = saveFrames;
    }

    public List<CifFrame> getSaveFrames() {
        return saveFrames;
    }

    public Stream<CifFrame> saveFrames() {
        return saveFrames.stream();
    }
}
