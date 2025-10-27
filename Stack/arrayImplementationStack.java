public class arrayImplementationStack {
   public static class Stack{
     private int[] arr=new int[10];
     private int idx=0;
       void push(int x){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        arr[idx++]=x;
       }
       int peek(){
        if(idx==0){
            System.out.println("stack is empty");
            return 0;
        }
       return  arr[idx-1];
       }
       void pop(){
        arr[idx]=0;
        idx--;
       }
       boolean isFull(){
        if(idx==arr.length)return true;
        return false;
       }
       boolean isEmpty(){
        if(idx==0)return true;
        return false;
       }
       void display(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       }
   }

     
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(6);
        st.push(7);
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.push(8);
        st.push(9);
        st.push(10);
        st.display();
        st.push(88);
        st.display();
        st.push(99);
    }
}
