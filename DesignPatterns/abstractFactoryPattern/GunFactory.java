package abstractFactoryPattern;

public class GunFactory extends AbstractFactory {
	 //use getShape method to get object of type shape 
	   public Gun getGun(String type){
	      if(type == null){
	         return null;
	      }		
	      if(type.equalsIgnoreCase("RIFLE")){
	         return new Rifle();
	         
	      } else if(type.equalsIgnoreCase("PISTOL")){
	         return new Pistol();
	         
	      } else if(type.equalsIgnoreCase("SHOTGUN")){
	         return new Shotgun();
	         
	      } else if(type.equalsIgnoreCase("FLAREGUN")){
		     return new FlareGun();
		  }
	      return null;
	   }

	@Override
	Color getColor(String color) {
		return null;
	}
}
