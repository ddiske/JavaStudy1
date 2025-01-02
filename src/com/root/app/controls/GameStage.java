package com.root.app.controls;

import java.util.Random;

import com.root.app.units.Character;
import com.root.app.units.Monster;

public class GameStage {
	
	private Random random;
	
	public GameStage() {
		random = new Random();
	}
	
	public void fight(Character character) {
		
		int count = random.nextInt(3)+1;
		Monster [] monster = new Monster[count];
		
		for(int i = 0; i < monster.length; i++) {
			if(i == count) {
				monster[i] = new Monster();
			}
			
		}
		
		this.attack(character, monster);
		
	}
	
	private void attack(Character character, Monster [] monsters) {
		
//		Monster monster = new Monster();
//		int ch = character.getHp();
//		int ma = monsters.length * monster.getPower();
//		int ca = character.getPower() + character.getPet().getPower() + character.getSword().getDamage();
//		int mh = monster.getHp();
		
		for(int i = 0; i < monsters.length; i++) {
			int d = monsters[i].getPower();
			d = random.nextInt(d);
			character.setHp(character.getHp()-d);
			
			
		}
		
		
	}

}
