package abstractFactoryPattern;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Gun getGun(String shape) ;
}
