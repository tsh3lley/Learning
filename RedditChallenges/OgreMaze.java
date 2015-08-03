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
		//bitwise boolean flag integer "directions"
		//topleft 2^3 topright 2^2 bottomleft 2^1 bottomright 2^0
		String[] moves = {"left","right","down","up"};
		int directions = 0;
		for (int j=0;j<moves.length;j++){
			for (int i=0;i<4;i++){
				move(maze,moves[j]);
				if (valid(maze, ogre.get(i))){
					
				}
			}
		}
		
	}
	
	public static boolean valid(int[][] maze, Point p){
		if (inMaze(maze,p) && notSink(maze,p) && notBeen(maze,p)) return true;
		else return false;
	}
	
	public static boolean inMaze(int[][] maze, Point p){
		if (p.x < (maze[0].length - 1) && p.x > -1 && p.y < (maze.length - 1) && p.y > -1){
			return true;
		} else return false;
	}
	
	public static boolean notSink(int[][] maze, Point p){
		if (maze[p.x][p.y] != 1) return true;
		else return false;	
	}
	
	public static boolean notBeen(int[][] maze, Point p){
		if (maze[p.x][p.y] != 4) return true;
		else return false;	
	}
	
	public static int[][] move(int[][] maze, String direction){
		for (int i=0;i<4;i++){
			maze[ogre.get(i).x][ogre.get(i).y] = 4;
		}
		if (direction == "left"){
			for (int i=0;i<4;i++){
				ogre.get(i).x = ogre.get(i).x - 1;
			}
		}else if (direction == "right"){
			for (int i=0;i<4;i++){
				ogre.get(i).x = ogre.get(i).x + 1;
			}
		}else if (direction == "down"){
			for (int i=0;i<4;i++){
				ogre.get(i).y = ogre.get(i).y - 1;
			}
		}else if (direction == "up"){
			for (int i=0;i<4;i++){
				ogre.get(i).y = ogre.get(i).y - 1;
			}
		}
		for (int i=0;i<4;i++){
			maze[ogre.get(i).x][ogre.get(i).y] = 2;
		}
		return maze;
	}
}
