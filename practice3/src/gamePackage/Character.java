package gamePackage;

import java.util.ArrayList;

public class Character {
	
	private String mName;
	private int mLevel;	
	private ArrayList<Item> mItems;
	private ArrayList<Skill> mSkills;
	private long mGUID;
	
	Character(String mName, long guid){
		this.mName = mName;
		this.mLevel = 1;
		this.mItems = new ArrayList<Item>();
		this.mSkills = new ArrayList<Skill>();
		this.mGUID = guid;
		System.out.printf("%s 생성완료", mName);
	}
	
	String getmName() {
		return this.mName;
	}
	
	int getmLevel() {
		return this.mLevel;
	}
	
	ArrayList<Item> getmItems() {
		return this.mItems;
	}
	
	ArrayList<Skill> getmSkills() {
		return this.mSkills;
	}
	
	public boolean getItem(Item item) {
		//TODO
		return true;
	}
	
	public boolean removeItem(long guid) {
		//TODO
		return true;
	}
	
	//TODO 레벨업 ,돈

}
