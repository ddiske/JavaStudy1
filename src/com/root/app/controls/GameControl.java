package com.root.app.controls;

import java.util.Scanner;

import com.root.app.units.Character;

import com.root.app.weapons.Sword;

public class GameControl {
	
	private Scanner sc;
	private GameStage gs;
	public GameControl () {
		this.sc = new Scanner(System.in);
		gs = new GameStage();
	}
	
	public void start() {
		Character character = new Character();
		System.out.println("캐릭터의 이름을 입력하세요");
		character.setName(sc.next());
		
		character.info();
		
		Sword sword = new Sword();
		
		character.setSword(sword);
		
		gs.fight(character);
		
		
		
	}

}
