package abstractFactoryPattern;

import abstractFactoryPattern.Color;

public class Camo implements Color {

	@Override
	public void paint(Gun gun) {
		System.out.println("A " + gun.getName() + " painted with a Camouflage pattern");
	}

}
