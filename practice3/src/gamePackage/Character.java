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
		System.out.printf("[Character]%s 생성완료%n", name);
	}
	
	public String getName() { return mName; }	
	public int getLevel() { return mLevel; }	
	public ArrayList<Item> getItems() { return mItems; }	
	public ArrayList<Skill> getSkills() { return mSkills; }
	public long getGUID() { return mGUID; }
	
	public boolean getItem(Item item) {
		//TODO
		return true;
	}
	
	public boolean removeItem(long guid) {
		//TODO
		return true;
	}
	
	//TODO 레벨업 ,돈, hp, mp, 공격력?

}
