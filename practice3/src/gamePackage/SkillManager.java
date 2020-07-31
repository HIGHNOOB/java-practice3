package gamePackage;

import java.util.HashMap;

public class SkillManager {

	private HashMap<Integer, String> mSkillHashMap = new HashMap<Integer, String>();
	
	public SkillManager() {
		initSkills();
	}
	
	public void initSkills(){
		mSkillHashMap.put(SkillDef.POWER_STRIKE, "power strike");
		mSkillHashMap.put(SkillDef.HYPER_BODY, "hyper body");
		mSkillHashMap.put(SkillDef.MAGIC_CLAW, "magic claw");
		mSkillHashMap.put(SkillDef.MAGIC_GUARD, "magic guard");
		//TODO ItemManager�� �ִ� �̽��� ����
	}
	
	public Skill getSkillByCode(int skillCode) {
	String skillName = mSkillHashMap.get(skillCode);
	if (skillName == null) {
		System.out.printf("[SkillManager]�ڵ�� ��ġ�ϴ� ��ų�� ã�� �� ����\n");
		return null;
	}
	long skillGUID = GUIDmanager.makeGUID(GUIDmanager.GUID_SKILL);
	
	return new Skill(skillName,skillCode,skillGUID);
	}
	
}