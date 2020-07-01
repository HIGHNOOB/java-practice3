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
		System.out.printf("%s �����Ϸ�", name);
	}
	
	String getmName() {
		return mName;
	}
	
	int getmLevel() {
		return mLevel;
	}
	
	ArrayList<Item> getmItems() {
		return mItems;
	}
	
	ArrayList<Skill> getmSkills() {
		return mSkills;
	}
	
	public boolean getItem(Item item) {
		//TODO
		return true;
	}
	
	public boolean removeItem(long guid) {
		//TODO
		return true;
	}
	
	//TODO ������ ,��, hp, mp, ���ݷ�?

}
