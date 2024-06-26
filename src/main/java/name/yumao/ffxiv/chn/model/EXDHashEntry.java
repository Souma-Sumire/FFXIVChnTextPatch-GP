package name.yumao.ffxiv.chn.model;

public class EXDHashEntry {
	private int index;
	
	private byte[] data;
	
	public EXDHashEntry(int index, byte[] data) {
		this.index = index;
		this.data = data;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public byte[] getData() {
		return this.data;
	}
	
	public void setData(byte[] data) {
		this.data = data;
	}
}
