public class MaxSumBruteForceMethodsubarrays {
    public static void maxsumofsubarrays(int arr[]){
        int currsum =0;
        int maxsum= Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){

            for(int j = i ; j<arr.length;j++){
                currsum =0;
                for(int k = i ; k<=j;k++){
                   currsum=+arr[k];
                }
                System.out.print(currsum);
             if(maxsum<currsum){
                 maxsum =currsum;
             }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println(" max sum = "+maxsum);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        maxsumofsubarrays(arr);
    }
}
