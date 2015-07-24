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
    static Point goal = new Point();
    static Point temp = new Point();
    static ArrayList<Point> sink = new ArrayList<Point>();
	static ArrayList<Point> ogre = new ArrayList<Point>();
	static ArrayList<Point> blank = new ArrayList<Point>();
	
    
    
	public static void main(String[] args) {
		OgrePath OP = new OgrePath();
		points(maze, OP);
		path(OP);
		

	}
	
	public static void points(int[][] maze, OgrePath OP){
		
		
		for (int i=0;i<maze.length;i++){
			for (int j=0;j<maze[i].length;j++){
				if (maze[i][j] == 3){
					OP.goal.x = i; 
					OP.goal.y = j;
				} else if (maze[i][j] == 2){
					OP.temp.x = i;
					OP.temp.y = j;
					ogre.add(temp);
				} else if (maze[i][j] == 1){
					OP.temp.x = i;
					OP.temp.y = j;
					sink.add(temp);
				} else if (maze[i][j] == 0){
					OP.temp.x = i;
					OP.temp.y = j;
					blank.add(temp);
				}
			}
		
		}

	}
	
	public static void path(OgrePath OP){
		System.out.println(OP.goal.x);
		System.out.println(OP.goal.y);
	}
}
