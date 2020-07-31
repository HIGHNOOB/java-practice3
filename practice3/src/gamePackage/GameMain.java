package gamePackage;

import java.lang.*;

public class GameMain {

	public static void main(String[] args) {
		
		Character jw =	CharacterManager.createCharacter("Àç¿Ï");
		Character jw2 =	CharacterManager.createCharacter("wodhks");
		Character jw3 =	CharacterManager.createCharacter("wodhks");//name duplicated
		Character jw4 =	CharacterManager.createCharacter("wodhks2");
		Character jw5 =	CharacterManager.createCharacter("wodhks3");
		
		jw.showStats();
		jw.showSkills();
		jw.showItems();
		
	} 
}