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
		
		//TODO �����ؾ� �ϴ� �̽�
		//������ �ڵ�� ������ �̸��� 1:1��Ī�Ǳ� ������ hashMap�� ����Ͽ� ���� ��Ī��
		//�̷μ� ������ ��ü�� ������ �� ������ �ڵ�� ���������� ���� �� ����
		//�׷��� �̷��� ������ ��� �������� �߰��� ������ �ڵ带 �ι�(ItemDef���� �ι� �۾��ؾ� ��) �Է��ؾ� �ϴ� ���� ����.
	}
	
	public Item getItemByItemCode(int itemCode, int itemCount) {
	String itemName = mItemHashMap.get(itemCode);
	if (itemName == null) {
		System.out.printf("[ItemManager]�ڵ�� ��ġ�ϴ� �������� ã�� �� ����\n");
		return null;
	}
	long itemGUID = GUIDmanager.makeGUID(GUIDmanager.GUID_ITEM);
	
	return new Item(itemName,itemCode,itemCount,itemGUID);
	}

}
