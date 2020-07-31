package gamePackage;

import java.lang.*;

public class GameMain {

	public static void main(String[] args) {
		
		Character jw =	CharacterManager.createCharacter("wodhks");
		Character jw2 =	CharacterManager.createCharacter("wodhks2");
		Character jw3 =	CharacterManager.createCharacter("wodhks2");//name duplicated
		Character jw4 =	CharacterManager.createCharacter("wodhks3");
		Character jw5 =	CharacterManager.createCharacter("wodhks4");
		
		jw.showStats();
		jw.showSkills();
		jw.showItems();
		
	} 
}