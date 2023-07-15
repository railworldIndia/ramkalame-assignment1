package com.railworld;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Animal animal = new Animal();
		
		//getting details of animal methods and variables using Getter and Setter
		
		System.out.println("Enter the name of the animal : ");
		animal.setCategoryName(s.next());
		System.out.println("Enter the color of the animal : ");
		animal.setColor(s.next());
		System.out.println("Enter the gender of the animal : ");
		animal.setGender(s.next());
		System.out.println("Enter the height of the animal : ");
		animal.setHeight(s.nextInt());
		System.out.println("Enter the number of legs of the animal : ");
		animal.setLegs(s.nextInt());
		System.out.println("Enter the sound of the animal : ");
		animal.setSound(s.next());
		
		System.out.println("Name of the animal is: "+animal.getCategoryName());
		System.out.println("Color of the "+animal.getCategoryName() +" is: "+ animal.getColor());
		System.out.println("Gender of the "+animal.getCategoryName() +" is: "+animal.getGender());
		System.out.println("Height of the "+animal.getCategoryName() +" is: "+animal.getHeight());
		System.out.println("Number of legs of the "+animal.getCategoryName() +" is: "+animal.getLegs());
		
		animal.sound();
		

	}

}
