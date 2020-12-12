package com.polymorphismDemo;

public class Test {

	public static void main(String[] args) {
		SunFlower sf = new SunFlower();
		Hibiscus h = new Hibiscus();
		Flower f =new Flower();
		f.water("flower");
		sf.water("sunflower");
		h.water("hibiscus", "red");

	}

}
