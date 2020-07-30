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
		
		System.out.printf("[Character] >%s< 생성완료%n", name);
		
		initItems();
		System.out.printf("[Character]기본 아이템 지급 완료%n");
	}
	
	public void initItems() {
		addItem(ItemDef.DORANS_BLADE,1);
		addItem(ItemDef.CLOTH_ARMOR,1);
		addItem(ItemDef.LEATHER_SHOSE,1);
		addItem(ItemDef.HEALTH_POTION,3);
	}
	
	public boolean addItem(int itemCode, int itemCount) {
		Item item = ItemManager.getItemByItemCode(itemCode, itemCount);
		if(item == null) {
			return false;
		}
		mItems.add(item);
		return true;
	}
	
	public boolean removeItem(long guid) {
		//TODO GUID를이용하여 아이템 삭제
		return true;
	}
	
	public String getName() { return mName; }	
	public int getLevel() { return mLevel; }	
	public ArrayList<Item> getItems() { return mItems; }	
	public ArrayList<Skill> getSkills() { return mSkills; }
	public long getGUID() { return mGUID; }
}
