package com.root.app.weapons;

public class Sword {
	
	private String name;
	private int damage;
	private int range;
	
	
	public Sword() {
		this.name = "죽도";
		this.damage = 1;
		this.range = 1;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(damage);
		System.out.println(range);
		System.out.println("======");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}
	

}
