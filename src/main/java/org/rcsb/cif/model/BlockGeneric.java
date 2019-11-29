package org.rcsb.cif.model;

import java.util.List;

public interface BlockGeneric {

	BaseCategory getCategory(String name);

	List<BlockGeneric> getSaveFrames();

	String getBlockHeader();

}
