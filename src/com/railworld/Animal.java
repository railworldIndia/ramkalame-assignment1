package com.railworld;

public class Animal {
	
	public String categoryName;
	public String color;
	public String gender;
	public int legs;
	public int height;
	public String sound;
	public Animal() {
		
	};
	public Animal(String categoryName, String color, String gender, int legs, int height, String sound) {
		super();
		this.categoryName = categoryName;
		this.color = color;
		this.gender = gender;
		this.legs = legs;
		this.height = height;
		this.sound = sound;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
	public void sound() {
		System.out.println("The sound of "+ categoryName+" is: " +sound );
	}
	@Override
	public String toString() {
		return "Animal [categoryName=" + categoryName + ", color=" + color + ", gender=" + gender + ", legs=" + legs
				+ ", height=" + height + ", sound=" + sound + "]";
	}
	
	
	
	

}
