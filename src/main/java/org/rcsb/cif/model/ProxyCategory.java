package org.rcsb.cif.model;

import java.util.List;

/**
 * Provides lazy initialization of Category classes
 * 
 * @author hansonr
 */
public class ProxyCategory implements Category {

	private String name;
	private int rowCount;
	private Object[] encodedColumns;
	private Category realizedCategory;
	
	public ProxyCategory(String name, int rowCount, Object[] encodedColumns) {
		this.name = name;
		this.rowCount = rowCount;
		this.encodedColumns = encodedColumns;
	}
	
	public Category get() {
		if (realizedCategory == null) {
			realizedCategory = ModelFactory.createCategoryBinary(name, rowCount, encodedColumns);
			encodedColumns = null;
		}
		return realizedCategory;
	}

	@Override
	public String getCategoryName() {
		return name;
	}

	@Override
	public int getRowCount() {
		return rowCount;
	}

	@Override
	public Column getColumn(String name) {
		return get().getColumn(name);
	}

	@Override
	public List<String> getColumnNames() {
		return get().getColumnNames();
	}

	@Override
	public boolean isDefined() {
		return true;
	}
	

}
