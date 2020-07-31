package gamePackage;

import java.util.HashMap;

public class CharacterManager {

	private static final HashMap<Long, String> mCharacterNames = new HashMap<Long, String>();

	public static Character createCharacter(String name) {
		if (isNameDuplicated(name)) {
			System.out.printf("[CharacterManager] ��������%n");
			return null;
		}
		
		long guid =GUIDmanager.makeGUID(GUIDmanager.GUID_CHARACTER);
		mCharacterNames.put(guid,name);
		
		Character character = new Character(name,guid);
		System.out.printf("[CharacterManager] >%s< �����Ϸ�%n", character.getName());
		
		initCharacterItems(character);
		System.out.printf("[CharacterManager] >%s< �⺻ ������ ���� �Ϸ�%n", character.getName());
		
		initCharacterSkills(character);
		System.out.printf("[CharacterManager] >%s< �⺻ ��ų ���� �Ϸ�%n", character.getName());
		return character;
	}

	public static boolean isNameDuplicated(String name) {
		if(mCharacterNames.containsValue(name)) {
			System.out.printf("[CharacterManager] %s: �ߺ��� �̸��Դϴ�.%n", name);
			return true;
		}
		return false; 
	}
	boolean giveItem(Character character, int itemCode, int count) {
		character.addItem(itemCode, count);
		return true;
	}
	
	public static void initCharacterItems(Character character) {
		character.addItem(ItemDef.DORANS_BLADE,1);
		character.addItem(ItemDef.CLOTH_ARMOR,1);
		character.addItem(ItemDef.LEATHER_SHOSE,1);
		character.addItem(ItemDef.HEALTH_POTION,3);
	}
	
	public static void initCharacterSkills(Character character) {
		//TODO ���� ��ų�� ��� �ϴ��� �Ǵ�
		character.addSkill(SkillDef.HYPER_BODY);
		character.addSkill(SkillDef.POWER_STRIKE);
	}
}