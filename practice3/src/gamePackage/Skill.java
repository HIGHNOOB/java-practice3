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

	String getName() {	return mName; }

	int getCode() { return mSkillCode; }

	long getGUID() { return mGUID; }

}
