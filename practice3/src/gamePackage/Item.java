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
			System.out.printf("%s을(를) 사용하였습니다.",mName);
		}
		else {
			System.out.printf("사용가능한 아이템이 아님");
		}
			
	}
	
	boolean isUsable(int itemCode) {
		//TODO:사용가능한 아이템인지 체크
		return true;
	}
	
}
