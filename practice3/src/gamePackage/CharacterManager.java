package gamePackage;

import java.util.HashMap;

public class CharacterManager {

	private static final HashMap<Long, String> mCharacterNames = new HashMap<Long, String>();

	public static Character createCharacter(String name) {
		if (isNameDuplicated(name)) {
			System.out.printf("[CharacterManager] 생성실패%n");
			return null;
		}
		
		long guid =GUIDmanager.makeGUID(GUIDmanager.GUID_CHARACTER);
		mCharacterNames.put(guid,name);
		
		return new Character(name,guid);
	}

	public static boolean isNameDuplicated(String name) {
		if(mCharacterNames.containsValue(name)) {
			System.out.printf("[CharacterManager] %s: 중복된 이름입니다.%n", name);
			return true;
		}
		return false; 
	}

}
