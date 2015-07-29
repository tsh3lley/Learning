package factoryPattern;

public class Shotgun implements Gun {
	private final int clipSize = 5;
	private int bullets = 0;
	
	public Shotgun(){
		load();
	}
	
	@Override
	public void shoot() {
		System.out.println("00 buck shot");
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
