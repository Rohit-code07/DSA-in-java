public class hollowrectangle {
    public static void main(String[] args) {
        // complex logic by me
       /* for(int i=1;i<=5;i++){
            System.out.print("*");
        }System.out.println();
       
        for(int j=1;j<3;j++){
            for(int k=1;k<6;k++){
                if(k==1||k==5){
                    System.out.print("*");
                }
               else {
                System.out.print(" ");
               }
              
            } System.out.println();

        }
        for(int i=1;i<=5;i++){
            System.out.print("*");
        }*/ 


        // simple logic
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==4||j==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    
}
