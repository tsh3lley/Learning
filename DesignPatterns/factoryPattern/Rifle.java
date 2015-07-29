package factoryPattern;

public class Rifle implements Gun {
	private final int clipSize = 24;
	private int bullets = 0;
	
	public Rifle(){
		load();
	}
	
	@Override
	public void shoot() {
		System.out.println("7.62 NATO");
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
