package abstractFactoryPattern;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
	      AbstractFactory GunFactory = FactoryProducer.getFactory("GUN");
	      Gun shotgun = GunFactory.getGun("SHOTGUN");
	      Gun pistol = GunFactory.getGun("PISTOL");
	      Gun rifle = GunFactory.getGun("RIFLE");
	      Gun flaregun = GunFactory.getGun("FLAREGUN");
	      
	      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
	      Color camo = colorFactory.getColor("CAMO");
	      Color orange = colorFactory.getColor("ORANGE");
	      Color black = colorFactory.getColor("BLACK");
	      
	      camo.paint(shotgun);
	      shotgun.shoot();
	    
	      orange.paint(flaregun);
	      flaregun.shoot();
	      
	      black.paint(rifle);
	      rifle.shoot();
	      
	      black.paint(pistol);
	      pistol.shoot();
	     
	   }
}
