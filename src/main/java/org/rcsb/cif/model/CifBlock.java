package org.rcsb.cif.model;

import java.util.List;
import java.util.Map;

public class CifBlock extends CifFrame {
    private List<CifFrame> saveFrames;

    public CifBlock(Map<String, CifCategory> categories, String header, List<CifFrame> saveFrames) {
        super(categories, header);
        this.saveFrames = saveFrames;
    }

    public List<CifFrame> getSaveFrames() {
        return saveFrames;
    }
}
