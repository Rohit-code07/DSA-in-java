
import java.util.*;
public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. rows & column of matrix: ");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
     int matrix[][]=new int [rows][columns];
     System.out.print("Enter the element of matrix: ");
     for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            matrix[i][j]=sc.nextInt();
        }
     }
     for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
        System.out.print(matrix[i][j]+" ");
        }System.out.println();
    }
    
}
}