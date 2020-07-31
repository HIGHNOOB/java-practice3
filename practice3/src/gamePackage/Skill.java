package gamePackage;

public class Skill {

	private String mName;
	private int mSkillCode;
	private long mGUID;
	// TODO 쿨타임, 소모값등

	Skill(String name, int skillCode, long guid) {
		mName = name;
		mSkillCode = skillCode;
		mGUID = guid;
	}

	void use() {
		// TODO 스킬쓰는내용(쿨타임 소모값 타켓 등)
		System.out.printf("%s!", mName);
	}

	String getSkillName() {	return mName; }

	int getSkillCode() { return mSkillCode; }

	long getSkillGUID() { return mGUID; }

}
