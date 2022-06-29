import java.io.*;

public class InventoryItemFile {

	private final int RECORD_SIZE = 44;
	private final int MAX_CHARS = 20;
	private RandomAccessFile r;


	public InventoryItemFile(String n) throws FileNotFoundException {
		r = new RandomAccessFile(n, "rw");
	}


	public void manageRecord(int i) {
		try	{
			r.seek((i - 1) * RECORD_SIZE);
		} catch (Exception e) {
			System.out.print("Error: Record " + i + " does not exist!");
		}
	}


	public int numberOfRecords() throws IOException {
		return (int)(r.length() / RECORD_SIZE);
	}


	public InventoryItem readItem() throws IOException {
		char[] g = new char[MAX_CHARS];
		for (int i = 0; i < MAX_CHARS; i++)
			g[i] = r.readChar();
		String e = new String(g);	//new
		return new InventoryItem(e.trim(), r.readInt());
	}


	public void addItem(InventoryItem s) throws IOException {
		String g = s.getDescription();
		if (g.length() > MAX_CHARS) {
			for (int i = 0; i < MAX_CHARS; i++)
				r.writeChar(g.charAt(i));
		} else {
			r.writeChars(g);	//new
			for (int i = 0; i < (MAX_CHARS - g.length()); i++)
				r.writeChar(' ');
		}
		r.writeInt(s.getUnits());
	}


	public void close() throws IOException {
		r.close();
	}
}


