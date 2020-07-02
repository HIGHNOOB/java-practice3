package gamePackage;

import java.lang.*;

public class GameMain {

	public static void main(String[] args) {
		
		Character jw =	CharacterManager.createCharacter("wodhks");
		Character jw2 =	CharacterManager.createCharacter("wodhks");
		Character jw3 =	CharacterManager.createCharacter("wodhks3");
		System.out.printf("guid: %d%n", jw.getGUID());
		//System.out.printf("guid: %d%n", jw2.getGUID());
		System.out.printf("guid: %d%n", jw3.getGUID());
	}
}
