package gamePackage;

public class Item {
	private String mName;
	private int mItemCode;
	private int mItemCount;
	private long mGUID;
	
	Item(String name, int itemCode, int itemCount, long guid){
		mName = name;
		mItemCode = itemCode;
		mItemCount = itemCount;
		mGUID = guid;
	}
	
	int getItemCode() {
		return mItemCode;
	}
	
	void use() {
		if(isUsable(mItemCode)) {
			mItemCount -=1;
			System.out.printf("%s��(��) ����Ͽ����ϴ�.",mName);
		}
		else {
			System.out.printf("��밡���� �������� �ƴ�");
		}
			
	}
	
	boolean isUsable(int itemCode) {
		//TODO:��밡���� ���������� üũ
		return true;
	}
	
}
