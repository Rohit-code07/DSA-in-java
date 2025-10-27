
import java.util.*;
public class searchingnumberFromarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int rows=3;
        int columns=3;
        int matrix [][]= new int [rows][columns];
        System.out.print("Enter the element of matrix:");
      for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            matrix[i][j]=sc.nextInt();

        }
      }
      System.out.print("Enter the you want to search:");
      int key=sc.nextInt();
      for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
      if(matrix[i][j]==key){
        System.out.println("The element found at rows and columns:"+i+"&"+j);
      }
      
        }}
}}
