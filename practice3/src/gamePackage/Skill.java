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
			//TODO 스킬코드(mSkillCode)사용하는내용
			System.out.printf("%s을(를) 사용하였습니다.",mName);
		}
		else {
			System.out.printf("남은 쿨타임:%f",mCooldown);
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
