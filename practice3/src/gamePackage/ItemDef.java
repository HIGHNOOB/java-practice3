package gamePackage;

import java.util.HashMap;

public class ItemDef {
	public static final int LONG_SWORD = 1001;
	public static final int BF_SWORD = 1002;
	public static final int DORANS_RING = 1003;
	public static final int DORANS_BLADE = 1004;
	
	public static final int DORANS_SHIELD = 2001;
	public static final int CLOTH_ARMOR = 2002;
	public static final int MAGICIAN_HAT = 2003;
	public static final int LEATHER_SHOSE = 2004;
	
	public static final int HEALTH_POTION = 3001;
	public static final int MANA_POTION = 3002;
	public static final int VISION_WARD = 3003;

	
	/* TODO 아이템 클래스에서
	 * 아이템코드와 아이템이름은 어차피 같은 것이다 이것을 통합하는것이 좋을것같음
	 *그것을 통합하기 위한 방식으로 hashMap을 사용해 보려고 하였으나 일단보류
	 *or itemManager에서 처리할 수 있을듯
	HashMap<Integer, String> mItemMap = new HashMap<Integer, String>();
	
	void initItem() {
		mItemMap.put(LONG_SWORD, "long");
	}
	*/
}
