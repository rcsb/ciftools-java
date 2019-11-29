package org.rcsb.cif.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A simpler interface that does not require generation
 * 
 * @author hansonr
 *
 */
public class BaseBlockGeneric implements BlockGeneric {
	
    protected final Map<String, Category> categories;
    private final List<BlockGeneric> saveFrames;
    protected final String header;

    public BaseBlockGeneric(Map<String, Category> categories, String header) {
    	this(categories, header, new ArrayList<BlockGeneric>());
	}

    public BaseBlockGeneric(Map<String, Category> categories, String header, List<BlockGeneric> saveFrames) {
        this.categories = categories;
        this.saveFrames = saveFrames;
        this.header = header;
    }

	@Override
    public BaseCategory getCategory(String name) {
        // try to return category, if unknown and not present, return empty category
        return (BaseCategory) categories.computeIfAbsent(name, ModelFactory::createEmptyCategory);
    }

    @Override
    public List<BlockGeneric> getSaveFrames() {
        return saveFrames;
    }

	@Override
	public String getBlockHeader() {
		return header;
	}


}
