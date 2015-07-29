package factoryPattern;

public class GunFactoryDemo {

	public static void main(String[] args) {
		GunFactory GunFactory = new GunFactory();
	    Gun gun1 = GunFactory.getGun("rifle");
	    gun1.shoot();
	    Gun gun2 = GunFactory.getGun("pistol");
	    gun2.shoot();
	    Gun gun3 = GunFactory.getGun("flaregun");
	    gun3.shoot();
	    Gun gun4 = GunFactory.getGun("shotgun");
	    gun4.shoot();
	   }

}
