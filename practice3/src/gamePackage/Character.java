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
	}
	public void showStats() {
		System.out.printf("┌─── %s's stats ────────%n",mName);
		System.out.printf("│ level: %d%n", mLevel);
		System.out.printf("└───────────────────────────%n");
	}
	public void showSkills() {
		
	}
	public void showItems() {
		System.out.printf("┌─── %s's Item List ───%n",mName);
		for(Item item : mItems){
			if(item.getItemCount()>1) {
				System.out.printf("│ %s * %d", item.getName(), item.getItemCount());
			}
			else {
				System.out.printf("│ %s", item.getName());
			}
			
			System.out.printf("%n");
		}
		System.out.printf("└───────────────────────────%n");
	}
	
	public boolean addItem(int itemCode, int itemCount) {
		ItemManager itemManager = new ItemManager();
		//TODO 이렇게하면 itemManager가 계속 생성되어 성능이 떨어질수 있나?
		Item item = itemManager.getItemByItemCode(itemCode, itemCount);
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
