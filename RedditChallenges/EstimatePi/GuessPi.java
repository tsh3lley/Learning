package EstimatePi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GuessPi {

	public static void main(String[] args) throws IOException {
		String circle1 = "C:/Users/Thomas/workspace/StonePile/src/EstimatePi/image1.png";
		String circle2 = "C:/Users/Thomas/workspace/StonePile/src/EstimatePi/image2.png";
		//TODO wont work on images with multiple circles
		//String circle3 = "C:/Users/Thomas/workspace/StonePile/src/EstimatePi/image3.png";
		System.out.println(findPi(circle1));
		System.out.println(findPi(circle2));
		//System.out.println(findPi(circle3));
	}
	
	public static double findPi(String filePath) throws IOException {
	    BufferedImage image = ImageIO.read(new File(filePath));
	    double rSqrd = Math.pow(findDiameter(image)/2,2);
	    double A = findArea(image);
	    return A/rSqrd;
	}
	
	public static int findArea(BufferedImage image){
		int pixels = 0;
		for (int i=0;i<image.getHeight();i++){
			for (int j=0;j<image.getWidth();j++){
				if (image.getRGB(j, i) != -1){
					pixels++;
				}
			}
		}
		return pixels;
	}
	
	public static int findDiameter(BufferedImage image){
		int line = 0;
		int bigLine = 0;
		for (int i=0;i<image.getHeight();i++){
			for (int j=0;j<image.getWidth();j++){
				if (image.getRGB(j, i) != -1){
					line++;
				}
			}
			if (line>bigLine){
				bigLine = line;
			}
			line = 0;
		}
		return bigLine;
	}

}
