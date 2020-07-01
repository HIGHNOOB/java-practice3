package gamePackage;

public class CharacterManager {
	
	public boolean createCharacter(String name) {
		if(isNameDuplicated(name)) {
			System.out.printf("중복된 이름입니다.");
			return false;
		}
		Character playerCharacter = new Character(name, makeGUID());
		System.out.printf("%s:생성완료", name);
		return true;
	}
	
	public boolean isNameDuplicated(String name) {
		//TODO 닉네임 중복확인
		return true;
	}
	
	public static long makeGUID() {
		//TODO 지금방식은 동시에 생성시 GUID가 겹칠 수 있는 문제가 있음
		long GUID = System.currentTimeMillis()%1000000;
		GUID = (long)(GUID*Math.random());
		System.out.printf("GUID: %d 생성%n", GUID);
		return GUID;
	}

}
