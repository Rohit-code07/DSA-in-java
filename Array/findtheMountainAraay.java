 public class findtheMountainAraay{
        public static void main(String[] args) {}
 public static int check(int[] arr, int target){
       int peaks=peakMountain(arr);
       int firsttry=ascendingbinary(arr, target,0,peaks);
       if(firsttry!=-1){
        return firsttry;
       }
       else
        return descendingbinary(arr, target, peaks+1, arr.length-1);
    
    }
        
        public static int peakMountain(int[] arr){
            int start =0;
            int end=arr.length-1;
            while(start<end){
            int mid=(start+end)/2;
            if (arr[mid]>arr[mid+1]){
                //It is descending order sorted
                end=mid;
            } 
            else {
                // It is ascending order sorted 
                start = mid +1;
    
            }}
            return start;
        }
    
    
        public static int descendingbinary(int[] arr,int target,int start,int end){
            
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==target){
                 return mid;
                }
                else if(arr[mid]<target){
                    end=mid-1;
                
                }
                else{start=mid+1;
                   }
            }
            return -1;
        }
        public static int ascendingbinary(int[] arr,int target,int start,int end){
           
            
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==target){
                 return mid;
                }
                else if(arr[mid]<target){
                start=mid+1;
                }
                else{
                   end=mid-1;}
            }
            return -1;
        }
    }
    
    
