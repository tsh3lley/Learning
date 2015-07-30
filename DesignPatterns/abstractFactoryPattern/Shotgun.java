package abstractFactoryPattern;

public class Shotgun implements Gun {
	private final int clipSize = 5;
	private int bullets = 0;
	private String name = "Shotgun";
	
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

	@Override
	public String getName() {
		return name;
	}

}
