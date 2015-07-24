import java.awt.Point;
import java.util.ArrayList;


public class OgrePath {
//	 @@........
//	 @@O.......
//	 .....O.O..
//	 ..........
//	 ..O.O.....
//	 ..O....O.O
//	 .O........
//	 ..........
//	 .....OO...
//	 .........$
    static int[][] maze = { 
    		{2,2,0,0,0,0,0,0,0,0},
            {2,2,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,0,1,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,0,0,0,0,0,0},
            {0,0,1,0,0,0,0,1,0,1},
            {0,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,0,0,0},
            {0,0,0,0,0,0,0,0,0,3}};
    static ArrayList<Point> sink = new ArrayList<Point>();
	static ArrayList<Point> ogre = new ArrayList<Point>();
	static ArrayList<Point> blank = new ArrayList<Point>();
	static ArrayList<Point> pivot = new ArrayList<Point>();
	static Point goal = new Point();
	static Point topLeft;
	static Point topRight;
	static Point bottomLeft;
	static Point bottomRight;
    
	public static void main(String[] args) {
		OgrePath OP = new OgrePath();
		points(maze, OP);
		path(OP);
		

	}
	
	public static void points(int[][] maze, OgrePath OP){
		Point o = new Point();
		Point s = new Point();
		Point b = new Point();
		for (int i=0;i<maze.length;i++){
			for (int j=0;j<maze[i].length;j++){
				if (maze[i][j] == 3){
					OP.goal.x = j; 
					OP.goal.y = i;
				} else if (maze[i][j] == 2){
					o.x = j;
					o.y = i;
					ogre.add(o);
				} else if (maze[i][j] == 1){
					s.x = j;
					s.y = i;
					sink.add(s);
				} else if (maze[i][j] == 0){
					b.x = j;
					b.y = i;
					blank.add(b);
				}
			}
		}
		
		topLeft = ogre.get(0);
		topRight= ogre.get(1);
		bottomLeft= ogre.get(2);
		bottomRight= ogre.get(3);
	}
	
	public static void path(OgrePath OP){
		System.out.println(topLeft.x);
		System.out.println(bottomLeft.x);
		System.out.println(ogre.get(0).x);
		System.out.println(ogre.get(0).y);
	}
}
