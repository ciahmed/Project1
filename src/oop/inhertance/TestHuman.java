package oop.inhertance;

public class TestHuman {	
	public static void main(String[] args) {
		
		Father father = new Father();
		father.eyesColor();
		father.athetic();
		father.rich();
		System.out.println("--------------------------------------");
		Son son = new Son();
		son.eyesColor();
		son.athetic();
		son.rich();
		son.communication();
		
		//hierarchical inheritance
		GrandFather grandFather = new GrandFather();
		grandFather.communication();
		Bird bird = new Bird();
		bird.communication();
		
		
		
		
	}
}
