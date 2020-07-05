package gamePackage;

import java.lang.*;

public class GameMain {

	public static void main(String[] args) {
		
		//Character jw =	CharacterManager.createCharacter("wodhks");
		//Character jw2 =	CharacterManager.createCharacter("wodhks"); //name duplicated
		Character jw3 =	CharacterManager.createCharacter("wodhks3");
		//System.out.printf("guid: %d%n", jw.getGUID());
		//System.out.printf("guid: %d%n", jw2.getGUID()); //name duplicated
		System.out.printf("name: %s%n", jw3.getName());
		System.out.printf("level: %d%n", jw3.getLevel());
		System.out.printf("GUID: %d%n", jw3.getGUID());	
		
	} 
}
