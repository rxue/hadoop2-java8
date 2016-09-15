package org.apache.finance.pdfbox;

import java.util.LinkedList;
import java.util.List;

import org.apache.finance.pdfbox.text.GroupedLineTextPosition;

public class PdfTable {
	private LinkedList<LinkedList<GroupedLineTextPosition>> table;
	public PdfTable() {
		this.table = new LinkedList<LinkedList<GroupedLineTextPosition>>();
	}
	public void appendCellData (GroupedLineTextPosition cellData) {
		LinkedList<GroupedLineTextPosition> lastRow = this.table.peekLast();
		if (lastRow == null || cellData.getY() > lastRow.peekLast().getY()) {
			lastRow = new LinkedList<GroupedLineTextPosition>();
			lastRow.add(cellData);
			this.table.add(lastRow);
		}
		else if (lastRow.peekLast().getY() == cellData.getY())
			lastRow.add(cellData);
	}
	
	/**
	 * Evaluate amount of columns statistically
	 * 
	 * @return the amount of columns in the table
	 */
	public int countColumns() {
		int rows = 0;
		return rows;
	}
	
	@Override
	public String toString() {
		String tableContent = "";
		for (List<GroupedLineTextPosition> currentList : this.table) {
			for (GroupedLineTextPosition current : currentList)
				tableContent += "\t" + current.toString();
			tableContent += "\n";
		}
		return tableContent;
	}

}
