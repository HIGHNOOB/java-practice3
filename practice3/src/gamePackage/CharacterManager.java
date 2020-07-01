package gamePackage;

public class CharacterManager {
	
	public boolean createCharacter(String name) {
		if(isNameDuplicated(name)) {
			System.out.printf("�ߺ��� �̸��Դϴ�.");
			return false;
		}
		Character playerCharacter = new Character(name, makeGUID());
		System.out.printf("%s:�����Ϸ�", name);
		return true;
	}
	
	public boolean isNameDuplicated(String name) {
		//TODO �г��� �ߺ�Ȯ��
		return true;
	}
	
	public static long makeGUID() {
		//TODO ���ݹ���� ���ÿ� ������ GUID�� ��ĥ �� �ִ� ������ ����
		long GUID = System.currentTimeMillis()%1000000;
		GUID = (long)(GUID*Math.random());
		System.out.printf("GUID: %d ����%n", GUID);
		return GUID;
	}

}
