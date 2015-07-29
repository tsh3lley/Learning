package factoryPattern;

public class FlareGun implements Gun {
	private final int clipSize = 1;
	private int bullets = 0;
	
	public FlareGun(){
		load();
	}
	
	@Override
	public void shoot() {
		System.out.println("Bright red flare");
		bullets = bullets - 1;
		System.out.println(bullets + " shots left");
	}

	@Override
	public void reload() {
		bullets = clipSize;
	}

	@Override
	public void load() {
		bullets = clipSize;
	}

}
