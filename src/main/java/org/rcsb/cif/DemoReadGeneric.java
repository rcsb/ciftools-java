package org.rcsb.cif;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import org.rcsb.cif.model.BaseColumn;
import org.rcsb.cif.model.BlockGeneric;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFileGeneric;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.StrColumn;

public class DemoReadGeneric {

	/**
	 * environment flag to prevent unnecessary Swing classes from loading
	 * 
	 */
	public static boolean j2sHeadless = true;

	protected static final int MODE_READ_PARSE_TEXT     = 0;
	protected static final int MODE_READ_PARSE_BINARY   = 1;
	
    protected static final int MODE_OPTION_GET_ALL_DATA   = 1 << 4;
	protected static final int MODE_OPTION_PROCESS        = 2 << 4;

	protected static final int MODE_TEST_FILE_TRANSFER    = 1 << 6;

	/**
	 *  include transfer time for file reading
	 */
	protected static final int MODE_READ_FILE                = 0;
	/**
	 * preload byte array to exclude file transfer time
	 */
	protected static final int MODE_READ_BYTE_STREAM         = 1 << 10;

	/**
	 * don't report
	 */
	protected static final int MODE_SILENT  = 1 << 10;

	private static final int MODE_LOCAL     = 1 << 11;

	// data 2019.11.27 BH
	// parsing of 1acj binary:
	// parsing of 1acj text: 2.7 sec

