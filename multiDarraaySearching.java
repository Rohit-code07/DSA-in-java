 import java.util.*;

public class multiDarraaySearching {
    public static void main(String[] args) {
        int[][] arr={{22,43,55,23,65},
                     {24,76,56,45,21},
                     {54,67,87,25,69}};
                Scanner sc=new Scanner(System.in);
        System.out.println("Enter the search number do you want to search: ");
        int key = sc.nextInt();
        search2Darray(arr, key);

    }
     public static void search2Darray(int[][] arr,int key){ 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
             if( arr[i][j]==key){
                System.out.println("The searching number is index at: row="+i+",column="+j);
             }
            }
        }
    
     }
}
