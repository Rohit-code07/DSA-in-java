public class RatinMazeFromTwoDirection {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
      maze(0, 0, rows-1, cols-1,"");

    }
public static void maze(int sr,int sc,int er,int ec,String s){
   if(sr>er || sc>ec)return;
if(sr==er&&sc==ec){
    System.out.println(s);
    return;
}

   maze(sr, sc+1, er, ec,s+"D");
   maze(sr+1, sc, er, ec,s+"R");
    
}

}
