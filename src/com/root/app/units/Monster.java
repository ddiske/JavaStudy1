package com.root.app.units;

public class Monster {
	
	private String name;
	private int level;
	private int hp;
	private int mp;
	private int power;
	private int exp;
	
	public Monster () {
		this.name = "들쥐";
		this.level = 1;
		this.hp = 10;		
		this.mp = 0;		
		this.power = 1;		
		this.exp = 1;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
	

}
