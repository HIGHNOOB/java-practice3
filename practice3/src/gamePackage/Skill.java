package gamePackage;

public class Skill {
	
	private String mName;
	private int mSkillCode;
	private double mCooldown;
	
	Skill(String name, int skillCode){
		mName = name;
		mSkillCode = skillCode;
		mCooldown = 0;
	}
	
	void use() {
		if(isUsable(mCooldown)) {
			//TODO ��ų�ڵ�(mSkillCode)����ϴ³���
			System.out.printf("%s��(��) ����Ͽ����ϴ�.",mName);
		}
		else {
			System.out.printf("���� ��Ÿ��:%f",mCooldown);
		}
			
	}
	
	boolean isUsable(double cooldown) {
		if(cooldown<=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
