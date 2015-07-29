package factoryPattern;

public class Pistol implements Gun {
	private final int clipSize = 13;
	private int bullets = 0;
	
	public Pistol(){
		load();
	}
	
	@Override
	public void shoot() {
		System.out.println("9mm subsonic");
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
