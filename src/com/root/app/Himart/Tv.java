package com.root.app.Himart;

public class Tv extends Electronics {
	
	private int quality;
	private int size;
	
	public Tv() {
		this.setPrice(600);
		
		this.setBrand("LG");
		this.setQuality(8);
		this.setSize(80);
	}
	
		
		@Override
		public void info() {
			super.info();
			System.out.print(this.quality + "\t");
			System.out.print(this.size + "\n");
		}
	
	
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	
	
}
