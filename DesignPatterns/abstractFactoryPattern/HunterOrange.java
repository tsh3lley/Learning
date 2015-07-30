package abstractFactoryPattern;

public class HunterOrange implements Color {

	@Override
	public void paint(Gun gun) {
		System.out.println("A " + gun.getName() + " painted with bright orange");
	}

}
