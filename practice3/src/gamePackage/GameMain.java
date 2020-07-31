package gamePackage;

import java.lang.*;

public class GameMain {

	public static void main(String[] args) {
		
		Character jw =	CharacterManager.createCharacter("wodhks");
		Character jw2 =	CharacterManager.createCharacter("wodhks"); //name duplicated
		Character jw3 =	CharacterManager.createCharacter("wodhks3");
		
		//System.out.printf("guid: %d%n", jw.getGUID());
		//System.out.printf("guid: %d%n", jw2.getGUID()); //name duplicated
		
		jw.showStats();
		jw.showSkills();
		jw.showItems();
		
	} 
}