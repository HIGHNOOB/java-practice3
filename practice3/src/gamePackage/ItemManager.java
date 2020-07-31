package gamePackage;

import java.util.HashMap;

public class ItemManager {

	private HashMap<Integer, String> mItemHashMap = new HashMap<Integer, String>();
	
	public ItemManager() {
		initItems();
	}
	
	public void initItems(){
		mItemHashMap.put(ItemDef.LONG_SWORD, "long sword");
		mItemHashMap.put(ItemDef.BF_SWORD, "BF sword");
		mItemHashMap.put(ItemDef.DORANS_RING, "dorans ring");
		mItemHashMap.put(ItemDef.DORANS_BLADE, "dorans blade");
		mItemHashMap.put(ItemDef.DORANS_SHIELD, "dorans shield");
		mItemHashMap.put(ItemDef.CLOTH_ARMOR, "cloth armor");
		mItemHashMap.put(ItemDef.MAGICIAN_HAT, "magician hat");
		mItemHashMap.put(ItemDef.LEATHER_SHOSE, "leather shose");
		mItemHashMap.put(ItemDef.HEALTH_POTION, "health potion");
		mItemHashMap.put(ItemDef.MANA_POTION, "mana potion");
		mItemHashMap.put(ItemDef.VISION_WARD, "vision ward");
		
		//TODO 수정해야 하는 이슈
		//아이템 코드와 아이템 이름은 1:1매칭되기 때문에 hashMap을 사용하여 둘을 매칭함
		//이로서 아이템 객체를 생성할 때 아이템 코드와 갯수만으로 만들 수 있음
		//그러나 이렇게 구성할 경우 아이템이 추가될 때마다 코드를 두번(ItemDef에서 두번 작업해야 함) 입력해야 하는 점이 있음.
	}
	
	public Item getItemByItemCode(int itemCode, int itemCount) {
	String itemName = mItemHashMap.get(itemCode);
	if (itemName == null) {
		System.out.printf("[ItemManager]코드와 일치하는 아이템을 찾을 수 없음\n");
		return null;
	}
	long itemGUID = GUIDmanager.makeGUID(GUIDmanager.GUID_ITEM);
	
	return new Item(itemName,itemCode,itemCount,itemGUID);
	}

}
