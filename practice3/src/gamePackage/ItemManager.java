package gamePackage;

import java.util.HashMap;

public class ItemManager {

	private static HashMap<Integer, String> mItemHashMap = new HashMap<Integer, String>();
	
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
		
		//TODO ↑↑↑↑이렇게하면 아이템이 추가될 때마다 코드를 두번(ItemDef에서 한번 이곳에서 한번) 입력하는데 다른 방법이?
		//TODO 마찬가지로 여러 언어를 지원하려면 어떻게?		
		
	}
	
	public static Item getItemByItemCode(int itemCode, int itemCount) {
	String itemName = mItemHashMap.get(itemCode);
	if (itemName == null) {
		System.out.printf("[ItemManager]코드와 일치하는 아이템을 찾을 수 없음\n");
		return null;
	}
	long itemGUID = GUIDmanager.makeGUID(GUIDmanager.GUID_ITEM);
	
	return new Item(itemName,itemCode,itemCount,itemGUID);
	}

}
