public class maximumwealthperson {
   public static void main(String[] args) {
    //accounts = [[1,5],[7,3],[3,5]]
    int[][] arr={{1,5},{7,3},{3,5}};
    
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){int sum=0;
        for(int j=0;j<arr[i].length;j++){
            
            sum=sum+arr[i][j];
        }
        if(sum>max){
           max=sum;
        }     
          // System.out.println("tne wealth of "+i+"person is :  "+sum);
        
    
    }
 System.out.println(max);
   }
}