	public static void main(String[] args) {
		String pdbId = "1acj";
		try {
			
			long t0 = System.nanoTime();
			try {
				// for CifIO static initialization
				CifIO.class.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
			}
			reportTime(t0, "Loading Cif options");
			
//			parse(pdbId, MODE_READ_BYTE_STREAM | MODE_OPTION_GET_ALL_DATA);
//			parse(pdbId, MODE_READ_FILE | MODE_OPTION_GET_ALL_DATA);
			
			parse(pdbId, MODE_READ_BYTE_STREAM | MODE_OPTION_PROCESS);// | MODE_LOCAL);
//			parse(pdbId, MODE_READ_FILE | MODE_OPTION_PROCESS);

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected static void parse(String pdbId, int mode) throws IOException {
		boolean useStream = ((mode & MODE_READ_BYTE_STREAM) == MODE_READ_BYTE_STREAM);
		if (useStream) {
			new StreamParser(pdbId, mode).parseTest(mode);
		} else {
			new TextParser(pdbId).parseTest(mode);
		}

	}

	/**
	 * abstract class; either a StreamParser or TextParser
	 * 
	 * @author hansonr
	 *
	 */
	protected static abstract class Parser {
	   
		abstract void parse(int mode) throws IOException;

		abstract void setMode(int mode);
	   
	   protected void parseTest(int mode) throws IOException {
			int binaryOptions = MODE_READ_PARSE_BINARY | mode;
			int textOptions = MODE_READ_PARSE_TEXT | mode;
			test(binaryOptions);
			test(textOptions);
		}

		private void test(int mode) throws IOException {
			boolean parseBinary = ((mode & MODE_READ_PARSE_BINARY) == MODE_READ_PARSE_BINARY);
			String type = (parseBinary ? "binary" : "text");

			long t0, tgc;
			setMode(mode);
			parse(mode);
			parse(mode);
			parse(mode);
			System.out.println("------");
			t0 = System.nanoTime();
			tgc = 0;
			for (int i = 0; i < 10; i++) {
//			parseFile(mode | MODE_SILENT);
				tgc = gcTime(tgc);
				parse(mode);
			}
			reportTime(t0 + tgc, 10, "------PARSE " + type + " (-GC)");
			t0 = reportTime(t0, 10, "------PARSE " + type);
		}
	}
	/**
	 * Preload the binary or text data as byte arrays so as to remove transfer time.
	 *  
	 * @author hansonr
	 *
	 */
	protected static class StreamParser extends Parser {

		protected InputStream inputStream, binaryStream, textStream;

		protected StreamParser(String pdbId, int mode) throws MalformedURLException, IOException {
//			binaryStream = loadStream("1crn", MODE_READ_PARSE_BINARY);
//			textStream = loadStream("1crn", MODE_READ_PARSE_TEXT);
//			binaryStream = loadStream("1crn", MODE_READ_PARSE_BINARY);
//			textStream = loadStream("1crn", MODE_READ_PARSE_TEXT);
//			binaryStream = loadStream("1crn", MODE_READ_PARSE_BINARY);
//			textStream = loadStream("1crn", MODE_READ_PARSE_TEXT);
			binaryStream = loadStream(pdbId, MODE_READ_PARSE_BINARY | (mode & MODE_LOCAL));
			textStream = loadStream(pdbId, MODE_READ_PARSE_TEXT | (mode & MODE_LOCAL));
		}

		private InputStream loadStream(String pdbId, int mode) throws MalformedURLException, IOException {
			boolean isBinary = ((mode & MODE_READ_PARSE_BINARY) == MODE_READ_PARSE_BINARY);
			boolean testTransfer = ((mode & MODE_TEST_FILE_TRANSFER) == MODE_TEST_FILE_TRANSFER);
			String type = (isBinary ? "binary" : "text");
			long t0 = System.nanoTime(), t1 = System.nanoTime();
			ByteArrayInputStream is = getByteStreamFor(pdbId, mode);
			if (testTransfer) {
				t1 = reportTime(t1, type + " transfer from " + getURL(pdbId, isBinary));
				is = getByteStreamFor(pdbId, mode);
				t1 = reportTime(t1, type + " transfer from " + getURL(pdbId, isBinary));
				is = getByteStreamFor(pdbId, mode);
				t1 = reportTime(t1, type + " transfer from " + getURL(pdbId, isBinary));
				t0 = reportTime(t0, 3, type + " transfer from " + getURL(pdbId, isBinary));
			} else {
				t0 = reportTime(t0, type + " transfer from " + getURL(pdbId, isBinary) + " len=" + is.available());
			}
			return is;
		}

		@Override
		void setMode(int mode) {
			inputStream = ((mode & MODE_READ_PARSE_BINARY) == MODE_READ_PARSE_BINARY ? binaryStream : textStream);
		}

		protected void parse(int mode) throws IOException {
			boolean silent = ((mode & MODE_SILENT) == MODE_SILENT);
			boolean parseBinary = ((mode & MODE_READ_PARSE_BINARY) == MODE_READ_PARSE_BINARY);
			boolean getAllData = ((mode & MODE_OPTION_GET_ALL_DATA) == MODE_OPTION_GET_ALL_DATA);
			boolean process = ((mode & MODE_OPTION_PROCESS) == MODE_OPTION_PROCESS);
			long t0 = System.nanoTime();

			inputStream.reset();
			CifFileGeneric cifFile = CifIOGeneric.readFromInputStream(inputStream);
			if (!silent)
				t0 = reportTime(t0, "parseStream " + (parseBinary ? "BINARY " : "TEXT ") + this.getClass().getSimpleName());
			if (getAllData) {
				System.out.println("getting data");
			}
			if (process) {
				process(cifFile, mode);
			}
		}

	}
	
	/**
	 * Do not pre-load the file data; include transfer time from EBI for each parsing
	 * 
	 * @author hansonr
	 *
	 */
	protected static class TextParser extends Parser {
		
		protected String pdbId;

		TextParser(String pdbId) {
			this.pdbId = pdbId;
		}

		protected void parse(int mode) throws IOException {
			boolean silent = ((mode & MODE_SILENT) == MODE_SILENT);
			boolean parseBinary = ((mode & MODE_READ_PARSE_BINARY) == MODE_READ_PARSE_BINARY);
			boolean getAllData = ((mode & MODE_OPTION_GET_ALL_DATA) == MODE_OPTION_GET_ALL_DATA);
			boolean process = ((mode & MODE_OPTION_PROCESS) == MODE_OPTION_PROCESS);
			long t0 = System.nanoTime();
			CifFileGeneric cifFile = CifIOGeneric.readFromURL(getURL(pdbId, parseBinary));
			if (!silent)
				t0 = reportTime(t0, "parseStream " + (parseBinary ? "BINARY " : "TEXT ") + this.getClass().getSimpleName());
			if (getAllData) {
				System.out.println("getting data");
			}

			if (process) {
				process(cifFile, mode);
			}
		}

		@Override
		void setMode(int mode) {
			// n/a for TextParser
		}
	}

	protected static void process(CifFileGeneric cifFile, int mode) {
		// get first block of CIF
		boolean silent = ((mode & MODE_SILENT) == MODE_SILENT);
		boolean parseBinary = ((mode & MODE_READ_PARSE_BINARY) == MODE_READ_PARSE_BINARY);
		String type = (parseBinary ? "binary " : "text ");
		long t0 = System.nanoTime();
		BlockGeneric data = cifFile.getFirstBlock();

		// get category with name '_atom_site' from first block - access is type-safe,
		// all categories
		// are inferred from the CIF schema
		Category atomSite = data.getCategory("atom_site");
		List<String> cols = atomSite.getColumnNames();
		for(int i = 0, n = cols.size(); i < n; i++) {
			String name = cols.get(i);
			BaseColumn x = (BaseColumn) atomSite.getColumn(name);
			x.getUnmaskedData();
			System.out.print(type);
			System.out.println(name + " " + x.getRowCount());
		}
		
		FloatColumn cartnX = (FloatColumn) atomSite.getColumn("cartn_x");

		// obtain entry id
		String entryId = ((StrColumn)data.getCategory("entry").getColumn("id")).get(0);
		System.out.println(entryId);

		// calculate the average x-coordinate - #values() returns as DoubleStream as
		// defined in the
		// schema for column 'Cartn_x'
		OptionalDouble averageCartnX = cartnX.values().average();
		System.out.print(type);
		averageCartnX.ifPresent(System.out::println);

		// print the last residue sequence id - this time #values() returns an IntStream
		OptionalInt lastLabelSeqId = ((IntColumn)atomSite.getColumn("label_seq_id")).values().max();
		System.out.print(type);
		lastLabelSeqId.ifPresent(System.out::println);

		// print record type - or #values() may be text
		Optional<String> groupPdb = ((StrColumn)data.getCategory("atom_site")
				.getColumn("group_pdb")).values().findFirst();
		System.out.print(type);
		groupPdb.ifPresent(System.out::println);
		if (!silent)
			t0 = reportTime(t0, "parse " + (parseBinary ? "BINARY" : "TEXT"));
	}

	protected static ByteArrayInputStream getByteStreamFor(String pdbId, int mode)
			throws MalformedURLException, IOException {
		boolean isBinary = ((mode & MODE_READ_PARSE_BINARY) == MODE_READ_PARSE_BINARY);
		boolean isLocal = ((mode & MODE_LOCAL) == MODE_LOCAL);
		Object o;
		InputStream is = (isLocal ? new FileInputStream((File)
				(o = new File("c:/temp/" + pdbId + (isBinary ? ".b" : ".") + "cif")))
				: ((URL)(o = getURL(pdbId, isBinary))).openStream());
		System.out.println("Reading data from "+ o);
		return new ByteArrayInputStream(getStreamAsBytes(new BufferedInputStream(is)));
	}

	protected static URL getURL(String pdbId, boolean isBinary) throws MalformedURLException {
		return (isBinary ? 
				new URL("https://www.ebi.ac.uk/pdbe/coordinates/" + pdbId + "/full?encoding=bcif")
				: 
					new URL("https://www.ebi.ac.uk/pdbe/coordinates/" + pdbId + "/full?encoding=cif")
//				new URL("https://files.rcsb.org/download/" + pdbId + ".cif")
				);
	}


	protected static long reportTime(long t0, int n, String msg) {
		long now = System.nanoTime();
		System.out.println((now - t0)/n/1000000 + "\tniter=" + n + "\t" + msg);
		return now;
	}

	protected static long reportTime(long t0, String msg) {
		long now = System.nanoTime();
		System.out.println((now - t0)/1000000 + "\t" + msg);
		return now;
	}

	protected static long gcTime(long tgc) {
		long tg = System.nanoTime();
		System.gc();
		return tgc + System.nanoTime() - tg;
	}

	protected static byte[] getStreamAsBytes(BufferedInputStream bis) throws IOException {
		byte[] buf = new byte[1024];
		byte[] bytes = new byte[4096];
		int len = 0;
		int totalLen = 0;
		while ((len = bis.read(buf, 0, 1024)) > 0) {
			totalLen += len;
				if (totalLen >= bytes.length)
					bytes = Arrays.copyOf(bytes, totalLen * 2);
				System.arraycopy(buf, 0, bytes, totalLen - len, len);
		}
		bis.close();
		return Arrays.copyOf(bytes, totalLen);
	}

}
