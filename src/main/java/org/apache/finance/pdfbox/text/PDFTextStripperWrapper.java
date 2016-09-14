package org.apache.finance.pdfbox.text;

import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;

/**
 * This is to make PDFTextStripper's protected method getCharactersByArticle public
 * @author rxue
 *
 */
public class PDFTextStripperWrapper extends PDFTextStripper {

	public PDFTextStripperWrapper() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<List<TextPosition>> getCharactersByArticle() {
		return this.getCharactersByArticle();
	}

}
