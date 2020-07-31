package gamePackage;

import java.util.ArrayList;

public class Character {
	
	private String mName;
	private int mLevel;	
	private ArrayList<Item> mItems;
	private ArrayList<Skill> mSkills;
	private long mGUID;
	
	Character(String name, long guid){
		mName = name;
		mLevel = 1;
		mItems = new ArrayList<Item>();
		mSkills = new ArrayList<Skill>();
		mGUID = guid;
		
		System.out.printf("[Character] >%s< �����Ϸ�%n", name);
		
		initItems();
		System.out.printf("[Character]�⺻ ������ ���� �Ϸ�%n");
	}
	
	public void initItems() {
		addItem(ItemDef.DORANS_BLADE,1);
		addItem(ItemDef.CLOTH_ARMOR,1);
		addItem(ItemDef.LEATHER_SHOSE,1);
		addItem(ItemDef.HEALTH_POTION,3);
	}
	
	public boolean addItem(int itemCode, int itemCount) {
		ItemManager itemManager = new ItemManager();
		//TODO �̷����ϸ� itemManager�� ��� �����Ǿ� ������ �������� �ֳ�?
		Item item = itemManager.getItemByItemCode(itemCode, itemCount);
		if(item == null) {
			return false;
		}
		mItems.add(item);
		return true;
	}
	
	public boolean removeItem(long guid) {
		//TODO GUID���̿��Ͽ� ������ ����
		return true;
	}
	
	public String getName() { return mName; }	
	public int getLevel() { return mLevel; }	
	public ArrayList<Item> getItems() { return mItems; }	
	public ArrayList<Skill> getSkills() { return mSkills; }
	public long getGUID() { return mGUID; }
}
