package gamePackage;

public class Skill {

	private String mName;
	private int mSkillCode;
	private long mGUID;
	// TODO ��Ÿ��, �Ҹ𰪵�

	Skill(String name, int skillCode, long guid) {
		mName = name;
		mSkillCode = skillCode;
		mGUID = guid;
	}

	void use() {
		// TODO ��ų���³���(��Ÿ�� �Ҹ� Ÿ�� ��)
		System.out.printf("%s!", mName);
	}

	String getSkillName() {	return mName; }

	int getSkillCode() { return mSkillCode; }

	long getSkillGUID() { return mGUID; }

}
