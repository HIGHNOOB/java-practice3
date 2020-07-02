package gamePackage;

import java.util.HashMap;

public class CharacterManager {

	private static HashMap<Long, String> mCharacterNames;

	public static Character createCharacter(String name) {
		if (isNameDuplicated(name)) {
			System.out.printf("[캐릭터매니저] 생성실패");
			return null;
		}

		Object nameObj = mCharacterNames.get(name);
		
		long guid =GUIDmanager.makeGUID(GUIDmanager.GUID_CHARACTER);
		System.out.printf("[CharacterManager] %s:생성완료%n", name);
		
		
		Character playerCharacter =new Character(name, guid);

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
