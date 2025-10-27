import java.util.*;

public class MissingANDreapting {
    public static void main(String[] args) {
        int[] arr={4, 3, 6, 2, 1, 1};
findTwoElement(arr);
    }
    public static void findTwoElement(int[]arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> list= new ArrayList<>();
    HashMap<Integer,Integer> set= new HashMap<>();
    for(int num : arr){
      set.put(num,set.getOrDefault(num,0)+1);
    }
   
    for(int i=1;i<=n;i++){
        if(!set.containsKey(i)){
            list.add(i);
        }
        else if(set.get(i)>1){
            list.add(i);
        }
    }
    System.out.println(list);
        
    }
}


