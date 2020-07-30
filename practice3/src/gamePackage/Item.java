package gamePackage;

public class Item {
	private String mName;
	private int mItemCode;
	private int mItemCount;
	private long mGUID;
	
	public Item(String name, int itemCode, int itemCount, long guid){
		mName = name;
		mItemCode = itemCode;
		mItemCount = itemCount;
		mGUID = guid;
	}
	
	public String getName() { return mName; }
	public int getItemCode() { return mItemCode; }	
	public int getItemCount() {	return mItemCount; }
	public long getGUID() { return mGUID; }
	
	public void addItemCount(int count) { mItemCount++; }
	public void subItemCount(int count) { mItemCount--; }
	
}
