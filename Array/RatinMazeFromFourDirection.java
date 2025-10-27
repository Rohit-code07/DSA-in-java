public class RatinMazeFromFourDirection {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
boolean [][] isvisited= new boolean[rows][cols];
maze(0, 0, rows-1, cols-1, "", isvisited);
    }
    public static void maze(int sr,int sc,int er,int ec,String s,boolean[][] isvisited){
        if(sr<0||sc<0)return;
        if(sr>er || sc>ec)return;
        if(isvisited[sr][sc]==true)return;
        if(sr==er&&sc==er){
         System.out.println(s);
         return;
        }
        isvisited[sr][sc]=true; 
  //to go right
maze(sr+1, sc, er, ec, s+"R",isvisited);
//to go down
maze(sr, sc+1, er, ec, s+"D",isvisited);
//to go left
maze(sr-1, sc, er, ec, s+"L",isvisited);
//to go up
maze(sr, sc-1, er, ec, s+"U",isvisited);
//backtracking
isvisited[sr][sc]=false;
    }
}
