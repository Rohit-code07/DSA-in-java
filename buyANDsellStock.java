public class buyANDsellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};

        maxProfit(prices);
    }
    public static void maxProfit(int[] prices) {
        int n=prices.length;
        int index=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
                index=i;
            }
        
        }
        System.out.println(index);
        int buyday=min;
        System.out.println(buyday);
        //here I already find min
        for(int i=index;i<n;i++){
            if(min<prices[i]){
                min=prices[i];
            }
        }
        int sellday=min;
        System.out.println(sellday);
     // return sellday-buyday;
    }
}

