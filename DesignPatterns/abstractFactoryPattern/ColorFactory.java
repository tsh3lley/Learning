package abstractFactoryPattern;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("CAMO")){
	         return new Camo();
	         
	      }else if(color.equalsIgnoreCase("BLACK")){
	         return new TacticalBlack();
	         
	      }else if(color.equalsIgnoreCase("ORANGE")){
	         return new HunterOrange();
	      }
		return null;
	}

	@Override
	Gun getGun(String shape) {
		return null;
	}
	
}
