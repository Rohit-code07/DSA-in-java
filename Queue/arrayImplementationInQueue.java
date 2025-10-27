public class arrayImplementationInQueue {
    public static class queue{
   int[]arr=new int[100];
   int f=0;
   int r=0;
   int idx=0;
   int size=0;
   void push(int x){
    arr[idx++]=x;
    r++;
    size++;
   }
    int peek(){
        return arr[f];
    }
    int pop(){
        if(f==r)return arr[f];
       int x=arr[f];
       f++;
       size--;
       return x;
    }
    int size(){
        return size;
    }
    void display(){
        if(size==0)System.out.println("Queue is Empty");
        for(int i=f;i<r;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    boolean isEmpty(){
        if(size==0)return true;

        else return false;
    }  
    }
    public static void main(String[] args) {
        queue Q=new queue();
        Q.push(1);
        Q.push(2);
        Q.push(3);
        Q.push(4);
        Q.push(5);
        Q.push(6);
        Q.push(7);
        Q.display();
        System.out.println(Q.peek());
        Q.pop();
        Q.display();
        System.out.println(Q.size());
System.out.println(Q.isEmpty());
    }
}
