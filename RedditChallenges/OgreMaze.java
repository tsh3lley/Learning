import java.awt.Point;
import java.util.ArrayList;

public class OgrePath {
//get ogre(@ or 2) to the finish ($ or 3)
//	 @O........
//	 ..O.......
//	 O....O.O..
//	 ..........
//	 ..O.O.....
//	 ..O....O.O
//	 OO........
//	 ..........
//	 .....OO...
//	 .....O...$
	
    static int[][] maze = { 
    		{2,1,0,0,0,0,0,0,0,0},
            {0,0,1,0,0,0,0,0,0,0},
            {1,0,0,0,0,1,0,1,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,0,0,0,0,0,0},
            {0,0,1,0,0,0,0,1,0,1},
            {1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,0,0,0},
            {0,0,0,0,0,1,0,0,0,3}};
    public static boolean[][] visited = new boolean[maze.length][maze[0].length];
    public static ArrayList<Point> path = new ArrayList<Point>();
    
	public static void main(String[] args) {
		for (int i=0;i<maze.length;i++){
			for (int j=0;j<maze[i].length;j++){
				visited[j][i] = false;
			}
		}
		visited[getOgre(maze).x][getOgre(maze).y] = true;
		System.out.println("Ogre: " + getOgre(maze));
		dfs(maze, getOgre(maze));
		print(maze);
		print(showPath(maze,path));
		
	}
	
	public static boolean dfs(int[][] maze, Point p){
		ArrayList<Point> neighbors = new ArrayList<Point>();
		neighbors = getNeighbors(maze,p);
		if (maze[p.x][p.y] == 3){
			System.out.println("FOUND IT @:");
			System.out.println("(" + p.x + "," + p.y + ")");
			return true;
		}
		if (neighbors.isEmpty()){
			return false;
		}
		for (int i=0;i<neighbors.size();i++){
			System.out.println("Nieghbors: " + neighbors);
			System.out.println(i + "(" + p.x + "," + p.y + ")");
			visited[neighbors.get(i).x][neighbors.get(i).y] = true;
			if(dfs(maze, neighbors.get(i))){
				path.add(p);
			    return true;
			}
		}
		return false;
	}
	
	public static ArrayList<Point> getNeighbors(int[][] maze, Point p){
		ArrayList<Point> neighbors = new ArrayList<Point>();
		Point left = new Point();
		Point right = new Point();
		Point down = new Point();
		Point up = new Point();
		down.x = p.x - 1;
		down.y = p.y;
		if (valid(maze,down)) neighbors.add(down);
		up.x = p.x + 1;
		up.y = p.y;
		if (valid(maze,up)) neighbors.add(up);
		left.x = p.x;
		left.y = p.y - 1;
		if (valid(maze,left)) neighbors.add(left);
		right.x = p.x;
		right.y = p.y + 1;
		if (valid(maze,right)) neighbors.add(right);
		return neighbors;
	}
	
	public static boolean valid(int[][] maze, Point p){
		if (inMaze(maze,p) && canGo(maze,p) && visited[p.x][p.y] == false) return true;
		else return false;
	}
	
	public static boolean inMaze(int[][] maze, Point p){
		if (p.x < (maze[0].length) && p.x > -1 && p.y < (maze.length) && p.y > -1){
			return true;
		} else return false;
	}
	
	public static boolean canGo(int[][] maze, Point p){
		if (maze[p.x][p.y] != 1 && maze[p.x][p.y] != 4) return true;
		else return false;	
	}
	
	public static Point getOgre(int[][] maze){
		Point ogre = new Point();
		for (int i=0;i<maze.length;i++){
			for (int j=0;j<maze[i].length;j++){
				if (maze[i][j] == 2){
					ogre.x = j;
					ogre.y = i;
				}
			}
		}
		return ogre;
	}
	
	public static void print(int[][] maze){
		for (int i=0;i<maze.length;i++){
			System.out.println(" ");
			for (int j=0;j<maze[i].length;j++){
				System.out.print(maze[i][j]);
			}
		}
	}
	
	public static int[][] showPath(int maze[][], ArrayList<Point> path){
		for (int i=0;i<path.size();i++){
			maze[path.get(i).x][path.get(i).y] = 4;
		}
		return maze;
	}
}
