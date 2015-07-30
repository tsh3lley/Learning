package abstractFactoryPattern;

public class TacticalBlack implements Color {

	@Override
	public void paint(Gun gun) {
		System.out.println("A " + gun.getName() + " painted flat black");
	}

}
